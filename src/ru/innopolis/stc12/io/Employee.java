package ru.innopolis.stc12.io;

import java.io.*;

/**Существует класс Employee с полями name, age, salary, job. Типы необходимо выбрать самостоятельно. Задание:

 1.      Реализовать следующие методы:

 a.      boolean save (Employee), дописывающий сотрудника в конец файла
 b.      boolean delete (Employee), удаляющий сотрудника из файла
 c.      Employee getByName (тип name), возвращающий сотрудника по полному совпадению имени
 d.      List<Employee> getByJob(тип job), возвращающий список сотрудников по должности
 e.      boolean saveOrUpdate (Employee), выполняющий обновление, либо сохранение сотрудника в зависимости от того, есть ли он уже в файле
 f.       boolean changeAllWork (какую должноcть, на какую должность), выполняющий замену заданной должности на заданную для всех сотрудников
 g.      Используем сериализацию/десериализацию «Из коробки»
 2.      Доп. Задание (+10%) в конец файла дописывать сумму зарплат всех сотрудников (с помощью Externalizable)

 3.      Доп. Задание (+10%) сделать все на кастомной сериализции/десериализации (BufferedReader/BufferedWriter)
 */


public class Employee implements Serializable {
    private String name;
    private int age;
    private double salary;
    private Job job;


    public Job getJob() {
        return job;
    }




    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public Employee(String name, int age, double salary, Job job) {
        this.name = name;
        this.age = age;
        this.salary = salary;
        this.job = job;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                ", job=" + job +
                '}';
    }



}
