package dandepreparation;

class LinkNodes {
	
	Object data1;
	Object data2;
	
	LinkNodes nextnode;
	
	LinkNodes(Object dataparam1,Object datapraram2){
		data1 = dataparam1;
		data2 =  datapraram2;
	}
}
public class linkedListImp {
	
 LinkNodes Firstnode;

	linkedListImp(){
		Firstnode = null;
	}
void add(Object datakey , Object datavalue){
	LinkNodes daaa  = new LinkNodes(datakey , datavalue);
	daaa.nextnode = Firstnode;
	Firstnode = daaa;
	
	}
 void removenode(Object key ) {
	LinkNodes currentnode1 = Firstnode;
	LinkNodes prev = null;
	while(currentnode1!=null) {
		if((currentnode1.data2).equals(key)) {
		break ; 	
		}
		prev = currentnode1;
		currentnode1  = currentnode1.nextnode;

	}
	if(prev!= null) {
	prev.nextnode = currentnode1.nextnode;}
	else {
		Firstnode = currentnode1.nextnode;;
	}
}

//search recusively 
Boolean search(LinkNodes headnode,Object keytofind){
	if (headnode==null) {
		return false ;
	}
	if(headnode.data2.equals(keytofind)) {
		return true;
	}
	else {
		return search( headnode.nextnode, keytofind);
	}
	
}

//reverse the linked list

void reverselinkedlist(LinkNodes first){
	LinkNodes next , prev = null;
	LinkNodes curr = first;
	  while (curr != null) {

	next = 	curr.nextnode;
	 
	curr.nextnode = prev;
	
	prev = curr;
	curr = next;
	  }
	  
	  
		LinkNodes currentnode21 = prev;
		while(currentnode21!=null) {
		System.out.println(currentnode21.data2);
			currentnode21 = currentnode21.nextnode;
		}
}
	public  static void main(String[] args)
	{
		linkedListImp dande = new linkedListImp();
		dande.add("adafsf", "king");
		dande.add("addafsf", "ki31ng");
		dande.add("adaf3sf", "ki3ng");
		dande.add("adaf2sf", "king131");
		
		//count and printing all the items
		LinkNodes currentnode = dande.Firstnode;
		int count =0;
		while(currentnode!=null) {
		System.out.println(currentnode.data2);
			currentnode = currentnode.nextnode;
			count++;
		}
		System.out.println(count);
		dande.removenode("king131");
	
//removing nodes 		
		LinkNodes currentnode21 = dande.Firstnode;
		while(currentnode21!=null) {
		System.out.println(currentnode21.data2);
			currentnode21 = currentnode21.nextnode;
		}
		
		Boolean val = dande.search(dande.Firstnode,"ki31n2323g");
		System.out.println(val);
		
		dande.reverselinkedlist(dande.Firstnode);
	}
}
