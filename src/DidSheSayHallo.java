public class DidSheSayHallo {
    public static boolean validateHello(String greetings){
        String[] language = {"hello","ciao","salut","hallo","hola","ahoj","czesc"};
            for(String greet : language){
                if(greetings.toLowerCase().contains(greet)){
                    return true;
                }
            }
            return false;
      }
      
}
