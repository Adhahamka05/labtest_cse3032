
import java.sql.*;
import java.util.*;

public class SessionDAO {

    private Connection getConnection() throws Exception {
        Class.forName("com.mysql.cj.jdbc.Driver");
        return DriverManager.getConnection("jdbc:mysql://localhost:3306/drivesmart_db", "root", "password");
    }

    public void bookSession(SessionBean session) {
        try ( Connection con = getConnection()) {
            String sql = "INSERT INTO training_sessions(student_name, branch_location, lesson_type, status) VALUES (?, ?, ?, ?)";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, session.getStudent_name());
            ps.setString(2, session.getBranch_location());
            ps.setString(3, session.getLesson_type());
            ps.setString(4, session.getStatus());
            ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public List<SessionBean> getAllSessions() {
        List<SessionBean> list = new ArrayList<>();
        try ( Connection con = getConnection()) {
            String sql = "SELECT * FROM training_sessions ORDER BY branch_location ASC";

            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                SessionBean s = new SessionBean(
                        rs.getInt("session_id"),
                        rs.getString("student_name"),
                        rs.getString("branch_location"),
                        rs.getString("lesson_type"),
                        rs.getString("status")
                );
                list.add(s);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        

        return list;

    }
}
