/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bean;

/**
 *
 * @author Admin
 */
public class donvi {
    private String madv;
    private String tendv;

    public donvi() {
    }

    public donvi(String madv, String tendv) {
        this.madv = madv;
        this.tendv = tendv;
    }

    public String getMadv() {
        return madv;
    }

    public void setMadv(String madv) {
        this.madv = madv;
    }

    public String getTendv() {
        return tendv;
    }

    public void setTendv(String tendv) {
        this.tendv = tendv;
    }

    @Override
    public String toString() {
        return tendv;
    }
}
