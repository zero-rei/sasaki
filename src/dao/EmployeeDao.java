package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import dto.Employee;


public class EmployeeDao {
	private static final String url = "jdbc:mysql://localhost:3306/jojo?serverTimezone=JST";
	private static final String user = "root";
	private static final String pw = "Gamezero0";

	public static ArrayList<Employee> selectAllStudent1(){
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;

		try {
			// ②JDBCドライバをロードする
			Class.forName("com.mysql.cj.jdbc.Driver");

			// ③DBMSとの接続を確立する
			con = DriverManager.getConnection(url,user,pw);
			// ④SQL文を作成する
			String sql = "SELECT * FROM  employee ";
			// ⑤SQL文を実行するための準備を行う
			pstmt = con.prepareStatement(sql);

			// ⑥SQL文を実行してDBMSから結果を受信する
			rs = pstmt.executeQuery();

			ArrayList<Employee>list=new ArrayList<Employee>();

			// ⑦実行結果を含んだインスタンスからデータを取り出す
			while(rs.next()){

			String name = rs.getString("name");
			String nai = rs.getString("nai");
			String mail = rs.getString("mail");
			String time =rs.getString("time");
			String times = rs.getString("times");
			Employee result = new Employee( name,nai,mail,time,times);
			list.add(result);

			}
			return list;
		} catch (ClassNotFoundException e) {
			System.out.println("JDBCドライバが見つかりません。");
			e.printStackTrace();
		} catch (SQLException e) {
			System.out.println("DBアクセス時にエラーが発生しました。");
			e.printStackTrace();
		} finally {
			// ⑧DBMSから切断する
			try {
				if (rs != null) {
					rs.close();
				}
			} catch (SQLException e) {
				System.out.println("DBアクセス時にエラーが発生しました。");
				e.printStackTrace();
			}
			try {
				if (pstmt != null) {
					pstmt.close();
				}
			} catch (SQLException e) {
				System.out.println("DBアクセス時にエラーが発生しました。");
				e.printStackTrace();
			}
			try {
				if (con != null) {
					con.close();
				}
			} catch (SQLException e) {
				System.out.println("DBアクセス時にエラーが発生しました。");
				e.printStackTrace();

		}
		}
		return null;
	}
//-----------------------------------------------------------------------
	public static ArrayList<Employee> tukareta3(String name,String nai,String mail,String time,String times){
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		int p=0;
		ArrayList<Employee> list =new ArrayList<Employee>();
		try {
			// ②JDBCドライバをロードする
			Class.forName("com.mysql.cj.jdbc.Driver");

			// ③DBMSとの接続を確立する
			con = DriverManager.getConnection(url,user,pw);
			// ④SQL文を作成する
			PreparedStatement stmt = con.prepareStatement("INSERT INTO employee values(?,?,?,now(),now())");
			// ⑤SQL文を実行するための準備を行う

			stmt.setString(1, name);
			stmt.setString(2, nai);
			stmt.setString(3, mail);
			// ⑥SQL文を実行してDBMSから結果を受信する
			p = stmt.executeUpdate();



		} catch (ClassNotFoundException e) {
			System.out.println("JDBCドライバが見つかりません。");
			e.printStackTrace();
		} catch (SQLException e) {
			System.out.println("DBアクセス時にエラーが発生しました。");
			e.printStackTrace();
		} finally {
			// ⑧DBMSから切断する
			try {
				if (rs != null) {
					rs.close();
				}
			} catch (SQLException e) {
				System.out.println("DBアクセス時にエラーが発生しました。");
				e.printStackTrace();
			}
			try {
				if (pstmt != null) {
					pstmt.close();
				}
			} catch (SQLException e) {
				System.out.println("DBアクセス時にエラーが発生しました。");
				e.printStackTrace();
			}
			try {
				if (con != null) {
					con.close();
				}
			} catch (SQLException e) {
				System.out.println("DBアクセス時にエラーが発生しました。");
				e.printStackTrace();

		}
		}
		return null;
	}
//-----------------------------------------------------------------------
	public static ArrayList<Employee> tukareta4(String name){
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		int p=0;
		ArrayList<Employee> list =new ArrayList<Employee>();
		try {
			// ②JDBCドライバをロードする
			Class.forName("com.mysql.cj.jdbc.Driver");

			// ③DBMSとの接続を確立する
			con = DriverManager.getConnection(url,user,pw);
			// ④SQL文を作成する
			String sql = "DELETE FROM employee where name=?";
			// ⑤SQL文を実行するための準備を行う
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, name);
			// ⑥SQL文を実行してDBMSから結果を受信する
			p = pstmt.executeUpdate();


		} catch (ClassNotFoundException e) {
			System.out.println("JDBCドライバが見つかりません。");
			e.printStackTrace();
		} catch (SQLException e) {
			System.out.println("DBアクセス時にエラーが発生しました。");
			e.printStackTrace();
		} finally {
			// ⑧DBMSから切断する
			try {
				if (rs != null) {
					rs.close();
				}
			} catch (SQLException e) {
				System.out.println("DBアクセス時にエラーが発生しました。");
				e.printStackTrace();
			}
			try {
				if (pstmt != null) {
					pstmt.close();
				}
			} catch (SQLException e) {
				System.out.println("DBアクセス時にエラーが発生しました。");
				e.printStackTrace();
			}
			try {
				if (con != null) {
					con.close();
				}
			} catch (SQLException e) {
				System.out.println("DBアクセス時にエラーが発生しました。");
				e.printStackTrace();

		}
		}
		return null;
	}
