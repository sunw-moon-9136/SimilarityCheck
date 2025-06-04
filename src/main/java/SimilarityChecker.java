public class SimilarityChecker {

    public static int check(String source, String target) {
        if (source.length() == target.length())
            return 60;

        if (target.length() - source.length() >= source.length())
            return 0;

        return 0;
    }
}
