long long factorial(int n){
  long result = 1;
  
  for (long i = n; i > 0; i--) {
    result *= i;
  }
  
  return result; 
}
