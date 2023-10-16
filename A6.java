

public class A6 {
    public static void main(String[] args) {

        double a=1.0;
        double b =2.35;
        double c= 1.0;
        double d= -25.0;
        System.out.println("a: "+a+ " b: "+b+" c: "+c);
        a +=4;
        System.out.println("a=a+4= "+a);
        b-=a;
        System.out.println("b=b-a= "+b);
        c*=2-4*a;
        System.out.println("c=c(2-4a)= "+c);
        d/=4-a*a;
        System.out.println("d=d/4-a^2= "+d);
    }

}
