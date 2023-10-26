/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedNativeQuery;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;

/**
 *
 * @author Simo
 */
@Entity
@NamedQuery(name = "findAll", query = "from Salle")
@NamedNativeQuery(name = "findAllNative", query = "select * from salle", resultClass = Machine.class)
public class Salle implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private int code;
    @OneToMany
    private List<Machine> machine;
    public Salle(){
    }
    
    public Salle(int code){
        this.code=code;
    }

    public int getId() {
        return id;
    }

    public int getCode() {
        return code;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public void setMachine(List<Machine> machine) {
        this.machine = machine;
    }

    public List<Machine> getMachine() {
        return machine;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
