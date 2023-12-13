package task5;

public class Test {
    public static String duplicateLetters(String input) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            sb.append(c);
            sb.append(c);
        }
        return sb.toString();
    }
}