package com.example.laboratorio.entity;

import jakarta.persistence.*;
import lombok.*;
@Entity
@Table(name = "invoice_detail")
@Getter @Setter
@NoArgsConstructor
@AllArgsConstructor

public class invoice_detailEntity {
    @Id
    private Long id;
    private int invoice_id;
    private int product_id;
    private int quantity;
    private Double price;
    private Double subtotal;
}
