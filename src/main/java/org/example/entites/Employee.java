package org.example.entites;

import jakarta.persistence.*;

@Entity
@Table(name = "emp")

public class Employee {
    @Id @GeneratedValue
    @Column(name = "id")
    private int empId;
    private String name;
    private String department;

    @Override
    public String toString() {
        return "Employee{" +
                "empId=" + empId +
                ", name='" + name + '\'' +
                ", department='" + department + '\'' +
                '}';
    }

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public Employee() {
    }

    public Employee(int empId, String name, String department) {
        this.empId = empId;
        this.name = name;
        this.department = department;
    }
}
