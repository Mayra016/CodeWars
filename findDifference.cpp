#include <array>

int findDifference(std::array<int, 3> a, std::array<int, 3> b) {
  int areaA = a[0] * a[1] * a[2];
  int areaB = b[0] * b[1] * b[2];
  
  return areaA >= areaB ? areaA - areaB : areaB - areaA;
}
