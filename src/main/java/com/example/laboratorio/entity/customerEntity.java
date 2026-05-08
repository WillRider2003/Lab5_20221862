package com.example.laboratorio.entity;

import jakarta.persistence.*;
import lombok.*;
@Entity
@Table(name = "customer")
@Getter @Setter
@NoArgsConstructor
@AllArgsConstructor
public class customerEntity {
    @Id
    private Long id;
    @Column(name = "name")
    private String firstName;
    private String document;
    private String document_type;
}
