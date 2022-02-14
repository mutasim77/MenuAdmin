import java.util.Scanner;
public class MenuNasim{
	public static void main(String[] args) {
	 
	 System.out.println("");
	 System.out.println("Hello!\nWelcome to the menu of \"Salam Bro\" Fast Food Station.");
	 System.out.println("Here you can see our menu below.");
	 System.out.println("");
	 

	 int price=0;
	 
	 String basket="";
     boolean a=true;
	 
	 while (a){
	 System.out.println("0. Exit Menu.");
	 System.out.println("1. Burgers.");
	 System.out.println("2. Hot dogs.");
	 System.out.println("3. French fries.");
	 System.out.println("4. Drinks.");
	 System.out.println("5. Sauces.");
	 System.out.println("6. Additivies.");
	 System.out.println("7. Clear Basket");
	 System.out.println("8. Check Basket");
	 System.out.println("");
	 System.out.print("Choose one: ");
	 
	 Scanner in=new Scanner(System.in);

	 int vibor=in.nextInt(); 

	 switch(vibor){
            case 0:
            //false=0
            //a=false
                System.exit(0);
            break;
            
            case 1:
                System.out.println("1. Barbecue burger - 900 kzt.");
                System.out.println("2. Bufallo burger - 870 kzt.");
                System.out.println("3. California burger - 1200 kzt.");
                System.out.println("4. Cheese burger - 1000 kzt.");
                System.out.println("");
                System.out.print("Choose a burger: ");
                int sort1=in.nextInt();
                switch(sort1){
                	
                	case 1:
                	price+=900;
                	basket+=(" Barbecue burger - 900 kzt.\n");
                	break;
                	
                	case 2:
                	price+=870;
                	basket+=(" Bufallo burger - 870 kzt.\n");
                	break;
                	
                	case 3:
                	price+=1200;
                	basket+=(" California burger - 1200 kzt.\n");
                	break;
                	
                	case 4:
                	price+=1000;
                	basket+=(" Cheese burger - 1000 kzt.\n");
                	break;
                }                             
            break;
                
                case 2:
                System.out.println("1. Papaya dog - 750 kzt.");             
                System.out.println("2. Chicago dog - 850 kzt.");
                System.out.println("3. Ripper dog - 700 kzt.");
                System.out.println("4. Texas dog - 1000 kzt.");
                System.out.println("5. Slaw dog - 670 kzt.");
                System.out.println("");
                System.out.print("Choose a hotDog: ");  
                int sort2=in.nextInt();            
                switch(sort2){
                    case 1:
                	price+=750;
                	basket+=" Papaya dog - 750 kzt.\n";
                	break;

                	case 2:
                	price+=850;
                	basket+=" Chicago dog - 850 kzt.\n";
                	break;

                	case 3:
                	price+=700;
                	basket+=" Ripper dog - 700 kzt.\n";
                	break;

                	case 4:
                	price+=1000;
                	basket+=" Texas dog - 1000 kzt.\n";
                	break;

                	case 5:
                	price+=670;
                	basket+=" Slaw dog - 670 kzt.\n";
                	break;

                  }
            break;
                case 3:
                System.out.println("1. Chilli Cheese Fries - 300 kzt.");
                System.out.println("2. Polenta Fries - 400 kzt.");
                System.out.println("3. Potato Wedges - 500 kzt.");
                System.out.println("");
                System.out.print("Choose a Frie: ");
                int sort3=in.nextInt();
                switch(sort3){
                	case 1:
                	price+=300;
                	basket+=" Chilli Cheese Fries - 300 kzt.\n";
                	break;

                	case 2:
                	price+=400;
                	basket+=" Polenta Fries - 400 kzt.\n";
                	break;

                	case 3:
                	price+=500;
                	basket+=" Potato Wedges - 500 kzt.\n";
                	break;

                }  
            break;
                case 4:
                System.out.println("1. Pepsi 1.5 - 300 kzt");
                System.out.println("2. Coca Cola 1 - 240 kzt.");
                System.out.println("3. Fuse tea 0.5 - 200 kzt.");
                System.out.println("4. Sprite 0.5 - 250 kzt.");
                System.out.println("");
                System.out.print("Choose a drink: ");
                int sort4=in.nextInt();
                switch(sort4){
                	case 1:
                	price+=300;
                	basket+=" Pepsi 1.5 - 300 kzt.\n";
                	break;

                	case 2:
                	price+=240;
                	basket+=" Coca Cola 1 - 240 kzt.\n";
                	break;

                	case 3:
                	price+=200;
                	basket+=" Fuse tea 0.5 - 200 kzt.\n";
                	break;

                	case 4:
                	price+=250;
                	basket+=" Sprite 0.5 - 250 kzt.\n";
                	break;

                }  
            break;
                case 5:
                System.out.println("1. Ketchup - 100 kzt.");
                System.out.println("2. Chilli sauce - 100 kzt.");
                System.out.println("3. Pepper sauce - 150 kzt.");
                System.out.println("");
                System.out.print("Choose sauce: ");
                int sort5=in.nextInt();
                switch(sort5){
                	case 1:
                	price+=100;
                	basket+=" Ketchup - 100 kzt.\n";
                	break;

                	case 2:
                	price+=100;
                	basket+=" Chilli sauce - 100 kzt.\n";
                	break;

                	case 3:
                	price+=150;
                	basket+=" Pepper sauce - 150 kzt.\n";
                	break;

                }
            break;
                case 6:
                System.out.println("1. Jalapeno - 100 kzt.");
                System.out.println("2. Cheese - 150 kzt.");
                System.out.println("");
                System.out.print("Choose additivies: ");
                int sort6=in.nextInt();
                switch(sort6){
                	case 1:
                	price+=100;
                	basket+=" Jalapeno - 100 kzt.\n";
                	break;

                	case 2:
                	price+=150;
                	basket+=" Cheese - 150 kzt.\n";
                	break;
                }  
            break;
                case 7: //clear basket
                price=0;
                basket = "";
                System.out.println("");

            break;
           
                case 8:
                if(price==0){
                	System.out.println("\nBasket is empty.\nTotal price: "+price+" kzt.");
                	System.out.println("");
                }
                else{
                System.out.println("\nBasket:\n"+basket);
                System.out.print("");
                System.out.println("Total price: "+price+" kzt.");
                System.out.println("");
                }

                break;
                default:


       }
   }
}
}




           
            
       

            



           



