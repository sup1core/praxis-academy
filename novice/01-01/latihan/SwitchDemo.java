/**
 * SwitchDemo
 */
public class SwitchDemo {

    public static void main(String[] args) {
        int bulan = 7 ;
        String bulanString="";
        switch (bulan){
            case 1:
                bulanString = "Januari";
                break;
            case 2:
                bulanString = "Febuari";
                break;
            case 3:
                bulanString = "Maret";
                break;
            case 4:
                bulanString = "April";
                break;
            case 5:
                bulanString = "Mei";
                break;
            case 6:
                bulanString = "Juni";
                break;
            case 7:
                bulanString = "Juli";
                break;
            case 8:
                bulanString = "Agustus";
                break;
            case 9:
                bulanString = "September";
                break;
            case 10:
                bulanString = "October";
                break;
            case 11:
                bulanString = "November";
                break;
            case 12:
                bulanString = "Desember";
                break;
                
            }
            System.out.println(bulanString);
    }
}