


class A extends Thread{
   public void run(){

    try {
        for(int i=1; i<= 5; i++){
            System.out.println("Sagar");
            Thread.sleep(2000);

        }
        
    } catch (Exception e) {
    }  
    }

}

public class ThreadException {

    public static void main(String[] args) throws InterruptedException {

        A obj = new A();
        obj.start();
        for(int i= 1; i<=5; i++){
            System.out.println("Verma");
            Thread.sleep(2000);
        }
        

    }
    
}
