#include <cctype>     
#include <string>  
#include <algorithm>

std::string makeUpperCase (const std::string& input_str)
{
    std::string result = input_str;
    std::transform(result.begin(), result.end(), result.begin(), [](unsigned char c) {
        return std::toupper(c);
    });
    return result;
}
