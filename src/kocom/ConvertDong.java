package kocom;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ConvertDong {
    public static String convertDong(String dong) {
        Matcher matcher = Pattern.compile("[A-Z]").matcher(dong);
        StringBuffer result = new StringBuffer();

        while (matcher.find()) {
            char originalChar = matcher.group().charAt(0);
            int convertedChar = originalChar - 'A' + 101;
            matcher.appendReplacement(result, String.valueOf(convertedChar));
        }
        matcher.appendTail(result);

        System.out.println(result);

        return result.toString();
    }

    public static String convertNumberToAlphabet(String numbers) {
        Matcher matcher = Pattern.compile("\\b(1[01][0-9]|12[0-6])\\b").matcher(numbers);
        StringBuffer result = new StringBuffer();

        while (matcher.find()) {
            String matchedNumber = matcher.group();
            int number = Integer.parseInt(matchedNumber);
            char convertedChar = (char) ('A' + number - 101);
            matcher.appendReplacement(result, String.valueOf(convertedChar));
        }
        matcher.appendTail(result);

        System.out.println(result);

        return result.toString();
    }
}
