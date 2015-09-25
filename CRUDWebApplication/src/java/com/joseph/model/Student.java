/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.joseph.model;

import java.io.Serializable;
import java.sql.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 *
 * @author Joseph
 */
@Entity
@Table
@NamedQueries({
    @NamedQuery(name = "Student.getAll", query = "SELECT e FROM Student e")})
public class Student implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column
    private int id;
    @Column
    private String name;
    @Column
    private String lastname;
    @Column
    private Date dob = (Date.valueOf("2015-10-10"));

    public int getStudentId() {
        return id;
    }

    public void setStudentId(int studentId) {
        this.id = studentId;
    }

    public String getFirstname() {
        return name;
    }

    public void setFirstname(String firstname) {
        this.name = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public Student(int studentId, String firstname, String lastname) {
        this.id = studentId;
        this.name = firstname;
        this.lastname = lastname;
        this.dob = (Date.valueOf("2015-10-10"));

    }

    public Student() {
    }
}
