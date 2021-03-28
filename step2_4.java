import javax.naming.spi.DirStateFactory.Result;

public class step2_4 {
    int result;
    private static int num(int i, int j){
        return i * j;
    }

    public static void main(String[] args){
        int i = num(7,1);     
        for(int j = 1; j < 10; j++) {
            System.out.print("," + num(7,1));        
        }  
    }  
}
