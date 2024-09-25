int points(const std::array<std::string, 10>& games) {
    int points = 0;
  
    for (int i = 0; i < games.size(); i++) {
      if (int(games[i][0]) >  int(games[i][2])) {
        points += 3;
      }
      if (int(games[i][0]) ==  int(games[i][2])) {
        points += 1;
      }
    }
  
    return points;
}
