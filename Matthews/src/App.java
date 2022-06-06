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

    void important() {
        System.out.println("Se eu ficar alterando branchs locais... ele leva as alterações comigo.");
        System.out.println("Eu preciso DAR COMMIT PRIMEIRO NA ABA DE COMMIT.");
        System.out.println("Só depois eu vou dar push nisso.");
    }
}
