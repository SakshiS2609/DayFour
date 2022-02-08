package daythreeassignments;

import java.util.Scanner;

public class OddNosFromTwoD {
public static void main(String args[]) {
	
	Scanner sc=new Scanner(System.in);
	int i ,j;
	System.out.println("enter size of row");
	int m=sc.nextInt();
	int n=sc.nextInt();
	int ar1[][]=new int[m][n];
	for( i=0;i<m;i++) 
		for(j=0;j<n;j++)
	{
		ar1[i][j]=sc.nextInt();
	}

	
	
}
	
}
