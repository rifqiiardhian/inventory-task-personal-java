import model.Inventory;
import model.Profile;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        setInventoryData();
    }

    private static void setInventoryData() {
        Profile profile = new Profile();
        Inventory inventory = new Inventory();
        Scanner input = new Scanner(System.in);

        String inUsername, inName;
        int inTotal;
        double inBuy, inSell;

        System.out.print("Masukkan nama anda : ");
        inUsername = input.nextLine();

        if (inUsername == null) {
            System.out.println("You should input your name!");
        } else {
            System.out.println("\nStok Gudang Input Barang");
            System.out.println("########################");
            System.out.println("\nSelamat datang " +inUsername+ "\n");

            System.out.print("Masukkan nama barang yang mau ditambah : ");
            inName = input.nextLine();

            System.out.print("Masukkan jumlah barang yang mau ditambah : ");
            inTotal = input.nextInt();

            System.out.print("Masukkan harga beli untuk barang tersebut : ");
            inBuy = input.nextDouble();

            System.out.print("Masukkan harga jual untuk barang tersebut : ");
            inSell = input.nextDouble();

            inventory.setProductName(inName);
            inventory.setStock(inTotal);
            inventory.setBuy(inBuy);
            inventory.setSell(inSell);

            String name = inventory.getProductName();
            int stock = inventory.getStock();
            double buy = inventory.getBuy(), sell = inventory.getSell();

            if (name == null && stock == 0 && buy == 0 && sell == 0) {
                System.out.println("\nYou should input your inventory data!");
            } else {
                System.out.println("\nStok Gudang Rincian Barang");
                System.out.println("############################");

                System.out.println("Nama Barang     : " +name);
                System.out.println("Jumlah Barang   : " +stock);
                System.out.println("Harga Beli      : " +String.format("%.2f", buy));
                System.out.println("Harga Beli      : " +String.format("%.2f", sell));

            }
        }
    }
}