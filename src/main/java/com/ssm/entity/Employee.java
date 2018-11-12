package com.ssm.entity;

public class Employee {
    private String id;
    private String name;
    private Double salary;
    private Integer age;
    private String imgsrc;

    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public Double getSalary() {
        return salary;
    }
    public void setSalary(Double salary) {
        this.salary = salary;
    }
    public Integer getAge() {
        return age;
    }
    public void setAge(Integer age) {
        this.age = age;
    }
    public String getImgsrc() {
        return imgsrc;
    }
    public void setImgsrc(String imgsrc) {
        this.imgsrc = imgsrc;
    }
    public Employee() {
    }
    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                ", age=" + age +
                ", imgsrc='" + imgsrc + '\'' +
                '}';
    }
    public Employee(String id, String name, Double salary, Integer age, String imgsrc) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.age = age;
        this.imgsrc = imgsrc;
    }
}
