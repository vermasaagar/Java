

class MyThread extends Thread{

    public MyThread(String name){
        super(name);
        setPriority(Thread.MIN_PRIORITY);

    }

}

public class ThreadImplementation {
    public static void main(String[] args) {

        MyThread myThread = new MyThread("Sagar");
       System.out.println("Get State : " +myThread.getState());~

        myThread.start();
       System.out.println("Get State : " +myThread.getState());

       System.out.println("ID: " +myThread.getId());
       System.out.println("Name : "+ myThread.getName());
       System.out.println("Priority : " +myThread.getPriority());
       System.out.println("Get State : " +myThread.getState());
       
    }  
}
