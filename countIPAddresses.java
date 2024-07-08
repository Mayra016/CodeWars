public class CountIPAddresses {

    public static long ipsBetween(String start, String end) {
        String[] startArray = start.split("\\.");
        String[] endArray = end.split("\\.");
        long result = 0;

        for (int i = 0; i < startArray.length; i++) {
            long startNum = Long.parseLong(startArray[i]);
            long endNum = Long.parseLong(endArray[i]);
            result += (endNum - startNum) * Math.pow(256, 3 - i);
        }

        return result;
    }
}
