#include <string>

std::string sum_str(const std::string& a, const std::string& b) {
    int varA = a.empty() ? 0 : std::stoi(a);
    int varB = b.empty() ? 0 : std::stoi(b);

    return std::to_string(varA + varB);
}
