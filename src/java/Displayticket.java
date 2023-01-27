
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

@ManagedBean(name="displayticket")
@RequestScoped
public class Displayticket {
        public List<BookManage> getUserList() {
        List<BookManage> list = new ArrayList<>();
        try {
        
            DBConnection dbcon = new DBConnection();
            Connection con = dbcon.connMethod();
            ResultSet rs = con.createStatement().executeQuery("select * from BOOK");
            while (rs.next()) {
                BookManage admin = new BookManage();
                admin.setPassport_no(rs.getInt("PASSPORT_NO"));
                admin.setFrom1(rs.getString("FROM1"));
                admin.setTo1(rs.getString("TO1"));
                admin.setClasss_travel(rs.getString("CLASS_TRAVEL"));
                admin.setPassenger_name(rs.getString("PASSENGER_NAME"));
                admin.setAge(rs.getInt("AGE"));
                 admin.setAddress(rs.getString("ADDRESS"));
                
                //course[1]=rs.getString("COURSE");
                //usr.setCourse(course);
                list.add(admin);
            }
        } catch (ClassNotFoundException | SQLException e) {
        }
        return list;
    }
}
