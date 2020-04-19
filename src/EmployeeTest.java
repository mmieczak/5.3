import java.util.Scanner;

public class EmployeeTest {

    public static void main(String[] args) {

        int employeeMax = 5;
        double totalWages = 0;
        Employee[] employees = new Employee[employeeMax];

        //with one scanner only it does not work correctly, sometimes it jumps reading Line and goes to another stdin assigment
        //for instance does not read Name and goes to Surname leaving name empty
        Scanner scanner1 = new Scanner(System.in);
        Scanner scanner2 = new Scanner(System.in);
        Scanner scanner3 = new Scanner(System.in);
        Scanner scanner4 = new Scanner(System.in);

        for (int i = 0; i < employees.length; i++) {
            System.out.print(" Name :");
            String name = scanner1.nextLine();
            System.out.print(" Surname: ");
            String surname = scanner2.nextLine();
            System.out.print(" Salary: ");
            String salary = scanner3.nextLine();
            employees[i] = new Employee(name, surname, Double.parseDouble(salary));
            System.out.print("Add another one? y/n : ");
            String nextOne = scanner4.next();
            if (!nextOne.equalsIgnoreCase("y")) {
                break;
            }
        }
        scanner1.close();
        scanner2.close();
        scanner3.close();
        scanner4.close();

        for (Employee employee : employees) {
            if (employee != null) {
                totalWages += employee.getSalary();
                System.out.println(employee);
            }
        }

        System.out.println("Total wages: " + totalWages);
    }
}
