package task1;

import java.util.Scanner;

public class Test {
    String stroka1;
    String stroka2;
    String stroka3;
    String dlin;
    String korot;

    public void stroki1() {
        System.out.println("введите 3 любые строки;");
        Scanner scanner = new Scanner(System.in);
        stroka1 = scanner.nextLine();
        stroka2 = scanner.nextLine();
        stroka3 = scanner.nextLine();
        dlin = stroka1;
        korot = stroka1;
    }

    public void stroki() {
        if (stroka2.length() < korot.length()) {
            korot = stroka2;
        } else if (stroka2.length() > dlin.length())
            dlin = stroka2;
        if (stroka3.length() < korot.length()) {
            korot = stroka3;
        } else if (stroka3.length() > dlin.length())
            dlin = stroka3;
        System.out.println(" Kороткая строка " + korot + " длина: " + korot.length());
        System.out.println(" Длинная строка " + dlin + " длина: " + dlin.length());
    }
}