package TWO_D_Arrays;

import java.util.Arrays;

public class SumOfEachColumnAndRow {
	public static void main(String[] args) {
		
	
	int[][] a = {{1,2,3},{1,2,3},{1,2,3}};
	
	for(int i =0;i<a.length;i++)
	{
		int sumROw = 0;
		for(int j = 0 ;j<a.length;j++)
		{
			sumROw += a[i][j];
			//System.out.println(sumROw);
		}
		System.out.println("Sum of the "+(i+1)+" row: "+sumROw);
	}
	for(int i =0;i<a.length;i++)
	{
		int sumCOl = 0;
		for(int j = 0 ;j<a.length;j++)
		{
			sumCOl += a[j][i];
		}
		System.out.println("Sum of the "+(i+1)+"  Column: "+sumCOl);
	}
	
		
	}
}