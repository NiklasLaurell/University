import java.util.Scanner;
public class CalculateMean {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double sum = 0;
        double antal = 0;
        
        while(scan.hasNextInt()){
            sum +=  scan.nextInt();
            antal++;
            double medel = sum/antal;
            
        System.out.println(medel);  
        }
        
    
        
    }
}