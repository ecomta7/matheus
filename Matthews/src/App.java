public class App {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        calcular();
    }

    static int x = 0;
    static int y = 0;

    static void calcular() {
        System.out.println("Only update in Dois... WHere is this updating?");
        System.out.println(x * y);
    }
}
