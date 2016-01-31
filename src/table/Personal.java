/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package table;

import javax.persistence.Column;
import javax.persistence.Id;

/**
 *
 * @author Гетманов Павел
 * pawka9494@mail.ru
 */
public class Personal {
   @Id
   @Column (name="id")
   private int id;  
   
   @Column (name="firstName")
   private String firstName;
   
   @Column (name="lastName")
   private String lastName;
    
   @Column (name="middleName")
   private String middleName;
    
   @Column (name="numberPhone")// дополнительное поле, 
   private String numberPhone; 

    public int getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public String getNumberPhone() {
        return numberPhone;
    }

   
    public void setId(int id) {
        this.id = id;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public void setNumberPhone(String numberPhone) {
        this.numberPhone = numberPhone;
    }
   
   
}
