import java.util.Scanner;
class Else_if
{
    public static void main(String ...args)
    {
      int age;
      Scanner sc = new Scanner(System.in);
      System.out.println("Type element ");
      age=sc.nextInt();

      if(age>45)
      {
        System.out.println("bhot bde log");
      }
      else if(age>35)
      {
        System.out.println("chote log");
      }
    }
}