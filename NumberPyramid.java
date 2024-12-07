import java.util.*;
public class NumberPyramid{
	public static void main(String[] args)
	{
		int a,i,j,k;
		Scanner sc=new Scanner(System.in);
		a=sc.nextInt();
		for(k=a;k>0;k--){
		for(i=a;i>k;i--){
		System.out.print(i);
		}
		for(j=a-k;j<(k*2)+a-k;j++){
		System.out.print(k);
		}
		for(i=k;i<=a;i++){
		System.out.print(i);
		}
		System.out.print("\n");
		}
		for(k=1;k<a;k++){
		for(i=a;i>k;i--){
		System.out.print(i);
		}
		for(j=a-k;j<(k*2)+a-k;j++){
		System.out.print(k);
		}
		for(i=k;i<=a;i++){
		System.out.print(i);
		}
		System.out.print("\n");
		}
		}}
