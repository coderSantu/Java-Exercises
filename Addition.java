public class Addition {
 int a,b,c;
    void getData(int x, int y)
        {
            a=x;
            b=y;
        }   
    void oper(){
        c=a+b;
    System.out.println("Sum of two digits is "+c);
    }
public static void main(String abj[]){
    Addition obj=new Addition();
    obj.getData(80, 20);
    obj.oper();
}
}