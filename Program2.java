import java.util.Scanner;
class Program2{
	public static void multi(int n){
		System.out.println("\t\t Multiplication Table");
		for(int i=1;i<=10;i++){
			System.out.println(i +" * "+ n +" = " + (i*n));
		}
		System.out.println();		
	}
	public static void sub(int n){
		System.out.println("\t\t Subtraction Table");

		for(int i=1;i<=10;i++){
			System.out.println(i +" - "+ n +" = " + (i-n));
		}	
}
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter The Number : ");
		int n=sc.nextInt();
		multi(n);
		sub(n);

	}
}