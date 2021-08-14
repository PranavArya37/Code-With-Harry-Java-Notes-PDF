// package pranavarya.gym;
import pranavarya.gym.PranavGym;

class Using extends PranavGym{
    void meth2(){
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);
        System.out.println(a);
    }
}
public class UsingPackage{
    public static void main(String[] args) {
        System.out.println("I am using the package");
        Using c = new Using();
        c.meth2();
        
    }
}