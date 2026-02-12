package f_OverloadedMethod;/*
write a program that calculate the area of circle and rectangles
and also use the features of overloaded method
make to method with same name one calculate the area of circle and other calculate the area of rectangular.

 */

public class v_AreaCalculator {


        public static double area (double radius) {
            if (radius < 0 ){
                return -1.0;
            } else {

                return Math.PI * java.lang.Math.pow(radius,2);

            }

        }
        public static double area ( double x , double y){
            if (x < 0 && y < 0){
                return -1.0;

            } else {
                double AreaOfRectangle = x * y;
                return AreaOfRectangle;
            }
        }

    public static void main(String[] args) {
            double areaOfCircle = area(3.0);
            System.out.println("if radius is 3.0 than the area of circle is : " + areaOfCircle );
            double areaOfRectangle = area(5.0 , 4.0);
            System.out.println("if the sides of rectangle are 5.0 and 4.0 that are of rectangle is : " + areaOfRectangle);

    }

    }

