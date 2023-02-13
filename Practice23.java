public class Practice23 {
    public static void main(String[] args) {
        // System.out.println(""Double.MAX_VALUE: "" + Double.MAX_VALUE);
        // System.out.println(""Double.MIN_VALUE: "" + Double.MIN_VALE); 
        
        // double d;
        // int a;
 
        // d = 10.6;
        // //a = d; ---> Compile Error!
        // a = (int)d;
        // System.out.println(a);
 
        // d = a;
        // System.out.println(d);
        int a = 200;
        double d;
 
        d = a / 3;
        System.out.println(d);
        d = a / 3.0;
        System.out.println(d);
        d = (double)a / 3;
        System.out.println(d);

    }
}
