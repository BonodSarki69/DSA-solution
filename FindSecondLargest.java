package Array;

public class FindSecondLargest {

    public static void main(String[] args) {
        int[] a = {5, 6, 4, 8, 10, 18, 15, 20};
        int max1, max2;
        if(a[0] > a[1]){
            max1 = a[0];
            max2 = a[1];
        }else{
            max2 = a[0];
            max1 = a[1];
        }
        for(int i = 2; i < a.length; i++){
            if (a[i] > max1){
                max2 = max1;
                max1 = a[i];
            }else if(a[i] > max2){
                max2 = a[i];
            }
        }
        System.out.println(max2);
    }
    
}