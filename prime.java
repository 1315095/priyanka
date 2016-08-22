class prime
{
public static void main()
{
int i,j,k;
for(i=100;i<=1000;i++)
{
k=0;
for(j=2;j<=i;j++)
{
if(i%j==0)
k++;
}
if(k==0)
System.out.print(i+" ");
}
