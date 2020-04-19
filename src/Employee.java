public class Employee {
  /*  Zdefiniuj klasę Employee (pracownik) z kilkoma polami jak imię, nazwisko, wypłata.
    W osobnej klasie stwórz tablicę pracowników (minimum 2), wczytaj informacje o pracownikach od użytkownika
    (minimum 2) i wyświetl ile w sumie pieniędzy firma musi wydać na wypłaty.*/

    private String name;
    private String surname;
    private double salary;

    public Employee(String name, String surname, double salary) {
        this.name = name;
        this.surname = surname;
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", salary=" + salary +
                '}';
    }
}
