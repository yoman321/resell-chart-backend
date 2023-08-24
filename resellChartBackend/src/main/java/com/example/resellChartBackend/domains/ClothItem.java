package com.example.resellChartBackend.domains;

import jakarta.persistence.*;

@Entity
@Table
public class ClothItem {

    @Id
    @SequenceGenerator(
            name = "item_sequence",
            sequenceName = "item_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "item_sequence"
    )
    private Long id;
    private String email;
    private String clothItemType;
    private String clothItemName;
    private int clothItemSize;

    public ClothItem() {
    }

    public ClothItem(Long id, String email, String clothItemType, String clothItemName, int clothItemSize) {
        this.id = id;
        this.email = email;
        this.clothItemType = clothItemType;
        this.clothItemName = clothItemName;
        this.clothItemSize = clothItemSize;
    }

    public Long getId(){
        return id;
    }
    public String getEmail(){
        return email;
    }
    public String getClothItemType() {
        return clothItemType;
    }

    public String getClothItemName() {
        return clothItemName;
    }
    public int getClothItemSize() {
        return clothItemSize;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setEmail(String email){
        this.email = email;
    }
    public void setClothItemType(String clothItemType) {
        this.clothItemType = clothItemType;
    }

    public void setClothItemName(String clothItemName) {
        this.clothItemName = clothItemName;
    }

    public void setClothItemSize(int clothItemSize) {
        this.clothItemSize = clothItemSize;
    }

    @Override
    public String toString() {
        return "ClothItem{" +
                "id=" + id +
                ", email='" + email + '\'' +
                ", clothItemType='" + clothItemType + '\'' +
                ", clothItemName='" + clothItemName + '\'' +
                ", clothItemSize=" + clothItemSize +
                '}';
    }
}


