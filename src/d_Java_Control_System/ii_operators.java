package d_Java_Control_System;

public class ii_operators {
    public static void main(String[] args) {
        // 1. Assignment operator.

        // " = " = it is an assignment operator.
        int a , b ;
        a = 5;     // here a is assigned a value that is '5'.
        b = 4;     // b assign a value that is '4'.

        //2. Arithmetic operator?

        //  i. " + "  =  it ia an addition operator
        int addition = a + b;      // 5 + 4 = 9
        System.out.println("the sum of a and b is : " +  addition);

        // ii.  " - "  =  it is a subtraction operator.
        int subtraction  = a - b;   // 5 - 4 = 1
        System.out.println("the subtraction of a and b is : " + subtraction);

        // iii. " * "  =  it is a multiplication operator.
        int multi = a * b;           // 5 * 4 = 20
        System.out.println("the multiplication of a and b is : " + multi);

        // iv. " / "  =  it is a division operator.
        int div = a / b;            // 5 / 4 = 1
        System.out.println("the division of a and b is : " + div);

        // v.  " % "  =  it is a modulus operator, give reminder.
        int reminder = a % b ;      // 5 % 4 = 1
        System.out.println("the reminder of a and b is : " + reminder);

        // 3. Compound Assignment Operators?

        //Compound assignment operators combine an arithmetic operation with an assignment.
        //Instead of writing a = a + 5, you can simply write a += 5.

        // i. "a += 1"          // it means a = a + 1
        // ii. "a -= 1 "        // it means a = a - 1
        // iii. "a *= 1 "       // it means a = a * 1
        // iv. "a /= 1 "        // it means a = a / 1
        // v. "a %= 1 "         // it means a = a % 1

        // 3. Relational / Comparison operators.

        // these operators give only boolean value "True or false".

        // i. "a == b"        // equal to (true only if a is eqaull to b)
        // ii. "a != b"       // not equall to (true only if a not equall to b).
        // iii. "a > b"       // greater than (true nly if a greater than b).
        // iv. "a < b"        // less than (true only if a less than b).
        // v. "a >= b"        // greater than or equall to (true only if a greater or equall to b).
        // vi. "a <= b"       // less than or equal to (true only if a less or greater than b).

        // 4.  Logical Operators.

        //Logical operators are used to combine two or more boolean expressions (true/false conditions).
        //They help in making decisions in control structures like if, else if, while, etc.

        // i. "a>b && a<b"    // '&&' AND operator (true only if both conditions a>b / a<b are true).
        // ii. "a>b || a>b"   // '||' OR operator (true if atleast one form both conditions a>b / a<b are true).
        // iii. " ! "         // it revert the condition, if true than !true = false.

        // 5. Unary Operators

        //Unary operators are operators that operate on a single operand (value or variable).
        //They are used to perform operations like increasing, decreasing, negating, or reversing a boolean value.

         a = 5;

        // i.  Unary plus
        System.out.println("+a = " + (+a));   // 5

        // ii.  Unary minus
        System.out.println("-a = " + (-a));   // -5

        // iii.  Increment (Post and Pre)
        System.out.println("a++ = " + (a++)); // Prints 5, then a becomes 6
        System.out.println("++a = " + (++a)); // a becomes 7, then prints 7

        // iv.  Decrement (Post and Pre)
        System.out.println("a-- = " + (a--)); // Prints 7, then a becomes 6
        System.out.println("--a = " + (--a)); // a becomes 5, then prints 5

        // v.  Logical NOT
        boolean flag = true;
        System.out.println("!flag = " + (!flag)); // false


    }
}
