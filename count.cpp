#include <map>
#include <set>
#include <string>

std::map<char, unsigned> count(const std::string& string) {
  std::map<char, unsigned> result;
  
  if (string.length() < 1) {
    return result;
  }
  
  std::set<char> letters(string.begin(), string.end());

  
  for (char letter : letters) {
    unsigned count = std::count(string.begin(), string.end(), letter);
    result[letter] = count;
  }
  
  return result;
}
