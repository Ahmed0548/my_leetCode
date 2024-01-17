 static int equivalentArray(int[] a1, int[] a2) {
        HashSet<Integer> set1 = new HashSet<Integer>();
        HashSet<Integer> set2 = new HashSet<Integer>();
        for (int num : a1) {
        set1.add(num);
        }
        for (int num : a2) {
        set2.add(num);
         }
  return set1.equals(set2) ? 1 : 0;
    }
}
