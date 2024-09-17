#include <vector>

std::vector<int> reverseSeq(int n) {
  std::vector<int> nums(n);
  int index = 0;
  
  for (int i = n; i > 0; i--) {
    nums[index] = i;
    index++;
  }
  
  return nums;
}
