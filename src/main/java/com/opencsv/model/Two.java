package com.opencsv.model;

import com.opencsv.bean.CsvRecurse;
import lombok.Data;

@Data
public class Two {
    private Integer id2;
    private String name2;
    @CsvRecurse
    private Three three;
}
