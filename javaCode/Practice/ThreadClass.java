// class A implements Runnable {
//     public void run() {
//         // Your code here
//     }
// }

// class B implements Runnable {
//     public void run() {
//         // Your code here
//     }
// }

public class ThreadClass {
    public static void main(String[] args) {
        Runnable obj1 = () -> {
            for (int i = 1; i < 5; i++) {
                System.out.println("hii");
                try {
                    Thread.sleep(5);
                } catch(InterruptedException e){
                    e.printStackTrace();
                }
            }
        };

        Runnable obj2 =  () -> {
            for (int i = 1; i < 5; i++) {
                System.out.println("hello");
                try {
                    Thread.sleep(10);
                } catch(InterruptedException e){
                    e.printStackTrace();
                }
            }
        };

        Thread t1 = new Thread(obj1);
        Thread t2 = new Thread(obj2);
        t1.start();
        t2.start();
    }
}
