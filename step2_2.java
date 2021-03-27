public class step2_2 {
    public static double BMI(double height, double weight) {
        height = height / 100;
        double bmi = weight / (height * height);
        return bmi;
    }
    public static void main(String[] args) {
        double bmi = BMI(170, 60); 
        System.out.println(String.format("%.1f",bmi));
        if( bmi < 18.5 ){
            System.out.println( "低体重" );
        }      
        else if( bmi < 25.0 ){
            System.out.println( "標準" );
        } 
        else{
            System.out.println( "肥満" );
        } 
    }
}
