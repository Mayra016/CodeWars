#include <string>
#include <utility>

std::pair<std::string, std::string> capitalize(const std::string &s)
{
  std::string result = s;
  std::string result1 = s;
  bool upper = true;
  
  for(int i = 0; i < result.length(); i++) {
    if (upper) {
      result[i] = toupper(result[i]);
      result1[i] = tolower(result1[i]);
      upper = false;
    } else {
      result[i] = tolower(result[i]);
      result1[i] = toupper(result1[i]);
      upper = true;
    }
    
  }
    return {result, result1};
}
