#include <vector>
#include <string>

std::string smash(const std::vector<std::string>& words)
{ 
  std::string result = "";
  
  for (std::string word : words) {
    result += word;
    if (words.size() > 1) {
      result += " ";
    }
  }
  
  if (words.size() > 1) {
    result.pop_back();
  }
  
  return result;
}
