import java.util.Scanner;

public class PrimeNumbers {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a number: ");
		int n=scan.nextInt();
		int a[]=new int[n];
		scan.close();
		for(int i=2;i<n;i++)
		{
			if(a[i]==0)
			{
				System.out.println(i);
				for(int j=i*i;j<n;j+=i)
				{
					a[j]=1;
				}
			}
		}
	}

}
