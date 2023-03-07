package TWO_D_Arrays;

import java.util.Arrays;

public class UpperTiangle {
	public static void main(String[] args) {
		
	
	int[][] a = {{1,2,3},{1,2,3},{1,2,3}};
	for(int i =0;i<a.length;i++)
	{
		for(int j = 0 ;j<a.length;j++)
		{
			if(i>j)
			{
				a[i][j]=0;
			}
			else
			{
				a[i][j]=a[i][j];
			}
		}
	}
	for(int[] m:a)System.out.println(Arrays.toString(m));
		
	}
}