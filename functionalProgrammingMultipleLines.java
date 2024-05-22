import java.util.function.ToDoubleFunction;

/*
With the return being specified in the implementation, the function musn't have Function<ObjectClass, ReturnType>

public static Function<ObjectClass> variable = objectName -> {
  data manipulation;
  return result;
}

TESTS
    assertEquals("Incorrect area returned", 25D, FunctionalProgramming.f.applyAsDouble(t), 0.001);
    assertEquals("Incorrect area in Triangle object", 25D, t.getArea(), 0.001);

*/



public class FunctionalProgrammingMultipleLines {
  public static ToDoubleFunction<Triangle> f = triangle -> {
        double area = (triangle.base * triangle.height) / 2.0;
        triangle.setArea(area);
        return area;
  };
}

public class Triangle {
  public final int height;
  public final int base;
  private double area;
  public void setArea(double a) {
    area = a;
  }
  public double getArea() {
    return area;
  }
}
