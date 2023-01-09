import java.util.Scanner;
class Testswitch{
    public static void main(String[] args) {       
    int a;
    Scanner ob=new Scanner(System.in);
    System.out.println("Enter any value (between 1 to 9): ");
    a=ob.nextInt();
    switch (a) {
        case 1:
            System.out.println("You have enter 1 ");
            break;
        case 2:
        System.out.println("You have enter 2 ");
            break;
        default:
        System.out.println("Invalid input");
        break;
    }
}
}
