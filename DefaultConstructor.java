public class DefaultConstructor {
    int tot,length,width;
    DefaultConstructor(){
        tot=0;
        length=78;
        width=90;
        System.out.println("Undre the Default Constructor");
    }
    void disPlay(){
        tot=length*width;
        System.out.println("The value is "+tot);
    }
    public static void main(String[] args) {
        DefaultConstructor ob=new DefaultConstructor();
        ob.disPlay();

    }
}
