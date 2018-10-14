package com.bootcamp.thymeleaf.model;

/**
 * @author sanchit on 14/10/18
 */
public class User {

    private String name;
    private String sex;
    private int id;
    private int salary;
    private boolean admin;

    public User() {
    }

    public String getName() {
        return name;
    }

    public User setName(String name) {
        this.name = name;
        return this;
    }

    public String getSex() {
        return sex;
    }

    public User setSex(String sex) {
        this.sex = sex;
        return this;
    }

    public int getId() {
        return id;
    }

    public User setId(int id) {
        this.id = id;
        return this;
    }

    public int getSalary() {
        return salary;
    }

    public User setSalary(int salary) {
        this.salary = salary;
        return this;
    }

    public boolean isAdmin() {
        return admin;
    }

    public User setAdmin(boolean admin) {
        this.admin = admin;
        return this;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                ", id=" + id +
                ", salary=" + salary +
                ", admin=" + admin +
                '}';
    }
}