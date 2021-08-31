public class BigSmall {
    public static void main(String []args){
       int a;
       int arr[] = {3,5,2,1,7,4,5,8};
       int count = arr.length;
       for (int i = 0; i < count; i++) {
          for (int j = i + 1; j < count; j++) {
             if (arr[i] > arr[j]) {
                a = arr[i];
                arr[i] = arr[j];
                arr[j] = a;
             }
          }
       }
       System.out.print("["+arr[count-1] + " " + arr[count-2] + " " + arr[1] + " " + arr[0] + "]");
    }
 }