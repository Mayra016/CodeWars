#include <iostream>
#include <algorithm>

class SortEvenAndOdd
{
public:
    std::vector<int> sortArray(std::vector<int> array)
    { std::vector<int> even = array;
      even.erase(std::remove_if(even.begin(), even.end(), [](int num) {return num % 2 == 0;}), even.end());
      std::sort(even.begin(), even.end());
      int evenLength = 0;
     
      for(int i = 0; i < array.size(); i++) {
        if (array[i] % 2 != 0) {
          array[i] = even[evenLength];
          evenLength++;
        }
      }
     
      return array;
    }
};
