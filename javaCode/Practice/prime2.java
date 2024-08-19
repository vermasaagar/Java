public class prime2 {

    public static boolean checkPrime(int n){

        boolean isprime=true;
        for(int i=2; i<=n-1; i++){
        
        if(n%i==0){
            System.out.println("Not Prime");
            return false;
        }
       
    }
    return true;

    

    }

    public static void main(String[] args) {

        System.out.println(checkPrime(9));
        
    }
    
}
