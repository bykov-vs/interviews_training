package tasks;

import java.util.*;

public class Tasks {
    /**
     * Просуммировать числа с помощью StreamApi
     * @param digits числа для суммирования
     * @return целое число
     */
    public static int sumDigitsByStreamApi(int... digits){
        return Arrays.stream(digits).sum();
    }

    /**
     * Проверить, что строка - палиндром
     * @param word строка для проверки
     * @return true или false
     */
    public static boolean isPalindrome(String word) {
        return new StringBuilder(word)
                .reverse()
                .toString()
                .equals(word);
    }

    /**
     * Удалить дупликаты из массива
     * @param list массив
     * @return массив без повторений
     */
    public List<?> removeDuplicates(List<?> list) {
        return new ArrayList<>(new TreeSet<>(list));
    }

    /**
     * Получить пару первых двух чисел, в сумме дающих нужную сумму
     * @param list массив чисел
     * @param sum целевая сумма
     * @return массив из двух чисел - индексов первой пары
     */
    public static List<Integer> getFirstIndexesOfPairByTargetSum(
            List<Integer> list, Integer sum
    ) {
        if (list.size() < 2) {
            return List.of(-1, -1);
        }
        int firstIndex = -1, secondIndex = -1, first = 0, second = 0;

        for (int i = 0; i < list.size(); i++) {
            first = list.get(i);
            firstIndex = i;
            for (int j = i + 1; j < list.size(); j++){
                second = list.get(j);
                secondIndex = j;
                if (first + second == sum) break;
            }
            if (first + second == sum) break;
        }
        if (first + second == sum) return List.of(firstIndex, secondIndex);
        else return List.of(-1, -1);
    }
}
