package school.mjc.stage0.conditions.finalTask;

public class DaysInMonth {
    public void printDays(int year, int month) {
        if (year < 0 || month < 1 || month > 12) {
            System.out.println("invalid date");
            return; // Завершаем метод, если дата невалидна
        }

        boolean isLeapYear = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);

        switch (month) {
            case 2:
                System.out.println(isLeapYear ? "29" : "28");
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println("30");
                break;
            default: // Все остальные месяцы имеют 31 день
                System.out.println("31");
        }
    }
}
