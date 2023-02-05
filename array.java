import java.util.*;
class array
{
public static void main(String[] args)
{
int a[];
a=new int[5];
a[0]=5;
Scanner s=new Scanner(System.in);
int i;
for(i=0;i<5;i++)
{
a[i]=s.nextInt();
}
for(i=0;i<5;i++)
{
System.out.println(a[i]);
}
}
}
