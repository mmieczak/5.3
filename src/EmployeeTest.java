import java.util.Scanner;

public class EmployeeTest {

    public static void main(String[] args) {

        int employeeMax = 5;
        double totalWages = 0;
        Employee[] employees = new Employee[employeeMax];

        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < employees.length; i++) {
            System.out.print(" Name :");
            String name = scanner.nextLine();
            System.out.print(" Surname: ");
            String surname = scanner.nextLine();
            System.out.print(" Salary: ");
            String salary = scanner.nextLine();
            employees[i] = new Employee(name, surname, Double.parseDouble(salary));
            System.out.print("Add another one? y/n : ");
            String nextOne = scanner.nextLine();
            if (!nextOne.equalsIgnoreCase("y")) {
                break;
            }
        }
        scanner.close();

        for (Employee employee : employees) {
            if (employee != null) {
                totalWages += employee.getSalary();
                System.out.println(employee);
            }
        }

        System.out.println("Total wages: " + totalWages);
    }
}
