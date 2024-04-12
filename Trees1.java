public class Trees1{
	 class Node{
		int data;
		Node left;
		Node right;
		public Node(int data){
			this.data=data;
			this.left=null;
			this.right=null;
		}
	}
	public static void inorder(Node root){
		if(root==null){
			return;
		}
		inorder(root.left);
		System.out.print(root.data+" ");
		inorder(root.right);
	}
	public static void postorder(Node root){
		if(root==null){
			return;
		}
		postorder(root.left);
		postorder(root.right);
		System.out.print(root.data+" ");
		
	}
	public static void preorder(Node root){
		if(root==null){
			return;
		}
		System.out.print(root.data+" ");
		postorder(root.left);
		postorder(root.right);
		
	}
	public static void main(String ar[]){
		Trees1.Node root=new Trees1.Node(1);
	System.out.println(root);
		// root.left=new Node(2);
		// root.right=new Node(3);
		// root.left.left=new Node(4);
		// root.left.right=new Node(5);
	    // root.right.left=new Node(6);
		// root.right.right=new Node(7);
		
		// inorder(root);
		// System.out.println("");
		// preorder(root);
		// System.out.println("");
	   // postorder(root);
	}
}