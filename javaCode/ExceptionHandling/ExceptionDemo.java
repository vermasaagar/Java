package ExceptionHandling;

class CheckException {

    public void method1(int a, int b) {
        if (a == 0 || b == 0) {
            System.out.println("hello");
        } else {
            int c = a / b;
            System.out.println(c);
        }
    }
}

public class ExceptionDemo {
    public static void main(String[] args) {
        CheckException obj = new CheckException();
        obj.method1(8, 4);
    }
}
