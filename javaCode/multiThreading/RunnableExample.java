


public class RunnableExample implements Runnable {

   
    public void run(){
        int i=1;

        while(i<=5){
            System.out.println("Hello ");
            i++;
        }

    }


    public static void main(String[] args) {

        RunnableExample m = new RunnableExample();
        Thread mythread = new Thread(m);
        mythread.start();

        int i = 1;
        while(i<=5){
            System.out.println("World!");
            i++;
        }
        
    }
}