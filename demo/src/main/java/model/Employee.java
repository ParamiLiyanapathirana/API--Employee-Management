package model;

import jakarta.persistence.*;

@Entity
@Table(name = "employee")
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private Integer id;

    @Column
    private String First_name;

    @Column
    private String Last_name;

    @Column
    private String Address;

    @Column
    private String Telno;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFirst_name() {
        return First_name;
    }

    public void setFirst_name(String first_name) {
        First_name = first_name;
    }

    public String getLast_name() {
        return Last_name;
    }

    public void setLast_name(String last_name) {
        Last_name = last_name;
    }

    public String getAddress() {
        return Address;
    }



    public void setAddress(String address) {
        Address = address;
    }

    public String getTelno() {
        return Telno;
    }

    public void setTelno(String telno) {
        Telno = telno;
    }


    //overide to string method
    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", First_name='" + First_name + '\'' +
                ", Last_name='" + Last_name + '\'' +
                ", Address='" + Address + '\'' +
                ", Telno='" + Telno + '\'' +
                '}';
    }

}
