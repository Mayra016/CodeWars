#include <vector>
#include <algorithm>

int sum_of_minimums(const std::vector<std::vector<int>> &numbers)
{   
    int result = 0;
  
    for ( std::vector<int> array : numbers) {
      std::sort(array.begin(), array.end());
      result += array[0];
    }
  
    return result;
}
