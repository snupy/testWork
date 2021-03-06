/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.malik.testproject.jsf;

import java.util.List;
import javax.faces.application.FacesMessage;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;

import org.primefaces.event.SelectEvent;
import ru.malik.testproject.entity.DAO.MenBirthday;
import ru.malik.testproject.entity.DAO.MenBirthdayDAO;
import ru.malik.testproject.entity.DAO.SecondName;
import ru.malik.testproject.entity.DAO.SecondNameDAO;

/**
 *
 * @author Малик
 */
@ManagedBean(name = "mainBean")
@SessionScoped
public class MainBean {

    private List<MenBirthday> menBirthdayList;
    private MenBirthday selectedMenBirthday;
    private MenBirthdaydataModel menBirthdaydataModel;

    public MainBean() {

        this.menBirthdayList = (new MenBirthdayDAO()).findAll();

        this.menBirthdaydataModel = new MenBirthdaydataModel(this.menBirthdayList);
    }

    public List<MenBirthday> getMenBirthdayList() {
        return menBirthdayList;
    }

    public void setMenBirthdayList(List<MenBirthday> menBirthdayList) {
        this.menBirthdayList = menBirthdayList;
    }
    
    public MenBirthday getSelectedMenBirthday() {
        return selectedMenBirthday;
    }

    public void setSelectedMenBirthday(MenBirthday selectedMenBirthday) {
        this.selectedMenBirthday = selectedMenBirthday;
    }

    public MenBirthdaydataModel getMenBirthdaydataModel() {
        return menBirthdaydataModel;
    }
    
    public List<SecondName> completeSecondName(String query) {
        List<SecondName> list = (new SecondNameDAO()).findAll();
        for (SecondName secondName : list) {
            System.out.println(secondName);
        }
        return list;
    }
    
}
