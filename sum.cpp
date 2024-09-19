#include<vector>
#include<algorithm>
using namespace std;

int sum(vector<int> numbers)
{
    int sum = 0;
    std::sort(numbers.begin(), numbers.end());
  
    for (int i = 0;  i < numbers.size(); i++) {
      if (i != 0 && i != numbers.size() - 1) {
        sum += numbers[i];
      }
    }
  
    return sum;
}
