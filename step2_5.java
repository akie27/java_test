public class step2_5 {
    public static void main(String[] args) {

        int array[] = {14,38,9,41,19};
        System.out.println("最小値は"+min(array)+"です。");
    }

    private static int min(int array[]){ 
        int min = array[0];
        for(int i = 0 ; i < array.length; i++){
            if(min > array[i]) {
                min = array[i];
            }                             
        }
        return min; 
    }
}
