package prep.dandepreparation.dandepreparation;

class 	AVLnode {
	
	int height ; 
	int key ;
	AVLnode leftnode;
	AVLnode rightnode;
	AVLnode(int keyvalue){
		key = keyvalue ;
		height = 0 ;
		leftnode = null;
		rightnode = null;
	}
}
public class AVLTreeImp {

	AVLnode  rootnode;
	
	int height(AVLnode nodevalue){
		if(nodevalue == null) {
			return -1;
		}
		else {
			return nodevalue.height;
		}
	};
	int checkbalance(AVLnode node) {
	     if (node == null)
	         return 0;

		 return (height(node.leftnode) - height(node.rightnode));
	}
	int max(int rightheight , int leftheight) {
		
	return 	rightheight > leftheight ? rightheight:leftheight;
	
	}
	AVLnode rightrotate(AVLnode x){
	AVLnode 	makeroot = x.leftnode;
	AVLnode nodeconv = makeroot.rightnode;
	
	//rotation
	makeroot.rightnode = x ;
	x.leftnode = nodeconv;
	
	makeroot.height = max(height(makeroot.leftnode), height(makeroot.rightnode)) + 1;
    x.height = max(height(x.leftnode), height(x.rightnode)) + 1;
    
	return makeroot;
	}
	AVLnode leftrotate(AVLnode x){
	AVLnode 	makeroot = x.rightnode;
	AVLnode nodeconv = makeroot.leftnode;
	
	//rotation
	makeroot.leftnode = x ;
	x.rightnode = nodeconv;
	
	makeroot.height = max(height(makeroot.leftnode), height(makeroot.rightnode)) + 1;
    x.height = max(height(x.leftnode), height(x.rightnode)) + 1;
    
	return makeroot;
	}
	AVLnode insert(AVLnode root , int insertele){
		
		if (root == null) {
		return 	new AVLnode(insertele);
		}
		if(insertele > root.key) {
			
		root.rightnode = insert(root.rightnode, insertele)	;
	}
		else if (insertele < root.key) {
			root.leftnode = insert(root.leftnode , insertele); 
		}
		else {
			return root ; 
		}
		
		root.height = 1 + max(height(root.rightnode), height(root.leftnode));
	int 	balance  = checkbalance(root);
			
		if (balance> -1 && (insertele < root.leftnode.key)) {
		return	rightrotate(root);
		}
	if (balance> -1 && (insertele > root.leftnode.key)) {
			root.leftnode = leftrotate(root.leftnode);
		return 	rightrotate(root);
		}
	if (balance> 1 && (insertele > root.rightnode.key)) {
		return leftrotate(root);
	}
	if (balance> 1 && (insertele < root.rightnode.key)) {
		root.rightnode = rightrotate(root.rightnode);
	return	leftrotate(root);
	}
	return root;
	}
    /* The constructed AVL Tree would be
    30
   /  \
 20   40
/  \     \
10  25    50
*/
	void  traverse(AVLnode node){
		if (node != null ) {
	
		
		
		traverse(node.leftnode);
		System.out.println(node.key);
	  traverse(node.rightnode);
		}	
	}
	
	public static void main(String args[]) {
		AVLTreeImp dande = new AVLTreeImp();
		dande.insert(dande.rootnode,24);
		
		dande.rootnode = dande.insert(dande.rootnode, 10);
		dande.rootnode = dande.insert(dande.rootnode, 20);
		dande.rootnode = dande.insert(dande.rootnode, 30);
		dande.rootnode = dande.insert(dande.rootnode, 40);
		dande.rootnode = dande.insert(dande.rootnode, 50);
		dande.rootnode = dande.insert(dande.rootnode, 25);
		dande.rootnode = dande.insert(dande.rootnode, 95);
		dande.rootnode = dande.insert(dande.rootnode, 2512);
		dande.rootnode = dande.insert(dande.rootnode, 225);
		dande.traverse(dande.rootnode);
	}
}
