import java.io.*;
class noOfItems
{
 public static void main(String args[])
 {
  try
  {
   FileInputStream fin=new FileInputStream("Exp1.txt");
   int i,c=-1,l=0,w=0;
   while((i=fin.read())!=-1)
   {
    c++;
    if(i =='\n')
    {
     l++;
    }
    if(i == ' '|| i =='\n')
    {
     w++;
    }
   }
   System.out.println("The file contains "+c+" characters,"+l+" lines and "+w+" words. ");
  }
  catch(Exception e)
  {
   System.out.println(e);
  }
 }
}
