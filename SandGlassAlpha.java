import java.util.*;
public class SandGlassAlpha{
	public static void main(String[] args)
	{
		int a,count=0;
		Scanner sc=new Scanner(System.in);
		a=sc.nextInt();
		for(int i=a;i>0;i--){
		System.out.print(" ");
		}
		System.out.print((char)(65+count));
		System.out.print("\n");
		count++;
		for(int k=a-1;k>0;k--){
		for(int i=k;i>0;i--){
		System.out.print(" ");
		}
		System.out.print((char)(65+count));
		for(int j=((a*2)-(k*2))-2;j>=0;j--){
		System.out.print(" ");
		}
		System.out.print((char)(65+count));
		System.out.print("\n");
		count++;
		}
		for(int k=a;k>0;k--){
		for(int i=a-k;i>0;i--){
		System.out.print(" ");
		}
		System.out.print((char)(65+count));
		for(int j=0;j<(k*2)-1;j++){
		System.out.print(" ");
		}
		System.out.print((char)(65+count));
		System.out.print("\n");
		count--;
		}
		for(int i=a;i>0;i--){
		System.out.print(" ");
		}
		System.out.print((char)(65+count));
		System.out.print("\n");
		}}
