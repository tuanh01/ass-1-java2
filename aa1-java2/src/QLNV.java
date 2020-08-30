
import java.io.Serializable;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author TuAnh
 */
public class QLNV implements Serializable{
    public String manv;
    public String hoten;
    public int tuoi;
    public String email;
    public double luong;

    public QLNV() {
    }

    public QLNV(String manv, String hoten, int tuoi, String email, double luong) {
        this.manv = manv;
        this.hoten = hoten;
        this.tuoi = tuoi;
        this.email = email;
        this.luong = luong;
    }

    public String getManv() {
        return manv;
    }

    public void setManv(String manv) {
        this.manv = manv;
    }

    public String getHoten() {
        return hoten;
    }

    public void setHoten(String hoten) {
        this.hoten = hoten;
    }

    public int getTuoi() {
        return tuoi;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public double getLuong() {
        return luong;
    }

    public void setLuong(double luong) {
        this.luong = luong;
    }

    @Override
    public String toString() {
        return "QLNV{" + "manv=" + manv + ", hoten=" + hoten + ", tuoi=" + tuoi + ", email=" + email + ", luong=" + luong + '}';
    }

   
   
}
