import org.testng.annotations.DataProvider;

import java.util.ArrayList;
import java.util.List;

public class TasksDataProvider {
    @DataProvider
    public Object[][] getRandomDigits() {
        return new Object[][]{
                {3, 2, 1},
                {24, 8, 8, 8},
                {124, 5, 29, 100, -10}
        };
    }

    @DataProvider
    public Object[][] getRandomWords() {
        return new Object[][]{
                {false, "test"},
                {true, "level"},
                {true, "RadAr"},
                {false, "braIn"}
        };
    }

    @DataProvider
    public Object[] getRandomLists() {
        return new Object[][]{
                {
                    List.of(1, 2, 1, 3, 5, 5, 5, 5),
                    List.of(1, 2, 3, 5)
                },
                {
                    List.of("drr", "brr", "grr", "br", "brr", "frr"),
                    List.of("drr", "brr", "grr", "br", "frr")
                },
                {
                    List.of("bbb", "ggg", "ccc"),
                    List.of("bbb", "ggg", "ccc")
                }
        };
    }

    @DataProvider
    public Object[][] getRandomDigitLists() {
        return new Object[][]{
                {
                    List.of(1, 2, 5, 6, 9, 10), 11, List.of(0, 5)
                },
                {
                    List.of(14, 8, 12, 23, -4, 6, 13), 19, List.of(3, 4)
                },
                {
                    List.of(14, 8, 11, 23, -4, 6, 13), 100, List.of(-1, -1)
                },
                {
                    List.of(14), 19, List.of(-1, -1)
                }
        };
    }
}
