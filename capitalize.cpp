std::string capitalize(std::string s, std::vector<int> idxs)
{
  for (int num : idxs) {
    s[num] = toupper(s[num]);
  }
  
  return s;
}
