class RBI {
    protected double minInterestRate;
    public RBI(double minInterestRate) {
    this.minInterestRate = minInterestRate;
    }
    public double getMinInterestRate() {
    return minInterestRate;
    }
    }
    class SBI extends RBI {
    public SBI() {
    super(4.0); // set minimum interest rate to 4%
    }
    }
    class ICICI extends RBI {
    public ICICI() {
    super(4.0); // set minimum interest rate to 4%
    }
    
    }
    class PNB extends RBI {
    public PNB() {
    super(4.0); // set minimum interest rate to 4%
    }
    }
    class Account {
    protected Customer customer;
    protected double balance;
    public Account(Customer customer, double balance) {
    this.customer = customer;
    this.balance = balance;
    }
    public void deposit(double amount) {
    balance += amount;
    }
    public void withdraw(double amount) {
    balance -= amount;
    }
    public double getBalance() {
    return balance;
    }
    }
    class Customer {
    protected String name;
    protected int age;
    public Customer(String name, int age) {
    this.name = name;
    this.age = age;
    }
    public String getName() {
    return name;
    }
    public int getAge() {
    return age;
    }
    }
    class BankDemo {
    public static void main(String[] args) {
    Customer customer = new Customer("John", 25);
    
    Account sbiAccount = new Account(customer, 10000.0);
    Account iciciAccount = new Account(customer, 20000.0);
    Account pnbAccount = new Account(customer, 30000.0);
    // Dynamic polymorphism
    RBI sbi = new SBI();
    RBI icici = new ICICI();
    RBI pnb = new PNB();
    System.out.println("SBI minimum interest rate: " + 
    sbi.getMinInterestRate());
    System.out.println("ICICI minimum interest rate: " + 
    icici.getMinInterestRate());
    System.out.println("PNB minimum interest rate: " + 
    pnb.getMinInterestRate());
    sbiAccount.deposit(5000.0);
    iciciAccount.withdraw(10000.0);
    pnbAccount.deposit(15000.0);
    System.out.println("SBI account balance: " + sbiAccount.getBalance());
    System.out.println("ICICI account balance: " + 
    iciciAccount.getBalance());
    System.out.println("PNB account balance: " + pnbAccount.getBalance());
    }
    }
    