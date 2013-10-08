package main;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Stack;

public class StackSort {

	
	private Stack<String> stack;
	private int start;
	private int groupSize;
	private LinkedList<String> alStack;
	private String[] set;
	
	
	
	public StackSort( int _groupSize, String[] _set)
	{
		alStack    = new LinkedList();
		stack      = new Stack();
		groupSize  = _groupSize;
		set        = _set;
	}
	
	
	public ArrayList<Stack> rGroup(int _start)
	{
	    int start = _start;
			for(int i=0; i<set.length;i++)
			{
				if(stack.size() < groupSize)
				{
					//System.out.println("push: " + set[i]);
					stack.push(set[i]);
				}
				if(stack.size() >= groupSize){ //groupSize 3
					
					alStack.add(stackToString(stack));
					//System.out.println("pop: " + stack.peek());
					//System.out.println("Saving...current alStackSize: " + alStack.size());

					//System.out.println("current Size: " +stack.size());
					stack.pop();
				    //System.out.println("aferPop: " + stack.peek());
				}
			}

			for (int i=0;i<alStack.size(); i++)
			{
				System.out.println(alStack.size());
				System.out.println("THE OUTPUT: " + alStack.get(i));

				System.out.println();
				
			} 
			/*
			Stack tempStack = new Stack();
			LinkedList<String> llStack = new LinkedList();
			tempStack.push("g");
			tempStack.push("u");
			tempStack.push("q");
			
			llStack.add(stackToString(tempStack));
			tempStack.pop();
			
			
			System.out.println("outoutout: " + llStack.get(0));
			*/
			return new ArrayList();
	}
	
	
	public String stackToString(Stack _s)
	{
		    String output ="";
		
			Stack t = _s;
			for(int k=0;k<t.size();k++)
			{
				output += t.get(k);
			}
			return output;
	}
	
	
	
	
	
	
}
