public class iv_challenge {
    public static void main(String[] args) {

        // create two double variable?
        // add both than multiply by 100.00?
        // take a remainder of operation value by 40.00?
        // creat a boolean variable that assign true if  remainder not find otherwise false?
        // if case to print "got some remainder" if remainder found?

        double num1 = 20.00d , num2 = 80.00d;
        double operation = (num1 + num2) * 100.00d;
        System.out.println("by adding and multiplying by 100 we got : " + operation);

        double remainder = operation % 40.00d;
        System.out.println("the remainder is : " + remainder );

        boolean check = (remainder == 0) ? (true) : (false) ;
        System.out.println("the result of remainder is : " + check);

        if (!check){
            System.out.println("got some remainder");
        }
    }
}
