public class Main {
  public static void main(String[] args) {
//   0 1 1 2 3 5 8 13 21 34 55 ...
//   n = 1 --> 0   - базовый
//   n = 2 --> 1   - базовый
//   n = 3 --> 1 = 1 + 0
//   n = 4 --> 2 = 1 + 1
//   ...
//   n = 9 --> 21= 8 + 13
//   f(9) --> f(9-1) + f(9-2)
//            f(8)   + f(7)
//            f(7) + f(6)   + f(6) + f(5)
//            f(6)+f(5) + f(5)+f(4)  + f(5)+f(4) + ...
    System.out.println(f(9));
    System.out.println(f(1));
    System.out.println(sum(3));
  }

  public static int f(int n) {
    if (n == 1) {
      return 0;
    }
    if (n == 2) {
      return 1;
    }
    return f(n - 1) + f(n - 2);
  }

  //  0 1 2 3 == 6
//  n = 0;  sum(0) -> 0; база рекурсии
//  n = 1;  1 + sum(0)
//  n = 2;  2 + sum(1)
  public static int sum(int n) {
    if (n == 0) {
      return 0;
    }
    return n + sum(n - 1);
  }
}