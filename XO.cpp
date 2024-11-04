bool XO(const std::string& str)
{
  int exes = 0;
  int os = 0;
  
  for (char letter : str) {
    if (tolower(letter) == 'x') {
      exes++;
    }
    if (tolower(letter) == 'o') {
      os++;
    }
  }
  
  return exes == os ? true : false;
}
