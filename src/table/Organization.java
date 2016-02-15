package table;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author Гетманов Павел
 * pawka9494@mail.ru
 */
@Entity
@Table(name="Organization")
public class Organization implements Serializable {
    @Id @GeneratedValue
    @Column (name="id")
    private int id;
    
    /**
     * Название организации
     */
    @Column (name="NameOrganization")
    private String nameOrganization;
    
    /**
     * Сокращенное название для номера документа
     */
    @Column (name="ShortNameOrganization")
    private String ShortNameOrganization;
    
    /**
     * Количество актов монтажа для нумерации
     */
    @Column (name="countInstallAct")
    private int countInstallAct;

    public int getId() {
        return id;
    }

    public String getNameOrganization() {
        return nameOrganization;
    }

    public String getShortNameOrganization() {
        return ShortNameOrganization;
    }

    public int getCountInstallAct() {
        return countInstallAct;
    }
    
    public void setId(int id) {
        this.id = id;
    }

    public void setNameOrganization(String nameOrganization) {
        this.nameOrganization = nameOrganization;
    }

    public void setShortNameOrganization(String ShortNameOrganization) {
        this.ShortNameOrganization = ShortNameOrganization;
    }

    public void setCountInstallAct(int countInstallAct) {
        this.countInstallAct = countInstallAct;
    }
    
}
