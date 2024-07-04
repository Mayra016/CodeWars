import static org.apache.commons.lang3.StringUtils.replace;

public class EmailObfuscator {
    
    public static String obfuscate(String email) {
        email = replace(email, ".", " [dot] ");
        return replace(email, "@", " [at] ");
    }
}
