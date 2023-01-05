#include <iostream>
#include <string>

using namespace std;

int main(){
    int price = 0;
    string basket = "";
    bool loop = true;
    int a1, a2, a3, a4, a5, a6, a7;

    cout << "\nHello!\nWelcome to the Fast Food Station." <<endl;
    cout << "Here you can see our Menu below.\n" << endl;

    while(loop){
        cout<< "0. Exit Menu.\n1. Burgers.\n2. Hot dogs.\n3. French fries.\n4. Drinks.\n5. Sauces.\n6. Additivies.\n7. Clear Basket\n8. Check Basket\n" <<endl;
        cout << "Choose one: ";
        cin >> a1 ;

        switch(a1){
            case 0:
                loop = false;
                break;
            case 1:
                cout << "\n1. Barbecue burger - 900 kzt.\n2. Bufallo burger - 870 kzt.\n3. California burger - 1200 kzt.\n3. California burger - 1200 kzt.\n4. Cheese burger - 1000 kzt.\n";
                cout << "\nChoose a burger: ";
                cin >> a2;
                switch(a2){
                    case 1:
                        basket += " Barbecue burger - 900 kzt\n";
                        price += 900;
                        break;
                    case 2:
                        basket += " Bufallo burger - 870 kzt\n";
                        price += 870;
                        break;
                    case 3:
                        basket += " California burger - 1200 kzt\n";
                        price += 1200;
                        break;
                    case 4:
                        basket += " Cheese burger - 1000 kzt\n";
                        price += 1000;
                        break;
                }
            break;

            case 2:
                cout << "\n1. Papaya dog - 750 kzt.\n2. Chicago dog - 850 kzt.\n3. Ripper dog - 700 kzt.\n4. Texas dog - 1000 kzt.\n5. Slaw dog - 670 kzt.\n";
                cout << "\nChoose a hotdog: ";
                cin >> a3;
                switch(a3){
                    case 1:
                        basket += " Papaya dog - 750 kzt\n";
                        price += 750;
                        break;
                    case 2:
                        basket += " Chicago dog - 850 kzt\n";
                        price += 850;
                        break;
                    case 3:
                        basket += " Ripper dog - 700 kzt\n";
                        price += 700;
                        break;
                    case 4:
                        basket += " Texas dog - 1000 kzt\n";
                        price += 1000;
                        break;
                    case 5:
                        basket += " Slaw dog - 670 kzt\n";
                        price += 670;
                        break;
                }
            break;

            case 3:
                cout << "1. Chilli Cheese Fries - 300 kzt.\n2. Polenta Fries - 400 kzt.\n3. Potato Wedges - 500 kzt.\n";
                cout << "\nChoose a Frie: ";
                cin >> a4;
                switch (a4){
                    case 1:
                        basket += " Chilli Cheese Fries - 300 kzt\n";
                        price += 300;
                        break;
                    case 2:
                        basket += " Polenta Fries - 400 kzt\n";
                        price += 400;
                        break;
                    case 3:
                        basket += " Potato Wedges - 500 kzt\n";
                        price += 500;
                        break;
                }
            break;

            case 4:
                cout << "1. Pepsi 1.5 - 300 kzt.\n2. Coca Cola 1 - 240 kzt.\n3. Fuse tea 0.5 - 200 kzt.\n4. Sprite 0.5 - 250 kzt.\n";
                cout << "\nChoose a drink: ";
                cin >> a5;
                switch(a5){
                    case 1:
                        basket += " Pepsi 1.5 - 300 kzt\n";
                        price += 300;
                        break;
                    case 2:
                        basket += " Coca Cola 1 - 240 kzt\n";
                        price += 240;
                        break;
                    case 3:
                        basket += " Fuse tea 0.5 - 200 kzt\n";
                        price += 200;
                        break;
                    case 4:
                        basket += " Sprite 0.5 - 250 kzt\n";
                        price += 250;
                        break;
                }
            break;

            case 5:
                cout << "1. Ketchup - 100 kzt.\n2. Chilli sauce - 100 kzt.\n3. Pepper sauce - 150 kzt.\n";
                cout << "\nChoose sauce: ";
                cin >> a6;
                switch(a6){
                    case 1:
                        basket += " Ketchup - 100 kzt\n";
                        price += 100;
                        break;
                    case 2:
                        basket += " Chilli sauce - 100 kzt\n";
                        price += 100;
                        break;
                    case 3:
                        basket += " Pepper sauce - 150 kzt\n";
                        price += 150;
                        break;
                }
            break;

            case 6:
                cout << "1. Jalapeno - 100 kzt.\n2. Cheese - 150 kzt.\n";
                cout << "\nChoose additivies: ";
                cin >> a7;
                switch (a7){
                    case 1:
                        basket += " Jalapeno - 100 kzt\n";
                        price += 100;
                        break;
                    case 2:
                        basket += " Cheese - 150 kzt\n";
                        price += 150;
                }
            break;

            case 7:
                basket = "";
                price = 0;
                cout << "\n";
            break;
            
            case 8:
                if(price == 0){
                    cout << "\nBasket is empty.\nTotal price: " << price << " kzt.\n"<< endl;
                } else {
                    cout << "\nBasket:\n"<< basket << "\n" << "Total price: " <<price << " kzt.\n" <<endl;
                }
            break;

            default:
                cout << "\nError!\n" << endl;
        }

    }
    
    return 0;
}