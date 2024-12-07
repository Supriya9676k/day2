import java.util.*;
public class HappyNumber{
	public static void main(String[] args)
	{
		int a,sum=0,digit;
		Scanner sc=new Scanner(System.in);
		a=sc.nextInt();
		while(a>9){
			sum=0;
		while(a>0){
		digit=a%10;
		a=a/10;
		sum=sum+(digit*digit);
		}
		a=sum;
		}
		if(sum==1)
		System.out.print("Happy Number");
		else
		System.out.print("Not Happy Number");
		}
}
