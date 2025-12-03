import java.util.*;
class Program4{
	public static void split(int n){
		int gro=4;
		int stroll=101;
		for(int i=1;i<=gro;i++){
			System.out.println(" Group "+ i +" is : ");
			for(int j=stroll+(i-1);j<=(stroll+n)-1;j=j+gro)
			{
				System.out.println(j);
			}
		}
	}
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("\t\tSplit Student Roll.no ");
		int n=20;
		System.out.println("Total Number Of Student : "+n);
		split(n);
	}
}