import org.testng.annotations.Test;
import tasks.ImmutableList;

import java.util.*;

import static org.testng.Assert.*;
import static tasks.Tasks.*;

public class TasksTest {
    @Test(
            dataProvider = "getRandomDigits",
            dataProviderClass = TasksDataProvider.class
    )
    public void testDigitsSum(int expectedValue, int... digits) {
        assertEquals(
                sumDigitsByStreamApi(digits), expectedValue
        );
    }

    @Test(
            dataProvider = "getRandomWords",
            dataProviderClass = TasksDataProvider.class
    )
    public void testPalindromes(boolean expectedValue, String word) {
        assertEquals(
                isPalindrome(word), expectedValue
        );
    }

    @Test(
            dataProvider = "getRandomLists",
            dataProviderClass = TasksDataProvider.class
    )
    public void testRemovingDuplicates(List<?> list, List<?> expectedValue) {
        assertEquals(
                removeDuplicates(list), expectedValue
        );
    }

    @Test(
            dataProvider = "getRandomDigitLists",
            dataProviderClass = TasksDataProvider.class
    )
    public void testSumPairs(List<Integer> list, int sum, List<?> expectedValue) {
        assertEquals(
                getFirstIndexesOfPairByTargetSum(list, sum), expectedValue
        );
    }
}
