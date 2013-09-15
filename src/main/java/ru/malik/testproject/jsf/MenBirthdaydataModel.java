/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.malik.testproject.jsf;

import java.util.List;
import javax.faces.model.ListDataModel;
import org.primefaces.model.SelectableDataModel;
import ru.malik.testproject.entity.DAO.MenBirthday;

/**
 *
 * @author Малик
 */
public class MenBirthdaydataModel extends ListDataModel<ru.malik.testproject.entity.DAO.MenBirthday>
        implements SelectableDataModel<ru.malik.testproject.entity.DAO.MenBirthday> {

    public MenBirthdaydataModel(List<MenBirthday> list) {
        super(list);
    }

    public MenBirthdaydataModel() {
    }

    @Override
    public Object getRowKey(MenBirthday menBirthday) {
        return menBirthday.getId();
    }

    @Override
    public MenBirthday getRowData(String rowKey) {
        List<MenBirthday> menBirthdays = (List<MenBirthday>) getWrappedData();

        for (MenBirthday menBirthday : menBirthdays) {
            if (String.valueOf(menBirthday.getId()).equals(rowKey)) {
                return menBirthday;
            }
        }

        return null;
    }
}
