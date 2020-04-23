public class SwitchOption {
    private final String add  = "+";
    private final String subtract = "-";
    private final String multiply = "*";
    private final String derivative = "/";

    public void calculation(double a, double b, String action){
        MathVariable var = new MathVariable();
        switch (action){
            case add:
                System.out.printf("%.2f + %.2f = %.2f",a,b,var.add(a,b));
                break;
            case subtract:
                System.out.printf("%.2f - %.2f = %.2f",a,b, var.subtract(a,b));
                break;
            case multiply:
                System.out.printf("%.2f * %.2f = %.2f",a,b, var.multiply(a,b));
                break;
            case derivative:
                System.out.printf("%.2f / %.2f = %.2f",a,b, var.derivative(a,b));
                break;
            default:
                System.out.println("We don't have that options");;

        }
    }



}
