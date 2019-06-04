import java.util.Scanner;

public class Java_USD2VND {
    public static void main(String[] args) {
        System.out.println("USD to VND inverter here!");
        double usd,vnd,rate;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter USD currency");
        usd = input.nextDouble();
        rate = 23000;
        if (usd > 0) {
            vnd = usd * rate;
            System.out.println(vnd);
        } else {
            System.out.println("out of ability");
        }
    }
}
