
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.faces.bean.ManagedBean;
@ManagedBean
public class BookManage {
   int passport_no;
   String from1;
   String to1;
   String classs_travel;
   String passenger_name;
   int age;
   String address;
   
  public BookManage(){
      
      
  }

    public int getPassport_no() {
        return passport_no;
    }

    public void setPassport_no(int passport_no) {
        this.passport_no = passport_no;
    }

    public String getFrom1() {
        return from1;
    }

    public void setFrom1(String from1) {
        this.from1 = from1;
    }

    public String getTo1() {
        return to1;
    }

    public void setTo1(String to1) {
        this.to1 = to1;
    }

    public String getClasss_travel() {
        return classs_travel;
    }

    public void setClasss_travel(String classs_travel) {
        this.classs_travel = classs_travel;
    }

    public String getPassenger_name() {
        return passenger_name;
    }

    public void setPassenger_name(String passenger_name) {
        this.passenger_name = passenger_name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
   
   public void function3(){
        
            DBConnection dbcon = new DBConnection();
        try {
            Connection con = dbcon.connMethod();
            String sql = "Insert into BOOK(PASSPORT_NO,FROM1,TO1,CLASS_TRAVEL,PASSENGER_NAME,AGE,ADDRESS) values(?,?,?,?,?,?,?)";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, passport_no);
            ps.setString(2, from1);
            ps.setString(3, to1);
            ps.setString(4, classs_travel);
            ps.setString(5,passenger_name);
            ps.setInt(6, age);
            ps.setString(7,address);
         
            
            ps.executeUpdate();
            
            System.err.println("success");
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(BookManage.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    }

    void setpassport_no(String string) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}

    
   

