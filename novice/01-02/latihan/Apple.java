    public class Apple extends Smartphone{
    protected String merk;
    protected int displayResolution;
    protected int batteryCapacity;

    public Apple()    {
        System.out.println("Color :"+color);
        System.out.println("Ram:"+ram);
        System.out.println("Running by Child (Inheritance) \n");
        merk="Apple";
        displayResolution=1280;
        batteryCapacity=4000;
        }
        public Apple(String merk,int displayResolution, int batteryCapacity)
        {
            this.merk=merk;
            this.displayResolution=displayResolution;
            this.batteryCapacity=batteryCapacity;
        }
        public String getMerk()
        {
            return merk;
        }
        public int getDisplayResolution()
        {
            return displayResolution;
        }
        public int getBatteryCapacity(){
            return batteryCapacity;
        }
        public static void main(String []args)
        {
            Apple iphone=new Apple();
        }
}