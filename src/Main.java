public class Main {
    public static void main(String[] args) {
        var dog = 8.0;
        var cat = 3.6;
        var paper = 763789;

        dog = dog + 4; // 12.0
        cat = cat + 4; // 7.6
        paper = paper + 4; // 763793

        dog = dog - 3.5; // 8.5
        cat = cat - 1.6; // 6.0
        paper = paper - 7639; // 756154

        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);
    }
}