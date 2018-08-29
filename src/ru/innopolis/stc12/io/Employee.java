package ru.innopolis.stc12.io;

import java.io.Serializable;

/**
 * Существует класс Employee с полями name, age, salary, job. Типы необходимо выбрать самостоятельно. Задание:
 */


public class Employee implements Serializable {
    private String name;
    private int age;
    private double salary;
    private Job job;


    public Employee(String name, int age, double salary, Job job) {
        this.name = name;
        this.age = age;
        this.salary = salary;
        this.job = job;
    }

    public Job getJob() {
        return job;
    }

    public void setJob(Job job) {
        this.job = job;
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
