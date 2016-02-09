package dao;

import java.sql.SQLException;
import java.util.List;
import table.CodeRegion;


/**
 *
 * @author Гетманов Павел
 * pawka9494@mail.ru
 */
public interface CodeRegionDao {
    public void addCodeRegion(CodeRegion codeRegion) throws SQLException;
    public void deleteCodeRegion(CodeRegion codeRegion) throws SQLException;
    public CodeRegion getCodeRegion (int id) throws SQLException;
    public List<CodeRegion> getCodeRegions() throws SQLException;
}
