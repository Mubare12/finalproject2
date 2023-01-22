

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

import javax.faces.bean.ManagedBean;

import javax.faces.bean.RequestScoped;


@ManagedBean
@RequestScoped
public class Delete1 {
    private String passport_no;

    public String getPassport_no() {
        return passport_no;
    }

    public void setPassport_no(String passport_no) {
        this.passport_no = passport_no;
    }
    
    public void delete() throws ClassNotFoundException, SQLException{
    
            
            Boolean status=false;
            String query = "delete from CUSTOMER where PASSPORT_NO='"+passport_no+"'";
            DBConnection connection1 = new DBConnection();
            Connection connection = connection1.connMethod();
            Statement statement = null;
            try {
                statement = connection.createStatement();
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
            try{
                status=statement.execute(query);
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        }
    
}