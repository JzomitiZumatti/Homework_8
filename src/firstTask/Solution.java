package firstTask;

public class Solution {
    /*public boolean isPalindrome(String s) {
        String reverse = "";
        for (int i = s.length() - 1; i >= 0; i--) {
            if (Character.isAlphabetic(s.charAt(i)) || Character.isDigit(s.charAt(i))) {
                reverse += String.valueOf(s.charAt(i));
            }
        }
        String su = s.replaceAll("[^a-zA-Z0-9]", "");
        int result = reverse.compareToIgnoreCase(su);
        return result == 0 ? true : false;
    }*/

    public boolean isPalindrome(String s) {
        s = s.toLowerCase().replaceAll("[^a-z0-9]", "");

        int left = 0;
        int right = s.length() - 1;

        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
