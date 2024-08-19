public class Immutable {
    public static void main(String[] args) {
        String a = "Sagar";
        System.out.println(a);
        String b = "Sagar";
        System.out.println(b);
        a.concat("Verma"); // create new object
        System.out.println(a);

        String str = new String("Rambo");
        System.out.println(str);

        String str1 = new String("Rambo1"); 
        System.out.println(str1);

        str.concat("kumar");
        System.out.println(str);
        

    }
    
}
