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
    
    @Column (name="filialName")
    private String filialName;
    
    @Column (name="idOrganization")
    private Organization idOrganization;

    public void setId(int id) {
        this.id = id;
    }

    public void setFilialName(String filialName) {
        this.filialName = filialName;
    }

    public void setIdUnits(Units idUnits) {
        this.idUnits = idUnits;
    }

    public int getId() {
        return id;
    }

    public String getFilialName() {
        return filialName;
    }

    public Units getIdUnits() {
        return idUnits;
    }
    
}
