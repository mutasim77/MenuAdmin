import java.util.*;
public class MenuAdmin{
//Functions

    //1.For adding in category
    public static void addCategories(String line, ArrayList<String> categories, ArrayList<String[]> subcategories, ArrayList<Integer[]> prices){
        String[] array = line.split(",");

        for(int i = 0; i < array.length; i++){
            categories.add(array[i]);
            subcategories.add(null);
            prices.add(null);
        }
    }
    
    //2.For adding in subcategory in category;
    public static void addSubCategories(String line, int index_category, ArrayList<String[]> subcategories,ArrayList<Integer[]> prices){// index_category = 1
        String[] new_array = line.split(",");//sub3,sub4
        if (subcategories.get(index_category) == null) {
            subcategories.add(index_category, new_array); //subctg = {bbq, burger}  bbq - > abb
        }
        else{
            Integer[] prices_array = prices.get(index_category); // prices_array = {100,200}
            Integer[] prices_array_res = new Integer[prices_array.length + new_array.length]; // prices_array_res {100,200,null,null
            String[] old_array = subcategories.get(index_category); // old_array = {sub1,sub2}
            String[] res_array = new String[new_array.length + old_array.length];
            for(int i = 0; i < old_array.length; i++){
                res_array[i] = old_array[i]; // {sub1, sub2, null, null}
                prices_array_res[i] = prices_array[i];
            }
            for(int i = old_array.length; i < old_array.length + new_array.length; i++){
                res_array[i] = new_array[i - old_array.length]; // {sub1,sub2,sub3,sub4}
                prices_array_res[i] = null;
            }
            subcategories.set(index_category, res_array); ///before  subctg = {null , [sub1,sub2] ,} after sub_ctg = {null , [sub1,sub2,sub3,sub4] ,}
            prices.set(index_category, prices_array_res); //before  prices = {null , [100,200] ,} after prices = {null , [100,200,null,null] ,}
        }
    }

    //3.For printing our categories;
    public static void printCategories(ArrayList<String> categories){
        for(int i = 0; i < categories.size(); i++){
            System.out.println( i + 1 + "."  + categories.get(i));
        }
    }

    //4.For printing our Subcategories;
    public static void printSubCategories(int index_category, ArrayList<String[]> subcategories){
        String[] sub_ctg_array = subcategories.get(index_category);
        for(int i = 0; i < sub_ctg_array.length; i++){
            if(sub_ctg_array[i] == null) continue;
            System.out.println(i + 1 + "." + sub_ctg_array[i]);
        }
    }

    //5.For removing our subcategories from category;
    public static String[] removeSubCategories(int category_index, String[] remove_indexes, ArrayList<String[]> subcategories){
        int count_remove_items = 0;
        String[] sub_ctg_array = subcategories.get(category_index);
        // String[] sub_ctg_array = {"asd","qwe", "zxc"};

        for(int i = 0; i < remove_indexes.length; i++){
            if (sub_ctg_array.length > toInt(remove_indexes[i])) {
                count_remove_items++;
            }
        }

        String[] new_array_res = new String[sub_ctg_array.length - count_remove_items];//res_array .length = 1
        boolean shouldAdd = true;
        int count = 0;
        for(int i = 0; i < sub_ctg_array.length; i++){//{"asd","qwe", "zxc"};
            for(int j = 0; j < remove_indexes.length; j++) {//1,2,3,4
                if(toInt(remove_indexes[j]) - 1 == i){shouldAdd = false;} // 1, 2, 3 ,4  //   "asd" = 0 = i , 1 = "qwe"  ,2

            }
            if (shouldAdd) {
                new_array_res[count] = sub_ctg_array[i];
                count++;
            }
            shouldAdd = true;
        }
        return new_array_res;
    }
    //String to Int;
    public static int toInt(String s){
        return Integer.parseInt(s);
    }
    //
    public static void printSubCategoriesPrices(int index_category, ArrayList<String[]> subcategories, ArrayList<Integer[]> prices){
        String[] sub_ctg_array = subcategories.get(index_category);
        Integer[] price2 = prices.get(index_category);

        if (price2 == null) {
            for(int i = 0; i < sub_ctg_array.length; i++){
                System.out.println(i + 1 + "." + sub_ctg_array[i] + " - 0 kzt.");
            }
            return;
        }
        for(int i = 0; i < sub_ctg_array.length; i++){
            if(sub_ctg_array[i] == null) continue;

            if (price2[i] == null) {
                System.out.println(i + 1 + "." + sub_ctg_array[i]+" - 0 kzt.");
            }
            else{
                System.out.println(i + 1 + "." + sub_ctg_array[i]+" - "+price2[i]+" kzt.");
            }
        }
    }





