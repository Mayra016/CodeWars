#include <string>
#include <vector>
#include <sstream>
#include <algorithm>

std::string reverse_words(const std::string& str) {
    std::string reversedWords;
    std::istringstream stream(str);
    std::string result;
    std::string word;
    std::vector<std::string> words;
  
    while (stream >> word) {
      words.push_back(word);
    }
  
    std::reverse(words.begin(), words.end());

    for (int i = 0; i < words.size(); i++) {
      if (i != words.size() - 1) {
        result.append(words[i]);
        result.append(" ");
      } else {
        result.append(words[i]);
      }    
    }
  
    return result;
}
