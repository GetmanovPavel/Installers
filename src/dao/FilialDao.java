package dao;

import java.sql.SQLException;
import java.util.List;
import table.Filial;

/**
 *
 * @author Гетманов Павел
 * pawka9494@mail.ru
 */
public interface FilialDao {
    public void addFilial(Filial filial) throws SQLException;
    public void deleteFilial(Filial filial) throws SQLException;
    public Filial getFilial (int id) throws SQLException;
    public List<Filial> getFilials() throws SQLException;
}
