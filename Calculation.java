package JavaInheritance;

public class Calculation {

    int A=10;
    int B=20;
    public void numberOfAddition(){

        System.out.println("Addition of A and B is:" +(A+B));
    }

    public void numberOfSubtraction(){
        System.out.println("Subtraction of A and B is:"+(A-B));
    }

    static void numberOfMultiplication(int C,int D){
//        int C=20;
//        int D=30;
        System.out.println("Multiplication of C and D is:"+(C*D));

    }

    public static void main(String[] args) {
        Calculation cal=new Calculation();
        cal.numberOfAddition();
        cal.numberOfSubtraction();

        numberOfMultiplication( 20,30);

    }
}
