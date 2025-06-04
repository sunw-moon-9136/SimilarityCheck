public class SimilarityChecker {

    public static final int MAX_LENGTH_SCORE = 60;
    public static final String ERROR_EMPTY_ARGUMENT = "EMPTY ARGUMENT";

    public static int getScore(String source, String target) {
        requireArgumentNotEmpty(source, target);

        return getLengthScore(source, target);
    }

    private static int getLengthScore(String source, String target) {
        if (isSameLength(source, target))
            return MAX_LENGTH_SCORE;

        String smaller = target;
        int diffLen = source.length() - target.length();
        if (diffLen < 0) {
            smaller = source;
            diffLen *= -1;
        }

        if (isGreaterThanTwiceBetween(diffLen, smaller))
            return 0;

        return (int) getSubScoreByFormula(diffLen, smaller.length());
    }

    private static boolean isSameLength(String source, String target) {
        return source.length() == target.length();
    }

    private static boolean isGreaterThanTwiceBetween(int diffLen, String smaller) {
        return diffLen >= smaller.length();
    }

    private static void requireArgumentNotEmpty(String source, String target) {
        if (source == null || source.isEmpty() || target == null || target.isEmpty())
            throw new IllegalArgumentException(ERROR_EMPTY_ARGUMENT);
    }

    private static double getSubScoreByFormula(double gap, int B) {
        return (1 - (gap / B)) * 60;
    }
}
