std::vector<int> maps(const std::vector<int> & values) {
  std::vector<int> result = values;
  std::transform(result.begin(), result.end(), result.begin(), [] (int x) {return x * 2;});
  return result;
}