//-----------------------------------------------------------------------
	public static ArrayList<Employee> tukareta2(String name){
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		int p=0;
		ArrayList<Employee> list =new ArrayList<Employee>();
		try {
			// ②JDBCドライバをロードする
			Class.forName("com.mysql.cj.jdbc.Driver");

			// ③DBMSとの接続を確立する
			con = DriverManager.getConnection(url,user,pw);
			// ④SQL文を作成する
			String sql = "UPDATE employee SET times = now()  where name = ?";
			// ⑤SQL文を実行するための準備を行う
			pstmt = con.prepareStatement(sql);

			pstmt.setString(1, name);
			// ⑥SQL文を実行してDBMSから結果を受信する
			p = pstmt.executeUpdate();



		} catch (ClassNotFoundException e) {
			System.out.println("JDBCドライバが見つかりません。");
			e.printStackTrace();
		} catch (SQLException e) {
			System.out.println("貸し出していない本です。");
			e.printStackTrace();
		} finally {
			// ⑧DBMSから切断する
			try {
				if (rs != null) {
					rs.close();
				}
			} catch (SQLException e) {
				System.out.println("DBアクセス時にエラーが発生しました。");
				e.printStackTrace();
			}
			try {
				if (pstmt != null) {
					pstmt.close();
				}
			} catch (SQLException e) {
				System.out.println("DBアクセス時にエラーが発生しました。");
				e.printStackTrace();
			}
			try {
				if (con != null) {
					con.close();
				}
			} catch (SQLException e) {
				System.out.println("DBアクセス時にエラーが発生しました。");
				e.printStackTrace();

		}
		}
		return null;
	}
//----------------------------------------------------
	public static ArrayList<Employee> tukareta3(String name, String nai,String mail){
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		int p=0;
		ArrayList<Employee> list =new ArrayList<Employee>();
		try {
			// ②JDBCドライバをロードする
			Class.forName("com.mysql.cj.jdbc.Driver");

			// ③DBMSとの接続を確立する
			con = DriverManager.getConnection(url,user,pw);
			// ④SQL文を作成する
			String sql = "INSERT INTO employee values(?,?,?)where name=?";
			// ⑤SQL文を実行するための準備を行う
			pstmt = con.prepareStatement(sql);

			pstmt.setString(1, name);
			// ⑥SQL文を実行してDBMSから結果を受信する
			p = pstmt.executeUpdate();



		} catch (ClassNotFoundException e) {
			System.out.println("JDBCドライバが見つかりません。");
			e.printStackTrace();
		} catch (SQLException e) {
			System.out.println("DBアクセス時にエラーが発生しました。");
			e.printStackTrace();
		} finally {
			// ⑧DBMSから切断する
			try {
				if (rs != null) {
					rs.close();
				}
			} catch (SQLException e) {
				System.out.println("DBアクセス時にエラーが発生しました。");
				e.printStackTrace();
			}
			try {
				if (pstmt != null) {
					pstmt.close();
				}
			} catch (SQLException e) {
				System.out.println("DBアクセス時にエラーが発生しました。");
				e.printStackTrace();
			}
			try {
				if (con != null) {
					con.close();
				}
			} catch (SQLException e) {
				System.out.println("DBアクセス時にエラーが発生しました。");
				e.printStackTrace();

		}
		}
		return null;
	}
}