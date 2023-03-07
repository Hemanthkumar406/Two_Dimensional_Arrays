package TWO_D_Arrays;

import java.util.Arrays;

public class SubStractMatrix {
	public static void main(String[] args) {
		
	
	int[][] a = {{3,4,1},{3,4,1},{3,4,1}};
	int [][] b = {{1,2,3},{1,2,3},{1,2,3}};
	
	int[][] c = add(a,b);
	for(int[] m:c)
	{
		System.out.println(Arrays.toString(m));
	}
	}
	public static int[][] add(int[][] a ,int[][] b)
	{
		int[][] c = new int[a.length][b[0].length];
		for(int i = 0 ;i<a.length;i++)
		{
			for(int j = 0 ;j<a.length;j++)
			{
				c[i][j]=a[i][j]-b[i][j];
			}
		}
		return c;
	}
}

