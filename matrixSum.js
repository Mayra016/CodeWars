function sum(matrix) {
  let sum = 0;
  let z = 0;
  
  for (let i = 0; i < matrix.length; i++) {
    sum += matrix[i][i];
  }
  for (let i = matrix.length - 1; i > -1; i--) {
    sum += matrix[z][i];
    z++;
  }
  return sum;
}
