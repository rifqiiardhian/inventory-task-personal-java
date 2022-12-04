import model.Inventory;
import model.Profile;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        Profile profile = new Profile();
//        Inventory inventory = new Inventory();

        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan nama anda : ");
        String username = input.nextLine();

        if (username == null) {
            System.out.println("You should input your name!");
        } else {
            setInventoryData(username);
        }
    }

    private static void setInventoryData(String name) {
        String inName;
        int inTotal;
        double inBuy, inSell;

        System.out.println("\nStok Gudang Input Barang");
        System.out.println("########################");
        System.out.println("\nSelamat datang " +name+ "\n");

        Scanner inputInventory = new Scanner(System.in);

        System.out.print("Masukkan nama barang yang mau ditambah : ");
        inName = inputInventory.nextLine();

        System.out.print("Masukkan jumlah barang yang mau ditambah : ");
        inTotal = inputInventory.nextInt();

        System.out.print("Masukkan harga beli untuk barang tersebut : ");
        inBuy = inputInventory.nextDouble();

        System.out.print("Masukkan harga jual untuk barang tersebut : ");
        inSell = inputInventory.nextDouble();

        if (inName == null && inTotal == 0 && inBuy == 0 && inSell == 0) {
            System.out.println("\nYou should input your inventory data!");
        } else {
            getResult(inName, inTotal, inBuy, inSell);
        }
    }

    private static void getResult(String name, int stock, double buy, double sell) {
        System.out.println("\nStok Gudang Rincian Barang");
        System.out.println("############################");

        System.out.println("Nama Barang     : " +name);
        System.out.println("Jumlah Barang   : " +stock);
        System.out.println("Harga Beli      : " +String.format("%.2f", buy));
        System.out.println("Harga Beli      : " +String.format("%.2f", sell));
    }
}