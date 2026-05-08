package com.example.laboratorio.entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.Date;

@Entity
@Table(name = "invoice")
@Getter @Setter
@NoArgsConstructor
@AllArgsConstructor

public class invoiceEntity {
    @Id
    private Long id;
    private String type;
    private Date date;
    private int customer_id;
}
