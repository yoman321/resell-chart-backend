package com.example.resellChartBackend.domains;

import jakarta.persistence.*;

@Entity
@Table
public class ClothUser extends Cloth{

    @Id
    @SequenceGenerator(
            name = "user_sequence",
            sequenceName = "user_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "user_sequence"
    )
    private long id;
    private String password;

    public ClothUser(){

    }
    public ClothUser(long id, String email, String password){
        super(email);
        this.id = id;
        this.password = password;
    }
    public ClothUser(String email, String password){
        super(email);
        this.password = password;
    }
    public long getId(){
        return id;
    }
    public String getPassword(){
        return password;
    }
    public void setId(long id){
        this.id = id;
    }
    public void setPassword(String password){
        this.password = password;
    }

    @Override
    public String toString() {
        return "ClothUser{" +
                "email='" + email + '\'' +
                ", id=" + id +
                ", password='" + password + '\'' +
                '}';
    }
}
