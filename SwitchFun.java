import java.util.Scanner;
public class SwitchFun{
   
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter 1st Number: ");
        int no1=sc.nextInt();
        System.out.print("Enter 2nd Number: ");
        int no2=sc.nextInt();
        System.out.print("Which operation you try...[+,-,* and /]: ");
        char op=sc.next().charAt(0);
        if(op=='+' || op=='-' || op=='*' || op=='/'){
            int res=SwitchFun(no1,no2,op);
            System.out.print(no1+" "+op+" "+no2+" = "+res);               
        }
    
        else {
            System.out.println("Invalid operator");
        }
        sc.close();
        static int SwitchFun(int x, int y, char opr){
                int res=0;
                switch(opr){
                    case '+':
                    res=x+y;
                    break;
                    case '-':
                    res=x-y;
                    break;
                    case '*':
                    res=x*y;
                    break;
                    case '/':
                    res=x/y;
                    break;
                }
                return res;
            } 
    }
}