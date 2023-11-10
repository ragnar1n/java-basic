package week8;

public class Ex10 {
    public static void main(String[] args) {
        // Create instances of CivilService and MilitaryService
        CivilService civilService = new CivilService();
        MilitaryService militaryService = new MilitaryService(300);

        // Example usage
        System.out.println("Civil Service Days Left: " + civilService.getDaysLeft());
        civilService.work();
        System.out.println("Civil Service Days Left after work: " + civilService.getDaysLeft());

        System.out.println("Military Service Days Left: " + militaryService.getDaysLeft());
        militaryService.work();
        System.out.println("Military Service Days Left after work: " + militaryService.getDaysLeft());
    }
    public interface NationalService {
        int getDaysLeft();
        void work();
    }
}
