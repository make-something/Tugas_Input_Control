package com.example.praktikumlab3;

public class ContactModel {
    public String nama;
    public String Hp;
    public String status;
    public String color;

    public ContactModel(String nama, String hp, String status, String color) {
        this.nama = nama;
        Hp = hp;
        this.status = status;
        this.color = color;
    }

    public String getNama() {
        return nama;
    }
    
    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getHp() {
        return Hp;
    }

    public void setHp(String hp) {
        Hp = hp;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

}
