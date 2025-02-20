
import java.util.Scanner;

public class UniversityManagementSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("\nUniversity Management System Menu:");
            System.out.println("1. Add Student");
            System.out.println("2. View Students");
            System.out.println("3. Add Professor");
            System.out.println("4. View Professors");
            System.out.println("5. Add Admin Staff");
            System.out.println("6. View Admin Staff");
            System.out.println("7. Add Course");
            System.out.println("8. View Courses");
            System.out.println("9. Delete Data");
            System.out.println("10. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter Name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter Student ID: ");
                    String studentID = scanner.nextLine();
                    System.out.print("Enter Age: ");
                    int age = scanner.nextInt();
                    scanner.nextLine(); // Consume newline

                    Student student = new Student(name, studentID, age);
                    student.displayInfo();
                    ReportGenerator.saveToFile("students.txt", name + ", " + studentID + ", " + age);
                    break;

                case 2:
                    System.out.println("\nStudent Records:");
                    ReportGenerator.readFromFile("students.txt");
                    break;

                case 3:
                    System.out.print("Enter Professor Name: ");
                    String profName = scanner.nextLine();
                    ReportGenerator.saveToFile("professors.txt", profName);
                    break;

                case 4:
                    System.out.println("\nProfessor Records:");
                    ReportGenerator.readFromFile("professors.txt");
                    break;

                case 5:
                    System.out.print("Enter Admin Staff Name: ");
                    String adminName = scanner.nextLine();
                    ReportGenerator.saveToFile("admin_staff.txt", adminName);
                    break;

                case 6:
                    System.out.println("\nAdmin Staff Records:");
                    ReportGenerator.readFromFile("admin_staff.txt");
                    break;

                case 7:
                    System.out.print("Enter Course Name: ");
                    String courseName = scanner.nextLine();
                    ReportGenerator.saveToFile("courses.txt", courseName);
                    break;

                case 8:
                    System.out.println("\nCourse Records:");
                    ReportGenerator.readFromFile("courses.txt");
                    break;

                case 9:
                    System.out.println("\nSelect Data to Delete:");
                    System.out.println("1. Students");
                    System.out.println("2. Professors");
                    System.out.println("3. Admin Staff");
                    System.out.println("4. Courses");
                    System.out.print("Enter your choice: ");
                    int deleteChoice = scanner.nextInt();
                    scanner.nextLine(); // Consume newline

                    switch (deleteChoice) {
                        case 1:
                            ReportGenerator.deleteFileContents("students.txt");
                            System.out.println("Student records deleted.");
                            break;
                        case 2:
                            ReportGenerator.deleteFileContents("professors.txt");
                            System.out.println("Professor records deleted.");
                            break;
                        case 3:
                            ReportGenerator.deleteFileContents("admin_staff.txt");
                            System.out.println("Admin staff records deleted.");
                            break;
                        case 4:
                            ReportGenerator.deleteFileContents("courses.txt");
                            System.out.println("Course records deleted.");
                            break;
                        default:
                            System.out.println("Invalid choice.");
                    }
                    break;

                case 10:
                    System.out.println("Exiting program...");
                    scanner.close();
                    System.exit(0);
                    break;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
