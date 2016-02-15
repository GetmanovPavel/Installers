package dao;

import java.sql.SQLException;
import java.util.List;
import table.GuideTechnique;


/**
 * @author Гетманов Павел
 * pawka9494@mail.ru
 */
public interface GuideTechniqueDao {
    public void addGuideTechnique(GuideTechnique guideTechnique) throws SQLException;
    public void deleteGuideTechnique(GuideTechnique guideTechnique) throws SQLException;
    public GuideTechnique getGuideTechnique (int id) throws SQLException;
    public List<GuideTechnique> getGuideTechniques() throws SQLException;
}
