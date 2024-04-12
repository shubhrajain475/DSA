//BFS using queue
import java.util.*;
import java.util.LinkedList.*;
public class Trees1{
	static class Node{
		int data;
		Node left,right;
		public Node(int data){
			this.data=data;
			this.left=null;
			this.right=null;
		}
	}
		public static void levelorder(Node root){
			if(root==null){
				return;
			}
			Queue<Node>q=new LinkedList<>();
			q.add(root);
			q.add(null);
			while(!q.isEmpty()){
				Node currNode=q.remove();
				if(currNode==null){
					System.out.println();
					if(q.isEmpty()){
						break;
					}
					else{
						q.add(null);
					}
				}
				else{
					System.out.print(currNode.data+" ");
					if(currNode.left!=null){
						q.add(currNode.left);
					}
					if(currNode.right!=null){
						q.add(currNode.right);
					}
				}
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
	
		levelorder(root);
	}
}