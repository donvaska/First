import java.util.*;
public class Calculator {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("პირველი რიცხვი:");
        int i = sc.nextInt();

        Scanner sc2 = new Scanner(System.in);
        System.out.println("ოპერაცია");
        String u = sc2.nextLine();

        Scanner sc1 = new Scanner(System.in);
        System.out.println("მეორე რიცხვი");
        int o = sc1.nextInt();


    }

    public static void calc(String u, int i, int o) {
        int a = 0;
        switch (u) {
        case "+":
            a = i + o;
            System.out.println("ჯამი:" + a );
            break;
        case "-":
            a = i - o;
            System.out.println("სხვაობა" + a);
            break;
        case "*":
            a = i * o;
            System.out.println("ნამრავლი" + a);
            break;
        case "/":
            a = i / o;
            System.out.println("განაყოფი" + a);
            break;
        }
    }


}









