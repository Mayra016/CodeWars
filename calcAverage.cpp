#include <vector>

double calcAverage(const std::vector<int>& values){
    int sumPtr = 0;

    for (int element : values) {
        sumPtr += element;
    }

    return static_cast<double>(sumPtr) / values.size();
}
