#include <vector>
#include <math.h>

int square_sum(const std::vector<int>& numbers)
{ 
  int sum = 0;
  
  for (int num : numbers) {
    sum += pow(num, 2);
  }
  
  return sum;
}
