package ro.fasttrackit.curs16.generics;

public class Palindrome {
    public boolean isPalindrome(String pal) {
        if (pal == null || pal.length() < 2) {
            return true;
        } else if (pal.charAt(0) == pal.charAt(pal.length() - 1)) {
            return isPalindrome(pal.substring(1, pal.length() - 1));
        } else {
            return false;
        }
    }
}
