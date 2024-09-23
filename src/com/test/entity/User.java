package com.test.entity;
import lombok.Data;
import lombok.experimental.Accessors;
import java.util.List;

@Data
@Accessors(chain = true)
public class User {
    private int id;
    private String name;
    private int age;
    List<Book> books;
    MyGroup group;


}
