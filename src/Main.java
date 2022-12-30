import java.util.Scanner;
public class Main{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String action = scanner.nextLine();
        switch (action) {
            case "Гриффиндор":
                System.out.println("Смелость");
                break;
            case "Пуффендуй":
                System.out.println("Преданность");
                break;
            case "Слизерин":
                System.out.println("Хитрость");
                break;
            case "Когтевран":
                System.out.println("Интеллект");
                break;
            default:
                System.out.println("Такого факультета нет");
        }
    }
}