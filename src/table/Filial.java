package table;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author Гетманов Павел 
 * pawka9494@mail.ru
 */
@Entity
@Table(name="Filial")
public class Filial {
    @Id
    @Column (name="Id")
    private int id;
    
    /**
     * Название филиала
     */
    @Column (name="filialName")
    private String filialName;
    
    /**
     * Связь с организацией
     */
    @Column (name="idOrganization")
    private Organization idOrganization;

    public int getId() {
        return id;
    }

    public String getFilialName() {
        return filialName;
    }

    public Organization getIdOrganization() {
        return idOrganization;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setFilialName(String filialName) {
        this.filialName = filialName;
    }

    public void setIdOrganization(Organization idOrganization) {
        this.idOrganization = idOrganization;
    }

}
