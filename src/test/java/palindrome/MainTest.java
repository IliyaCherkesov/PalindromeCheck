
package palindrome;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class MainTest {


    @Test
    public void palyndromeTest() {
        assertEquals(true, Main.checkToPalindrome("Sit on a potato pan Otis."));
        assertEquals(true, Main.checkToPalindrome("Cigar? Toss it in a can. It is so tragic."));
        assertEquals(true, Main.checkToPalindrome("Go hang a salami, I'm a lasagna hog."));
        assertEquals(true, Main.checkToPalindrome("Taco cat."));
        assertEquals(true, Main.checkToPalindrome("Nun."));
        assertEquals(true, Main.checkToPalindrome("Mom."));
        assertEquals(true, Main.checkToPalindrome("Madam in Eden, I'm Adam."));
        assertEquals(true, Main.checkToPalindrome("Go deliver a dare vile dog."));
        assertEquals(true, Main.checkToPalindrome("Yo! Banana boy."));
        assertEquals(true, Main.checkToPalindrome("Murder for a jar of red rum."));
        assertEquals(true, Main.checkToPalindrome("On a clover, if alive, erupts a vast pure evil; a fire volcano."));
        assertEquals(false, Main.checkToPalindrome("Go hang a salami, I'm a lasagna hot."));
        assertEquals(false, Main.checkToPalindrome("Cigar? Toss it in a can. It is so tragically."));
        assertEquals(false, Main.checkToPalindrome("Sit on a potato pan Ortis."));
   }
}
