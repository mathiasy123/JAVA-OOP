
package segitiga;

public class buatSegitiga {
    String warna = "";
    int luas;
    int kell;
    int sisiAlas, sisiM1, sisiM2, tinggi;
    
    void setSisiAlas(int sisi1){this.sisiAlas = sisi1;}   
    void setSisiM1(int sisi2){this.sisiM1 = sisi2;}
    void setSisiM2(int sisi3){this.sisiM2 = sisi3;}
    void setTinggi(int t){this.tinggi = t;}
    void setWarna(String w){this.warna = w;}
    
    int getSisiAlas(){return this.sisiAlas;}
    int getSisiM1(){return this.sisiM1;}
    int getSisiM2(){return this.sisiM2;}
    int getTinggi(){return this.tinggi;}
    String getWarna(){return this.warna;}
    
    int luas(){return (this.sisiAlas * this.tinggi) / 2;}
    int kell(){return this.sisiAlas + this.sisiM1 + this.sisiM2;}
}
