public class Main {
    public static void main(String[] args) {
        var oneBoxer = 78.2;
        var twoBoxer = 82.7;
        var b = twoBoxer - oneBoxer;
        System.out.println("Разница между весом боксеров " + b + " кг.");
        b = twoBoxer % oneBoxer;
        System.out.println("Разница между весом боксеров " + b + " кг.");
    }
}