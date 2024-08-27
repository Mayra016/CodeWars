public class DaysInAYear {
   public static String daysInTheYear(int year) {
      if (year % 4 == 0 && year % 100 != 0 || year % 100 == 0 && year % 400 == 0) {
        return String.valueOf(year).concat(" has 366 days");
      }
      return String.valueOf(year).concat(" has 365 days");
   }
}
