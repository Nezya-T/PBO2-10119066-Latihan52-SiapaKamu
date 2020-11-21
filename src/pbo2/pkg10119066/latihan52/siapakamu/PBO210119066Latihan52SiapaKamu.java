/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10119066.latihan52.siapakamu;

/**
 *
 * @author Neyza-T
 * Nama     : Nezya Tariska
 * Kelas    : IF2
 * Nim      : 10119066
 */
public class PBO210119066Latihan52SiapaKamu {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Dosen manusia1;
        Mahasiswa manusia2;
        
        manusia1 = new Dosen();
        manusia1.setNip("41227829930");
        System.out.println("NIP Dosen : " + manusia1.getNip());
        manusia1.siapaKamu();
        manusia1.mengajarApa();
        
        manusia2 = new Mahasiswa();
        manusia2.setNim("10119066");
        System.out.println("NIP Dosen : " + manusia2.getNim());
        manusia2.siapaKamu();
        manusia2.kelasApa();
    }
    
}
