package TWO_D_Arrays;

public class SumOFDiagnols {
	public static void main(String[] args) {
		int [][] a = {{1,2,3},{1,2,3},{1,2,3}};
		int sum =0;
		for(int i=0;i<a.length;i++)
		{
			for(int j =0;j<a.length;j++)
			{
				if(i==j)
				{
					sum += a[i][j];
				}
				if(i+j==a.length-1)
				{
					sum += a[i][j];
				}
			}
		}
		System.out.println("Sum of Diagnol "+sum);
	}

}
