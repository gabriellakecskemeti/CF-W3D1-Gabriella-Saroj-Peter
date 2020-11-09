package Gabriella.A4;

import java.util.ArrayList;

public class WareHouse {

    static private String name;
    static private ArrayList<String> inventoryList = new ArrayList<>();

    public WareHouse(String name, ArrayList<String> inventoryList) {
        this.name = name;
        this.inventoryList = inventoryList;
    }

    static public void fillInventoryList(String name){
                inventoryList.add(name);
    }

    public static ArrayList<String> getInventoryList() {

        return new ArrayList<String>(inventoryList);
    }

    @Override
    public String toString() {
        return "WareHouse{" +
                "inventoryList=" + inventoryList +
                '}';
    }

    public static void main(String[] args) {
        fillInventoryList("chair");
        fillInventoryList("laptop");
        fillInventoryList("super chair");
        fillInventoryList("desk");
        fillInventoryList("table");

        System.out.println(getInventoryList());



    }


}
