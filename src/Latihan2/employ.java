/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Latihan2;

/**
 *
 * @author Kardi
 */
public class employ extends person {
    private String noKaryawan;
    //konstruktor
    public employ (String noKaryawan, String nama, int usia)
    {
        super(nama, usia);
        this.noKaryawan = noKaryawan;
    }
    //metode
    public void info ()
    {
        System.out.println("no.karyawan : "+this.noKaryawan);
        super.info();
    }
} //akhir kelas
