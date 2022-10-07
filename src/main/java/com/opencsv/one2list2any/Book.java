package com.opencsv.one2list2any;

import lombok.Data;

import java.util.List;

@Data
public class Book {

    String bookName;

    Author author;

    List<Chapter> chapters;
}
