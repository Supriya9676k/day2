import java.util.*;
public class BinaryPyramid{
	public static void main(String[] args)
	{
		int a,i,j,bvalue=1;
		Scanner sc=new Scanner(System.in);
		a=sc.nextInt();
		for(i=0;i<a;i++){
			for(j=0;j<a;j++){
		System.out.print(bvalue);
		if(bvalue==0)
		bvalue=1;
		else
		bvalue=0;
		}
	System.out.print("\n");
		}
		}}
