#include <algorithm>
#include <iostream>
#include <string>
#include <cctype>

std::string reverse_letter(const std::string &str)
{   std::string result;
    for (char ch : str) {
        if (std::isalpha(ch)) {
            result += ch;
        }
    }
    std::string reversed(result.rbegin(), result.rend());
    return reversed;
}
