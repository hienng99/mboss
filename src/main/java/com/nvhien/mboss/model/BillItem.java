package com.nvhien.mboss.model;

import jakarta.persistence.*;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.sql.Timestamp;

@Entity
@Table(name = "bill_item")
@NoArgsConstructor
@Getter
@Setter
public class BillItem {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private Timestamp create_time;
    private Timestamp update_time;

    @ManyToOne(fetch = FetchType.LAZY)
    @MapsId("bill_id")
    private Bill bill;

    @ManyToOne(fetch = FetchType.LAZY)
    @MapsId("item_id")
    private Item item;
}
