import model.Inventory;
import model.Profile;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        Profile profile = new Profile();
//        Inventory inventory = new Inventory();

        Scanner input = new Scanner(System.in);

        // Input username
        // Type String
        System.out.print("Masukkan nama anda : ");
        String username = input.nextLine();

        if (username == null) {
            // if there are no username data exist
            System.out.println("You should input your name!");
        } else {
            // if username defined, calling method/void set inventory for add data
            setInventoryData(username);
        }
    }

    // Method for input inventory data
    private static void setInventoryData(String name) {
        String inName;
        int inTotal;
        double inBuy, inSell;

        // Showing user data
        System.out.println("\nStok Gudang Input Barang");
        System.out.println("########################");
        System.out.println("\nSelamat datang " +name+ "\n");

        Scanner inputInventory = new Scanner(System.in);

        // Input product name
        // Type String
        System.out.print("Masukkan nama barang yang mau ditambah : ");
        inName = inputInventory.nextLine();

        // Input stock/total
        // Type integer
        System.out.print("Masukkan jumlah barang yang mau ditambah : ");
        inTotal = inputInventory.nextInt();

        // Input buy price
        // Type double
        System.out.print("Masukkan harga beli untuk barang tersebut : ");
        inBuy = inputInventory.nextDouble();

        // Input sell price
        // Type double
        System.out.print("Masukkan harga jual untuk barang tersebut : ");
        inSell = inputInventory.nextDouble();

        if (inName == null && inTotal == 0 && inBuy == 0 && inSell == 0) {
            // If inventory data is empty
            System.out.println("\nYou should input your inventory data!");
        } else {
            // If inventory data is exists
            getResult(inName, inTotal, inBuy, inSell);
        }
    }

    // Method for showing inventory data
    private static void getResult(String name, int stock, double buy, double sell) {
        System.out.println("\nStok Gudang Rincian Barang");
        System.out.println("############################");

        // print inventory data from user inputs and formatting price number
        System.out.println("Nama Barang     : " +name);
        System.out.println("Jumlah Barang   : " +stock);
        System.out.println("Harga Beli      : " +String.format("%.2f", buy));
        System.out.println("Harga Beli      : " +String.format("%.2f", sell));
    }
}