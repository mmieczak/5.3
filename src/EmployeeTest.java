import java.util.Scanner;

public class EmployeeTest {

    public static void main(String[] args) {

        Company company = new Company(new Employee[100]);
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < company.getEmployees().length; i++) {
            System.out.print(" Name :");
            String name = scanner.nextLine();
            System.out.print(" Surname: ");
            String surname = scanner.nextLine();
            System.out.print(" Salary: ");
            String salary = scanner.nextLine();
            //Add new Employee to company collection of Employees
            company.addEmployee(new Employee(name, surname, Double.parseDouble(salary)));
            System.out.print("Add another one? y/n : ");
            String nextOne = scanner.nextLine();
            if (!nextOne.equalsIgnoreCase("y")) {
                break;
            }
        }
        scanner.close();

        System.out.println(">>>>>>>>>>>>>>>>>>>");
        System.out.println("Show all employees from database");
        for (int i = 0; i < company.getEmployees().length; i++)
            if (company.get(i) != null)
                System.out.println(company.get(i));
    }
}
