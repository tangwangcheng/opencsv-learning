package com.opencsv.one2list;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.opencsv.bean.AbstractCsvConverter;
import lombok.SneakyThrows;

public class TextToTeacher  extends AbstractCsvConverter{
    @Override
    public Object convertToRead(String value) {
        // 解析数据
        Teacher t = new Teacher();
        String[] split = value.split("\\.", 2);
        t.setSalutation(split[0]);
        t.setSurname(split[1]);
        return t;
    }

    @SneakyThrows
    @Override
    public String convertToWrite(Object value) {
        // 转化存储格式
        Teacher t = (Teacher) value;
        return String.format("%s.%s", t.getSalutation(), t.getSurname());
    }

}
