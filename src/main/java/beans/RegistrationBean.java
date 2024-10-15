package beans;

import jakarta.enterprise.context.SessionScoped;
import jakarta.inject.Named;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Named(value = "registrationBean")
@SessionScoped
public class RegistrationBean implements Serializable{

    private String firstName;
    private String lastName;
    private String gender;
    private Date dob;
    private int experience;
    private String newsletter;
    private String phone;
    private String password;
    private Object resume;
    private List<User> userList = new ArrayList<>();

    private int count = 0;
    public int getUsers(){
	    return count;
    }
    public void increaser(){
	    count++;
    }	
    public void submit() {
        userList.add(new User(firstName , lastName , gender , dob));
	
        firstName = "";
        lastName = "";
        gender = "";
        dob = null;
        experience = 0;
        newsletter = "";
        phone = "";
        password = "";
    }
    
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Date getDob() {
        return dob;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    public String getNewsletter() {
        return newsletter;
    }

    public void setNewsletter(String newsletter) {
        this.newsletter = newsletter;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Object getResume() {
        return resume;
    }

    public void setResume(Object resume) {
        this.resume = resume;
    }

    public List<User> getUserList() {
        return userList;
    }

    public void setUserList(List<User> userList) {
        this.userList = userList;
    }
}
