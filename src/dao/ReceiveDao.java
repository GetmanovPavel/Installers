package dao;

import java.sql.SQLException;
import java.util.List;
import table.Receive;

/**
 * @author Гетманов Павел
 * pawka9494@mail.ru
 */
public interface ReceiveDao {
    public void addReceive(Receive receive) throws SQLException;
    public void deleteReceive(Receive receive) throws SQLException;
    public Receive getReceive (int id) throws SQLException;
    public List<Receive> getReceives() throws SQLException;
}
