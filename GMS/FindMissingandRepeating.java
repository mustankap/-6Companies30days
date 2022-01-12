
class Solve {
    int[] findTwoElement(int arr[], int n) {
        // code here
        Map<Integer, Boolean> numberMap
            = new HashMap<>();
        int b =0,a=0;
        int max = arr.length;

        for (Integer i : arr) {

            if (numberMap.get(i) == null) {
                numberMap.put(i, true);
            }
            else {
                b=i;
            }
        }
        for (int i = 1; i <= max; i++) {
            if (numberMap.get(i) == null) {
                a=i;
            }
        }
        
        return new int[]{b,a};
    }
}
