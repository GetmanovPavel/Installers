package dao;

import java.sql.SQLException;
import java.util.List;
import table.Equipment;

/**
 * @author Гетманов Павел
 * pawka9494@mail.ru
 */
public interface EquipmentDao {
    public void addEquipment(Equipment equipment) throws SQLException;
    public void deleteEquipment(Equipment equipment) throws SQLException;
    public Equipment getEquipment (int id) throws SQLException;
    public List<Equipment> getEquipments() throws SQLException; 
}
