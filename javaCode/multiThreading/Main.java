
package multiThreading;
class MyThread extends Thread{

    public void run(){
        int i=1;
        while(true){
            System.out.println("Hello");
            i++;
        }
    }
}
public class Main {
    public static void main(String[] args) {
        MyThread myThread = new MyThread();
        myThread.start();
        int i=1;
        while(true){
            System.out.println("World!");
            i++;

        }
        
    }  } 
    






































































































































