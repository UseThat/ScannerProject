public class MathVariable {
    public double add(double a, double b){
        return a+b;
    }
    public double subtract(double a, double b){
        return a-b;
    }
    public double multiply(double a, double b){
        return a*b;
    }
    public double derivative(double a, double b){
        if(b == 0){
            System.out.println("Unable to derivative by 0");
            return 0;

        }else{
            return a/b;
        }
    }
}
