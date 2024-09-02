
class A implements Runnable {

    public void run() {

try{
    
    for (int i = 1; i <= 5; i++) {
        System.out.println("child thread");
         Thread.sleep(1000);
    }

}catch(Exception e){

}

    }

}

public class RunnableEx {
    public static void main(String[] args) throws Exception {

        A obj = new A();
        Thread myThread = new Thread(obj);
        myThread.start();

        for (int i = 1; i <= 5; i++) {
            System.out.println("main thread");
            Thread.sleep(1000);
        }

    }

}
