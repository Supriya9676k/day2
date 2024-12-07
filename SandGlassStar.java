import java.util.*;
public class SandGlassStar{
	public static void main(String[] args)
	{
		int a;
		Scanner sc=new Scanner(System.in);
		a=sc.nextInt();
		for(int k=a;k>0;k--){
		for(int i=a-k+1;i>0;i--){
		System.out.print(" ");
		}
		for(int j=0;j<(k*2)-1;j++){
		System.out.print("*");
		}
		System.out.print("\n");
		}
		for(int k=a-1;k>0;k--){
		for(int i=k;i>0;i--){
		System.out.print(" ");
		}
		for(int j=(a*2)-(k*2);j>=0;j--){
		System.out.print("*");
		}
		System.out.print("\n");
		}
		}}
