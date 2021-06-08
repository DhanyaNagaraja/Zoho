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
int n=str.length(); 
String temp=str.substring(n/2,n)+str.substring(0,n/2);
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
