package ro.fasttrackit.curs16.generics;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class PalindromeTest {
    @Test

    void testPalindrome(){
        Palindrome palindrome = new Palindrome();

        assertThat(palindrome.isPalindrome("")).isTrue();
        assertThat(palindrome.isPalindrome("a")).isTrue();
        assertThat(palindrome.isPalindrome("ana")).isTrue();
        assertThat(palindrome.isPalindrome("racecar")).isTrue();
        assertThat(palindrome.isPalindrome("racecars")).isFalse();
        assertThat(palindrome.isPalindrome(null)).isTrue();
    }

}