import sys

print("\n\t\t\tHello\n\tWelcome to the \"Mutasim\" Fast Food Station\n\tHere you can see our Menu below.")

#our basket and prices
basket = ""
price = 0

#start our program
while True:
    print("0.Exit Menu.\n1. Burgers.\n2. Hot dogs.\n3. French fries.\n4. Drinks.\n5. Sauces.\n6. Additivies.\n7. Clear Basket\n8. Check Basket\n")
    client = input("Choose one: ")

    if client == "0":
        sys.exit("\n\tGood bye!\n")

    elif client == "1":
        print("\n1. Barbecue burger - 900 kzt.\n2. Bufallo burger - 870 kzt.\n3. California burger - 1200 kzt.\n4. California burger - 1200 kzt.\n5. Cheese burger - 1000 kzt.\n")
        client = input("\nChoose a burger: ")
        if client == "1":
            basket += "Barbecue burger - 900 kzt\n"
            price += 900
        elif client == "2":
            basket += "Bufallo burger - 870 kzt\n"
            price += 870
        elif client == "3":
            basket += "California burger - 1200 kzt\n"
            price += 1200
        elif client == "4":
            basket += "Cheese burger - 1000 kzt\n"
            price += 1000
        else:
            print("\nNo Burger found!\n")

    elif client == "2":
        print("\n1. Papaya dog - 750 kzt.\n2. Chicago dog - 850 kzt.\n3. Ripper dog - 700 kzt.\n4. Texas dog - 1000 kzt.\n5. Slaw dog - 670 kzt.\n")
        client = input("\nChoose a hotdog: ")
        if client == "1":
            basket += "Papaya dog - 750 kzt\n"
            price += 750
        elif client == "2":
            basket += "Chicago dog - 850 kzt\n"
            price += 850
        elif client == "3":
            basket += "Ripper dog - 700 kzt\n"
            price += 700
        elif client == "4":
            basket += "Texas dog - 1000 kzt\n"
            price += 1000
        elif client == "5":
            basket += "Slaw dog - 670 kzt\n"
            price += 670
        else:
            print("\nNo hotdog found!\n")

    elif client == "3":
        print("\n1. Chilli Cheese Fries - 300 kzt.\n2. Polenta Fries - 400 kzt.\n3. Potato Wedges - 500 kzt.\n")
        client = input("\nChoose a Frie: ")
        if client == "1":
            basket += "Chilli Cheese Fries - 300 kzt\n"
            price += 300
        elif client == "2":
            basket += "Polenta Fries - 400 kzt\n"
            price += 400
        elif client == "3":
            basket += "Potato Wedges - 500 kzt\n"
            price += 500
        else:
            print("\nNo Frie found!\n")

    elif client == "4":
        print("\n1. Pepsi 1.5 - 300 kzt.\n2. Coca Cola 1 - 240 kzt.\n3. Fuse tea 0.5 - 200 kzt.\n4. Sprite 0.5 - 250 kzt.\n")
        client = input("\nChoose a drink: ")
        if client == "1":
            basket += "Pepsi 1.5 - 300 kzt\n"
            price += 300
        elif client == "2":
            basket += "Coca Cola 1 - 240 kzt\n"
            price += 240
        elif client == "3":
            basket += "Fuse tea 0.5 - 200 kzt\n"
            price += 200
        elif client == "4":
            basket += "Sprite 0.5 - 250 kzt\n"
            price += 250
        else:
            print("\nNo drink found!\n")

    elif client == "5":
        print("\n1. Ketchup - 100 kzt.\n2. Chilli sauce - 100 kzt.\n3. Pepper sauce - 150 kzt.\n")
        client = input("\nChoose sauce: ")
        if client == "1":
            basket += "Ketchup - 100 kzt\n"
            price += 100
        elif client == "2":
            basket += "Chilli sauce - 100 kzt\n"
            price += 100
        elif client == "3":
            basket += "Pepper sauce - 150 kzt\n"
            price += 150
        else:
            print("\nNo sauce found!\n")

    elif client == "6":
        print("\n1. Jalapeno - 100 kzt.\n2. Cheese - 150 kzt.\n")
        client = input("\nChoose additivies")
        if client == "1":
             basket += "Jalapeno - 100 kzt\n"
             price += 100
        elif client == "2":
             basket += "Cheese - 150 kzt\n"
             price += 150
        else:
            print("\nNo additivies found!\n")

    elif client == "7":
        if price == 0:
            print("\nYour baskter already is clear!\n")
        else:
            basket = ""
            price = 0
            print("\nBasket is clear!\n")

    elif client == "8":
        if price == 0:
            print("\nBasket is empty.\nTotal price: " + str(price) + " kzt.\n")
        else:
            print("\nBasket:\n" + basket + "\nTotal price: " + str(price) + " kzt.\n")

    else:
        print("\nNot found!\n")
