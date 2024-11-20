/*import java.util.Scanner;

public class selection {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int data[] = new int[5];
        System.out.println("Selection Sort");
        System.out.println("Masukkan Data Awal");

        for (int i = 0; i < 5; i++) {
            System.out.print("Data (" + (i + 1) + ") = ");
            data[i] = s.nextInt();
        }
        System.out.print("Data Awal: ");
        for (int i = 0; i < data.length; i++) {
            System.out.print(data[i] + " ");
        }
        System.out.println("");
        for (int i = 0; i < data.length - 1; i++) {
            for (int j = i + 1; j < data.length; j++) {
                if (data[i] > data[j]) {
                    //tukar data
                    int temp = data[j];
                    data[j] = data[i];
                    data[i] = temp;
                } //end if
            } //end loop j
        } //end loop iS
        System.out.print("Data Akhir: ");
        for (int i = 0; i < data.length; i++) {
            System.out.print(data[i] + " ");
        }
        System.out.println("");
    }
}*/

import java.util.Scanner;
public class selectionString {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String data[] = new String[5];
        System.out.println("Selection Sort");
        System.out.println("Masukkan Data Awal");
        for (int i = 0; i < 5; i++) {
            System.out.print("Data (" + (i + 1) + ") = ");
            data[i] = s.next();
        }
        System.out.print("Data Awal: ");
        for (int i = 0; i < data.length; i++) {
            System.out.print(data[i] + " ");
        }
        System.out.println("");
        for (int i = 0; i < data.length - 1; i++) {
            for (int j = i + 1; j < data.length; j++) {
                if (data[i].compareToIgnoreCase(data[j]) > 0) {
                    String temp = data[j];
                    data[j] = data[i];
                    data[i] = temp;
                }
            }
        }
        System.out.print("Data Akhir: ");
        for (int i = 0; i < data.length; i++) {
            System.out.print(data[i] + " ");
        }
        System.out.println("");
    }
}

/*import java.util.Scanner;
public class selection {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int data[] = new int[5];
        System.out.println("Selection Sort");
        System.out.println("Masukkan Data Awal");
        for (int i = 0; i < 5; i++) {
            System.out.print("Data (" + (i + 1) + ") = ");
            data[i] = s.nextInt();
        }
        System.out.print("Data Awal: ");
        for (int i = 0; i < data.length; i++) {
            System.out.print(data[i] + " ");
        }
        System.out.println("");
        System.out.println("Pengurutan dimulai...");
        int step = 1; // Untuk menghitung langkah pengurutan
        for (int i = 0; i < data.length - 1; i++) {
            for (int j = i + 1; j < data.length; j++) {
                if (data[i] > data[j]) {
                    int temp = data[j];
                    data[j] = data[i];
                    data[i] = temp;
                    System.out.print("Step " + step + ": ");
                    for (int k = 0; k < data.length; k++) {
                        System.out.print(data[k] + " ");
                    }
                    System.out.println("");
                    step++;
                }
            }
        }
        System.out.println("Pengurutan selesai.");
        System.out.print("Hasil Akhir: ");
        for (int i = 0; i < data.length; i++) {
            System.out.print(data[i] + " ");
        }
        System.out.println("");
    }
}*/

/*import java.util.Scanner;
public class SeqSearchLoop {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String rumah[] = {"Sarah", "Zerlina", "Nayla", "Zahlul", "Nana", "Nadilah", "Bita", "Farah", "Gratia", 
        "Faren", "Ima", "Lutfia", "Kirana", "Adinda", "Cutrin", "Indi", "Elvina", "Michelle", "Karin", "Alya"};
        boolean ketemu;
        int i, pilih;
        do {
            System.out.println("\nSequential Search Loop");
            System.out.print("Nama perempuan kelas D: ");
            for (i = 0; i < rumah.length; i++) {
                System.out.print(rumah[i] + " ");
            }
            System.out.println("");

            ketemu = false;

            System.out.print("Cari nama = ");
            String cari = s.next();

            for (i = 0; i < rumah.length; i++) {
                if (rumah[i].compareToIgnoreCase(cari) == 0) {
                    ketemu = true;
                    break;
                }
            }

            if (ketemu == true) {
                System.out.println("Ada di nomor " + (i + 1));
            } else {
                System.out.println("Tidak ditemukan");
            }
            System.out.println("Cari lagi?");
            System.out.println("[1.Ya] [2.Tidak]");
            System.out.print("Jawab = ");
            pilih = s.nextInt();
        } while (pilih == 1);
        System.out.println("Terima kasih.");
    }
}*/