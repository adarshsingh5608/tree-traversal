package tree;
class node
{
	int data;
	node left,right;
	node(int data)
	{
		this.data=data;
		left=right=null;
	}
}
public class tree {
	public static void inorder(node node)
	{
		if(node!=null) {
		inorder(node.left);
		System.out.println(node.data);
		inorder(node.right);
		}
		
	}
	public static void preorder(node node)
	{
		if(node!=null) {
		System.out.println(node.data);
		preorder(node.left);
		preorder(node.right);
		}
	}
	public static void postorder(node node)
	{
		if(  node!=null) {
		postorder(node.left);
		postorder(node.right);
		System.out.println(node.data);
		}
	}
	public static int countnodes(node node)
	{
		if(node==null)
			return 0;
		else
			return 1+ countnodes(node.left)+countnodes(node.right);
	}
	public static node insert(node node,int data)
	{
		if(node == null)
			return new node(data);
		else if(data<node.data)
			node.left=insert(node.left, data);
		else if(data>node.data)
			node.right= insert(node.right, data);
		
		return node;
	}
	public static int height(node node) {
		if(node==null)
			return 0;
		return 1+Math.max(height(node.left), height(node.right));
	}
	public static void main(String args[])
	{
		node root= new node(10);
		root.left= new node(20);
		root.right = new node(30); 	
		root.left.right= new node(50);
		root.left.left= new node(40);
		root.right.left= new node(60);
		insert(root,90);
		inorder(root);
		System.out.println(root.left.data);
		System.out.println("inorder traversal");
		inorder(root);
		System.out.println("preorder traversal");
		preorder(root);
		System.out.println("postorder traversal");
		postorder(root);
		int i= countnodes(root);
		System.out.println("number of nodes =" +i);
		int h=height(root);
		System.out.println("the height of the tree = "+h);
	}

}
