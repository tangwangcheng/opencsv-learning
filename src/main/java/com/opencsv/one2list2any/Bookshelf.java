package com.opencsv.one2list2any;

import com.opencsv.bean.CsvBindAndSplitByName;
import com.opencsv.bean.CsvBindByName;
import com.opencsv.bean.CsvRecurse;
import lombok.Data;

import java.util.List;

@Data
public class Bookshelf {
    @CsvBindByName
    int id;
    @CsvBindByName
    String name;
    @CsvRecurse
    Owner owner;
    @CsvBindAndSplitByName(elementType = Book.class, collectionType= List.class, converter = TextToBook.class)
    List<Book> books;
}
