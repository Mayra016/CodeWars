#include <vector>

std::vector<int> countPositivesSumNegatives(std::vector<int> input)
{
    if (input.size() == 0) {
      return {};
    }
  
    int sum = 0;
    int count = 0;
  
    for (int i = 0; i < input.size(); i++) {
      if (input[i] > 0) {
        count++;
      }
      
      if (input[i] < 0) {
        sum += input[i];
      }
    }
  
  
    std::vector<int> result(2);
    
    result[0] = count;
    result[1] = sum;
  
    return result;
}
