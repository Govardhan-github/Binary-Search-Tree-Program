/*
 * Declaring MyBinaryNode Class With Extended Comparable of Generic k
 */
public class MyBinayNode<k extends Comparable<k>> {
	//Declaring Key ,Left And Right
	k key;
	MyBinayNode<k> left;
	MyBinayNode<k> right;
	/*
	 * Declaring parameterized Constructor 
	 */
	public MyBinayNode(k key) {
		//Initializing The Key,Left And right
		this.key = key;
		this.left = null;
		this.right = null;
	}
}
