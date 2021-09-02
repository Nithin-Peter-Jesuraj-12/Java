public class Streak{
    public static void sortArray(int array[], int n){
        for (int i = 1; i < n; i++){
            int j = i;  
            int a = array[i];
            while ((j > 0) && (array[j-1] > a)){
                array[j] = array[j-1];
                j--;
            }
            array[j] = a;
        }
    }
    public static int max(int a, int b){
        if(a < b){
            return b;
        }
        else{
            return a;
        }
    }
    public static void longStreak(int[] nums){        
        int Streak = 1;
        int presentStreak = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i-1]) {
                if (nums[i] == nums[i-1]+1) {
                    presentStreak += 1;
                }
                else {
                    Streak = Math.max(Streak, presentStreak);
                    presentStreak = 1;
                }
            }
        }
        System.out.println(max(Streak, presentStreak));
        System.out.println();
    }
    public static void main(String [] args){
        int array[] = {100,4,200,1,3,2};
        int array1[] = {0,3,7,2,5,8,4,6,0,1};
        sortArray(array,array.length);
        sortArray(array1,array1.length);
        longStreak(array);
        longStreak(array1);
    }
}