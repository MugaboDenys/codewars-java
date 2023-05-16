public class Digit {
    public class SquareDigit {

        public int squareDigits(int n) {
          String num = String.valueOf(n);
              String[] nums = num.split("");
              int res = 0;
              String sqrd = "";
              
              for(String x : nums){
                  int sqr = Integer.parseInt(x) * Integer.parseInt(x);
                    sqrd += String.valueOf(sqr);
                    res = Integer.parseInt(sqrd);
                   
              }
              return res;
        }
      
      }
}
