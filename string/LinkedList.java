import java.io.*;
import java.util.*;

class Node {
	int data;
	Node next;
	Node(int d) {
        data = d;
        next = null;
    }
}

class LinkedList {
    public static  Node insert(Node head,int data){
        Node NewNode = new Node(data);
         if(head == null){
            head = new Node(data);
			 return NewNode;
         }
         NewNode.next = null;
         Node end = head;
         while(end.next != null){
            end = end.next;
         }
         end.next=NewNode;
	
		return head;
		 
    }
 
	public static void display(Node head){
		
        Node start = head;
        while(start != null) {
            System.out.print(start.data + " ");
            start = start.next;
        }
    }
	public static Node Reverse(Node head){
		Node prev = null;
		Node next = null;
		Node curr = head;
		while(curr!=null){
			next=curr.next;
			curr.next=prev;
			prev=curr;
			curr=next;
		}
		head=prev;
		return head;
	}

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        Node head = null;
        int N = sc.nextInt();

        while(N-- > 0){
            int ele = sc.nextInt();
            head = insert(head,ele);
        }
       // display(head);
		System.out.println(" ");
		 
		Reverse(head);
		
		display(head);
        sc.close();
    }
}