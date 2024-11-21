#include <vector>
#include <bits/stdc++.h>

using namespace std; 

int maxProduct (vector<int>numbers , int sub_size)
{
  std::sort(numbers.begin(), numbers.end(), greater<int>());
  int result = 1;
  
  for (int i = 0; i < sub_size; i++) {
    result *= numbers[i];
  }
  
  return result;
}
