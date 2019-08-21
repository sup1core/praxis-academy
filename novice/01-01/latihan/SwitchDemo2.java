/**
 * SwitchDemo2
 */
public class SwitchDemo2 {
    public static void main(String[] args) {
        int bulan = 7;
        int tahun = 2019;
        int hari = 0;
        
        switch(bulan){
            case 1: case 3: case 5:
            case 7: case 8: case 10: case 12:
                hari = 31;
                break;
            case 4: case 6: case 9: case 11:
                hari = 30;
                break;
            case 2:
            if (((tahun % 4 == 00) && !(tahun % 100 == 0))
                || (tahun % 400 == 0))
                hari = 29;
            else 
                hari = 28;
                break;
            default:
            System.out.println("Salah bulan");
            break;
        }
        System.out.println("Bulan = "+bulan+" memiliki total hari " + hari);
    }
}