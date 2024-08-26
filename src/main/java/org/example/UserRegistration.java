package org.example;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class UserRegistration {

    private static final String userFirstNameRegex = "^[A-Z]{1}[a-z]{2,}$";

    public static boolean validateUserFirstName(String firstName) {
        return Pattern.matches(userFirstNameRegex, firstName);
    }

}
