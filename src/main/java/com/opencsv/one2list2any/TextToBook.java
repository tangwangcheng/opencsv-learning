package com.opencsv.one2list2any;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.opencsv.bean.AbstractCsvConverter;
import com.opencsv.exceptions.CsvConstraintViolationException;
import com.opencsv.exceptions.CsvDataTypeMismatchException;
import lombok.SneakyThrows;

public class TextToBook extends AbstractCsvConverter {
    private static ObjectMapper objectMapper = new ObjectMapper();
    @SneakyThrows
    @Override
    public Object convertToRead(String value) throws CsvDataTypeMismatchException, CsvConstraintViolationException {
        // 解析数据
        Book book1 = objectMapper.readValue(value, Book.class);
        return book1;
    }

    @SneakyThrows
    @Override
    public String convertToWrite(Object value) throws CsvDataTypeMismatchException {
        String string = objectMapper.writeValueAsString(value);
        return string;
    }

}
