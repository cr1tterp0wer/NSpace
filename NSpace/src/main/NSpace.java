package main;


import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;


public class NSpace {
  
	public static String[] set;
	public static int setNumberSize;
	public static Scanner scan;
	public static ArrayList<Stack> alStack;
	
  public static void main(String[] args) {

	  

	  scan    = new Scanner(System.in);
      System.out.println("Please Specify group number");
	  setNumberSize = scan.nextInt();
	  set = args;
	  StackSort stackSort = new StackSort( setNumberSize, set);
	  

      
	 alStack = stackSort.rGroup(0);

	    
	  
  }
  
	
	
}

