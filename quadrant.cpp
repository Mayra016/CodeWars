int quadrant(int x, int y) {
  if ( x > 0 && y > 0 ) {
    return 1;
  }
  
  if ( x > 0 && y < 0 ) {
    return 4;
  }
  
  if ( x < 0 && y > 0 ) {
    return 2;
  }
  
  if ( x < 0 && y < 0 ) {
    return 3;
  }
}
