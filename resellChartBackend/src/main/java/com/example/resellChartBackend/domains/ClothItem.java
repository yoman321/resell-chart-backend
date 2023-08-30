package com.example.resellChartBackend.domains;

import jakarta.persistence.*;

@Entity
public class ClothItem extends Cloth{

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
    private String clothItemType;
    private String clothItemName;
    private int clothItemSize;
    private int clothItemAmount;

    public ClothItem() {
    }

    public ClothItem(Long id, String email, String clothItemType, String clothItemName, int clothItemSize, int clothItemAmount) {
        super(email);
        this.id = id;
        this.clothItemType = clothItemType;
        this.clothItemName = clothItemName;
        this.clothItemSize = clothItemSize;
        this.clothItemAmount = clothItemAmount;
    }
    public ClothItem(String email, String clothItemType, String clothItemName, int clothItemSize){
        super(email);
        this.clothItemType = clothItemType;
        this.clothItemName = clothItemName;
        this.clothItemSize = clothItemSize;
        this.clothItemAmount = clothItemAmount;
    }
    public Long getId(){
        return id;
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
    public int getClothItemAmount(){
        return clothItemAmount;
    }

    public void setId(Long id) {
        this.id = id;
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
    public void setClothItemAmount(int clothItemAmount){
        this.clothItemAmount = clothItemAmount;
    }

    @Override
    public String toString() {
        return "ClothItem{" +
                "email='" + email + '\'' +
                ", id=" + id +
                ", clothItemType='" + clothItemType + '\'' +
                ", clothItemName='" + clothItemName + '\'' +
                ", clothItemSize=" + clothItemSize +
                ", clothItemAmount=" + clothItemAmount +
                '}';
    }
}


