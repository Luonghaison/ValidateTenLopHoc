import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ClassNameValidator {
    private static final String CLASS_NAME_PATTERN = "^[CAP]\\d{4}[GHIKLM]$";

    private Pattern pattern;
    private Matcher matcher;

    public ClassNameValidator() {
        pattern = Pattern.compile(CLASS_NAME_PATTERN);
    }

    public boolean validate(final String className) {
        matcher = pattern.matcher(className);
        return matcher.matches();
    }
}