package com.example.resellChartBackend.domains;

import jakarta.persistence.MappedSuperclass;

@MappedSuperclass
public abstract class Cloth {

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
