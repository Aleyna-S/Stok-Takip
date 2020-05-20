/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stok;
import java.util.Arrays;
import java.util.Random;



/**
 *
 * @author asus
 */
public class Stok {
 

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     
        // Random r = new Random();
       // generateColor Toplam[]=new generateColor [100];
      // for (int i = 0; i < 100; i++) {
           //int generateColor  = (int) (Math.random() * 100);  
       
        Urun toplam[] = new Urun[250];
        for (int i = 0; i < 250; i++) {
        int urunkodu = (int) (Math.random() * 5000);
        int stokMiktarı = (int) (Math.random() * 250);
        Urun yeni = new Urun(urunkodu,stokMiktarı);
        toplam[i] = yeni;
         }
        urunleriStokMiktarınaGoreSirala(toplam);
         for(int i=0; i<250;i++){
            toplam[i].urunÖzellikleriniYazdir();
         }
}
     private static void  urunleriStokMiktarınaGoreSirala(Urun[]toplam){
        for(int i=0;i<toplam.length-1;i++){
            int EnBuyukSayi=toplam[i].getstokMiktarı();
            int EnBuyukElemaninIndex=i;
            for(int j=i+1; j<toplam.length;j++){
                if(EnBuyukSayi<toplam[j].getstokMiktarı()){
                    EnBuyukSayi=toplam[j].getstokMiktarı();
                    EnBuyukElemaninIndex=j;
                }
            }
        
            if(EnBuyukElemaninIndex!=i){
                toplam[EnBuyukElemaninIndex]=toplam[i];
                toplam[i].setstokMiktarı(EnBuyukSayi);
            }
        }
     }
}

             /*private static String generateColor(Random r) {
        StringBuilder color = new StringBuilder(Integer.toHexString(r.nextInt(16777215)));
               
        while (color.length() < 6) {
            color.append("0");
        }

        return color.append("#").reverse().toString();*/
//class generateColor{
    //private int generateColor;
//public generateColor(int generateColor){
    //this.generateColor=generateColor;
    

        class Urun{
   private int urunkodu;
   private  int stokMiktarı;  
   //private int generateColor;
   
public Urun(int urunkodu, int stokMiktarı){
    this.urunkodu=urunkodu;
    this.stokMiktarı=stokMiktarı;
    //this.generateColor= generateColor;
}
    
  public int geturunkodu(){
    return urunkodu;
  }
public void seturunkodu(int urunkodu){
    this.urunkodu=urunkodu;

}
public int getstokMiktarı(){
    return stokMiktarı;

}
public void setstokMiktarı(int stokMiktarı){
    this.stokMiktarı=stokMiktarı;

}

     //public int getgenerateColor(){
        // return generateColor;
     
    // public void setgenerateColor(int generateColor){
   // this.generateColor= generateColor;
    // }
       
      
public void urunÖzellikleriniYazdir(){
    
    System.out.println("Ürün kodu:"+" "+ urunkodu+ " " +"stok miktarı:" +" "+stokMiktarı+"\n");
}
        }




    
    
