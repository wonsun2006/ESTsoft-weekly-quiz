package dbms_jdbc_quiz;

import java.sql.*;

public class SqlQuiz {
	public static void main(String[] args) {
		// Q. 학생 테이블에 있는 전체 학생들 중, 30대 학생들만 출력하기 (name, age, addres)
		try{
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			System.out.println("MySQL 드라이버를 찾을 수 없습니다.");
			return;
		}

		String url = "jdbc:mysql://localhost:3306/test_db";
		String userId = Secret.DB_USER_ID;
		String password = Secret.DB_PASSWORD;
		String sql = "SELECT name, age, address FROM students WHERE age BETWEEN 30 AND 39";

		try(Connection conn = DriverManager.getConnection(url, userId, password);
			PreparedStatement ps = conn.prepareStatement(sql);
			ResultSet rs = ps.executeQuery()){

			while(rs.next()){
				System.out.println(
					"name: " + rs.getString("name")
						+ ", age: " + rs.getInt("age")
						+ ", address: " + rs.getString("address"));
			}
		} catch (SQLException e) {
			System.out.println("SQL Exception 발생");
			System.out.println(e);
		}
	}
}
