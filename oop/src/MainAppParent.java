import interfaces.Phone;

import java.util.Scanner;

public class MainAppParent {
    public static void main(String[] args) {
        // membuat object phone menggunakan instansiasi dari class Xiaomi
        Phone redmiNote10 = new Xiaomi();

        // membuat object PhoneUser
        PhoneUser reza = new PhoneUser(redmiNote10);

        // nyalakan dulu HP
        reza.turnOnThePhone();

        // membuat tampilan
        Scanner input = new Scanner(System.in);
        String aksi;
        boolean isLooping = true;

        do {
            System.out.println("====Aplikasi Interface====");
            System.out.println("[1] Nyalakan HP");
            System.out.println("[2] Matikan HP");
            System.out.println("[3] Perbesar Volume");
            System.out.println("[4] Perkecil Volume");
            System.out.println("[0] Keluar");
            System.out.println("==========================");

            System.out.println("Pilih Aksi : ");
            aksi = input.next();

            if (aksi.equalsIgnoreCase("1")) {
                reza.turnOnThePhone();
            } else if (aksi.equalsIgnoreCase("2")) {
                reza.turnOffThePhone();
            } else if (aksi.equalsIgnoreCase("3")) {
                reza.makePhoneLouder();
            }  else if (aksi.equalsIgnoreCase("4")) {
                reza.makePhoneSilent();
            } else if (aksi.equalsIgnoreCase("0")){
                isLooping = false;
            } else {
                System.out.println("Aksi yang anda pilih Tidak tersedia.");
                System.out.println("Silahkan Pilih Aksi Kembali.");
            }
         } while(isLooping);
    }
}
