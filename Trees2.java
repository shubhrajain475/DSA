public class Trees2{
	static class Node{
		int data;
		Node left,right;
		public Node(int data){
			this.data=data;
			this.left=null;
			this.right=null;
		}
	}
		public static Node lca(Node root,int p,int q){
			if(root==null||root.data==p||root.data==q){
				return root;
			}
			Node left=lca(root.left,p,q);
			Node right=lca(root.right,p,q);
			if(left==null){
				return right;
			}
			else if(right==null){
				return left;
			}
			else{
				return root;
			}

	}
	public static void main(String ar[]){
		Node root=new Node(1);
		root.left=new Node(2);
		root.right=new Node(3);
		root.left.left=new Node(4);
		root.left.right=new Node(5);
		root.right.left=new Node(6);
		root.right.right=new Node(7);
		Node lcaNode=lca(root,4,7);
		System.out.println(lcaNode.data);
	}
}