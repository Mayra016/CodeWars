import java.util.List;

public class Rotations {
    
    public static boolean containAllRots(String strng, List<String> arr) {
        if (strng.isEmpty()) return true;
        
        int n = strng.length();
        
        for (int i = 0; i < n; i++) {
            String rotation = strng.substring(i) + strng.substring(0, i);
            if (!arr.contains(rotation)) { 
                return false;
            }
        }
        
        return true;
    }
}
