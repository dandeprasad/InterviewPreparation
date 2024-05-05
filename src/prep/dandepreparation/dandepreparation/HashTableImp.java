package dandepreparation;

import java.util.ArrayList;

//A HashNode

//A node of chains
class HashNode<K, V>
{
	K key;
	V value;

	// Reference to next node
	HashNode<K, V> next;

	// Constructor
	public HashNode(K key, V value)
	{
		this.key = key;
		this.value = value;
	}
}

public class HashTableImp<K, V> {
	// bucketArray is used to store array of chains
	private ArrayList<HashNode<K, V>> bucketArray;
	// Current capacity of array list
	private int numBuckets;
	// Current size of array list
		private int size;
	public HashTableImp()
	{
		bucketArray = new ArrayList<>();
		
		numBuckets = 10;
		size = 0;
		// Create empty chains
		for (int i = 0; i < numBuckets; i++)
			bucketArray.add(null);
	}
	// This implements hash function to find index
	// for a key
	private int getBucketIndex(K key)
	{
		int hashCode = key.hashCode();
		int index = hashCode % numBuckets;
		return index;
	}
	
	// Adds a key value pair to hash
	public void add(K key, V value)
	{
		// Find head of chain for given key
		int bucketIndex = getBucketIndex(key);
		HashNode<K, V> head = bucketArray.get(bucketIndex);
		
		// Check if key is already present
		while (head != null)
		{
			if (head.key.equals(key))
			{
				head.value = value;
				return;
			}
			head = head.next;
		}
		// Insert key in chain
				size++;
		head = bucketArray.get(bucketIndex);
		HashNode<K, V> newNode = new HashNode<K, V>(key, value);
		newNode.next = head;
		bucketArray.set(bucketIndex, newNode);
		
		if ((1.0*size)/numBuckets >= 0.7)
		{
			ArrayList<HashNode<K, V>> temp = bucketArray;
			bucketArray = new ArrayList<>();
			numBuckets = 2 * numBuckets;
			size = 0;
			for (int i = 0; i < numBuckets; i++)
				bucketArray.add(null);

			for (HashNode<K, V> headNode : temp)
			{
				while (headNode != null)
				{
					add(headNode.key, headNode.value);
					headNode = headNode.next;
				}
			}
		}
	}
	public int size() { return size; }
	public boolean isEmpty() { return size() == 0; }

	
	// Method to remove a given key
	public V remove(K key)
	{
		// Apply hash function to find index for given key
		int bucketIndex = getBucketIndex(key);

		// Get head of chain
		HashNode<K, V> head = bucketArray.get(bucketIndex);

		// Search for key in its chain
		HashNode<K, V> prev = null;
		while (head != null)
		{
			// If Key found
			if (head.key.equals(key))
				break;

			// Else keep moving in chain
			prev = head;
			head = head.next;
		}

		// If key was not there
		if (head == null)
			return null;

		// Reduce size
		size--;

		// Remove key
		if (prev != null)
			prev.next = head.next;
		else
			bucketArray.set(bucketIndex, head.next);

		return head.value;
	}
	
	public static void main (String[] args) {
		HashTableImp<Object, Object>map = new HashTableImp<>();
		map.add("this",1 );
		map.add("dande", "valurssss");
		map.add("danwde", "valurwssss");
		map.add("this","wddg");
		map.add("hi",5 );
		System.out.println(map.size());
		System.out.println(map.remove("this"));
		System.out.println(map.remove("this"));
		System.out.println(map.size());
		System.out.println(map.isEmpty());
	
	}
}
