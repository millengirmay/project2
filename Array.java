public class Array {
    /* Max Element
    public static int findMax(int[] array) {
        int max = array[0];
        for (int num : array) {
            if (num > max) {
                max = num;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int[] nums = {3, 5, 7, 2, 8};
        System.out.println("Maximum Element: " + findMax(nums));
    }*/
    public static void main(String[] args) {
        int[] arr = {10,20,5,40,30};
        int max = arr[0];
        for(int i= 1; i< arr.length; i++){
            if (arr[i]> max){
                max = arr[i];
            }
        }
        System.out.println("Largest element is : "+ max);
    }
}
