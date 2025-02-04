import org.testng.annotations.Test;
import tasks.ImmutableList;

import java.util.List;

import static org.testng.Assert.assertEquals;
import static tasks.Tasks.*;

public class TasksTest {
    @Test(
            description = "Проверка суммирования через Stream Api",
            dataProvider = "getRandomDigits",
            dataProviderClass = TasksDataProvider.class
    )
    public void testDigitsSum(int expectedValue, int... digits) {
        assertEquals(
                sumDigitsByStreamApi(digits), expectedValue
        );
    }

    @Test(
            description = "Проверка слов палиндромов",
            dataProvider = "getRandomWords",
            dataProviderClass = TasksDataProvider.class
    )
    public void testPalindromes(boolean expectedValue, String word) {
        assertEquals(
                isPalindrome(word), expectedValue
        );
    }

    @Test(
            description = "Проверка удаления дупликатов из списка",
            dataProvider = "getRandomLists",
            dataProviderClass = TasksDataProvider.class
    )
    public void testRemovingDuplicates(List<?> list, List<?> expectedValue) {
        assertEquals(
                removeDuplicates(list), expectedValue
        );
    }

    @Test(
            description = "Проверка поиска первой пары, дающих целевую сумму",
            dataProvider = "getRandomDigitListsWithSum",
            dataProviderClass = TasksDataProvider.class
    )
    public void testSumPairs(List<Integer> list, int sum, List<?> expectedValue) {
        assertEquals(
                getFirstIndexesOfPairByTargetSum(list, sum), expectedValue
        );
    }
}
