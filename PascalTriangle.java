package TWO_D_Arrays;

import java.util.Arrays;

public class PascalTriangle {
public static void main(String[] args) {
	

	int n = 5;
	int[][]a= pascal(n);
	int space = 4;
	for(int[] s:a)
	{
		 System.out.println(Arrays.toString(s));
	}
}
public static int[][] pascal(int s)
{
	int[][] a = new int[s][];
	for(int i = 0 ;i<s;i++)
	{
		a[i] = new int[i+1];
		for(int j=0;j<a[i].length;j++)
		{
			if(j==0||i==j)
			{
				a[i][j] = 1;
			}
			else
			{
				a[i][j]=a[i-1][j-1]+a[i-1][j];
			}
		}
	}
	return a;
}

}

