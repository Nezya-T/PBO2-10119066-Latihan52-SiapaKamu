/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Neyza-T
 */
public class Dosen extends Manusia {
    
    private String nip;
    private String matakuliah;
    
    public String getNip(){
        return nip;
    }
    public void setNip(String nip){
        this.nip = nip;
    }
    public String getMataKuliah(){
        return matakuliah;
    }
    public void setMataKuliah(String matakuliah){
        this.matakuliah = matakuliah;
    }
    public void mengajarApa(){
        setNama("Rizki Adam Kurniawan");
        setMataKuliah("PBO");
        System.out.println("Saya " + getNama() + " umur 27 tahun sedang mengajar matakuliah " + getMataKuliah());
    }
   
    @Override
    public void siapaKamu(){
        System.out.println("Saya Dosen");
    }
    
}
