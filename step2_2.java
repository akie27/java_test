public class step2_2 {
    public static double BMI(double height, double weight) {
        height = height / 100;
        double bmi = weight / (height * height);

        String str = "低体重,標準,肥満";
        String[] str1 = str.str1("低体重");
        String[] str2 = str.str2("標準");
        String[] str3 = str.str3("肥満");
        return str;
    }
    public static void main(String[] args) {
        double bmi = BMI(170, 60); 
        System.out.println(String.format("%.1f",bmi));
        if( bmi < 18.5 ){
            System.out.println(str1);
        }      
        else if( bmi < 25.0 ){
            System.out.println(str2);
        } 
        else{
            System.out.println(str3);
        } 
    }
}
