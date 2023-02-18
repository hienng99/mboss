package com.nvhien.mboss.model;

import jakarta.persistence.*;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.sql.Timestamp;
import java.util.Set;

@Entity
@Table(name = "category")
@NoArgsConstructor
@Getter
@Setter
public class Category {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String description;
    private Timestamp create_time;
    private Timestamp update_time;

    @OneToMany(mappedBy = "category", cascade = CascadeType.ALL)
    private Set<Item> items;
}
