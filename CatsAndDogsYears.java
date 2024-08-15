public class CatsAndDogsYears {

  public static int[] humanYearsCatYearsDogYears(final int humanYears) {
    int[] years = new int[3];
    
    if (humanYears >= 1) {
      years[0] += humanYears;
      years[1] += 15;
      years[2] += 15;
    }
    
    if (humanYears - 2 >= 0) {
      years[1] += 9;
      years[2] += 9;
    }
    
    if (humanYears - 2 > 0) {
      int yearsPlus = humanYears - 2;
      years[1] += 4 * yearsPlus;
      years[2] += 5 * yearsPlus;
    }
    
    return years;
  }

}
