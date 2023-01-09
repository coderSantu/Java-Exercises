import java.util.Scanner;
class Ifelse
{
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        int a,b,c;
        System.out.println("Enter any Three Values ");
        a=obj.nextInt();
        b=obj.nextInt();
        c=obj.nextInt();
        if(a>b&&a>c){
            System.out.println("It is the lergest value "+a);
        }
        else if(b>c){
            System.out.println("It is the lergest value "+b);
        }
        else{
            System.out.println("It is the lergest value "+c);
        }
    }
   
}