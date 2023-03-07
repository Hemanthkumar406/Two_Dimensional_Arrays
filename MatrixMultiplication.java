package TWO_D_Arrays;

import java.util.Arrays;

public class MatrixMultiplication {
	public static void main(String[] args) {
		int[][] a= {{1,2,3},{1,2,3},{1,2,3}};
		int[][] b= {{1,2,3},{1,2,3},{1,2,3}};
		int [][] c= matrix(a,b);
		for(int[] m :c)
		System.out.println(Arrays.toString(m));
	}
	public static int[][] matrix(int[][] a,int[][] b)
	{
		int c[][] =new int[a.length][a.length];
		for(int i=0;i<a.length;i++)
		{
			for(int j =0;j<a.length;j++)
			{
				for(int k=0;k<a.length;k++)
				{
					c[i][j] +=a[i][k]*a[k][j ];
				}
			}
		}
		return c;
		
	}

}
