import java.util.*;
import java.util.Scanner;
public class Main
{
public static void main(String []args)
{
Scanner sc=new Scanner(System.in);
String str=""; 
System.out.println("Enter input string :");
str=sc.nextLine();
String temp=str.substring(2)+str.substring(0,2);
//System.out.println(temp);
int i,j;
for(i=0;i<temp.length();i++)
{
for(j=0;j<=i;j++) 
{
System.out.print(temp.charAt(j));
}        
System.out.println();
}
}
}