#include <vector>
#include <array>
#include <algorithm>

std::array<int, 2> two_oldest_ages(std::vector<int> ages)
{   
    
    std::sort(ages.begin(), ages.end());
    std::array<int, 2> oldest = {ages[ages.size() - 2], ages[ages.size() - 1]};
    
    return oldest;
}