    //static main
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);//for input;
        ArrayList<String> categories = new ArrayList<String>(); //for case 1 in case (2) and also for case 6 and 7
        ArrayList<String[]> subcategories = new ArrayList<String[]>();// for case 3 and for case 7
        ArrayList<Integer[]> prices = new ArrayList<Integer[]>();// for case 3 and for case 7

	    /*
			subctg 	{ [sub1,sub2]     [sub3,sub4]}
			price 	{ null        [300,400]}

	    */
        StringBuilder wel = new StringBuilder("\nWelcome to the Admin Panel of \"Salam Bro\" Fast Food Station! \nHere you can do the following ativities: \n");
        System.out.println(wel);//print StringBuilder(also we can with well.toString() );
        boolean a = true; //boolean for while
        String message =""; //it's for Welcome message for case (1) and case (5);


        while(a){//true(worked infinity);


            System.out.println("\n0. Exit.\n1. Change the Welcome Message.\n2. Change Menu.\n3. Change SubMenu.\n4. Change Prices.\n5. Display Welcome Message.\n6. Display Menu.\n7. Display SubMenu.\n8. Display Prices.\n9. Switch to Client Mode\n");
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
                    //String [] s2 =s.split(",");
                    //for(int i =0; i<s2.length; i++){
                    //System.out.println(s2[i]);}
                    break;

                case 2://for creating menu;
                    System.out.println("Here you can do the following activities: ");
                    System.out.println("0. Go Back.");
                    System.out.println("1. Add categories.");
                    System.out.println("2. Remove categories.");
                    System.out.print("\nYour choice: ");   //ctg = {burger}  // subctg = {}      // .add(index, elements)

                    int case2=in.nextInt();
                    boolean a1 =true;//for case 0

                    switch(case2){//int

                        case 0://exit
                            a1=false;//false=exit
                            break;

                        case 1://in this case we add kind of fastfoods in list
                            System.out.print("Write the name of categories separeted by comma(c1, c2, ...):\n>");
                            in.nextLine();
                            String cat = in.nextLine();
                            addCategories(cat, categories, subcategories, prices);
                            break;//case1

                        case 2://in this case we remove categories;
                            if(categories.size()<1)System.out.println("\nYou don't have a menu yet.");//elsi snacha najmyom syuda to budet pusto;

                            else{//and it's after adding
                                System.out.println("Tip: Write the indexes separeted by comma( i1, i1, ... )");//now we can remove them;
                                printCategories(categories);//print category
                                in.nextLine();
                                String rem_ind = in.nextLine();//write indexes
                                String [] rem_ind2= rem_ind.split(",");//split it in array

                                for(int i =0; i<rem_ind2.length; i++){
                                    if(categories.size()<=Integer.parseInt(rem_ind2[i])-1)continue;//when category less then index to ne break a prosto continuet;
                                    categories.remove(Integer.parseInt(rem_ind2[i])-1);//for example(catg.remove(0))
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
                            if(categories.size()<1){
                                System.out.println("\nYou don't have any category yet.");
                            }else{
                                System.out.println("\nChoose the category for which you want to add subcategories: ");
                                printCategories(categories);//print categories
                                int sub_cat= in.nextInt() - 1;  // 1-1=0( index 0 is 1);
                                System.out.println("Write the name of subcategories separeted by comma(c1, c2, ... ):\n>");
                                String add_sub = in.nextLine();
                                add_sub = in.nextLine(); //there we will add some subctg in categories;
                                addSubCategories(add_sub, sub_cat, subcategories, prices);
                            }

                            break;

                        case 2://we can remove them;
                            if(categories.size()<1){
                                System.out.println("\nYou don't have any category yet.");
                                break;
                            }
                            System.out.println("Choose the category from which you want to remove subcategories: ");
                            printCategories(categories);//print menu
                            //1.pizza(0)
                            //2.burger(1)
                            int subcategory_index = in.nextInt() - 1; // 2 - 1 = 1
                            if (subcategory_index >= categories.size()) {
                                System.out.println("\nThere is no subcategories in this category.");
                                break;
                            }
                            //1  sub_index = 0
                            printSubCategories(subcategory_index, subcategories);//
                            System.out.println("\nChoose subcategory you want to remove: ");
                            System.out.println("Tip: seperate the indexes with a comma(i1, 2, ...)\n>");

                            in.nextLine();
                            String rem_ind = in.nextLine();//1,2,3
                            String [] rem_ind2= rem_ind.split(",");//[1 2 3]
                            subcategories.set(subcategory_index, removeSubCategories(subcategory_index, rem_ind2, subcategories));//

                            break;

                    }
                    break;

                case 4://for changing price
                    if(categories.size()<1){
                        System.out.println("\nYou dont have Menu yet.");
                        break;
                    }

                    System.out.println("Choose a category for which you want to change prices of subcategories: ");

                    printCategories(categories);//1.Pizza 2.Burger

                    int index_category = in.nextInt()-1; // choosed  3

                    if (index_category >= categories.size()) {
                        System.out.println("No category chosen");
                        break;
                    }

                    if(subcategories.get(index_category) == null){
                        System.out.println("You don't have any subcategories yet");
                        break;
                    }

                    System.out.println("Choose subcategory for which you want to change prices: ");

                    // printSubCategories(index_category,subcategories);
                    printSubCategoriesPrices(index_category,subcategories,prices);
                    // 1.Sub1
                    // 2.sub2

                    System.out.print("\nTip: write the indexes separeted by comma(i1, i2, ...)\n>");

                    in.nextLine();

                    String price_sub2 = in.nextLine();
                    String[] price_sub3 = price_sub2.split(",");

                    //subctg_array = {sub1,sub2,sub3}
                    //	prices = { null, null}
                    //  1
                    // price_array = prices.get(0) = null
                    //price_sub3 = {1,2,3}


                    String[] subctg_array = subcategories.get(index_category); // {sub1, sub2}
                    Integer[] price_array =  prices.get(index_category); // {100, 200} / null
                    if (price_array == null) {
                        price_array = new Integer[subctg_array.length];
                        //null   ->    price_array =  {200, 150, 90}
                    }
                    for(int i =0; i<price_sub3.length; i++){ // 2,3,4

                        if (toInt(price_sub3[i]) - 1 < subctg_array.length) { //  {sub1,sub2} 0,1
                            System.out.println("\nEnter a new price for "+ subctg_array[toInt(price_sub3[i]) - 1]);

                            int new_price = in.nextInt();

                            price_array[toInt(price_sub3[i]) - 1] = new_price; // 200

                        }
                    }
                    prices.set(index_category, price_array);
                    break;

                case 5://for printing message
                    if(message==""){
                        System.out.println("\nYou dont have Welcome message yet.");
                    }else{
                        System.out.println("\n"+message);
                    }
                    break;

                case 6://for prinring our Menu

                    if(categories.size()<1){
                        System.out.println("\nYou don't have a menu yet.");
                    }else{
                        System.out.println();
                        printCategories(categories);
                    }
                    break;

                case 7://for printing our subcategoris from category
                    if(categories.size()<1){
                        System.out.println("\nYour don't have any menu yet.");
                    }else{
                        System.out.println("\nChoose the category for which you want to see it's subcategories: ");

                        printCategories(categories);//print our categories

                        System.out.print("\n>");
                        int sub_ctg_index = in.nextInt()-1;//2-1=1

                        if(subcategories.get(sub_ctg_index) == null){
                            System.out.println("\nYou don't have subcategory in this category.");
                            break;
                        }

                        printSubCategories(sub_ctg_index, subcategories);//print subcategory if we have it
                    }
                    break;

                case 8://for printing price
                    if(categories.size()<1){
                        System.out.println("\nYou don't have category yet.");

                        break;
                    }

                    System.out.println("\nChoose the category for which you want to see its subcategorie's prices: ");
                    printCategories(categories);//print Menu
                    int in_price = in.nextInt()-1;//2-1=1;
                    if(subcategories.size()<=in_price){
                        System.out.println("\nYou don't have subcategories in this category.");
                        break;
                    }
                    if(subcategories.get(in_price)==null){
                        System.out.println("\nYou don't have subcategories in this category.");
                        break;
                    }
                    if(prices.size()<=in_price) break;
                    printSubCategoriesPrices(in_price,subcategories,prices);


                    break;

                case 9://third project
                    MenuClient menu = new MenuClient(); // Object of MenuClient

                    MenuClient.displayMessage(message);//Message == null (Hello SalamBro) else(our message)
                    menu.displayCode(categories , subcategories , prices);//arrayLists;
                    break;
                
                default:
                    System.out.println("Error!");

            }
        }
    }
}

