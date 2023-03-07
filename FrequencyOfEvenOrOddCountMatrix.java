package TWO_D_Arrays;

import java.util.Arrays;

public class FrequencyOfEvenOrOddCountMatrix {
	public static void main(String[] args) {
		
	
	int[][] a = {{1,2,3},{1,2,3},{1,2,3}};
	int even = 0;
	int odd =0;
	for(int i =0;i<a.length;i++)
	{
		for(int j = 0 ;j<a.length;j++)
		{
			if(a[i][j]%2==0)
			{
				even++;
			}
			else
			{
				odd++;
			}
		}
	}
	System.out.println("Even NUmber count = "+even);
	System.out.println("Odd NUmber count = "+odd);
		
	}
}