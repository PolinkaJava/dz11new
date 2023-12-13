import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("напишите строку");
        String st = scanner.nextLine();
        String[] w = st.split("\\s+");
        System.out.println("напишите номер слова, выберите число от 1 до " + w.length);
        int nomerSlova = scanner.nextInt();
        if (nomerSlova > w.length) {
            System.out.println("все плохо");
            return;
        }
        if (nomerSlova < 1) {
            System.out.println("опять ошибка");
            return;
        }
        String vyberySlova = w[nomerSlova - 1];
        if (Palindrom(vyberySlova)) {
            System.out.println("палиндром " + vyberySlova);
        } else {
            System.out.println("не палиндром " + vyberySlova);
        }
    }

    public static boolean Palindrom(String slovo) {
        String perevernytSlovo = new StringBuilder(slovo).reverse().toString();
        return slovo.equals(perevernytSlovo);
    }
}
