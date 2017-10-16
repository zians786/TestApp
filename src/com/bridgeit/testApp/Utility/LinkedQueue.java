package com.bridgeit.testApp.Utility;

import java.util.NoSuchElementException;

public class LinkedQueue<E> extends Node

	{

	    protected Node front, rear;

	    public int size;

	 

	    /* Constructor */

	    public LinkedQueue()

	    {

	        front = null;

	        rear = null;

	        size = 0;

	    }    

	    /*  Function to check if queue is empty */

	    public boolean isEmpty()

	    {

	        return front == null;

	    }    

	    /*  Function to get the size of the queue */

	    public int getSize()

	    {

	        return size;

	    }    

	    /*  Function to insert an element to the queue */

	    public void insert(E data)

	    {

	        Node nptr = new Node( null,data);

	        if (rear == null)

	        {

	            front = nptr;

	            rear = nptr;

	        }

	        else

	        {

	            rear.setLink(nptr);

	            rear = rear.getLink();

	        }

	        size++ ;

	    }    

	    /*  Function to remove front element from the queue */

	    public E remove()

	    {

	        if (isEmpty() )

	            throw new NoSuchElementException("Underflow Exception");

	        Node ptr = front;

	        front = ptr.getLink();        

	        if (front == null)

	            rear = null;

	        size-- ;        

	        return (E) ptr.getData();

	    }    

	    /*  Function to check the front element of the queue */

	    public E peek()

	    {

	        if (isEmpty() )

	            throw new NoSuchElementException("Underflow Exception");

	        return (E)front.getData();

	    }    

	    /*  Function to display the status of the queue */

	    public void display()

	    {

	        System.out.print("\nQueue = ");

	        if (size == 0)

	        {

	            System.out.print("Empty\n");

	            return ;

	        }

	        Node ptr = front;

	        while (ptr != rear.getLink() )

	        {

	            System.out.print(ptr.getData()+" ");

	            ptr = ptr.getLink();

	        }

	        System.out.println();        

	    }

	}




