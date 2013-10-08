package main;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;


public class NSpace {

	public static ArrayList<String> arrayList = new ArrayList();
	public static String[] set;
	public static ArrayList[] temp_set; //stores all arrayLists();
	public static int setNumberSize;
	public static Scanner scan;
	
  public static void main(String[] args) {
	  System.out.println("Please Specify group number");
	  scan = new Scanner(System.in);
	  setNumberSize = scan.nextInt();
	  
	  set  = new String[args.length];
	  arrayList = new ArrayList();
	  
    //get command line args  
    for (int i=0;i<args.length;i++)
    {
      	set[i] = args[i];
    }
	
    for(int k=0;k<setNumberSize;k++)
    {
      rGroup(k, setNumberSize);
    }
    /*
    //print
    for(int i=0;i<temp_set.length; i++)
    {
    	for(int k=0;k<temp_set[i].size();k++)
    	{

    	    System.out.println(temp_set[i].toString());
    	}
    } */
    
}
	
	public static ArrayList[] rGroup(int _start, int _setNumberSize)
	{
		//make new array for each pass, throw the value into set[]
		for(int i = 0; i < _setNumberSize; i++)
		{
			arrayList.add(set[_start]);
		// if(check for uniqueness)
			System.out.println(arrayList.get(i));
			
		}
		//everytime this is called in the loop, the original value gets clobbered
		//temp_set[_start] = new ArrayList<String>();
		//temp_set[_start] = arrayList;
		if(_start < setNumberSize)
		  return rGroup(_start + 1, setNumberSize);
		else
	      return temp_set;
	}
	
}

