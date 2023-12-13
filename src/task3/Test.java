package task3;

import java.util.Scanner;

class Test {
    public void test() {
        System.out.println("введите 3 строки ");
        Scanner scanner = new Scanner(System.in);
        String[] lines = new String[3];
        int total = 0;

        for (int i = 0; i < 3; i++) {
            lines[i] = scanner.nextLine();
            total = total + lines[i].length();

        }

        int average = total/ 3;

        for (int i = 0; i < lines.length; i++) {
            if (lines[i].length() < average) {
                System.out.println(lines[i] + " Длина: " + lines[i].length());
            }
        }

    }
}