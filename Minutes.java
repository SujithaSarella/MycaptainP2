import java.util.Scanner;
public class Minutes{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Input the number of minutes: ");
        int minutes = input.nextInt();
        int minutesInYear = 60*24*365;
        int years = (int)(minutes/minutesInYear);
        int days = (int)(minutes/60/24)%365;
        System.out.println((int) minutes + " minutes is approximately " + years + " years and " + days +" days ");
        
    }
}