import java.util.Scanner;
class even
{
public static void main(String[] args)
{
int n,i;
Scanner s=new Scanner(System.in);
n=s.nextInt();
for(i=1;i<=n;i++)
{
if(i%2==0)
{
System.out.println(i);
}
}
}
}