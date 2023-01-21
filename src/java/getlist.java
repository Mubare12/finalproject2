
import java.io.Serializable;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.Dependent;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@Dependent
@ManagedBean

@SessionScoped
public class getlist  {

    public List<CustomerManage> getUserList() {
        List<CustomerManage> list = new ArrayList<>();
        try {
        
            DBConnection dbcon = new DBConnection();
            Connection con = dbcon.connMethod();
            ResultSet rs = con.createStatement().executeQuery("select * from CUSTOMER");
            while (rs.next()) {
                CustomerManage admin = new CustomerManage();
                admin.setFlightCode(rs.getString("FLIGHT_CODE"));
                admin.setPassportNo(rs.getString("PASSPORT_NO"));
                admin.setAddress(rs.getString("ADDRESS"));
                admin.setNationality(rs.getString("NATIONALITY"));
                admin.setName(rs.getString("NAME"));
                admin.setGender(rs.getString("GENDER"));
                 admin.setPhno(rs.getString("PH_NO"));
                
                //course[1]=rs.getString("COURSE");
                //usr.setCourse(course);
                list.add(admin);
            }
        } catch (ClassNotFoundException | SQLException e) {
        }
        return list;
    }

}
