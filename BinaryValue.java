import java.util.ArrayList;
import java.util.*;
public class BinaryValue {
    public static void main(String[] args){
    List<Integer> binary = new ArrayList<Integer>();
    Scanner sc=new Scanner(System.in);
    int num=sc.nextInt();
    while(num>0){
    binary.add(num%2);
    num=num/2;
    }
    for(int i=binary.size()-1;i>=0;i--){
System.out.print(binary.get(i));
}
}}
