class FirstNonConsecutive {
    static Integer find(final int[] array) {
      
        for (int i = 1; i < array.length; i++) {
          if (array[i] - array[i - 1] > 1 && array[i] - array[i - 1] > -1) {
            return array[i - 1] + 2;
          }
        }
      
        return null;
    }
}
