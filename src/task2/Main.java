package task2;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("введите 3 любые строки;");
        Scanner scanner = new Scanner(System.in);
        String stroka1 = scanner.nextLine();
        String stroka2 = scanner.nextLine();
        String stroka3 = scanner.nextLine();
        String[] stroki = {stroka1, stroka2, stroka3};

        Test test= new Test(stroki);
        String[] sortStroki = test.sortStrings();

        System.out.println("Строки в порядке возрастания длины:");
        for (int i = 0; i < sortStroki.length; i++) {
            System.out.println(sortStroki[i]);
        }
        }
    }


