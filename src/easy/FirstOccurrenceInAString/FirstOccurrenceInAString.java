package easy.FirstOccurrenceInAString;

import java.util.Objects;

public class FirstOccurrenceInAString {
    public static int solution(String haystack, String needle) {
        if(Objects.equals(haystack, needle)) {
            return 0;
        }

        for(int i = 0; i < haystack.length(); i++) {
            int end = i + needle.length();
            if(end > haystack.length()) {
                end = haystack.length();
            }
            String subStr = haystack.substring(i, end);
            if(subStr.equals(needle)) {
                return i;
            }
        }

        return -1;
    }
}
