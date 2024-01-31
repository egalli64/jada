/*
 * Introduction to Data Structures in Java
 * 
 * https://github.com/egalli64/jada
 */
package com.example.jada.m1.h2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

import static com.example.jada.m1.h2.Config.PASSWORD;
import static com.example.jada.m1.h2.Config.URL;
import static com.example.jada.m1.h2.Config.USER;

/**
 * Setting a simple H2 database for serialization example
 */
public class Setup {
    static final String DROP_DOG_TABLE = "drop table if exists dog";
    static final String DROP_OWNER_TABLE = "drop table if exists owner";
    static final String CREATE_OWNER_TABLE = """
            create table owner (
            owner_id identity primary key,
            first_name varchar(20),
            last_name varchar(20),
            unique(first_name, last_name))""";
    static final String CREATE_DOG_TABLE = """
            create table dog (
            dog_id identity primary key,
            name varchar(20),
            birth date,
            owner_id integer,
            unique(name, birth),
            constraint dog_owner_fk foreign key (owner_id) references owner (owner_id))""";

    public static void main(String[] args) {
        System.out.println("Reset database " + URL);
        dropTables();
        createTables();
        System.out.println("Done");
    }

    private static void createTables() {
        System.out.println("Creating tables");

        try (Connection conn = DriverManager.getConnection(URL, USER, PASSWORD);
                Statement stmt = conn.createStatement()) {
            stmt.execute(CREATE_OWNER_TABLE);
            stmt.execute(CREATE_DOG_TABLE);
        } catch (Exception e) {
            throw new IllegalStateException(e);
        }
    }

    private static void dropTables() {
        System.out.println("Dropping tables");

        try (Connection conn = DriverManager.getConnection(URL, USER, PASSWORD);
                Statement stmt = conn.createStatement()) {
            stmt.execute(DROP_DOG_TABLE);
            stmt.execute(DROP_OWNER_TABLE);
        } catch (Exception e) {
            throw new IllegalStateException(e);
        }
    }
}
