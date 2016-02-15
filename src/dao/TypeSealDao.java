package dao;

import java.sql.SQLException;
import java.util.List;
import table.TypeSeal;

/**
 * @author Гетманов Павел
 * pawka9494@mail.ru
 */
public interface TypeSealDao {
    public void addTypeSeal(TypeSeal typeSeal) throws SQLException;
    public void deleteTypeSeal(TypeSeal typeSeal) throws SQLException;
    public TypeSeal getTypeSeal (int id) throws SQLException;
    public List<TypeSeal> getTypeSeals() throws SQLException;
}
