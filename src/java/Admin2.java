
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;


class Admin2 {

    static boolean express(String fullname, String passport, String passport_no) {
    boolean status =false;
         try {
//            Class.forName("oracle.jdbc.driver.OracleDriver");
//            Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "java2021", "1616");
            //CallableStatement callobj=con.prepareCall("{call SsELECTUSe(?)}");
            DBConnection dbcon = new DBConnection();
            Connection con = dbcon.connMethod();
            PreparedStatement ps = con.prepareStatement("select * from ADMIN where FULLNAME=? and PASSPORT=?");
            ps.setString(1, fullname);
            ps.setString(2, passport);
            ResultSet rs = ps.executeQuery();
            status = rs.next();

        } catch (Exception e) {
            System.out.println(e);
        }
        return status;
    }
    
    }
    

