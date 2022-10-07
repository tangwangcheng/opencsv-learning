package com.opencsv.one2list;

import com.opencsv.bean.CsvBindByName;
import lombok.Data;

@Data
public class Teacher {
    @CsvBindByName
    private String salutation;
    @CsvBindByName
    private String surname;
}
