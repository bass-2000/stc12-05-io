package ru.innopolis.stc12.io;


import org.junit.Assert;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;


public class EmployeeDataTest {

    @Test
    public void readListFromFile() {
        Employee employee1 = new Employee("Alex", 28, 98000, Job.ENGENEER);
        EmployeeData.clearFile();
        EmployeeData.save(employee1);
        ArrayList<Employee> list = EmployeeData.readListFromFile();
        Assert.assertEquals(employee1,list.get(0));
    }

    @Test
    public void save() {
    }

    @Test
    public void delete() {
    }

    @Test
    public void getByName() {
    }

    @Test
    public void clearFile() {
    }

    @Test
    public void getByJob() {
    }

    @Test
    public void saveOrUpdate() {
    }

    @Test
    public void changeAllWork() {
    }

    @Test
    public void printFile() {
    }

    @Test
    public void setFileName() {
    }
}
