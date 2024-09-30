#include <vector>
#include <numeric>

int arrayPlusArray(std::vector<int> a, std::vector<int> b) { 
  return std::accumulate(begin(a), end(a), 0, std::plus<int>()) + std::accumulate(begin(b), end(b), 0, std::plus<int>());
}
