package com.company;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

class TaskThird {
    private String text = "12345678901234567890.0338295828134 12345678901234567890.0338295828134";

    private String regex = "\\b[1-9]\\d+[0-9]\\.?[0-9]*\\b";
    private Pattern pattern = Pattern.compile(regex);
    private Matcher matcher = pattern.matcher(text);

    private boolean isEquals = false;

    void subTaskFirst(boolean printResult) {
        matcher = pattern.matcher(text);
        String prevSubstr = "";

        while (matcher.find()) {
            System.out.print(text.substring(matcher.start(), matcher.end()) + " ");

            if (text.substring(matcher.start(), matcher.end()).equals(prevSubstr))
                isEquals = true;

            prevSubstr = text.substring(matcher.start(), matcher.end());
        }
        System.out.println();

        if (printResult)
            if (isEquals)
                System.out.println("Строка состоит из двух эквивалентных чисел.");
            else
                System.out.println("Строка не состоит из двух эквивалентных чисел.");
    }

    void subTaskSecond() {
        subTaskFirst(false);

        if (isEquals)
            System.out.println(matcher.replaceAll("*"));
    }
}
