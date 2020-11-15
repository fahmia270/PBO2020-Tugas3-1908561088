package com.main;

import java.util.Scanner;

public class Program {
    private final Scanner scanner;

    public Program() {
        scanner = new Scanner(System.in);
    }

    public void run() {
        int userMenu;
        do {
            userMenu = this.getIntegerInput("\n\nNama: Fahmi Ahmad Arum Pratama\nNIM: 1908561088\nMENU\n1. Cek Member Gfriend\n2. Ganti Data Member\n3. Reset Data Member\n4. Quit\nPilihan: ");
            this.processMenu(userMenu);
        } while(userMenu != 4);
    }

    private void processMenu(int menu) {
        switch (menu) {
            case 1:
                MemberGfriend memberGfriend = TampilkanMember.tampilkanMember();
                if (memberGfriend != null) {
                    System.out.println("Nama Member: " + memberGfriend.getNamaMember());
                } else {
                    System.out.println("Mohon diisi terlebih dahulu!");
                }
                break;
            case 2:
                MenyimpanMember menyimpanMember = new MenyimpanMember(getInputMember("Masukkan nama member baru: "));
                menyimpanMember.laksanakan();
                break;
            case 3:
                MenyimpanMember menyimpanMember1 = new MenyimpanMember(null);
                menyimpanMember1.laksanakan();
                break;
            case 4:
                break;
            default:
                System.out.println("Mohon maaf anda salah");
                break;
        }
    }

    private int getIntegerInput(String message) {
        System.out.println(message);
        int buffer = scanner.nextInt();
        scanner.nextLine();
        return buffer;
    }

    private String getInputMember(String message) {
        System.out.println(message);
        return scanner.nextLine();
    }
}