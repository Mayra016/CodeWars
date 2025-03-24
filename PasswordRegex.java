class PasswordRegex {
// asssign your pattern string to REGEX, it will be
// compiled to a Pattern and matched with matches()
    static final String REGEX = "^(?=.*\\p{Lower})(?=.*\\p{Upper})(?=.*\\p{Alpha})(?=.*\\p{Digit})[\\p{Alnum}]{6,}$";

}
