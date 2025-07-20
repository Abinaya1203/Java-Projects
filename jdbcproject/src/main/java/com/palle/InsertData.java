package com.palle;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class InsertData {

	public static void main(String[] args) {
		 try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/project","root","Admin");
		    PreparedStatement st = con.prepareStatement("insert into product values(?,?,?,?)");
		    int noOfRows=0;
		    st.setInt(1, 1);
            st.setString(2, "Laptop");
            st.setInt(3, 10);
            st.setDouble(4, 55000.00);
            noOfRows += st.executeUpdate();
            // Record 2
            st.setInt(1, 2);
            st.setString(2, "Smartphone");
            st.setInt(3, 25);
            st.setDouble(4, 18000.50);
            noOfRows += st.executeUpdate();
            // Record 3
            st.setInt(1, 3);
            st.setString(2, "Keyboard");
            st.setInt(3, 40);
            st.setDouble(4, 750.00);
            noOfRows += st.executeUpdate();
            // Record 4
            st.setInt(1, 4);
            st.setString(2, "Mouse");
            st.setInt(3, 35);
            st.setDouble(4, 450.00);
            noOfRows += st.executeUpdate();
            // Record 5
            st.setInt(1, 5);
            st.setString(2, "Monitor");
            st.setInt(3, 15);
            st.setDouble(4, 12000.00);
            noOfRows += st.executeUpdate();
            // Record 6
            st.setInt(1, 6);
            st.setString(2, "Printer");
            st.setInt(3, 8);
            st.setDouble(4, 9000.00);
            noOfRows += st.executeUpdate();
            // Record 7
            st.setInt(1, 7);
            st.setString(2, "Tablet");
            st.setInt(3, 12);
            st.setDouble(4, 22000.00);
            noOfRows += st.executeUpdate();
            // Record 8
            st.setInt(1, 8);
            st.setString(2, "Speaker");
            st.setInt(3, 30);
            st.setDouble(4, 1500.00);
            noOfRows += st.executeUpdate();
            // Record 9
            st.setInt(1, 9);
            st.setString(2, "Webcam");
            st.setInt(3, 20);
            st.setDouble(4, 1700.00);
            noOfRows += st.executeUpdate();
            // Record 10
            st.setInt(1, 10);
            st.setString(2, "Headphones");
            st.setInt(3, 50);
            st.setDouble(4, 2000.00);
            noOfRows += st.executeUpdate();
		    st.close();
		    con.close();
		    System.out.println("no of rows inserted"+ noOfRows);
		 } catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
