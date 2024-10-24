
#include <string>
#include <vector>

std::vector<int> wordValue(std::vector<std::string> arr) {
    int sum = 0;
    std::vector<int> sums = {};

    for (size_t i = 0; i < arr.size(); i++) {
        for (char letter : arr[i]) {
            if (letter != ' ') {
                sum += int(letter) - 'a' + 1;
            }
        }
        sums.push_back(sum * (i + 1));
        sum = 0;
    }

    return sums;
}
