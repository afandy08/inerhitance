/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan4;

/**
 *
 * @author Kardi
 */
public class b extends a{
    private int b;
    public void setb(int nilai)
    {
    b = nilai;
    }
    
    public int getb ()
    {
    return b;
    }
    
    //melakukan override terhadap method tampilan nilai pada kelas a
    
    public void tampilkannilai()
    {
    super.tampilkannilai();//memanggil method
    System.out.println("nilai b : "+getb());
    }
}
