import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
        int km,yas,tarife;
        double tutar,indy,indt,indirimlit;
        System.out.print("Mesafeyi km türünden giriniz: ");
        km= inp.nextInt();
        tutar=km*1.5;
        if (km<1){
            System.out.print("Hatalı veri girdiniz!");
        }else {
            System.out.print("Yaşınızı giriniz: ");
            yas= inp.nextInt();
            if (yas<1){
                System.out.print("Hatalı veri girdiniz!");
            }else {
                if (yas<=12){
                    indy=tutar*0.5;
                    indirimlit=tutar-indy;
                    System.out.print("Yolculuk tipini giriniz (1 => Tek Yön , 2 => Gidiş Dönüş ): ");
                    tarife= inp.nextInt();
                    if (tarife==1){
                        System.out.print("Toplam tutar: "+indirimlit);
                    }else {
                        tutar=(indirimlit*0.8)*2;
                        System.out.print("Toplam tutar: "+tutar);
                    }
                } else if (yas<=24) {
                    indy=tutar*0.10;
                    indirimlit=tutar-indy;
                    System.out.print("Yolculuk tipini giriniz (1 => Tek Yön , 2 => Gidiş Dönüş ): ");
                    tarife= inp.nextInt();
                    if (tarife==1){
                        System.out.print("Toplam tutar: "+indirimlit);
                    }else {
                        tutar=(indirimlit*0.8)*2;
                        System.out.print("Toplam tutar: "+tutar);
                    }
                }else if (yas>=65){
                    indy=tutar*0.3;
                    indirimlit=tutar-indy;
                    System.out.print("Yolculuk tipini giriniz (1 => Tek Yön , 2 => Gidiş Dönüş ): ");
                    tarife= inp.nextInt();
                    if (tarife==1){
                        System.out.print("Toplam tutar: "+indirimlit);
                    }else {
                        tutar=(indirimlit*0.8)*2;
                        System.out.print("Toplam tutar: "+tutar);
                    }
                }else {
                    System.out.print("Yolculuk tipini giriniz (1 => Tek Yön , 2 => Gidiş Dönüş ): ");
                    tarife= inp.nextInt();
                    if (tarife==1){
                        System.out.print("Toplam tutar: "+tutar);
                    }else {
                        tutar=(tutar*0.8)*2;
                        System.out.print("Toplam tutar: "+tutar);
                    }
                }
            }

        }
    }
}