package ru.innopolis.stc12.io;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class EmployeeData {
    private static String fileName = "C:\\TEMP\\MyTestData.txt";
    private static String tmpfileName = "C:\\TEMP\\tmpMyTestData.txt";

    public String getFileName() {

        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public static boolean save(Employee employee) {
        ArrayList<Employee> list = new ArrayList<>();
        try(ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(fileName))){
            list = (ArrayList<Employee>) objectInputStream.readObject();
        }catch (ClassNotFoundException|IOException e){
        }

        list.add(employee);
        clearFile();
        try (ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(fileName, true))) {
            objectOutputStream.writeObject(list);
            System.out.println(employee.toString() + " was saved to file " + fileName);
            return true;
        } catch (IOException e) {
            System.out.println(e.getMessage());
            return false;
        }
    }

    public static boolean delete(Employee employee) {
        List<Employee> list = new ArrayList<Employee>();
        Employee currentLine=null;
        try (ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(fileName))) {
            list = (ArrayList<Employee>) objectInputStream.readObject();

        for(int i=0;i<list.size();i++){
            if(list.get(i).getName().equals(employee.getName())
                    &&(list.get(i).getAge()==employee.getAge())
                    &&(list.get(i).getJob().equals(employee.getJob()))
                    &&(list.get(i).getSalary()==employee.getSalary())
                    ) {
                list.remove(list.get(i));
                System.out.println("Обнаружен employee на удаление: " + employee.toString());
                list.remove(employee);
            }
        }
        } catch (ClassNotFoundException|IOException e) {
            System.out.println(e);
            return false;
        }
        clearFile();
        for(Employee empl: list){
            save(empl);
        } return true;
    }

    public static void clearFile(){
        try {
            new FileOutputStream(fileName).close();

        } catch (IOException e) {
            System.out.println(e);
        }
    }
}
