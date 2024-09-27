import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("문자열 내림차순으로 정렬하기")
class Question02Test {

    @DisplayName("s = \"Zbcdefg\"")
    @Test
    void solution01() {
        String answer01 = Question02.solution("Zbcdefg");
        assertEquals("gfedcbZ", answer01);
    }

    @DisplayName("s = \"abcXYZxyzABC\"")
    @Test
    void solution02() {
        String answer02 = Question02.solution("abcXYZxyzABC");
        assertEquals("zyxcbaZYXCBA", answer02);
    }

}