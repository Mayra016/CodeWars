import java.util.function.Function;

/*
NOTES
In the test the value of the object jSmith will be asigned to the f variable of the class FunctionalProgramming.
To access the values of this object a function muss be created. 
Function<ObjectClass, ReturnType> classVariable = objectName ->
  objectName.method() || objectName.classVariable

  **to access the classVariable directly without a method, this variable must setted as public


TEST
Student jSmith = new Student("John", "Smith", "js123");
assertTrue("John Smith with student number js123 did not return true", FunctionalProgramming.f.apply(jSmith));
*/

public class FunctionalProgramming {
  public static Function<Student, Boolean> f = student ->
            student.getFullName().equals("John Smith") && student.studentNumber.equals("js123");
}

public class Student {
  private final String firstName;
  private final String lastName;
  public final String studentNumber;
  public String getFullName() {
    return firstName + " " + lastName;
  }
  public String getCommaName() {
    return lastName + ", " + firstName;
  }
}
