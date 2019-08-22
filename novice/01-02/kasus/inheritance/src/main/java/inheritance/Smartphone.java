public class Smartphone
    {
        protected String color;
        protected int ram;
        public Smartphone(){
            System.out.println("\n===============================");
            System.out.println("Author : github.com/sup1core");
            System.out.println("_________________________________");
            System.out.println("\nProgram Inheritance | CRC Card");
            System.out.println("=================================");
            System.out.println("Running by Construktor Smartphone ");
            color="Black";
            ram=8;
        }
        public Smartphone(String color,int ram){
            this.color=color;
            this.ram=ram;
        }    
        public String getColor(){
            return color;
        }
        public int getRam(){
            return ram;
        }
    }

/*
interface A{ } 
interface B{ } 
class C{ } 
class D extends C implements A,B { } */