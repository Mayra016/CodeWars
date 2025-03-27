public class ToastTest {
  public static int sixToast(int num){
    int rest = num % 6;
    if ( num > 6) {
      return num - 6;
    }
    
    if (num == 0) {
      return 6;
    }
    
    return rest != 0 ? 6 - rest : 0;
  }
}
