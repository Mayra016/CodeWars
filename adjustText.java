public class AdjustText {
	public static void main(String[] args) {
	    String LIPSUM = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Vestibulum sa"
            + "gittis dolor mauris, at elementum ligula tempor eget. In quis rhoncus nunc, at aliquet orci. Fusc"
            + "e at dolor sit amet felis suscipit tristique. Nam a imperdiet tellus. Nulla eu vestibulum urna. V"
            + "ivamus tincidunt suscipit enim, nec ultrices nisi volutpat ac. Maecenas sit amet lacinia arcu, no"
            + "n dictum justo. Donec sed quam vel risus faucibus euismod. Suspendisse rhoncus rhoncus felis at f"
            + "ermentum. Donec lorem magna, ultricies a nunc sit amet, blandit fringilla nunc. In vestibulum vel"
            + "it ac felis rhoncus pellentesque. Mauris at tellus enim. Aliquam eleifend tempus dapibus. Pellent"
            + "esque commodo, nisi sit amet hendrerit fringilla, ante odio porta lacus, ut elementum justo nulla"
            + " et dolor.";
		System.out.println(justify(LIPSUM, 30));
	}
	
	public static String justify(String text, int width) {
        String[] words = text.split(" ");
        int line = 0;
        StringBuilder justified = new StringBuilder();
        
        for (int i = 0; i < words.length; i++) {
          line += words[i].length();
          
          if (i < words.length - 1 && line + 1 + words[i + 1].length() <= width) {
            line += 1;
            justified.append(words[i] + " ");
          } else {
            line = 0;
            if (i != words.length - 1) {
              justified.append(words[i] + "\n");
            } else {
              justified.append(words[i]);
            }
            
          }
        }
        
        
        return justified.toString();
    }
}
