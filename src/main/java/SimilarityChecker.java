public class SimilarityChecker {

    public static final int MAX_LENGTH_SCORE = 60;

    public static int check(String source, String target) {
        return getLengthScore(source, target);
    }

    private static int getLengthScore(String source, String target) {
        String smaller = target;

        if (source.length() == smaller.length())
            return MAX_LENGTH_SCORE;

        int diffLength = source.length() - smaller.length();
        if (diffLength < 0) {
            smaller = source;
            diffLength *= -1;
        }

        if (diffLength >= smaller.length())
            return 0;

        return -1;
    }
}
