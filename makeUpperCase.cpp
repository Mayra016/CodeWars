#include <iostream>
#include <string>
#include <algorithm>
#include <cctype>

std::string makeUpperCase (const std::string& input_str)
{
    std::string result = input_str;
    std::transform(result.begin(), result.end(), result.begin(), ::toupper);
    return result;
}
