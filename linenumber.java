import java.io.*;
class linenumber
{
 public static void main(String args[])throws Exception
 {
  try
  {
   FileInputStream fin=new FileInputStream("Exp1.txt");
   
   int i,l=2;
   System.out.print("1. ");
   while((i=fin.read())!=-1)
   {
     System.out.print((char)i);
     if((char)i=='\n')
     {
       System.out.print(l+". ");
       l++;
     }
   }
   fin.close();
  }
  catch(Exception e)
  {
    System.out.println(e);
  }
 }
}
