public class step2_5 {
    public static void main(String[] args) {

        int [] data = {14,38,9,41,19};
        System.out.println("最小値は"+min(data)+"です。");
    }

    private static int min(int [] data){ 
        int min = Integer.MAX_VALUE;
        for(int i = 1 ; i < data.length; i++){
            min = Math.min(min, data[i]);                                
        }
        return min; 
    }
}
