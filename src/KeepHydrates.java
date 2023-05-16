public class KeepHydrates {
    public static int Liters(double time)  {
        int ans = (int) Math.floor(time * 0.5);
        return ans;
      }
    public static void main(String[] args) throws Exception {
        System.out.println(Liters(11.8));
    }
}
