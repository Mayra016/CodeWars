import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Comparator;

public class AllocateRoomsHotel {
	public static void main(String[] args) {
	    int[][] clients = {{15, 22}, {2, 4}, {6, 9}, {3, 33}, {12, 21}};
		System.out.println(Arrays.toString(allocateRooms(clients)));
	}
	
	public static int[] allocateRooms(int[][] customers) {
      // Each customer is represented by a pair of integers, their arrival and departure days.
      // This is why the second component of the array is needed.
         int[] rooms = new int[customers.length];
         int[][] customersIndex = Arrays.copyOf(customers, customers.length);
         int[] roomOuts = new int[customers.length];
         int[] roomIn = new int[customers.length];
         int[] result = new int[customers.length];
         
         Arrays.sort(customers, Comparator.comparingInt(a -> a[0]));
         
         for (int i = 0; i < customers.length; i++) {
             for (int x = 0; x < newRooms; x++) {
                 if (customers[i][0] > roomOuts[x]) {
                     rooms[i] = x + 1;
                     roomOuts[x] = customers[i][1];
                     break;
                 }
                 if (customers[i][1] < roomIn[x]) {
                     rooms[i] = x + 1;
                     roomIn[x] = customers[i][0];
                     break;
                 }
             }
              
             if (rooms[i] == 0) {
               rooms[i] = newRooms;
               newRooms++;
             }

           
         }
         
         
         for (int i = 0; i < customersIndex.length; i++) {
             for (int x = 0; x < customersIndex.length; x++) {
                 if (customersIndex[i][0] == customers[x][0] && customersIndex[i][1] == customers[x][1]) {
                     result[i] = rooms[x];
                 }
             }
         }

         
         return result;
    }
}
