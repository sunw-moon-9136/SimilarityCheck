import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SimilarityCheckerTest {

    @Test
    void checkWhenOnlySameLength() {
        int expected = 60;

        int actual = SimilarityChecker.check("ABCDEFG", "HIJKLMN");

        assertEquals(expected, actual);
    }

    @Test
    void checkWhenTwiceLengthAndNotMatched() {
        int expected = 0;

        int actual = SimilarityChecker.check("ABCDEFG", "HIJKLMNOPQRSTU");

        assertEquals(expected, actual);
    }
}