#include<string>

int dontGiveMeFive(int start, int end)
{
  int result = 0;
  
  for (int i = start; i <= end; i++) {
    if (std::to_string(i).find("5") == std::string::npos) {
      result++;
    }
  }
  
  return result;
}
