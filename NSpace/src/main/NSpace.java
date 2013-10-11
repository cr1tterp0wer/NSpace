package main;


import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;


public class NSpace {
  
	public static String[] set;
	public static int groupSize;
	public static Scanner scan;
	
  public static void main(String[] args) {

	  

	  scan    = new Scanner(System.in);
      System.out.print("Please Specify group size: ");
	  groupSize = scan.nextInt();
	  set = args;
	  StackSort stackSort = new StackSort();
	  stackSort.perm(set,0,set.length, groupSize);


	    
	  
  }
  
	
	
}

