
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;

/*
 * NAMA              : Tassyakur Pasya
 * KELAS             : IF-01
 * NIM               : 10118009
 * DESKRIPSI PROGRAM : Target Saldo Tabungan
 */

public class IF01PBO110118009Latihan36TargetSaldoTabungan {

    /**
     * @param args the command line arguments
     */
    public static double bunga;
    public static double saldo = 3500000;
    public static void main(String[] args) {
        // TODO code application logic here
        
        
        DecimalFormat rp = (DecimalFormat) DecimalFormat.getCurrencyInstance();
        DecimalFormatSymbols fRp = new DecimalFormatSymbols();
        fRp.setCurrencySymbol("Rp. ");
        fRp.setMonetaryDecimalSeparator(',');
        fRp.setGroupingSeparator('.');
        rp.setDecimalFormatSymbols(fRp);
        
        for (int i = 1;i <= 12; i++){
            bunga = saldo*0.08;
            saldo += bunga;
            
            if (saldo <= 6500000){
                System.out.printf("Saldo di Bulan ke- "+i+" %s%n",rp.format(saldo)); 
                   
            }
        }
    }
    
}
    


