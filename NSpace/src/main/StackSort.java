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
					stack.push(set[i]);
				}
				if(stack.size() >= groupSize){ //groupSize 3
					
					alStack.add(stackToString(stack));
					stack.pop();
				}
			}

			for (int i=0;i<alStack.size(); i++)
			{
				System.out.println(alStack.size());
				System.out.println("THE OUTPUT: " + alStack.get(i));

				System.out.println();
				
			} 
			
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
	
  public void permutation(int _start)
  {
	  Stack s = new Stack();
	  int inc = -1;
	  int main = _start,inc,current;
	  
	  s.push(set[main]);
	  
	  if(main < set.length-1) //clearance for current's insertion
	    current = main+1;  
	  else
	    current = 0;
	    
	  while(current != main && inc != current)
	  {
            s.push(set[current]);
            
            for(int i=0;i<groupSize;i++) //groupSize
             {
             	if(inc+1 < length)
             	  inc++;
             	else
             	  inc=0;
             	if(inc!=main && inc!=current)
             	{
             	  s.push(set[inc]);
             	}
             }//group built-now save
             alStack.add(stackToString(s));
             for(i=groupSize;i>2;i--)
               s.pop();
             current++;
	  }
	  
		
		
		
  }
	
	
	
	
}
