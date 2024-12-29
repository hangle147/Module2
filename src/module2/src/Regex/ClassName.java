package Regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ClassName {
    public static boolean isValidClassName(String className) {
        String regex = "^[CAP]\\d{4}[GHIK]$";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(className);

        return matcher.matches();
    }

    public static void main(String[] args) {
        String[] classNames = {"C0223G", "A0323K", "M0318G", "P0323A"};

        for (String className : classNames) {
            if (isValidClassName(className)) {
                System.out.println(className + " là tên lớp hợp lệ.");
            } else {
                System.out.println(className + " là tên lớp không hợp lệ.");
            }
        }
    }
}
