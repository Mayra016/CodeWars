import java.util.concurrent.TimeUnit;

public class MakeSlow {
    public static void makeMeSlow() {
        for (int i = 0; i < 1000000; i++) {
          
        }
      
        try {
            TimeUnit.SECONDS.sleep(7);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}
