package daythreeassignments;

import java.util.Scanner;

public class Printeven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     
      Scanner sc=new Scanner(System.in);
       int ar[]=new int[10];
       for(int i=0;i<10;i++)
       {
    	   ar[i]=sc.nextInt();
    	   
       }
       System.out.println("even nos. from array are:");
       
       for(int i=0;i<10;i++)
       {
    	   if(ar[i]%2==0)
    	   {
    		   System.out.println(+ar[i]);
    	   }
       }
	}

}
