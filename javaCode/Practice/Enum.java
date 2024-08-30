package Practice;
enum Status{
    running, failed, pending, success;

}



class Enum{
    public static void main(String[] args) {
        
        Status obj = Status.success;

        switch (obj) {
            case running:
                System.out.println("All good");
                break;
            
            case failed:
            System.out.println("failed");
            break;

            case pending:
            System.out.println("pending");
            break;    

            default:
                System.out.println("Success");
        }

        
    }
}
