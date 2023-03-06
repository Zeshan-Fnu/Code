package com.example.demo.Models;

public class Item {
    private Long serial_number;
    private String name;
    private Double price;
    private Integer on_hand_quantity;

    public Item() {
    }

    public Item(Long serial_number, String name, Double price, Integer on_hand_quantity) {
        this.serial_number = serial_number;
        this.name = name;
        this.price = price;
        this.on_hand_quantity = on_hand_quantity;
    }

    public Item( String name, Double price, Integer on_hand_quantity) {
        this.name = name;
        this.price = price;
        this.on_hand_quantity = on_hand_quantity;
    }

    public Long getSerial_number() {
        return serial_number;
    }

    public void setSerial_number(Long serial_number) {
        this.serial_number = serial_number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Integer getOn_hand_quantity() {
        return on_hand_quantity;
    }

    public void setOn_hand_quantity(Integer on_hand_quantity) {
        this.on_hand_quantity = on_hand_quantity;
    }

    @Override
    public String toString() {
        return "Item{" +
                "serial_number=" + serial_number +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", on_hand_quantity=" + on_hand_quantity +
                '}';
    }
}
