package com.opencsv.one2list2any;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.opencsv.bean.CsvToBean;
import com.opencsv.bean.CsvToBeanBuilder;
import com.opencsv.bean.StatefulBeanToCsv;
import com.opencsv.bean.StatefulBeanToCsvBuilder;
import com.opencsv.exceptions.CsvDataTypeMismatchException;
import com.opencsv.exceptions.CsvRequiredFieldEmptyException;

import java.io.*;
import java.util.List;

public class Test {

    private static ObjectMapper objectMapper = new ObjectMapper();

    private static final String JSON_PATH = "D:\\my_work\\opencsv\\src\\main\\java\\com\\opencsv\\one2list2any\\test.json";
    private static final String CSV_PATH = "D:\\my_work\\opencsv\\src\\main\\java\\com\\opencsv\\one2list2any\\test.csv";

    public static void main(String[] args) throws IOException, CsvDataTypeMismatchException, CsvRequiredFieldEmptyException {
        // 读取文件
        File file = new File(JSON_PATH);
        // 反序列化对象
        Bookshelf bookshelf = objectMapper.readValue(file, Bookshelf.class);
        System.out.println("打印对象："+ bookshelf);

        // 写入 csv 文件
        Writer writer = new FileWriter(CSV_PATH);
        StatefulBeanToCsv beanToCsv = new StatefulBeanToCsvBuilder(writer).build();
        beanToCsv.write(bookshelf);
        writer.close();

        // 读取csv文件，反序列化对小昂
        CsvToBean csvToBean = new CsvToBeanBuilder(new FileReader(CSV_PATH)).withType(Bookshelf.class).build();
        List<Bookshelf> parse = csvToBean.parse();
        System.out.println(parse);
    }
}
