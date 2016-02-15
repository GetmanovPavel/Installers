package dao;

import java.sql.SQLException;
import java.util.List;
import table.Images;

/**
 *
 * @author Гетманов Павел
 * pawka9494@mail.ru
 */
public interface ImagesDao {
    public void addImages(Images images) throws SQLException;
    public void deleteImages(Images images) throws SQLException;
    public Images getImages (int id) throws SQLException;
    public List<Images> getImagess() throws SQLException;
}
