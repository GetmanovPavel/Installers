package dao;

import java.sql.SQLException;
import java.util.List;
import table.PurposeSeal;

/**
 * @author Гетманов Павел
 * pawka9494@mail.ru
 */
public interface PurposeSealDao {
    public void addPurposeSeal(PurposeSeal purposeSeal) throws SQLException;
    public void deletePurposeSeal(PurposeSeal purposeSeal) throws SQLException;
    public PurposeSeal getPurposeSeal (int id) throws SQLException;
    public List<PurposeSeal> getPurposeSeals() throws SQLException;  
}
