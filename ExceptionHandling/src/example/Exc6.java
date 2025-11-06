package example;


import java.util.Scanner;
class MyException extends Exception
{
  MyException(String msg)
  {
      super(msg);
  }
}
class Exc6
{
  public static void main(String args[])
  {
      Scanner sc=new Scanner(System.in);

      int sallary;
      try
      {
          System.out.println("Enter Sallary:");
          sallary=sc.nextInt();
          if(sallary<=0)
          {
              throw new MyException("Entered wrong number please checck");
          }
          else
          System.out.println("the value is corect");
      }
  catch(MyException e)
  {
      
      System.out.println(e.getMessage());
  }
  
  }
}