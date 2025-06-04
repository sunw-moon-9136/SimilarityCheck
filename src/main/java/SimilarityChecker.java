public class SimilarityChecker {

    public static final int MAX_LENGTH_SCORE = 60;

    public static int check(String source, String target) {
        return getLengthScore(source, target);
    }

    private static int getLengthScore(String source, String target) {
        String smaller = target;

        if (source.length() == smaller.length())
            return MAX_LENGTH_SCORE;

        int diffLen = source.length() - smaller.length();
        if (diffLen < 0) {
            smaller = source;
            diffLen *= -1;
        }

        if (diffLen >= smaller.length())
            return 0;

        return (int) ((1 - ((double) diffLen / smaller.length())) * 60);
    }
}
