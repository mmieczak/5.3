public class Company {
    /*add(Employee emp),która dodaje pracownika na pierwsze wolne miejcse w tablicy,
    get(int index),która zwraca obiekt tablicy zapisany pod indeksem index.*/

    private Employee[] employees;
    private int elementIndex;

    public Company(Employee[] employees) {
        this.elementIndex = 0;
        this.employees = employees;
    }

    public void addEmployee(Employee worker) {
        employees[elementIndex] = worker;
        elementIndex++;
    }

    public Employee get(int index) {
        if (index < employees.length && index >= 0) {
            return employees[index];
        } else {
            return null;
        }
    }

    public Employee[] getEmployees() {
        return employees;
    }

    public void setEmployees(Employee[] employees) {
        this.employees = employees;
    }
}
