// This is a Basic Calculator. It was created by Maria in 2022.

public class Calculator{
  public Calculator() {

  }
  
public int add(int a, int b) {
  return a + b;

}
public int subtract(int a, int b) {
  return a - b;

}
public int multiply(int a, int b) {
  return a * b;

}
public int divide(int a, int b) {
  return a / b;

}
public int modulo(int a, int b) {
  return a % b;

}
// main
public static void main(String[] args) {

  Calculator myCalculator = new Calculator();

  System.out.println(myCalculator.add(5, 7));

  System.out.println(myCalculator.subtract(45, 11));

  }
}
