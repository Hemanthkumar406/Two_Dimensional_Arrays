package TWO_D_Arrays;

import java.util.Arrays;

public class TransposeMatrix {
	public static void main(String[] args) {
		int[][] a = {{1,2,3},{1,2,3},{1,2,3}};
		int[][] b =transpose(a);
		for(int [] m:b)
		{
			System.out.println(Arrays.toString(m));
		}
	}
	public static int[][] transpose(int[][] a)
	{
		int b[][]  = new int[a.length][a.length];
		for(int i= 0 ; i<a.length;i++)
		{
			for(int j = 0 ; j<a.length;j++)
			{
				b[j][i] = a[i][j];
			}
		}
		return b;
	}

}
