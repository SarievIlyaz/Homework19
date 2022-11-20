import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Week[] weeks = Week.values();
        while (true) {
            System.out.print("Англисче кундун атын жаз : ");
            String getWeek = scanner.next().toUpperCase();
            for (Week week : weeks) {
                if (week.name().equals(getWeek)) {
                    switch (week) {
                        case MONDAY -> System.out.println("Дуйшөмбү куну жава окуйм");
                        case TUESDAY -> System.out.println("Шейшемби куну англис тили");
                        case WEDNESDAY -> System.out.println("Шаршемби куну жава окуйм");
                        case THURSDAY -> System.out.println("Бейшемби куну softskills");
                        case FRIDAY -> System.out.println("Жума куну жава окуйм");
                        case SATURDAY -> System.out.println("Ишемби куну дем алыш");
                        case SUNDAY -> System.out.println("Жекшемби куну дем алыш");
                    }
                }
            }
        }
    }
}


