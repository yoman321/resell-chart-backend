package com.example.resellChartBackend.domains;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.MappedSuperclass;
import jakarta.persistence.SequenceGenerator;
import org.springframework.data.annotation.Id;

@MappedSuperclass
public abstract class Cloth {

//    @Id
//    @SequenceGenerator(
//            name = "cloth_sequence",
//            sequenceName = "cloth_sequence",
//            allocationSize = 1
//    )
//    @GeneratedValue(
//            strategy = GenerationType.SEQUENCE,
//            generator = "cloth_sequence"
//    )
    protected String email;

    public Cloth(){

    }
    public Cloth(String email){
        this.email = email;
    }
    public String getEmail(){
        return email;
    }
    public void setEmail(){
        this.email = email;
    }
}
