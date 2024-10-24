public class DuckDuckGoose {
  public static String duckDuckGoose(Player[] players, int goose) {
    
    if (goose <= players.length) {
      return players[goose - 1].name;
    }
    
    while (goose > players.length) {
      goose -= players.length;
    }
    
    return players[goose - 1].name;
  }
}
