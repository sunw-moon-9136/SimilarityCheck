import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SimilarityCheckerTest {

    @Test
    void test() {
        SimilarityChecker similarityChecker = new SimilarityChecker();
        String testStr1 = "ABCDEFG";
        String testStr2 = "HIJKLMN";
        int expected = 60;

        int actual = similarityChecker.check(testStr1, testStr2);

        assertEquals(expected, actual);
    }
}