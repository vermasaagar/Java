public class typePromotion {
    
    public static void main(String[] args) {

        //Type Promotion: JAva automatically promotes each byte, short, or char operand to int
        //when evaluating the expression.;

        int a = 10;
        float b= 20.25f;
        long c = 25;
        double d= 30;
        double ans = a+b+c+d;
        System.out.println(ans);




        byte e=5;
        e= (byte)(e*2);
        System.out.println(e);


        
    }
}
