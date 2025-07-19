package com.java.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;

public class ExampleJdbc {

	public static void main(String[] args) {

		try {
			Connection conn = DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres", "postgres",
					"emirCorso2025.java%");
			System.out.println("Connesso!");
			conn.close();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
