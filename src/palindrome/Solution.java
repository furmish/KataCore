package palindrome;

public class Solution {
    public static void main(String[] args) {
        System.out.println(isPalindrome("Was it a cat I saw?"));
    }
    public static boolean isPalindrome(String text) {
        String unsignedText = text.replaceAll("\\W", "");
        StringBuilder reversedText = new StringBuilder(unsignedText);
        reversedText.reverse();
        return unsignedText.equalsIgnoreCase(reversedText.toString());
    }
}
