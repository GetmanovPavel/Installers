package dao;

import java.sql.SQLException;
import java.util.List;
import table.EquipmentType;

/**
 * @author Гетманов Павел
 * pawka9494@mail.ru
 */
public interface EquipmentTypeDao {
    public void addEquipmentType(EquipmentType equipmentType) throws SQLException;
    public void deleteEquipmentType (EquipmentType equipmentType) throws SQLException;
    public EquipmentType getEquipmentType (int id) throws SQLException;
    public List<EquipmentType> getEquipmentTypes() throws SQLException; 
}
