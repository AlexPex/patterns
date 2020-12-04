
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Администратор
 */
public class StudentModel {
    public String name, surname, email;
    
    
    
    public void createStudent(String name, String surname, String email){
        this.email = email;
        this.name = name;
        this.surname = surname;
    }
    
    public String getStName(){
        return name;
    }
}
