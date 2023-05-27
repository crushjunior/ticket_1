public class Palindrom {
    public static void main(String[] args) {
        System.out.println(isPalindrom("AbBa"));
        System.out.println(isPalindrom("AbcvvbBa"));
    }

    private static boolean isPalindrom(String text) {
        boolean palindrom = true;
        String text2 = text.toLowerCase();
        for (int i = 0; i < text2.length(); i++) {
            if (text2.charAt(i) != text2.charAt(text.length() - 1 - i)) {
                palindrom = false;
            }
        }
        return palindrom;
    }
}
