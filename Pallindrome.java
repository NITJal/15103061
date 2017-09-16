import java.util.Scanner;

public class Pallindrome {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a string: ");
		String s=scan.next();
		char c[];
		String s1="";
		c=s.toCharArray();
		int n=s.length();
		for(int i=0;i<n;i++)
			s1+=c[n-1-i];
		scan.close();
		if(s.equalsIgnoreCase(s1))
			System.out.println("Pallindrome String");
		else
			System.out.println("Not a pallindrome string");
	}

}
