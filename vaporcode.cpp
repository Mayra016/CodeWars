#include<string>
#include <algorithm>
#include <cctype>

std::string vaporcode(const std::string &str) {
  std::string words = str;
  std::transform(words.begin(), words.end(), words.begin(), ::toupper);
  std::string result = "";
  
  if (str.empty()) {
    return result;
  }
  
  for (char letter : words) {
    if (!std::isspace(letter)) {
      result += letter;
      result += "  ";
    }
  }
  
  result.pop_back();
  result.pop_back();
  
  return result;
}
