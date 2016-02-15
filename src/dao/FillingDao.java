package dao;

import java.sql.SQLException;
import java.util.List;
import table.Filling;

/**
 *
 * @author Гетманов Павел
 * pawka9494@mail.ru
 */
public interface FillingDao {
    public void addFilling(Filling flling) throws SQLException;
    public void deleteFilling(Filling filling) throws SQLException;
    public Filling getFilling (int id) throws SQLException;
    public List<Filling> getFillings() throws SQLException; 
}
