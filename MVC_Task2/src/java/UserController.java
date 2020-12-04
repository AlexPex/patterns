/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import static java.util.Collections.list;
import java.util.List;
import java.util.prefs.Preferences;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.component.UIPanel;
import javax.faces.context.FacesContext;
/**
 *
 * @author Администратор
 */
@ManagedBean(name = "UserController")
public class UserController {
    
    private StudentModel student;
    private UIPanel resultPanel;
    private String name, surname, email;
    Preferences userPreferences = Preferences.userRoot();
    
    private int counter = 0;
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getSurname(){
        return surname;
    }
    public void setSurname(String surname){
        this.surname = surname;
    }
    public String getEmail(){
        return email;
    }
    public void setEmail(String email){
        this.email = email;
    }
    public UIPanel getResultPanel() {
      return resultPanel;
   }
    public void setResultPanel(UIPanel resultPanel) {
      this.resultPanel = resultPanel;
   }
    
    public int getNumber(){
        return counter;
    }
    public void addStudent(){
        student = new StudentModel();
        student.createStudent(this.name, this.surname, this.email);
        if(userPreferences.getInt("counter", 0) == 0){
            ++counter;
            userPreferences.putInt("counter", counter);

        }else{
            counter = userPreferences.getInt("counter", 0);
            ++counter;
            userPreferences.putInt("counter", counter);
        }
        
        
        
    }
    
    //UIInput name, UIInput surname, UIInput email, UIInput age
    public void createStudent() {
        FacesContext ctx = FacesContext.getCurrentInstance();
      try {
          this.setEmail(email);
          this.setName(name);
          this.setSurname(surname);
          this.addStudent();
         resultPanel.setRendered(true);
         ctx.addMessage(null, new
               FacesMessage(FacesMessage.SEVERITY_INFO,
            "Student was added. Total is  " + this.counter ,
               null));
      } catch (Exception ex) {
         resultPanel.setRendered(false);
         ctx.addMessage(null, new
               FacesMessage(FacesMessage.SEVERITY_ERROR,
            ex.getMessage(), null));
      }      
   }
}
