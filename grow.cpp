#include <vector>
int grow(std::vector<int> nums) {
  int result = 1;
  
  for (int num : nums) {
    result *= num;
  }
  
  return result;
}
