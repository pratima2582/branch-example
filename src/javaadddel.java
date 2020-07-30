public class javaadddel {
    static int x = 30;
    static int y = 20;
    static int addition;
    static int deletion;
    static int multiplication;
    static double devision;

    static void add(){
        addition = x+y;
        System.out.println("The addition of " + x + " and " + y + " = "+addition); }
    static void del(){
        deletion = x-y;
        System.out.println("The deletion of " + x + " and " + y + " = "+deletion); }
    static void mul(){
        multiplication = x*y;
        System.out.println("The multiplication of " + x +" and " + y + " = "+multiplication); }
    static void dev(){
        devision = x/y;
        System.out.println("The devision of " + x +" and " + y + " = "+devision); }
        public static void main(String[] args) {
        add();
        del();
        mul();
        dev();
    }
}
