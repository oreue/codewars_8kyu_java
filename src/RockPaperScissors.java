public class RockPaperScissors {
    
    public static String rps(String p1, String p2) {
        if (p1 == p2) return "Draw!";
        int p = (p1 + p2).equals("scissorspaper") || (p1 + p2).equals("rockscissors") 
        || (p1 + p2).equals("paperrock") ? 1 : 2;
        return "Player " + p + " won!";
    }
}