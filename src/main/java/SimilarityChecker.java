public class SimilarityChecker {

    public static int check(String source, String target) {
        if (source.length() == target.length())
            return 60;

        int diffLength = target.length() - source.length();
        if (diffLength >= source.length())
            return 0;

        diffLength = source.length() - target.length();
        if (diffLength >= target.length())
            return 0;

        return -1;
    }
}
