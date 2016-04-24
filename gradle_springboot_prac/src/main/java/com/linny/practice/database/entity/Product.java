package com.linny.practice.database.entity;

import javax.persistence.*;

/**
 * Created by russelll on 4/24/16.
 */

@Entity
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "prooduct_id_seq")
    @SequenceGenerator(name = "prooduct_id_seq", sequenceName = "PRODUCT_ID_SEQ", allocationSize = 100)
    private Integer id;
}
