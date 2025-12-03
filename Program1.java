import java.util.*;
class Program1{
	public static void output(char c){
	
		for(int i=c;i<=90;i++){
			 System.out.print((char)(i));
		}
	}
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter The Character : ");
		char c=sc.next().charAt(0);
		output(c);
	}
}
		