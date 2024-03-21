package com.crudapplication.apicrud.model;

import jakarta.persistence.*;

@Entity
@Table(name = "employees")

public class employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private int eid;
    @Column
    private String ename;
    @Column
    private String dept;

    public int getEid() {
        return eid;
    }

    public void setEid(int eid) {
        this.eid = eid;
    }

    public String getEname() {
        return ename;
    }

    public void setEname(String ename) {
        this.ename = ename;
    }

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    public employee() {
    }

    public employee(String ename, String dept) {

        this.ename = ename;
        this.dept = dept;
    }

    @Override
    public String toString() {
        return "employee{" +
                "eid=" + eid +
                ", ename='" + ename + '\'' +
                ", dept='" + dept + '\'' +
                '}';
    }
}