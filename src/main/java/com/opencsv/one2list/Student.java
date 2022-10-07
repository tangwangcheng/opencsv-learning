package com.opencsv.one2list;

import com.opencsv.bean.CsvBindAndSplitByName;
import com.opencsv.bean.CsvBindByName;
import lombok.Data;

import java.util.List;

@Data
public class Student {
    @CsvBindByName
    int studentID;
    @CsvBindByName
    String name;
    @CsvBindAndSplitByName(elementType = Teacher.class, collectionType= List.class, converter = TextToTeacher.class)
    List<Teacher> teachers;
}
