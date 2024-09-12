int rental_car_cost(int d){
  int rent = 0; 
  
  if (d == 1) {
    return 40;
  }
  if (d > 1) {
    for (int i = 0; i < d; i++) {
      rent += 40;
    }
  }
  
  if (d >= 7) {
    rent -= 50;
  }
  
  if (d >= 3 && d < 7) {
    rent -= 20;
  }
  
  return rent;
}
