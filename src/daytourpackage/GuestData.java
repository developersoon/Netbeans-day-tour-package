/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package daytourpackage;

/**
 *
 * @author Lexar
 */
public class GuestData {
     private int id;
    private String AccN, Lastname, Firstname, Tp, Ap, Date;

    public GuestData(int id, String accn, String ln, String fn, String tp, String ap, String date) {
        this.id = id;
        this.AccN = accn;
        this.Lastname = ln;
        this.Firstname = fn;
        this.Tp = tp;
        this.Ap = ap;
        this.Date = date;
        
    }

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the AccN
     */
    public String getAccN() {
        return AccN;
    }

    /**
     * @param AccN the AccN to set
     */
    public void setAccN(String AccN) {
        this.AccN = AccN;
    }

    /**
     * @return the Lastname
     */
    public String getLastname() {
        return Lastname;
    }

    /**
     * @param Lastname the Lastname to set
     */
    public void setLastname(String Lastname) {
        this.Lastname = Lastname;
    }

    /**
     * @return the Firstname
     */
    public String getFirstname() {
        return Firstname;
    }

    /**
     * @param Firstname the Firstname to set
     */
    public void setFirstname(String Firstname) {
        this.Firstname = Firstname;
    }

    /**
     * @return the Tp
     */
    public String getTp() {
        return Tp;
    }

    /**
     * @param Tp the Tp to set
     */
    public void setTp(String Tp) {
        this.Tp = Tp;
    }

    /**
     * @return the Ap
     */
    public String getAp() {
        return Ap;
    }

    /**
     * @param Ap the Ap to set
     */
    public void setAp(String Ap) {
        this.Ap = Ap;
    }

    /**
     * @return the Date
     */
    public String getDate() {
        return Date;
    }

    /**
     * @param Date the Date to set
     */
    public void setDate(String Date) {
        this.Date = Date;
    }

  
   


}
