package dandepreparation;

import java.util.ArrayList;

class Hashnode1<K,V>{
	
	K key ;
	V value;
	
	Hashnode1<K,V> next ;
	
	Hashnode1(K key , V value){
		this.key = key;
		this.value = value;
	}
}

public class hashmapmyImp <K,V>{

	private ArrayList<Hashnode1<K,V>> bucket;
	private int numberofbuckets;
	private int size;
	
	hashmapmyImp(){
		bucket = new ArrayList<>();
		numberofbuckets = 10;
		size = 0;
		for(int i =0;i<numberofbuckets;i++) {
			bucket.add(null);
		}
	}
	
	void add(K Key , V Value){
		
		int index  = calculateindex(Key);
		Hashnode1 head = bucket.get(index);
		
		while(head !=null) {
			
			if(head.key.equals(Key)) {
				head.value = Value;
				return ; 
			}
			head = head.next;
		}
		size++;
		head = bucket.get(index);
		Hashnode1<K, V> newnode = new  Hashnode1<>(Key , Value);
		newnode.next = head;
		
		bucket.add(index, newnode);
		
		if(1.0*size/numberofbuckets >=0.7 ) {
			
			numberofbuckets = numberofbuckets+10;
			size = 0;
			
			 ArrayList<Hashnode1<K,V>> temp = bucket;
			 bucket = new ArrayList<>();
			 for (int i = 0; i < numberofbuckets; i++)
					bucket.add(null);

		
				 for(Hashnode1<K, V> headNode : temp) {
					 
					 while(headNode!=null) {
						add( headNode.key , headNode.value);
						headNode  = headNode.next;
					 }
				 
			 }
		}
		
		
	}
	public V remove(K Key){
		int index  = calculateindex(Key);
		Hashnode1<K, V> head = bucket.get(index);
		
		Hashnode1<K, V> prev = null;
		while(head !=null) {
			if(head.key.equals(Key)) {
				break;
			}	
				prev = head;
				head = head.next;
				
			
		}
		if(head == null) {
			return null;
		}
		
		// Remove key
		if (prev != null)
			prev.next = head.next;
		else
			bucket.set(index, head.next);
		return head.value;
	}
	 int calculateindex(K key){
		
		int hash =  key.hashCode();
		return hash % bucket.size();
	}
	
	public static void main (String[] args) {
		hashmapmyImp <Object,Object> map = new hashmapmyImp<>();
		map.add("dande", "valurssss");
		map.add("danwde", "valurwssss");
		System.out.println(map.remove("dande"));
		
	}
}
