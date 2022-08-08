package com.company.inventory.model;

import lombok.Data;

import java.io.Serializable;

import javax.persistence.*;

@Data
@Entity
@Table(name = "category")

public class Category implements Serializable{

    private static final long serialVersionUID = -436326371L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String description;


}
