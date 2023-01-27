
import java.sql.Connection;
import java.sql.PreparedStatement;
import javax.faces.bean.ManagedBean;

@ManagedBean
public class UpdateBean {
 int passport_no;
 String passenger_name;
 int age;
 String address;
 public UpdateBean(){
     
 }

    public int getPassport_no() {
        return passport_no;
    }

    public void setPassport_no(int passport_no) {
        this.passport_no = passport_no;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

  

    public String getPassenger_name() {
        return passenger_name;
    }

    public void setPassenger_name(String passenger_name) {
        this.passenger_name = passenger_name;
    }

    

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
    
 
  public void update13(){
      try{
      
       DBConnection dbcon = new DBConnection();
            Connection con = dbcon.connMethod();
       
          String sql = "UPDATE BOOK SET  PASSENGER_NAME=?, AGE=?, ADDRESS=?  WHERE PASSPORT_NO=?";
           
             PreparedStatement ps = con.prepareStatement(sql);
          
                  ps.setString(1, passenger_name);
              ps.setInt(2, age);
          
                ps.setString(3, address);
                 
                    ps.setInt(4, passport_no);
                      
            ps.executeUpdate();
          
      
      }
      catch(Exception e )
      
      {
      
      System.out.print(e);
      
      }
}}
