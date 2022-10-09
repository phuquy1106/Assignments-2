package model;

import java.util.Scanner;

public class Student {
    private String code;
    private String name;
    private int age;
    private int sex;

    public Student() {
        this.code = code;
        this.name = name;
        this.age = age;
        this.sex = sex;
    }

    public void inputStudent(){
        Scanner sc = new Scanner(System.in);

        System.out.println("Input Student Information:");
        System.out.println("Code: ");
        this.code = sc.next().trim();
        System.out.println("Name: ");
        this.name = sc.next().trim();
        System.out.println("Age: ");
        this.age = sc.nextInt();
        System.out.println("Sex: ");
        this.sex = sc.nextInt();
    }

    @Override
    public String toString() {
        return "Student{" +
                "code='" + code + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", sex=" + sex +
                '}';
    }
    public void printStudent(){
        String st = "Student "+
                "code: " + this.code+
                "name: " + this.name+
                "age: "  + this.age+
                "sex: "  + this.sex;
        System.out.println(st);
    }



    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
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

    public int getSex() {
        return sex;
    }

    public void setSex(int sex) {
        this.sex = sex;
    }
}
