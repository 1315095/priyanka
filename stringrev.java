import java.util.scanner;
public static void main(String[] arg)
{
Scanner in=new Scanner(System.in);
String str,rev="";
System.out.prin("{enter the string");
str=in.nextLine();
int len=str.length();
for(int i=len-1;i>=0;i--)
{

rev=rev+str.charAt(i);
}
System.out.prin(rev);
