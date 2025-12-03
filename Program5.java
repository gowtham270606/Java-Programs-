import java.util.Scanner;
public class Program5{

	public static void output(char ch){
		for(int i=ch;i>=65;i--){
			int n=i-64;
			for(int j=1;j<=n;j++){
				System.out.print((char)(i));
			}
			System.out.println("");
		} 
	}
	
	public static void main(String agrs[]){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Your Character : ");
		char ch=sc.next().charAt(0);
		output(ch);
		
	}

}