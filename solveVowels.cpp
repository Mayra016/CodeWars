#include <string>
#include <vector>
#include <algorithm>

int solve(const std::string &s)
{
    std::vector<char> vowels = {'a', 'e', 'i', 'o', 'u'};
    int current = 0;
    int max = 0;
  
    for (char letter : s) {
      if (std::find(vowels.begin(), vowels.end(), letter) == vowels.end()) {
        current += int(tolower(letter)) - 'a' + 1;
      } else {
        if (current != 0) {
          max = current > max ? current : max;
          current = 0;
        }       
      }
    }
    max = current > max ? current : max;
  
    return max;
}
