public class i_Introduction {
    /*
    what is overloaded method?
    In java, the multiple method with same name but with different parameter types or order or numbers is called overloaded method in java.
    mean that you create many method with same name in a same class.

     some tips to make overloaded method and means to prevent from error:

     During making a method overloaded "signature"  of method should be different except of method name .
     different  (types, order and number) of parameter.
     name of method same ✅.
     order of type of parameter should be different ✅.
     type of method different but if name of method same  than it is overloaded ✅.
     Clarified: return type alone doesn't count as overload

     ⚠️Type of error :
     same number and order of parameter ❌.

     like :
     int print(int a) { return a; }
     void print(int a) { }       // ❌ ERROR: same name and same parameter → duplicate


    👑 So, for method overloading:
    The method name is same, but the parameter list must be different.
    If the entire signature is same, Java gives an ❌ error.


    */
    // ✔️ Examples of valid overloading:

    public static void overloadedMethod(){

    }
    public static void overloadedMethod(int a){

    }
    public static void overloadedMethod(float a ,  int b){

    }
    public static void overloadedMethod(int a , int b) {

    }
    public static void overloadedMethod(String a , long b , int c) {

    }
    public static int overloadedMethod(long a){
        return 0 ;

    }
    public static long overloadedMethod(float a){
        return 0;
    }
    public static float overloadedMethod(int test , long overload){
        return 0;
    }

}
