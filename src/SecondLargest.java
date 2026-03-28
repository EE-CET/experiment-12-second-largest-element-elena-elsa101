
import java.util.*;
public class SecondLargest{

public static void main(String[] args){
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int first=Integer.MIN_VALUE,second=Integer.MIN_VALUE;
for(int i=0;i<n;i++){
int x=sc.nextInt();
if(x>first){
if(first!=Integer.MIN_VALUE) second=first;
first=x;
}
else if(x>second && x!=first){
second=x;
}
}
if(second==Integer.MIN_VALUE) System.out.print(-1);
else System.out.print(second);
}
}

