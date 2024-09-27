import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("제일 작은 수 제거하기")
class Question01Test {

    @DisplayName("arr = {4,3,2,1}")
    @Test
    void solution01() {
        int[] answer01 = Question01.solution(new int[]{4, 3, 2, 1});
        assertArrayEquals(new int[]{4, 3, 2}, answer01);
    }

    @DisplayName("arr = {10}")
    @Test
    void solution02() {
        int[] answer02 = Question01.solution(new int[]{10});
        assertArrayEquals(new int[]{-1}, answer02);
    }

    @DisplayName("arr = {5, 3, 1, 4, 2}")
    @Test
    void solution03() {
        int[] answer03 = Question01.solution(new int[]{5, 3, 1, 4, 2});
        assertArrayEquals(new int[]{5, 3, 4, 2}, answer03);
    }
}