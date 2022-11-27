package com.cb.yash.Exception.task6;

import java.util.*;

public class User {
    static Scanner scanner =  new Scanner(System.in);
    public static void main(String[] args) {
        Item[] items = new Item[Item.getITEM_NUMBER_CAN_BAUGHT()];
        ItemBought[] itemBoughts = new ItemBought[Item.getITEM_NUMBER_CAN_BAUGHT()];
        int count=0;
        int quantityCount =0;
        String pName;
        int pId=0;
        int localQuantity=0;

        Map<Integer, Integer> productsPrice =  new HashMap<>();
        productsPrice.put(101, 70);
        productsPrice.put(102, 40);
        productsPrice.put(103, 250);
        productsPrice.put(104, 50);
        productsPrice.put(105, 50);
        productsPrice.put(106, 120);

        Map<Integer, String> products =  new HashMap<>();
        products.put(101, "iceCream");
        products.put(102, "cold drink");
        products.put(103, "pizza");
        products.put(104, "burger");
        products.put(105, "coffee");
        products.put(106, "chicken");

        System.out.println("\t\t\t\tPlease select product from list what you want");
        System.out.println("\t"+products);
        while (true) {

            while (true) {
                try {
                    System.out.println("Enter Product Id From Above List:\t");
                    try {
                        pId = scanner.nextInt();
                        scanner.nextLine();
                        if (pId < 0)
                            throw new NegativeNumberException("INVALID INPUT!! please enter +ve number from list");
                        else {
                            Integer proId = pId;
                            Set<Integer> integers = products.keySet();
                            if (!integers.contains(proId)) {
                                throw new MyNumberFormatException("INVALID PID!!please enter +ve and valid item id");
                            } else {
                                System.out.println("you selected:\t" + products.get(pId));
                                System.out.println("please enter quantity");
                                localQuantity = scanner.nextInt();
                            }
                            break;
                        }
                    } catch (InputMismatchException | MyNumberFormatException | NegativeNumberException e) {
                        System.out.println(e.getMessage());
                        scanner.nextLine();
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                    scanner.nextLine();
                }
            }


            try {
                if (quantityCount + localQuantity <= Item.getITEM_NUMBER_CAN_BAUGHT()) {
                    for (int i = 0; i < localQuantity; i++) {
                        items[quantityCount++] = new Item(products.get(pId), pId);
                        itemBoughts[count++] = new ItemBought(pId, localQuantity, productsPrice.get(pId) * localQuantity);
                    }
                    System.out.println(quantityCount + "\tproduct added to cart");
                } else {
                    int remainQuantity = Item.getITEM_NUMBER_CAN_BAUGHT() - quantityCount;
                    throw new ItemPurchaseLimitExceed(quantityCount + "\talready in cart\t" + "only you can add now:\t" + remainQuantity + "\tproducts");
                }
            } catch (ItemPurchaseLimitExceed e) {
                System.out.println(e.getMessage());
                scanner.nextLine();
            }

            System.out.println("do you want to add any other product? press (Y/N)");
            scanner.nextLine();
            String choice = Character.toString(scanner.next().charAt(0));

            try {
                if (choice.equalsIgnoreCase("Y")) {
                    if (quantityCount < Item.getITEM_NUMBER_CAN_BAUGHT())
                        continue;
                    else
                        throw new ItemPurchaseLimitExceed("your cart is full. now you can not add other items ");
                }
                if (choice.equalsIgnoreCase("N"))
                    break;
            } catch (ItemPurchaseLimitExceed e) {
                System.out.println(e.getMessage());
                break;
            }
        }

        System.out.println("please collect your bill");
        int grandTotal=0;
        System.out.println("\t\tItem Id\t\t\t\tItem Quantity\t\t\t\tItem Price\t\t\t\tTotal Price");
        for(int i=0; i<count;i++){
            grandTotal = grandTotal+itemBoughts[i].getTotalPrice();
            System.out.println("\t\t"+itemBoughts[i].getItemId()+"\t\t\t\t\t\t\t"+itemBoughts[i].getItemQuantity()+"\t\t\t\t\t\t"+
                    (itemBoughts[i].getTotalPrice()/itemBoughts[i].getItemQuantity())+"\t\t\t\t\t\t"+itemBoughts[i].getTotalPrice());
        }
        System.out.println("=====================================================================================================================");
        System.out.println();
        System.out.println("Grand total is:\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t"+grandTotal+".00 Rs");
    }
}



