import java.util.*;
class Node{
	int data; 
	
	Node left;
	Node right;
	
	public Node(int d){
		this.data=d;
	//	System.out.println(data);
	}
}
public class binarySearch{
	Node root;
	public void addNode(int data){
		Node newNode=new Node(data);
		if(root == null){
			root = newNode;
		}
		else{
			Node focusNode = root;
			Node parent;
			while(true){
				parent = focusNode;
				if(data<focusNode.data){
					focusNode=focusNode.left;
					if(focusNode==null){
						parent.left=newNode;
						return;
						}
					}
				else{
					focusNode=focusNode.right;
				    if(focusNode==null){
						parent.right=newNode;
						return;
						}
					}
				}
			}
		}
	public void InorderTraversal(Node focusNode){
		if(focusNode!=null){
			InorderTraversal(focusNode.left);
			System.out.println(focusNode.data);
			InorderTraversal(focusNode.right);
		}
	}
	public void PreorderTraversal(Node focusNode){
		if(focusNode!=null){
			System.out.println(focusNode.data);
			PreorderTraversal(focusNode.left);
			PreorderTraversal(focusNode.right);	
		}
	}
	public void PostorderTraversal(Node focusNode){
		if(focusNode!=null){
			PostorderTraversal(focusNode.left);
			PostorderTraversal(focusNode.right);	
			System.out.println(focusNode.data);
		}
	}
	public static void main(String[] args){
		binarySearch bs =new binarySearch();
		bs.addNode(10);
		bs.addNode(37);
		bs.addNode(24);
		bs.addNode(56);
		bs.addNode(11);
		bs.addNode(54);
		bs.addNode(1);
		
		
		bs.InorderTraversal(bs.root);
		System.out.println("**********");
		bs.PreorderTraversal(bs.root);
		System.out.println("**********");
		bs.PostorderTraversal(bs.root);
	}
}