package com.nvhien.mboss.common;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter
public enum Unit {
    KILOGRAM("kg");

    private final String symbol;
}
