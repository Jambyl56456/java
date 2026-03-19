class Config6 {
    static String appName;

    static {
        appName = "MyApp";
        System.out.println("Loaded");
    }
}

public class Task6 {
    public static void main(String[] args) {
        System.out.println(Config6.appName);
    }
}