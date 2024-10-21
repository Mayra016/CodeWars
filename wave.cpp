#include <string>
#include <vector>
#include <algorithm>
#include <cctype> 

std::vector<std::string> wave(std::string y){
  std::vector<std::string> result = {};
  
  for (int i = 0; i < y.length(); i++) {
    if (std::isalpha(y[i])) {
      std::string word = y;
      word[i] = toupper(y[i]);
      result.push_back(word);
    }  
  }
  
  return result;
}
