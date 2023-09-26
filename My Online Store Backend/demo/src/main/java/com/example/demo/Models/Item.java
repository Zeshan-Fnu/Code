package com.example.demo.Models;

import jakarta.persistence.*;
import lombok.*;

@Data
@Entity
@Table
public class Item {
    @Id
    @SequenceGenerator(
            name="serial_num_seq",
            sequenceName = "serial_num_seq",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "serial_num_seq"
    )
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

}
