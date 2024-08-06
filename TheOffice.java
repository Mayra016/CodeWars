public class TheOffice {
  public static String boredom(Person[] staff) {
    int scores = 0;
    
    for (Person person : staff) {
      switch (person.department) {
          case "accounts":
            scores += 1;
            break;
          
          case "finance":
            scores += 2;
            break;
          
          case "canteen":
            scores += 10;
            break;
          
          case "regulation":
            scores += 3;
            break;
          
          case "trading":
            scores += 6;
            break;
          
          case "change":
            scores += 6;
            break;
          
          case "IS":
            scores += 8;
            break;
          
          case "retail":
            scores += 5;
            break;
          
          case "cleaning":
            scores += 4;
            break;
          
          case "pissing about":
            scores += 25;
            break;
      }
    }
    
    if (scores <= 80) {
      return "kill me now";
    } else if (scores > 80 && scores < 100) {
      return "i can handle this";
    } else {
      return "party time!!";
    }
  }
}
