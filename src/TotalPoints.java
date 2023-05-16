public class TotalPoints {
  
    public static int points(String[] games) {
      int res = 0;
        
        for(String match : games){
          char ourScore = match.charAt(0), theirScore = match.charAt(2);
          res += ourScore > theirScore ? 3 : theirScore == ourScore ? 1 : 0;
        }
        return res;
    }
}