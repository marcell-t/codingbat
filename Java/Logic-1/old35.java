public boolean old35(int n) {

  if (n % 5 == 0 ^ n % 3 == 0) return true; // ^ is the bitwise XOR operator
  return false;
  
}
