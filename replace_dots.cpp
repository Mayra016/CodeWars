#include <regex>
#include <string>

std::string replace_dots(const std::string& str)
{
    return std::regex_replace(str, std::regex{ R"(\.)" }, "-");
}
