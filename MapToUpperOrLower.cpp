#include <iostream>
#include <string>
#include <algorithm>
#include <cctype>  

std::string MapToUpperOrLower(const std::string& str){
  int lowers = std::count_if(str.begin(), str.end(), [](unsigned char c) { return std::islower(c); });
  int uppers = std::count_if(str.begin(), str.end(), [](unsigned char c) {return std::isupper(c); });
  
  std::string result = str;
  
  if (lowers >= uppers) {
    std::transform(result.begin(), result.end(), result.begin(), ::tolower);
  } else {
    std::transform(result.begin(), result.end(), result.begin(), ::toupper);
  }
  
  return result;
}
