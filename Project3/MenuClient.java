import java.util.*;
 class MenuClient {

     static void displayMessage(String s) { //for changing  Welcome Message;
       if (s == "") System.out.println("\nHello!\nWelcome to the menu of \\\"Salam Bro\\\" Fast Food Station.\nHere you can see our menu below.\n");
         else System.out.println("\n" + s+"\n"); // our new Message;
     }

      void displayCode(ArrayList<String> menu, ArrayList<String[]> submenu, ArrayList<Integer[]> price) { //for Display our menu && submenu && prices;
         ArrayList<String> basket = new ArrayList<>();
         int totalPrice = 0;
         Scanner in = new Scanner(System.in);

         while (true) {
             System.out.println("0. Exit Menu.");// 0.Case
             // if(menu.size() == 0 ) System.out.println("\nYou don't have menu yet.\n");
             for (int i = 0; i < menu.size(); i++) {
                 System.out.println(i + 1 + ". " + menu.get(i)); //Menu Cases;
             }

             System.out.println(menu.size() + 1 + "." + " Clear Basket"); // menu.size = 2 ; 3.Clear Basket // 7.Case
             System.out.println(menu.size() + 2 + "." + " Check Basket"); // 8.Case
             System.out.print("\nChoose one: ");//input

             int index = in.nextInt();//3
             if (index == 0) break;// 0. Case = Exit

             else if (index < menu.size()+1 ){ // menu.size == 1 && > 1
                 MenuAdmin submenuAndPrice = new MenuAdmin();
                 if (submenu.get(index - 1) == null){ // if we don't add submenu it will be empty
                     System.out.println("\nYou don't have any subcategories yet.\n");
                 }
                 else{
                     submenuAndPrice.printSubCategoriesPrices(index - 1, submenu, price); // 1 {bbq} {200}
                     System.out.print("\nChoose a " + menu.get(index - 1) + " which u want:");

                     int in_choice = in.nextInt();//1
                     String[] sub_ctg = submenu.get(index-1);//2
                     Integer[] price2 = price.get(index-1);//

                     if( price.size() == 0  ){ //if price == null , we set price to zero =0 ;
                         basket.add(sub_ctg[in_choice-1] + " - " + 0 + " kzt.");
                     }

                     else{
                         if(price2 != null ) { // if not null = we add to basket and to price;
                             basket.add(sub_ctg[in_choice - 1] + " - " + price2[in_choice - 1] + " kzt.");
                             totalPrice += price2[in_choice - 1];
                         }
                         else{ //else
                             basket.add(sub_ctg[in_choice - 1] + " - " +0+ " kzt."); // if == null ; we just add 0-kzt.
                         }
                     } //else
                 } //else (33)


             } // else if (line 28 )
             else if(index == menu.size()+1){ //Case 7 (Clear basket)  if index == menu +1 = clearBasket
                 basket.clear(); // basket will be empty
                 totalPrice = 0; // price will be 0
             } //else if

             else if(index == menu.size()+2){  // case 8 (Basket: ) if index == menu+2 = checkBasket
                 if(basket.size() == 0) System.out.println("\nBasket is empty.\n"); // if menu == 0  = basketEmpty
                  else{
                     System.out.println("\nBasket:");
                     for (int i = 0; i < basket.size(); i++) {
                           System.out.println(basket.get(i)); //Elements of Basket
                     } //for Loop
                     System.out.println("\nTotal price: "+totalPrice+"\n");// totalPrice = <  > ;
                 } //else

             } // else if
         } // whhile
     } // method displayCode
 } // class MenuClient


/*
      ██████  ██████  ███    ███ ██ ███    ██  ██████      ███████  ██████   ██████  ███    ██ 
     ██      ██    ██ ████  ████ ██ ████   ██ ██           ██      ██    ██ ██    ██ ████   ██ 
     ██      ██    ██ ██ ████ ██ ██ ██ ██  ██ ██   ███     ███████ ██    ██ ██    ██ ██ ██  ██ 
     ██      ██    ██ ██  ██  ██ ██ ██  ██ ██ ██    ██          ██ ██    ██ ██    ██ ██  ██ ██ 
      ██████  ██████  ██      ██ ██ ██   ████  ██████      ███████  ██████   ██████  ██   ████
*/
