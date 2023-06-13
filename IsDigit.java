public class IsDigit {
    public static void main(String args[]) {
        char S[] = { 'A', 'a', '2', ' ', 'B' };
        for (int i = 0; i < 5; i++) {
            if (Character.isDigit(S[i]))
                System.out.println(S[i] + " is digit at position " + i);
            if (Character.isLetter(S[i]))
                System.out.println(S[i] + " is a letter at position " + i);
        }
    }
}
