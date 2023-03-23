class Primeyear
{
public static void main(String args[])
{
int n=1,count=0,i;
 
for(i=1;i<=n;i++)
{
if(n%i==0)
{
count++;
}
}
if(count==2)
 System.out.println("Prime year");
else
 System.out.println("Not prime year");
}
}
