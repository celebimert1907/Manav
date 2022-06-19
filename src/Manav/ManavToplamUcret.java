package Manav;

import java.util.Scanner;

public class ManavToplamUcret {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double armutKGF = 2.14;
        double elmaKGF = 3.67;
        double domatesKGF = 1.11;
        double muzKGF = 0.95;
        double patlicanKGF = 5;

        double armut;
        double elma;
        double domates;
        double muz;
        double patlican;

        System.out.print("Kac kilo armut istersiniz ? ");
        armut = input.nextFloat();
        System.out.print("Kac kilo elma istersiniz ? ");
        elma = input.nextFloat();
        System.out.print("Kac kilo domates istersiniz ? ");
        domates = input.nextFloat();
        System.out.print("Kac kilo muz istersiniz ? ");
        muz = input.nextFloat();
        System.out.print("Kac kilo patlican istersiniz ? ");
        patlican = input.nextFloat();

        double toplamTutar = ((armut*armutKGF)+(elma*elmaKGF)+(domates*domatesKGF)+(muz*muzKGF)+(patlican*patlicanKGF));
        System.out.println("Toplam tutar: "+ toplamTutar);
    }
}
