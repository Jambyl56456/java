class Outer7 {
    class Inner {
        void show() {
            System.out.println("Inner class works");
        }
    }
}

public class Task7 {
    public static void main(String[] args) {
        Outer7 o = new Outer7();
        Outer7.Inner i = o.new Inner();
        i.show();
    }
}