public class task3 {
    public static void main( String[] args ) {
        double h = 150;
        double w = 45;
        double bmi;

        h *= 0.01;  // cm --> m
        bmi = w / (h*h);

        System.out.println( "BMI指数は " + Math.round( bmi*10.0 )/10.0 );
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
