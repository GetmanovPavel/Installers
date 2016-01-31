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
@Table(name="Calibration")
public class Calibration {
    @Id
    @Column (name="Id")
    private int id;
    /**
    * Название тарировки(одновременная,последовательная и пр.)
    */
    @Column (name="calibrationName")
    private String calibrationName;
 
    /**
    * Тарировка сделана заказчиком 
    */
    @Column (name="customerCalibration")
    private boolean customerCalibration;

    public void setId(int id) {
        this.id = id;
    }

    public void setCalibrationName(String calibrationName) {
        this.calibrationName = calibrationName;
    }

    public void setCustomerCalibration(boolean customerCalibration) {
        this.customerCalibration = customerCalibration;
    }

    public int getId() {
        return id;
    }

    public String getCalibrationName() {
        return calibrationName;
    }

    public boolean isCustomerCalibration() {
        return customerCalibration;
    }

    
}
