public class Iphone extends Apple
{
    public Iphone()
    {
        System.out.println("Merk  :"+merk);
        System.out.println("batteryCapacity :"+batteryCapacity);
        System.out.println("displayResolution :"+displayResolution);
    }
    public static void main(String []args)
    {
        String namaIphone;
        Iphone lagan=new Iphone();
        System.out.println("Seri Iphone 8");
    }
}