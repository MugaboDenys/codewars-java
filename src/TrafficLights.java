public class TrafficLights {
    public static String updateLight(String current) {
  
        return current == "red" ? "green" : current == "green" ? "yellow" : "red" ;
      }
      
}
