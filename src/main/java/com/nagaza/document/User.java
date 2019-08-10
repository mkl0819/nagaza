package com.nagaza.document;

import java.io.Serializable;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * User
 */@Document(collection = "user")
public class User implements Serializable {
	static final long serialVersionUID = 1L;

    @Id
    private String id;
    private String name;
    private int age;

    User(){}

    User(String name, int age){
        setName(name);
        setAge(age);
    }
    /**
     * @return the id
     */
    public String getId() {
        return id;
    }
    /**
     * @return the age
     */
    public int getAge() {
        return age;
    }
    /**
     * @return the name
     */
    public String getName() {
        return name;
    }
    /**
     * @param id the id to set
     */
    public void setId(String id) {
        this.id = id;
    }
    /**
     * @param age the age to set
     */
    public void setAge(int age) {
        this.age = age;
    }
    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }
}