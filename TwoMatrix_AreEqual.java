package TWO_D_Arrays;

public class TwoMatrix_AreEqual {
	public static void main(String[] args) {
		
	
	
	int[][] a = {{1,2,3},{1,2,3},{1,2,3}};
	int [][] b = {{1,4,3},{1,2,3},{1,2,3}};
	
	if(isMatrixareEqual(a,b))
	{
		System.out.println("A and B are Equal Matrix");
	}
	else System.out.println("Not Equal");
	}
public static boolean isMatrixareEqual(int[][] a ,int[][]b)
{
	boolean flag = true;
	for(int i =0;i<a.length;i++)
	{
		for(int j=0;j<a.length;j++)
		{
			if(a[i][j] !=b[i][j])
			{
				flag = false;
				break;
			}
		}
		if(!flag)
		{
			break;
		}
		
	}
	
	return flag;
	
	
}
}

