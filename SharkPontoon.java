public class SharkPontoon {
	public static String shark(int pontoonDistance, int sharkDistance,
                             int youSpeed, int sharkSpeed, boolean dolphin) {

    sharkSpeed = dolphin ? (sharkSpeed / 2) : sharkSpeed;
    
    int sharkTime = sharkDistance / sharkSpeed;
    int yourTime = pontoonDistance / youSpeed;
    
    return yourTime < sharkTime ? "Alive!" : "Shark Bait!";
  }
}
