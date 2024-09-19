std::string to_alternating_case(const std::string& str)
{
  std::string result = str;
  
  for (int i = 0; i < str.length(); i++) {
    if (result[i] == std::toupper(str[i])) {
      result[i] = std::tolower(str[i]);
    } else {
      result[i] = std::toupper(str[i]);
    }
  }
  
	return result;
}
