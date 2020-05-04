package day11;

import java.util.*;

public class p10 {

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
	
	 void insert(int n)
	{
		
		Node newnode = new Node(n);
		
		if(root == null)
		{
			root = newnode;
			return;
			
		}
		
		Node tmp = root ;
		
		while(tmp.next!=null)
			tmp = tmp.next;
		
		
		tmp.next = newnode;
		newnode.next = null;
		
	}
	
	 void display()
	{
		Node tmp = root;
		
		while(tmp!=null)
		{
			System.out.println(tmp.data);
			
			tmp = tmp.next;
			
		}
			
		 
	}
	
	 int delete(int val)
	{
		Node tmp = root;
		
		int flag =0;
		if(root.data == val)
		{
			root = root.next;
			flag =1;
			return flag;
			
		}
		while(tmp.next!=null)
		{
			if(tmp.next.data == val)
			{
				tmp.next = tmp.next.next;
				flag =1;
				
			}
			
			tmp = tmp.next;
		}
		
		return flag;
		 
		
	}
	
	public static void main(String args[])
	{
		
		p10 obj = new p10();
		
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter the size");
		
		int n = sc.nextInt();
		
		System.out.println("Enter nodes");
		
		for(int i=0;i<n;i++)
		{
			obj.insert(sc.nextInt());
			
		}
		
		System.out.println("Enter element you want to delete");
		
		int el = sc.nextInt();
		
		System.out.println("Before deletion the list is ");
		
		obj.display();
		
		int d = obj.delete(el);
		
		if(d==0)
		{
			System.out.println("Element not found");
			
		}
		else
		{
			System.out.println("After Deletion !");
			
			obj.display();
			
			
		}
		
		sc.close();
		
	}
	
	
}
