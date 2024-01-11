import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class Testing {
    @Test
    void problem1(){
        int[] nums = {2,7,11,15};
        int target = 9;
        assertEquals("[0,1]", Main.Problem1(nums,target));
    }
    @Test
    void problem2(){
        int x = 121;
        int x1 = 10;
        assertTrue(Main.Problem2(x));
        assertFalse(Main.Problem2(x1));
    }
    @Test
    void problem3(){
        String[] strs = {"flower", "flow", "flight"};
        assertEquals("fl",Main.Problem3(strs));
    }
    @Test
    void problem4(){
        String num = "III";
        String num1 = "MCMXCIV";
        assertEquals(3,Main.Problem4(num));
        assertEquals(1994,Main.Problem4(num1));
    }
    @Test
    void problem5(){
        String s1 = "()";
        String s2 = "(){}[]";
        String s3  = "(]";
        assertTrue(Main.Problem5(s1));
        assertTrue(Main.Problem5(s2));
        assertFalse(Main.Problem5(s3));
    }
    @Test
    void problem7(){
        int[] digits1 = {1,2,3};
        int[] digits2 = {9};
        assertEquals("[1,2,4]",Main.Problem7(digits1));
        assertEquals("[1,0]",Main.Problem7(digits2));
    }
}
