import java.util.Scanner;
class reverse
{
public static void main(String[] args)
{
int n,i,r,rev=0;
Scanner s=new Scanner(System.in);
n=s.nextInt();
while(n!=0)
{
r=n%10;
rev=rev*10+r;
n=n/10;
}
System.out.print(rev);
}
}