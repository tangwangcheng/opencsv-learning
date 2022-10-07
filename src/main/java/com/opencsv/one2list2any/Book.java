package com.opencsv.one2list2any;

import com.opencsv.bean.CsvBindAndSplitByName;
import com.opencsv.bean.CsvBindByName;
import com.opencsv.bean.CsvRecurse;
import lombok.Data;

import java.util.List;

@Data
public class Book {

    String bookName;

    Author author;

    List<Chapter> chapters;
}
