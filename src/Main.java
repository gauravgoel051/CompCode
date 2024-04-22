import org.w3c.dom.ls.LSOutput;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
class ComplexNumber {
    int real;
    int imaginary;

    ComplexNumber(int real, int imaginary){
        this.real=real;
        this.imaginary=imaginary;
    }

    ComplexNumber add(ComplexNumber y){
        int sumReal = this.real +y.real;
        int sumImaginary = this.imaginary + y.imaginary;

        ComplexNumber res = new ComplexNumber(sumReal,sumImaginary);
                return res;
    }
    void print(){
        System.out.println(real +" + "+imaginary+"i");

    }
}
class Main {
        public static void main(String[] args) {

            ComplexNumber x = new ComplexNumber(2,3);
            x.print();
            ComplexNumber y = new ComplexNumber(3,4);
            y.print();

            ComplexNumber z = x.add(y);
            z.print();

        }
}

