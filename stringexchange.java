import java.util.Scanner;
public stringexchange
{
public static void main (string[] arg)
{
Scanner in=new Scanner(System.in);
String str;
System.out.println("enter the string:");
str=in.nextLine();

for(int i=0;i<str.length();i++)
{
if(str.charAt(i)%2==0)
{
System.out.print(str.charAt(i));
}
if(str.charAt(i)%2!=0)
{
System.out.print(str.charAt(i));
}
}
}
}