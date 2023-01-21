
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.faces.bean.ManagedBean;

@ManagedBean
public class CustomerManage {
    String flightCode;
    String passportNo;
    String address;
    String nationality;
    String name;
    String gender;
    String phno;
    
    public CustomerManage(){
        
    }

    public String getFlightCode() {
        return flightCode;
    }

    public void setFlightCode(String flightCode) {
        this.flightCode = flightCode;
    }

    public String getPassportNo() {
        return passportNo;
    }

    public void setPassportNo(String passportNo) {
        this.passportNo = passportNo;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getPhno() {
        return phno;
    }

    public void setPhno(String phno) {
        this.phno = phno;
    }

   
   
    public void function(){
        
            DBConnection dbcon = new DBConnection();
        try {
            Connection con = dbcon.connMethod();
            String sql = "Insert into CUSTOMER(FLIGHT_CODE,PASSPORT_NO,ADDRESS,NATIONALITY,NAME,GENDER,PH_NO) values(?,?,?,?,?,?,?)";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, flightCode);
            ps.setString(2, passportNo);
            ps.setString(3, gender);
            ps.setString(4, nationality);
            ps.setString(5,name);
            ps.setString(6, gender);
            ps.setString(7,phno);
         
            
            ps.executeUpdate();
            
            System.err.println("success");
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(CustomerManage.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    }

    void setflightCode(String string) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
