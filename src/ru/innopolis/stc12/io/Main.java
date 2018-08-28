package ru.innopolis.stc12.io;

public class Main {
    public static void main(String[] args) {
        //      employee.setFileName("C:\\TEMP\\MyTestData.txt");
        EmployeeData.clearFile();
        Employee employee1 = new Employee("Alex", 28, 98000, Job.ENGENEER);
        Employee employee2 = new Employee("Fill", 29, 90800, Job.ADMINISTRATOR);
        Employee employee3 = new Employee("Gosha ", 38, 78000, Job.COORDINATOR);
        Employee employee4 = new Employee("Kira", 68, 6900, Job.CLERK);

        EmployeeData.save(employee1);
        EmployeeData.save(employee2);
        EmployeeData.save(employee3);
        EmployeeData.save(employee4);

     EmployeeData.delete(employee3);
     EmployeeData.delete(employee1);

     EmployeeData.save(employee1);
     EmployeeData.save(employee1);
     EmployeeData.delete(employee1);

    }
}
