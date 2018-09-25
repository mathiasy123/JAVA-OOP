
package segitiga;

public class Segitiga {

    public static void main(String[] args) {
        buatSegitiga segitiga1 = new buatSegitiga();
        
        segitiga1.setSisiAlas(10);
        segitiga1.setSisiM1(4);
        segitiga1.setSisiM2(4);
        segitiga1.setTinggi(5);
        segitiga1.setWarna("merah");
        System.out.println("Segitiga ini berwarna " + segitiga1.getWarna());
        System.out.println("Segitiga ini memiliki sisi alas : " + segitiga1.getSisiAlas());
        System.out.println("Segitiga ini memiliki sisi miring : " + segitiga1.getSisiM1() + " dan " + segitiga1.getSisiM2());
        System.out.println("Segitiga ini memiliki tinggi : " + segitiga1.getTinggi());
        System.out.println("Segitiga ini memiliki luas : " + segitiga1.luas());
        System.out.println("Segitiga ini memiliki keliling : " + segitiga1.kell());
    }
    
}
