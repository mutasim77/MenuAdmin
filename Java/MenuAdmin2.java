import java.util.*;
public class MenuAdmin2{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);//for scan
        System.out.println("\nWelcome to the Admin Panel of \"Salam Bro\" Fast Food Station! \nHere you can do the following ativities: \n");

        String category ="";
        ArrayList<String> categories = new ArrayList<String>(); //for case 1 in case (2) and also for case 6 and 7
        ArrayList<String> categories2 = new ArrayList<String>(); //for case 1 in case (2) and also for case 6 and 7
        // String subcategory = "";
        ArrayList<String> subcategories = new ArrayList<String>(); // {   }
        ArrayList<Integer> subcategories2 = new ArrayList<Integer>();// for case 3 and for case
        //this ArrayLists for price and index of prices
        ArrayList<Double> price = new ArrayList<Double>();
        ArrayList<Integer> price2 = new ArrayList<Integer>();

        String message ="";//it's for Welcome message

        boolean a = true; //boolean for while

        while(a){//true(worked infinity);
            System.out.println("\n0. Exit.\n1. Change the Welcome Message.\n2. Change Menu.\n3. Change SubMenu.\n4. Change Prices.\n5. Display Welcome Message.\n6. Display Menu.\n7. Display SubMenu.\n8. Display Prices.\n9. Switch to Client Mode (soming soon)\n");
            System.out.print("Choose an activity: ");
            int choice = in.nextInt();//your choice;

            switch(choice){

                case 0://Exit
                    a=false;//false=Exit ( we can also use: ) //System.exit(0);
                    break;

                case 1://for Welcome message
                    System.out.print("\nPlease, type the message that clients will see when they enter the menu:\nTip: use underscore (_) as a spliter\n>");
                    String s = in.nextLine();
                    s=in.nextLine().replace("_","\n");//also we can use split there. you can see in below;
                    message=s;

                    break;

                case 2: //for creating menu;
                    System.out.println("Here you can do the following activities: ");
                    System.out.println("0. Go Back.");
                    System.out.println("1. Add categories.");
                    System.out.println("2. Remove categories.");
                    System.out.print("\nYour choice: ");

                    int case2=in.nextInt();
                    boolean a1 =true;//for case 0

                    switch(case2){//int

                        case 0://exit
                            a1=false;
                            break;

                        case 1://in this case we add kind of fastfoods in list
                            System.out.print("Write the name of cotegories separeted by comma(c1, c2, ...):\n>");
                            in.nextLine();
                            category = in.nextLine();
                            String [] category2 = category.split(","); //there we can also do it with .replace("_","\n");

                            for(int i=0; i<category2.length; i++){
                                categories.add(category2[i]);
                            }
                            break;//case1

                        case 2://
                            if(categories.size()<1)System.out.println("\nYou don't have a menu yet.");//elsi snacha najmyom syuda to budet pusto;

                            else{//and it's after adding
                                for(int i =0; i<categories.size(); i++){
                                    System.out.println(i+1+ "."+categories.get(i));
                                }
                                System.out.println("\nChoose the categories you want to remove:  ");
                                System.out.println("Tip: Write the indexes separeted by comma( i1, i1, ... )");//now we can remove them;
                                in.nextLine();
                                String rem_ind = in.nextLine();

                                String [] rem_ind2= rem_ind.split(",");

                                for(int i =0; i<rem_ind2.length; i++){
                                    if(categories.size()<=Integer.parseInt(rem_ind2[i])-1)continue;//when category less then index to ne break a prosto continuet;

                                    categories.remove(Integer.parseInt(rem_ind2[i])-1);
                                }

                            }
                            break;

                    }

                    break;

                case 3://for subcategory
                    System.out.println("\nHere you can do the following activities: ");
                    System.out.println("0. Go Back.");
                    System.out.println("1. Add subcategories.");
                    System.out.println("2. Remove subcategories.");
                    System.out.print("\nYour choice: ");

                    int case3 = in.nextInt();
                    boolean a2 = true;

                    switch(case3){
                        case 0:
                            a2=false;
                            break;

                        case 1:
                            if(categories.size()<1) System.out.println("\nYou don't have any category yet.");

                            else{
                                System.out.println("\nChoose a category for which you want to add subcategories: ");
                                for(int i =0; i<categories.size(); i++){
                                    System.out.println(i+1+"."+categories.get(i));
                                }
                                int add_sub = in.nextInt();

                                System.out.println("\nWrite the names of the subcategories seperated by comma (c1, c2, ...).");
                                in.nextLine();
                                String indexes = in.nextLine(); // 123,qwe,sad
                                String [] arr_indexes = indexes.split(","); // [123,qwe,sad]  [asd,axc]
                                for(int j=0; j<arr_indexes.length; j++){
                                    subcategories.add(arr_indexes[j]); //subctg = {asd, axc}
                                    subcategories2.add(add_sub); //subctg2{2,2}
                                    price.add(0.0);
                                }
                            }
                            break;

                        case 2:
                            if(categories.size()<1) System.out.println("\nYou don't have any category yet.");

                            else{
                                System.out.println("\nChoose a category for which you want to remove it's subcategories: ");

                                for(int i=0; i<categories.size(); i++){
                                    System.out.println(i+1+"."+categories.get(i));
                                }
                                int r = in.nextInt();
                                boolean t = false;
                                for(int i =0; i<subcategories2.size(); i++){
                                    if(subcategories2.get(i)==r){
                                        t = true;
                                    }
                                }
                                if(true){
                                    System.out.println("\nChoose subcategory you want to remove: ");
                                    System.out.println("Make sure to seperate the indexes with a comma. >");
                                    for(int i =0; i<subcategories.size(); i++){
                                        if(subcategories2.get(i)==r){
                                            System.out.println(i+1+"."+subcategories.get(i));

                                        }
                                    }
                                    if(subcategories.size() !=0){
                                        in.nextLine();
                                        String w = in.nextLine();
                                        System.out.println();
                                        String [] rem_in = w.split(","); // {3,4}  // {sc1,sc2,sc3,sc1,sc2,sc3,sc1,sc2,sc3}   {1,1,1,2,2,2,3,3,3}
                                        for(int i =0; i<rem_in.length; i++){
                                            if(subcategories.size()<=Integer.parseInt(rem_in[i])-1)continue;//when category less then index to ne break a prosto continuet;

                                            subcategories.remove(Integer.parseInt(rem_in[i])-1);
                                            subcategories2.remove(Integer.parseInt(rem_in[i])-1);
                                        }
                                    }
                                }

                                else{
                                    System.out.println("\nYou have no subcategories in this category!");
                                }
                            }
                            break;
                    }


                    break;

                case 4:
                    if(categories.size()>0){
                        System.out.println("\nChoose a category for which you want to see subcategories:");
                        for(int i =0; i <categories.size(); i++){
                            System.out.println(i+1+"."+categories.get(i));
                        }
                        int pr = in.nextInt();
                        boolean pr2 = false;
                        //
                        if(subcategories2.size()<pr){
                            System.out.println("There is no category!");
                            break;
                        }
                        for(int i =0; i<subcategories.size(); i++){
                            if(subcategories2.get(i)==pr){
                                pr2 = true;
                            }
                        }
                        if(true){
                            for(int i =0; i<subcategories.size(); i++){
                                if(subcategories2.get(i) ==pr ){
                                    if(price2.size()>0){
                                        for(int j =0; j<price2.size(); j++){
                                            if(price.get(j)==i){
                                                System.out.println(i+1+"."+subcategories.get(i)+"- "+price.get(j)+" kzt.");
                                            }
                                        }
                                    }
                                }
                            }
                            System.out.println("\nChoose the prices you want to change by their index.\nTip: seperate indexes by comma(i1, i2, ...)");
                            in.nextLine();
                            String pp = in.nextLine();
                            //
                            if (Integer.parseInt(pp) > subcategories2.size()) {
                                System.out.println("Wrong index");
                                break;
                            }
                            String [] pp2 = pp.split("," );
                            for(int i=0; i<pp2.length; i++){
                                System.out.println("Type the new price for "+subcategories.get(Integer.parseInt(pp2[i])-1));
                                double mm = in.nextDouble();
                                price.set(Integer.parseInt(pp2[i])-1, mm);
                                price2.add(Integer.parseInt(pp2[i])-1);
                            }
                        }
                        else{
                            System.out.println("\nThere're no subcategories for this category yet.");

                        }
                    }


                    else {System.out.println("\nYou don't have category yet.");}

                    break;

                case 5:
                    if(message=="")
                        System.out.println("\nYou dont have Welcome message yet.");
                    else
                        System.out.println("\n"+message);

                    break;


                case 6:

                    if(categories.size()<1){
                        System.out.println("\nYou don't have a menu yet.");
                    }
                    else{
                        System.out.println();
                        for(int i =0; i<categories.size(); i++){
                            System.out.println(i+2-1 + "." +categories.get(i));
                        }

                    }
                    break;

                case 7:
                    System.out.println("\nChoose a category for which you want too see subcategories: ");
                    for(int i =0; i<categories.size(); i++){
                        System.out.println(i+1+"."+categories.get(i));
                    }

                    int display = in.nextInt();
                    boolean d = false;
                    for(int i =0; i<subcategories2.size(); i++){
                        if(subcategories2.get(i) == display){
                            d = true;
                        }
                    }
                    if(true){
                        for(int i =0; i<subcategories.size(); i++){
                            if(subcategories2.get(i)==display){
                                System.out.println(i+1+"."+subcategories.get(i));
                            }
                        }
                    }
                    else
                    {System.out.println("\nYou don't have any categories yet.");}

                    break;

                case 8:

                    if(categories.size()<1){
                        System.out.println("\nYou don't have Menu yet.");
                    }
                    else{
                        System.out.println("\nChoose the category for which you want to see its subcategorie's prices: ");
                        for(int i=0; i<categories.size(); i++){
                            System.out.println(i+1+"."+categories.get(i));
                        }
                        int p = in.nextInt();
                        boolean b= false;
                        if(true){
                            for(int i =0; i<subcategories.size(); i++){
                                if(subcategories2.get(i) ==p ){
                                    if(price2.size()>0){
                                        for(int j =0; j<price2.size(); j++){
                                            if(price2.get(j)==i){
                                                System.out.println(i+1+"."+subcategories.get(i)+" - "+price.get(j)+" kzt.");
                                            }
                                        }
                                    }
                                }
                            }

                        }
                    }

                    break;

                case 9:
                    System.out.println("");
                    break;

                default:
                    System.out.println("");

            }
        }
    }
}

