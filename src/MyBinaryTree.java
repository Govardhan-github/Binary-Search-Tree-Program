/*
 * Program To Print Binary Search Tree 
 * Declaring MyBinaryTree Class With Extends Comparable 
 * Declaring K as Generic Data Type Parameter
 */
public class MyBinaryTree<k extends Comparable<k>> {
	public MyBinayNode<k> root;	
	/*
	 * Declaring  add Method 
	 * To Initialize The Root And Key Values
	 */
	public void add(k key) {
		this.root = this.addRecursively(root, key);
	}
private MyBinayNode<k> addRecursively(MyBinayNode<k> root , k key) {
	//If condition Is To Store The Root Value
	if (root == null)//here checking if condition if root value is null store the value in root
	{
		root = new MyBinayNode<k>(key);//Storing root value
	}
	//Here Comparing Key with Root And It Will Store In CompareResult 
	int compareResult = key.compareTo(root.key);//It Gives The Values As -1,0,1
	{
	if(compareResult == 0) //If CompareResult Is Zero Return The Root Value
		return root;
	}
	if(compareResult < 0)//If CompareResult Is LessThan Zero 
	{
		root.left = addRecursively(root.left, key);//It Will Store The Value In Left Node
	}
	else {
		root.right = addRecursively(root.right, key);//If CompareResult Is Greater Than Zero The Value Will Be Store In Right Node	
	}
	return root;//Return Root
}
	/*
	 * Declaring The Main Method 
	 * Adding The Nodes To Binary Tree
	 */
	public static void main(String[] args) {
	MyBinaryTree<Integer> myBinaryTree = new MyBinaryTree<Integer>();
    myBinaryTree.add(56);//Inserting 56 Value To Binary Tree
    myBinaryTree.add(30);//Inserting 30 Value To Binary Tree
    myBinaryTree.add(70);//Inserting 70 Value To Binary Tree
    System.out.println("myBinaryTree is : "  +myBinaryTree);//Printing The My bInary Tree
	}
}


