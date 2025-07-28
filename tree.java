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
		System.out.print(node.data+" ");
		inorder(node.right);
		}
		
	}
	public static void preorder(node node)
	{
		if(node!=null) {
		System.out.print(node.data+" ");
		preorder(node.left);
		preorder(node.right);
		}
	}
	public static void postorder(node node)
	{
		if(  node!=null) {
		postorder(node.left);
		postorder(node.right);
		System.out.print(node.data+" ");
		}
	}
	public static void main(String args[])
	{
		node root= new node(10);
		root.left= new node(20);
		root.right = new node(30); 	
		root.left.right= new node(50);
		root.left.left= new node(40);
		root.right.left= new node(60);
		System.out.println("inorder traversal");
		inorder(root);
		System.out.println("preorder traversal");
		preorder(root);
		System.out.println("postorder traversal");
		postorder(root);
	}

}
