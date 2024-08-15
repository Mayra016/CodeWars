#include <vector>

std::vector<int> humanYearsCatYearsDogYears(int humanYears) {
  std::vector<int> years = {humanYears, 15, 15};
  
  if (humanYears - 2 >= 0) {
    years[1] += 9;
    years[2] += 9;
  }
  
  if (humanYears - 2 > 0) {
    years[1] += 4 * (humanYears - 2);
    years[2] += 5 * (humanYears - 2);
  }
  
  return years;
  
}
