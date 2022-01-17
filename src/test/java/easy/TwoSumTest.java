package easy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class TwoSumTest {

    private TwoSum twoSum = new TwoSum();
    private int[] solution1 = {0, 1};
    private int[] solution2 = {1, 2};
    private int[] solution3 = {0, 1};

    @Test
    void case1() {
        int[] test1 = {2, 7, 11, 15};
        int target1 = 9;
        int[] result1 = twoSum.solution(test1, target1);
        Arrays.stream(result1).forEach(System.out::println);
        Assertions.assertArrayEquals(solution1, result1);
    }

    @Test
    void case2() {
        int[] test2 = {3, 2, 4};
        int target2 = 6;
        Assertions.assertArrayEquals(solution2, twoSum.solution(test2, target2));
    }

    @Test
    void case3() {
        int[] test3 = {3, 3};
        int target3 = 6;
        Assertions.assertArrayEquals(solution3, twoSum.solution(test3, target3));
    }
}