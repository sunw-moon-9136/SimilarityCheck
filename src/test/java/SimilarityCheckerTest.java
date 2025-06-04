import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SimilarityCheckerTest {

    @Nested
    class LengthScoreTest {
        @Test
        void checkWhenOnlySameLength() {
            int expected = 60;

            int actual = SimilarityChecker.check("ABCDEFG", "HIJKLMN");

            assertEquals(expected, actual);
        }

        @Test
        void checkWhenTwiceWithSmallerOneFirst() {
            int expected = 0;

            int actual = SimilarityChecker.check("ABCDEFG", "HIJKLMNOPQRSTU");

            assertEquals(expected, actual);
        }

        @Test
        void checkWhenTwiceWithBiggerOneFirst() {
            int expected = 0;

            int actual = SimilarityChecker.check("HIJKLMNOPQRSTU", "ABCDEFG");

            assertEquals(expected, actual);
        }
    }
}