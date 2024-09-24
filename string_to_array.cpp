#include <vector>
#include <string>
#include <sstream>

std::vector<std::string> string_to_array(const std::string& s) {
  
    std::vector<std::string> result;
    std::istringstream stream(s);
    std::string word = "";
  
    if (s.length() < 1) {
      result.push_back("");
      return result;
    }
  
    while(stream >> word){
      result.push_back(word);
    }
  
    return result;
}
