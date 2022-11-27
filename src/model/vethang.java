/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author hi
 */
public class vethang {
    private  int id ;
    private  long khId ;
    private  String xe;
    private String bienso;
    private  String ngaytao;
    private String ngayhethen;
    private  boolean  active; 
  

  
    

    public vethang( long khId, String bienso, String ngayhethen , String xe ) {
        this.id = (int)( Math.random()*1000);
        this.khId = khId;
        this.bienso = bienso;
         Date date1 = new Date();
        String mmddyyyy1 = new SimpleDateFormat("MM-dd-yyyy").format(date1);
        this.ngaytao = mmddyyyy1;
        this.ngayhethen = ngayhethen;
        this.xe= xe;
        this.active = true;
    }

    public String getXe() {
        return xe;
    }

    public void setXe(String xe) {
        this.xe = xe;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public long getKhId() {
        return khId;
    }

    public void setKhId(long khId) {
        this.khId = khId;
    }

    public String getBienso() {
        return bienso;
    }

    public void setBienso(String bienso) {
        this.bienso = bienso;
    }

    public String getNgaytao() {
        return ngaytao;
    }

    public void setNgaytao(String ngaytao) {
        this.ngaytao = ngaytao;
    }

    public String getNgayhethen() {
        return ngayhethen;
    }

    public void setNgayhethen(String ngayhethen) {
        this.ngayhethen = ngayhethen;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }
    

     
}
