#include <vector>

char findMissingLetter(const std::vector<char>& chars)
{
  for (int i = 0; i < chars.size() - 1; i++) {
    if ((tolower(chars[i + 1]) - '0') - (tolower(chars[i]) - '0') != 1) {
      return chars[i] + 1;
    }
  }
  return ' ';
}
