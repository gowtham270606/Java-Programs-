import java.util.Scanner;
class Program3{
	public static void reverse(int n){
		int sub=n;
		int rev=0;
		while(sub>0){
			int last=sub%10;
			rev=(rev*10)+last;
			sub/=10;
		}
		int total=n-rev;
		System.out.print("Answer : "); 
		System.out.print(n+"-"+rev+"="+total);
		
	}
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter The Number : ");
		int n=sc.nextInt();
		reverse(n);
	}
}