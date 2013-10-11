package main;


public class StackSort {


	public void perm(String[] a, int _start, int _last, int _groupSize)
	{

		if(_start >= _groupSize)
		{
			for(int i=0; i<_groupSize; i++)
				System.out.print(a[i]);
			System.out.println();
			return;
		}

		
		for(int i=_start; i<_last;i++)  //build
		{
			String current = a[_start];
			a[_start] = a[i]; 
			a[i] = current;
			
			perm(a, _start+1,_last,_groupSize); //internal values
			current = a[_start];                //reset
			a[_start] = a[i];
			a[i] = current;
		}
		System.out.println();
	}

}

