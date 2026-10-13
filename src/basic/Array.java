package basic;

public class Array {

    static void main() {
            int target = 10;
            int[] arr = {1,3,4,5,6,7,8,9};

            for (int i = 0; i<arr.length; i++) {
                if (arr[i] == target){
                    System.out.println("index of " + target + " is :" + i);
                    return;
                }
            }
        System.out.println("Target is not found!");

    }
}
