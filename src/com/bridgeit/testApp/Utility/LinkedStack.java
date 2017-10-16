package com.bridgeit.testApp.Utility;

import java.util.NoSuchElementException;

public class LinkedStack<E> extends Node

{

    protected Node top ;

    protected int size ;

 

    
    public <E> LinkedStack()

    {

        top = null;

        size = 0;

    }    

    
    public boolean isEmpty()

    {

        return top == null;

    }    

    
    public int getSize()

    {

        return size;

    }    

    
    public void push(E data)

    {

        Node nptr = new Node ( null,data);

        if (top == null)

            top = nptr;

        else

        {

            nptr.setLink(top);

            top = nptr;

        }

        size++ ;

    }    

    
    public E  pop()

    {

        if (isEmpty() )

            throw new NoSuchElementException("Underflow Exception") ;

        Node ptr = top;

        top = ptr.getLink();

        size-- ;

        return (E) ptr.getData();

    }    

    
    public E peek()

    {

        if (isEmpty() )

            throw new NoSuchElementException("Underflow Exception") ;

        return (E)top.getData();

    }    

    
    public void display()

    {

        System.out.print("\nStack = ");

        if (size == 0) 

        {

            System.out.print("Empty\n");

            return ;

        }

        Node ptr = top;

        while (ptr != null)

        {

            System.out.print(ptr.getData()+" ");

            ptr = ptr.getLink();

        }

        System.out.println();        

    }

}