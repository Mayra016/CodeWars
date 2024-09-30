std::vector<int> divisible_by(std::vector<int> numbers, int divisor)
{   std::vector<int> nums;
 
    for (int num : numbers) {
      if (num % divisor == 0) {
        nums.push_back(num);
      }
    }
 
    return nums;
}
