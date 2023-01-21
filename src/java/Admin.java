
import java.io.Serializable;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;

@ManagedBean
@SessionScoped
public class Admin implements Serializable {
   private String fullname;
   private String passport;
   private String passport_no;

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public String getPassport() {
        return passport;
    }

    public void setPassport(String passport) {
        this.passport = passport;
    }

    public String getPassport_no() {
        return passport_no;
    }

    public void setPassport_no(String passport_no) {
        this.passport_no = passport_no;
    }
   
    public String mubarek() throws SQLException, ClassNotFoundException {
        boolean valid =Admin2.express(fullname,passport,passport_no);
         if (valid) {
              DBConnection dbcon = new DBConnection();
            Connection con = dbcon.connMethod();
            PreparedStatement ps = con.prepareStatement("select PASSPORT_NO from ADMIN where FULLNAME=?");
            ps.setString(1, fullname);       
            ResultSet rs = ps.executeQuery();
            rs.next();
            String userType =rs.getString(1);
            //HttpSession session = Session.getSession();
            //session.setAttribute("username", user);
            if ("Admin".equals(userType)) {
                return "index";
            } else {
                return "Customer";
            }
        } else {
            FacesContext.getCurrentInstance().addMessage(
                    null,
                    new FacesMessage(FacesMessage.SEVERITY_WARN,
                            "Incorrect Username and Passowrd",
                            "Please enter correct username and Password"));
            return "index";
        }
    }

  
    
}
    

