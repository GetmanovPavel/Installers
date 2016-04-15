package installers;

import java.util.List;
import javax.swing.ComboBoxModel;
import javax.swing.DefaultComboBoxModel;
import table.CodeRegion;

/**
 *
 * @author Павел
 */
class CodeRegionModel2 extends DefaultComboBoxModel<CodeRegion> {

    public CodeRegionModel2(List<CodeRegion> codeRegions) {
        super((CodeRegion[]) codeRegions.toArray(new CodeRegion[codeRegions.size()]));
    }

}
