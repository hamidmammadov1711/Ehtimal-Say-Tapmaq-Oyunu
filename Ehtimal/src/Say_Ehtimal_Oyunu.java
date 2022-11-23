
import java.awt.BorderLayout;
import java.util.Random;
import java.util.Scanner;


public class Say_Ehtimal_Oyunu {
    public static void main(String[] args) {
        
        short texmin_haqqi=6;
        String message="Ehtimal Say Oyununa Xoş Gəldiniz\n"
                + "Oyunumuzda ehtimal edəcəyiniz say 0-ilə 20 arasındadır\n"
                + "Sizin 6 təxmin haqqınız var\n"
                + "Təxmin haqqınız bitdikdə oyun sonlanacaq\n"
                + "Yenidən oynamaq istədikdə isə proqramı yenidən başladıb təxmininizi yoxlayın\n"
                + "Oyun başladı, xoş təxminlər...\n"
                + "Təxmini sayı daxil edin: ";
                
                while (true){
                    System.out.println(message);
                    
Random random=new Random();
                    
         int texmin_edilecek_say=random.nextInt(20);
         
Scanner scanner=new Scanner(System.in);
    for (int i=texmin_haqqi; i>0; i--) {
        int texmin_edilen_say=scanner.nextInt();
            if(texmin_edilecek_say==texmin_edilen_say){
            String message2="Təbriklər sayını doğru təxmin etdiniz...\n"
                    + "Təkrar oynamaq üçün '1'-ə, çıxmaq üçün isə '0'-a basın";
                System.out.println(message2);
                
                int cavab=scanner.nextInt();
                    if(cavab==0){
                        System.out.println("Proqramdan çıxılır....\n"
                                + "Yenə görüşmək diləyilə...");
                        return;                      
                    }
                    
                    else {
                        break;
                    }            
            }
                else if (texmin_edilecek_say!=texmin_edilen_say){
                    System.out.println("Xətalı seçim etdiniz"+" "+" Qalan haqqınız: "+(i-1));
                                if(i==1) {
                        String message3="Təxmin haqqınız bitdi\n"
                                            + "Yenidən oynamaq üçün '1'-ə, çıxmaq üçün isə '0'-a basın...";
                                        System.out.println(message3);
                       int cavab2=scanner.nextInt();
                            if (cavab2 == 0){
                                System.out.println("Oyundan çıxdınız...");
                                return;
                            }
                            else{
                                break;
                                }
                            
            }   
                               texminDerecesi(texmin_edilen_say, texmin_edilecek_say);
    }                
                }
    }
    }
    static void texminDerecesi (int texmin_edilen_say, int texmin_edilecec_say){
        
        int f = (texmin_edilen_say - texmin_edilecec_say);
            
            if (f <= 0 && f >= -2 || f >= 0 && f < 2){
                System.out.println("Sayı tapmağa çox yaxınlaşdınız...");
            }
            else if (f <= -2 && f >= -4 || f >= 2 && f < 4){
                System.out.println("Saya yaxınlaşırsınız...");
            }
            else if(f <= -4 && f >= -14 || f >= 4 && f < 14){
                System.out.println("Saydan uzaqlaşırsınız....");
            } 
            else if (f <= -15 && f >= -19 || f >= 15 && f <= 19){
                System.out.println("Saydan çox uzaqlaşdınız...");
            }
            
        
        
    }
}
