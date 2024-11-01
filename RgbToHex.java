public class RgbToHex {

    public static String rgb(int r, int g, int b) {
      int[] nums = {r, g, b};
      
      for (int i = 0; i < 3; i++) {
        nums[i] = Math.max(0, Math.min(255, nums[i]));
      }
      
      return String.format("%02X%02X%02X", nums[0], nums[1], nums[2]);
    }
}
