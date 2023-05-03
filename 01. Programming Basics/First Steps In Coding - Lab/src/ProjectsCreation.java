import java.util.Scanner;

public class ProjectsCreation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String architectName = scanner.nextLine();
        int numberOfProjects = Integer.parseInt(scanner.nextLine());
        int timePerProject = 3;
        int hours = numberOfProjects * timePerProject;

        System.out.printf("The architect %s will need %d hours to complete %d project/s.", architectName, hours, numberOfProjects);
    }
}
