package ru.innopolis.stc12.io;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        //      employee.setFileName("C:\\TEMP\\MyTestData.txt");
        EmployeeData.clearFile();
        Employee employee1 = new Employee("Alex", 28, 98000, Job.ENGENEER);
        Employee employee2 = new Employee("Fill", 29, 90800, Job.ADMINISTRATOR);
        Employee employee3 = new Employee("Gosha ", 38, 78000, Job.COORDINATOR);
        Employee employee4 = new Employee("Kira", 68, 6900, Job.CLERK);
        Employee employee5 = new Employee("Kara", 68, 6900, Job.CLERK);

        EmployeeData.save(employee1);
        EmployeeData.save(employee2);
        EmployeeData.save(employee3);
        EmployeeData.save(employee4);
        EmployeeData.save(employee5);
        System.out.println("\n Данные записаны. Приступаю к удалению.");

        EmployeeData.delete(employee3);
        EmployeeData.delete(employee1);
        System.out.println("\n");

        EmployeeData.save(employee1);
        EmployeeData.save(employee1);
        System.out.println("\n");
        EmployeeData.delete(employee1);
        System.out.println("\n");

        System.out.println("Метод поиска по имени: " + EmployeeData.getByName("Alex"));

        List<Employee> list = EmployeeData.getByJob(Job.CLERK);
        System.out.println("Метод поиска по Job: ");
        for (Employee employee : list) System.out.println(employee);

        EmployeeData.saveOrUpdate(new Employee("Kara", 68, 999999, Job.ADMINISTRATOR));
    }
}
