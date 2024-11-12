package com.clerodri;

import java.util.regex.Pattern;

public class EmailValidator {
    public static final Pattern EMAIL_PATTERN = Pattern.compile(
            "[a-zA-Z0-9\\+\\.\\_\\%\\-\\+]{1,256}" +
                    "\\@" +
                    "[a-zA-Z0-9][a-zA-Z0-9\\-]{0,64}" +
                    "(" +
                    "\\." +
                    "[a-zA-Z0-9][a-zA-Z0-9\\-]{0,25}" +
                    ")+"
    );
    public static Pattern createSubdomainPattern(String domain) {
        // Escape the domain to handle special characters
        String escapedDomain = domain.replace(".", "\\.");
        String patternString = "^(?!-)([A-Za-z0-9-]{1,63}\\.)+" + escapedDomain + "$";
        return Pattern.compile(patternString);
    }
    private boolean mIsValid = false;

    public boolean isValid() {
        return mIsValid;
    }


    public static boolean isValidSubDomain(String domain, String subdomain){
        Pattern subdomainPattern = createSubdomainPattern(domain);
        return subdomain != null && subdomainPattern.matcher(subdomain).matches();
    }

    public static boolean isValidEmail(CharSequence email) {
        return email != null && EMAIL_PATTERN.matcher(email).matches();
    }
}
