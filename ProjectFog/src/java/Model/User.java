package model;
/**
 *
 * @author Casper
 */
public class User {
    private String userName, password, userType;
    private boolean enabled;

    public User(){
        
    }
    public User(String userName, String password, String userType, boolean enabled) {
        this.userName = userName;
        this.password = password;
        this.userType = userType;
        this.enabled = enabled;
    }

    public boolean getEnabled() {
        return enabled;
    }

    public void setEnabled(boolean enabled) {
        this.enabled = enabled;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
       // whatsuosfgfdgf
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUserType() {
        return userType;
    }

    public void setUserType(String userType) {
        this.userType = userType;
    }
    

}
