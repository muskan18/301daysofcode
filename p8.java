package day07;

import java.util.*;

public class p8 {

	class Node{
		
		int data;
		Node next;
		
		
		Node(int data)
		{
			this.data = data;
			
			next = null;
		}
	}
	
	Node root;
	
	
	 void insert(int data)
	{
		
		Node newnode = new Node(data);
		
		
		if(root == null)
		{
			
			root = newnode;
			return;
		}
		
		else
		{
			Node tmp = root;
			
			while(tmp.next!=null)
			{
				tmp = tmp.next;
			}
			
			tmp.next = newnode;
			newnode.next = null;
			
			return;
		}
	}
	
	void display()
	{
		
		Node temp = root;
		
		while(temp!=null)
		{
			System.out.println(temp.data);
			
			temp = temp.next;
		}
		
	}
	
	
	public static void main(String args[])
	{
		p8 obj = new p8();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number of nodes ");
		
		int n = sc.nextInt();
		
		System.out.println("Enter the nodes");
		
		
		for(int i=0;i<n;i++)
		{
		   obj.insert(sc.nextInt());
		}
		
		sc.close();
		
		System.out.println("The linked list is : ");
		
		obj.display();
		
		
	}
}
