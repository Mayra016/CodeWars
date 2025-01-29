public class Dinglemouse {

  private String firstName;
  private String lastName;
  
  public Dinglemouse(String firstName, String lastName) {
    this.firstName = firstName.trim();
    this.lastName = lastName.trim();
  }
  
  public String getFullName() { 
    if (this.firstName == " " || this.firstName.isEmpty()) {
      return this.lastName;
    }
    
    if (this.lastName == " " || this.lastName.isEmpty()) {
      return this.firstName;
    }
    
    if (this.lastName == " " && this.firstName == " " || this.firstName.isEmpty() && this.lastName.isEmpty()) {
      return " ";
    }
    
    return this.firstName + " " + this.lastName;
  }
  
}
