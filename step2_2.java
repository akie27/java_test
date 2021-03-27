import java.util.*;
public class step2_2 {
    public static void main(String args []) {

        Scanner scanner = new Scanner(System.in);

        /* 身長と体重の読み込み */
        System.out.println("BMIの計算:");
	    System.out.print("身長(cm)を入力してください: ");
        double height_cm = scanner.nextDouble();
        System.out.print("体重(kg)を入力してください: ");
        double weight = scanner.nextDouble();

        double height_m = height_cm / 100.0;

        /* BMI の計算 */
        double bmi = weight / ( height_m * height_m );
        System.out.println("BMIは" + String.format("%.1f",bmi) + "です");
    }
}
