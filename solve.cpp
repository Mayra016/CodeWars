#include <iostream>
#include <algorithm>

std::vector<int> solve(std::string s){
    std::vector<int> counts = {0,0,0,0};
  
    for (char letter : s) {
      if (letter == toupper(letter) && isalpha(letter)) {
        counts[0]++;
      }
      if (letter == tolower(letter) && isalpha(letter)) {
        counts[1]++;
      }
      if (std::isdigit(letter)) {
        counts[2]++;
      }
      if (!std::isdigit(letter) && !isalpha(letter)) {
         counts[3]++;
      }
    }
  
    return counts;
}
