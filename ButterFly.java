import java.util.*;
public class ButterFly{
	public static void main(String[] args)
	{
		int a;
		Scanner sc=new Scanner(System.in);
		a=sc.nextInt();
		for(int k=a;k>0;k--){
		for(int i=a-k;i>0;i--){
		System.out.print("*");
		}
		for(int j=0;j<(k*2)-1;j++){
		System.out.print(" ");
		}
		for(int i=a-k;i>0;i--){
		System.out.print("*");
		}
		System.out.print("\n");
		}
		for(int i=a*2-1;i>0;i--){
		System.out.print("*");
		}
		System.out.print("\n");
		for(int k=0;k<a;k++){
		for(int i=a-k-1;i>0;i--){
		System.out.print("*");
		}
		for(int j=0;j<(k*2)+1;j++){
		System.out.print(" ");
		}
		for(int i=a-k-1;i>0;i--){
		System.out.print("*");
		}
		System.out.print("\n");
		}
		}}
