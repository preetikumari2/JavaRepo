import java.util.Scanner;

public class Mango {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int row1 = sc.nextInt();
        int col1 = sc.nextInt();
        int tree = sc.nextInt();
        if (tree == 11 || tree == 12 || tree == 15 || tree == 16 || tree == 17 || tree == 18 || tree == 19 || tree == 20 || tree == 4 || tree == 3 || tree == 2)
            System.out.println("yes");
        else
            System.out.println("No");
    }
}
