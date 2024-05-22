import java.util.HashMap;

public class RockScissorPaperComplex {
  
  public static String rpsls(String player1, String player2){
    HashMap<String, String[]> moves = new HashMap<>();
    
    moves.put("scissors", new String[] {"paper", "lizard"});
    moves.put("paper", new String[] {"rock", "spock"});
    moves.put("rock", new String[] {"lizard", "scissors"});
    moves.put("lizard", new String[] {"spock", "paper"});
    moves.put("spock", new String[] {"scissors", "rock"});

    if (player1.equals(player2)) {
      return "Draw!";
    }  

    for (int i = 0; i < 2; i++) {
      String[] win1 = moves.get(player1);
      String[] win2 = moves.get(player2);
      
      System.out.println(win1[i]);
      
      if (player2.equals(win1[i])) {
        return "Player 1 Won!";
      }
      
      if (player1.equals(win2[i])) {
        return "Player 2 Won!";
      }
    }

    return "Draw!";

  }
}
