package com.bridgeit.testApp.Utility;

public class LinkedListUtility<E> {

	Node start;
	Node end;
	int size;

	public LinkedListUtility() {
		start = null;
		end = null;
		size = 0;

	}
	
	public void size(){
		System.out.println(size);
	}

	public <E> void displayList() {
		
		
		if (start == null) {
			System.out.println("List is Empty..");
		} else if (start.getLink() == null) {
			System.out.println(start.getData());
		} else {

			Node temp = start;
			System.out.print(temp.getData());

			while (temp.getLink() != null) {
				temp = temp.getLink();
				System.out.print(" -> " + temp.getData());
			}

		}

	}
	
	public String[] listToString(){
		String[] name=new String[size];
		Node temp=start;
		int pos=0;
		while(temp.getLink()!=null){
			name[pos]=(String) temp.getData();
			pos++;
		}
		name[pos]=(String) temp.getData();
		 return name;
	}
	
	

	public <E> void insertAtEnd(E data) {
		Node nptr = new Node(null, data);
		size++;
		if (start == null) {

			start = nptr;
			end = start;

		} else {
			end.setLink(nptr);
			end = nptr;
		}
	}
	
	
	public <E extends Comparable<E>> int findPosition(E data){
		boolean status=false;
		int pos=1;
		/*if(start.getData().compareTo(data)>0){
			return 1;	
		}
		else if(end.getData()==data){
			return size;
		}
		else{
			*/
			Node temp = start;
			
			while (temp.getLink()!=null) {
				if(temp.getData().equals(data))
				{
					status=true;
					break;
				}
				temp = temp.getLink();
				pos++;
			}
			if(temp.getData().equals(data)){
				status=true;
			}
		
		if(status==true){
			return pos;
		}
		else
			return -1;
		
	}

	public void deleteAtPos(int pos)
	{
		if (pos == 1)
		{
			start = start.getLink();
			size--;
			return;

		}

		if (pos == size)
		{

			Node s = start;
			Node t = start;

			while (s != end)

			{
				t = s;
				s = s.getLink();
			}

			end = t;
			end.setLink(null);

			size--;

			return;
		}

		Node ptr = start;
		pos = pos - 1;

		for (int i = 1; i < size - 1; i++)
		{
			if (i == pos)
			{
				Node tmp = ptr.getLink();
				tmp = tmp.getLink();
				ptr.setLink(tmp);
				break;

			}

			ptr = ptr.getLink();

		}

		size--;

	}

}

class Node<E> {
	Node link;
	E data;

	public Node() {
		link = null;

	}

	public Node(Node n, E d) {
		link = n;
		data = d;
	}

	public void setLink(Node n) {
		link = n;
	}

	public void setData(E d) {
		data = d;
	}

	public Node getLink() {
		return link;
	}

	public E getData() {
		return data;
	}

	public boolean isEmpty() {
		return link == null;
	}
}
