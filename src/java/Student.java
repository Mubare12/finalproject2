
import javax.faces.bean.ManagedBean;

@ManagedBean
public class Student {
    String FullName;
    String Password;
    String Passport_no;
    public Student(){
        
    }

    public String getFullName() {
        return FullName;
    }

    public void setFullName(String FullName) {
        this.FullName = FullName;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String Password) {
        this.Password = Password;
    }

    public String getPassport_no() {
        return Passport_no;
    }

    public void setPassport_no(String Passport_no) {
        this.Passport_no = Passport_no;
    }
    
}
