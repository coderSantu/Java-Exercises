import java.util.Scanner;
public class Salary {
   public static void main(String[] args) {  
  int sal,b;
  Scanner ob=new Scanner(System.in);
  System.out.println("Enter your Salary ");
  sal=ob.nextInt();
  if (sal>10000){
      b=(sal*10)/100;
      sal=sal+b;
  }
  System.out.println("Salary with 10% bonus is "+sal);
}
}
