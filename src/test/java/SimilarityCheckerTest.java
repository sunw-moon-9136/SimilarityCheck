import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SimilarityCheckerTest {

    @Nested
    class LengthScoreTest {
        @Test
        void checkWhenOnlySameLength() {
            int expected = 60;

            int actual = SimilarityChecker.getScore("ABCDEFG", "HIJKLMN");

            assertEquals(expected, actual);
        }

        @Test
        void checkWhenTwiceWithSmallerOneFirst() {
            int expected = 0;

            int actual = SimilarityChecker.getScore("ABCDEFG", "HIJKLMNOPQRSTU");

            assertEquals(expected, actual);
        }

        @Test
        void checkWhenTwiceWithBiggerOneFirst() {
            int expected = 0;

            int actual = SimilarityChecker.getScore("HIJKLMNOPQRSTU", "ABCDEFG");

            assertEquals(expected, actual);
        }

        @Test
        void checkWhenLessThanTwiceWithSmallerOneFirst() {
            int expected = 30;

            int actual = SimilarityChecker.getScore("AB", "CDE");

            assertEquals(expected, actual);
        }

        @Test
        void checkWhenLessThanTwiceWithBiggerOneFirst() {
            int expected = 30;

            int actual = SimilarityChecker.getScore("ABC", "EF");

            assertEquals(expected, actual);
        }

    }
}