package com.example.resellChartBackend.domains;

import jakarta.persistence.*;

@Entity
@Table
public class ClothUser {

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
    private String email;

    public ClothUser(){

    }
    public ClothUser(long id, String email){
        this.id = id;
        this.email = email;
    }
    public ClothUser(String email){
        this.email = email;
    }
    public long getId(){
        return id;
    }
    public String getEmail(){
        return email;
    }
    public void setId(long id){
        this.id = id;
    }
    public void setEmail(String email){
        this.email = email;
    }

    @Override
    public String toString() {
        return "ClothUser{" +
                "id=" + id +
                ", email='" + email + '\'' +
                '}';
    }
}
