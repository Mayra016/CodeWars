#include <string>

std::string double_char(const std::string& str)
{ 
  std::string result = "";
  for (int i = 0; i < str.length(); i++) {
    result += str[i];
    result += str[i];
  }
  return result;
}
