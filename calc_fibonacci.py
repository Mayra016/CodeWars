def fibonacci(x):
  result = []
  
  if x <= 2:
      return [1, 1] if x == 2 else [1]
 
  result = [1, 1]
  
  for i in range(2, x):
      result.append(result[i - 2] + result[i - 1])
  return result
