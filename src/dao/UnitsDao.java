package dao;

import java.sql.SQLException;
import java.util.List;
import table.Units;

/**
 * @author Гетманов Павел
 * pawka9494@mail.ru
 */
public interface UnitsDao {
    public void addUnits(Units units) throws SQLException;
    public void deleteUnits(Units units) throws SQLException;
    public Units getUnits (int id) throws SQLException;
    public List<Units> getUnitss() throws SQLException;
}
