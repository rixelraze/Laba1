import java.util.Scanner;

public class ageTest {
    Scanner scanner = new Scanner(System.in);
    int year = 2022;
    int age = scanner.nextInt();

    public ageTest() {
    }

    public void testing() {
        if (age < 0) {
            System.out.println("Отрицательное значение возраста");
            System.exit(0);
        } else if (age > year) {
            System.out.println("Год рождения больше текущего");
        } else {
            System.out.println("Успешно!");

        }

    }


}
