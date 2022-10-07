package com.opencsv.model;

import com.opencsv.bean.CsvRecurse;
import lombok.Data;

@Data
public class One {
    private Integer id;
    private String name;
    @CsvRecurse
    private Two two;
}
