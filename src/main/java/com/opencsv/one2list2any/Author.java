package com.opencsv.one2list2any;

import com.opencsv.bean.CsvBindByName;
import lombok.Data;

@Data
public class Author {
    @CsvBindByName
    String name;
    @CsvBindByName
    int age;
}
