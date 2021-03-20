public class task2_2 {
    public static void main(String[] args){
        for(int i  = -50; i <= 50; i++){
            if(i % 2 == 0 && i > 0){
                System.out.println(i + "は正の偶数");
            } else if(i % 2 == 1 && i > 0){
                System.out.println(i + "は正の奇数");
            }else if(i % 2 == 0 && i < 0){
                System.out.println(i + "は負の偶数");
            }else if(i == 0){
                System.out.println(i);
            }else{
                System.out.println(i + "は負の奇数");
            }
        }
    }
}
