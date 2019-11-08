import java.util.regex.Matcher;
import java.util.regex.Pattern;

class TaskThird {
    private String text = "44 44";

    private String regex = "(\\d+) \\1";
    private Pattern pattern = Pattern.compile(regex);

    void subTaskFirst() {
        Matcher matcher = pattern.matcher(text);

        if (matcher.find())
            System.out.println("Строка состоит из двух эквивалентных чисел.");
        else
            System.out.println("Строка не состоит из двух эквивалентных чисел.");
    }

    void subTaskSecond() {
        Matcher matcher = pattern.matcher(text);

        if (matcher.find())
            System.out.println(matcher.replaceAll("*"));
        else
            System.out.println("Строка не состоит из двух эквивалентных чисел.");
    }
}
