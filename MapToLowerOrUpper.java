public class MapToLowerOrUpper {
    public static String solve(final String str) {
        int lowers = (int) str.chars().filter(Character::isLowerCase).count();
        int uppers = (int) str.chars().filter(Character::isUpperCase).count();
      
        return lowers >= uppers ? str.toLowerCase() : str.toUpperCase();
    }
}
