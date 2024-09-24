#include <string>
#include <algorithm>
#include <cctype>

using namespace std;

int getCount(const string& inputStr){
  int num_vowels = 0;
  string word = inputStr;
  transform(word.begin(), word.end(), word.begin(), ::tolower);
  vector<char> vowels = {'a', 'e', 'i', 'o', 'u'};
  
  for (char letter : word) {
    if (find(vowels.begin(), vowels.end(), letter) != vowels.end()) {
      num_vowels++;
    }
  }
  
  return num_vowels;
}
