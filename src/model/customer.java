/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author hi
 */
public class customer {
    private  long cmnd ;
    private String name ;
    private  String diachi;
    private  int sdt;

    public customer(long cmnd, String name, String diachi, int sdt) {
        this.cmnd = cmnd;
        this.name = name;
        this.diachi = diachi;
        this.sdt = sdt;
    }

    public long getCmnd() {
        return cmnd;
    }

    public void setCmnd(long cmnd) {
        this.cmnd = cmnd;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDiachi() {
        return diachi;
    }

    public void setDiachi(String diachi) {
        this.diachi = diachi;
    }

    public int getSdt() {
        return sdt;
    }

    public void setSdt(int sdt) {
        this.sdt = sdt;
    }
    
}
