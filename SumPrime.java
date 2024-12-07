import java.util.*;
public class SumPrime{
	public static void main(String[] args)
	{
		int a,sum=0,count=0,j;
		Scanner sc=new Scanner(System.in);
		a=sc.nextInt();
		for(int i=2;i<a;i++){
			count=0;
			for(j=2;j<i;j++){
			if(i%j==0)
			count++;
		}
		if(count==0)
		sum=sum+i;
		}
		System.out.print(sum);
	}
}
