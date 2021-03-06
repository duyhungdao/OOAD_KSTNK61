/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entity.List;

import Entity.Resident;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author User
 */
@XmlRootElement(name = "ResidentList")
@XmlAccessorType (XmlAccessType.FIELD)
public class ResidentList {
    @XmlElement(name = "Resident")
    private List<Resident> listResident;

    public ResidentList() {
        listResident = new ArrayList<>();
    }

    public List<Resident> getListResident() {
        return listResident;
    }

    public void setListResident(List<Resident> listResident) {
        this.listResident = listResident;
    }
}
