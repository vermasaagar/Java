

package Practice;


    class ComplexNumber {
    private double real;
    private double imaginary;

    public ComplexNumber(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    // Method to add two complex numbers
    public ComplexNumber add(ComplexNumber other) {
        double newReal = this.real + other.real;
        double newImaginary = this.imaginary + other.imaginary;
        return new ComplexNumber(newReal, newImaginary);
    }

    @Override
    public String toString() {
        return real + " + " + imaginary + "i";
    }
}





public class OperatorOverLoad {
    public static void main(String[] args) {
        
        ComplexNumber num1 = new ComplexNumber(1.0, 2.0);
        ComplexNumber num2 = new ComplexNumber(3.0, 4.0);

        ComplexNumber result = num1.add(num2);

        System.out.println("Sum: " + result);
        
    }
    
}
