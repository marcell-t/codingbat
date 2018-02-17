public boolean nearTen(int num) {
  
  int newNum = num % 10;
  
  if (newNum <= 2 || (newNum >= 8 && newNum <= 10)) return true; //first checks if 2 greater than 10, last checks if two less than 10
  return false;
  
}
