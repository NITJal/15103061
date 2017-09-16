public class Multiply_Matrices {
	public static void main(String args[])
	{
		int a[][]={
				{1,2,3},
				{4,1,7},
				{5,0,1}
		};
		int b[][]={
				{1,2,1},
				{3,0,0},
				{4,1,0}
		};
		int n=3,m=3,r=3;
		int p[][]=new int[n][r];
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<r;j++)
			{
				for(int k=0;k<m;k++)
				{
					p[i][j]+=a[i][k]*b[k][j];
				}
			}
		}
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<r;j++)
				System.out.print(p[i][j]+" ");
			System.out.println();
		}
	}
}
