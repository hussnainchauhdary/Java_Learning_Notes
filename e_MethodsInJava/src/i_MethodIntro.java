
// i_MethodBasics.java
// ------------------------------------------------------------------
// What is a Method?
// A method is a named block of code that performs a specific task.
// You define it once, and then you can “call” (invoke) it whenever you need.
//
// Benefits of Using Methods:
// 1. Reusability
// 2. Readability
// 3. Maintainability
// 4. Abstraction
// ------------------------------------------------------------------

//public class i_MethodBasics {

/**
 * Method Signature:
 * public static void sayHello()
 *
 * public    → anyone can call this method
 * static    → no need to create an object first
 * void      → does not return any value
 * sayHello  → descriptive name of the method
 * ()        → takes no input parameters
 */
public class i_MethodIntro{

    public static void sayHello() {
        System.out.println("Hello, welcome to Java methods!");
    }

    /**
     * main() is the entry point of the program.
     * Java starts execution from here.
     */
    public static void main(String[] args) {
        // Calling our method three times
        sayHello();
        sayHello();
        sayHello();
    }

}

