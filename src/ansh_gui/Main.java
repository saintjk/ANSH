package ansh_gui;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Main {

	
	/*
	public static void main(String[] args) {
		try {

			CSVLoader loader = new CSVLoader(getCon());
                      loader.loadCSV("/home/lab/data_tmp/2013_CLEAR.CS.csv", "csv_test", true);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}*/

	private static Connection getCon() {
		Connection con = null;
		try {
		Class.forName("com.mysql.jdbc.Driver");
        con = DriverManager.getConnection("jdbc:mysql://172.31.15.127:3306/ANSH","ansh","admin123");

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return con;
	}
}
