package Practice;

public class Code1{
    public static void main(String[] args) {

        int x=0;
        do{
       x++;
       System.out.println(x);
       if(++x<5){
        System.out.println(x);
        if(++x<10){
            x++;
            break;
        }
        
       }
        x++;
        System.out.println(x);

       }
       while(++x<10);
    }


}
