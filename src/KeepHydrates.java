public class KeepHydrates {
    public static int Liters(double time)  {
        return (int) (time * 0.5);
      }
    public static void main(String[] args) throws Exception {
        System.out.println(Liters(11.8));
    }
}
