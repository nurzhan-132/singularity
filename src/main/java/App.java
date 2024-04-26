package main.java;

public class App {
    public static void main(String[] args) {
        Employee[] employees = new Employee[5];

        employees[0] = new Employee("Karl Marx", "Philosopher", "ert@mailbox.com", "892312312", 30000, 100);
        employees[1] = new Employee("Vladimir Lenin", "Revolutionist", "fgh@mailbox.com", "892312312", 30000, 70);
        employees[2] = new Employee("Joseph Stalin", "Communist", "zxc@mailbox.com", "892312312", 30000, 40);
        employees[3] = new Employee("Nikita Khrushchev", "Agronomist", "qwe@mailbox.com", "892312312", 30000, 30);
        employees[4] = new Employee("Leonid Brezhnev", "Engineer", "asd@mailbox.com", "892312312", 30000, 20);

        for(Employee employee: employees) {
            if(employee.getAge() > 40) {
                employee.printEmployee();
            }
        }
    }
}