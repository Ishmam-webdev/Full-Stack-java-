import java.util.*;
class Node
{
	int data;
	Node next;
}
class MyDQueue
{
	Node front,rear;
	MyDQueue()
	{
		front=null;
		rear=null;

	}
	void enqueuer(int ele)
	{
		node cur=new Node();
		cur.data=ele;
		System.out.println(ele+" data insert ");
		cur.next=cur;
		if(front==null)
		{
			front=cur;
			rear=cur;
			return;
		}
		cur.next=front;
		front=cur;
	}
	void dequeuef()
	{
		if(front== null)
		{
			System.out.println("no element ");
			return ;
		}
		System.out.println("delect element="+front.data);
		if(front==rear)
		{
			front=null;
			rear=null;
			return ;
		}
		front=front.next;
	}
	void dequeuer()
	{
		if(front==null)
		{
			System.out.println("no element ");
			return ;
		}
		System.out.println("delete element"+rear.data);
		return ;
	}
	System.out.println("delete element= "=rear.data);
	if(front==null)
	{
		System.out.println("no element");
		return ;
	}
	System.out.println("delete element="+rear.data);
	if(front==rear)
	{
		front=null;
		rear=null;
		return ;
	}
		Node temp = front;
		while(temp.next != rear)
		{
			temp= temp.next;
		}	
		temp.next = null;
		rear = temp;

}