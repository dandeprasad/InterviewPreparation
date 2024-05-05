package prep.dandepreparation.dandepreparation;

class Node 
 {
	 
	 int key ;
	 Node leftnode , rightnode;
	 
	 Node(int item){
		 key = item;
		 leftnode = null;
		 rightnode = null;
	 }
	 
 }
 
 
public class BinarysearchtreeImp {

	Node  root;
	BinarysearchtreeImp(){
		root = null;
		
	}
	
void 	additem(int value ){
		
	root = insetbin(root , value);
	};
	
	Node insetbin(Node rootdata , int valuedata) {
		
		if (rootdata == null) {
			rootdata = new Node(valuedata);
			return rootdata;
		}
		else {
			if(valuedata<rootdata.key){
				rootdata.leftnode = insetbin( rootdata.leftnode , valuedata) ;
			}
			if(valuedata > rootdata.key) {
				rootdata.rightnode = insetbin( rootdata.rightnode , valuedata) ;
			}
		
		}
		return rootdata;
	}

	 // This method mainly calls InorderRec()
	 void inorder()  {
	    inorderRec(root);
	 }

	 // A utility function to do inorder traversal of BST
	 void inorderRec(Node root) {
	     if (root != null) {
	    	 
	         inorderRec(root.leftnode);
	         System.out.println(root.key);
	         inorderRec(root.rightnode);
	         
	     }
	 }
	public static void main(String[] args) {
		
		BinarysearchtreeImp tree = new BinarysearchtreeImp();
		
	   
	    tree.additem(50);
        tree.additem(30);
        tree.additem(20);
        tree.additem(40);
        tree.additem(70);
        tree.additem(60);
        tree.additem(80);

	     
	     tree.inorder();
	     
	}
}
