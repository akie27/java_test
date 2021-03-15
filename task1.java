public class task1 {
    public static void main(String[] args){
        String test1 = "国語のテスト";
        String test2 = "数学のテスト";
        int sum;
        int score1 = 90;
        int score2 = 70;
        sum = score1 + score2;

        System.out.println(test1 + score1);
        System.out.println(test2 + score2);
        System.out.println(sum);

        if(sum >= 160){
            System.out.println("優");
        }else if(score1 < 40 || score2 < 40){
            System.out.println("追試");
        }else if(sum >= 140 && sum <= 159){
            System.out.println("良");
        }else if(sum >= 100 && sum <= 139){
            System.out.println("可");
        }else if(sum < 100){
            System.out.println("追試");
        
        }
            
    }
}
