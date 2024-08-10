package Room_Booking_System;

import java.util.InputMismatchException;
import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.Set;

public class User_Booking extends Room_Management {
	int Total_members_price;
	int payment;
	int pay;
	int total_amount;
	int food_menu_in;
	int menu;
	int quantity;
	int total_item = 0;
	int add = 0;
	int food_pay;
	static int food_paid_amount;

	LinkedHashMap<String, Integer> food_menu = new LinkedHashMap<>();

	public void hotel_Info() {
		System.out.println("enter 1 for room 1: AC,swimmingpool,Balcony with sea view "
				+ "\nenter 2 for room 2: non-AC,swimmingpool" + "\nenter 3 for room 3: AC,swimmingpool ");

		while (rooms != 1 && rooms != 2 && rooms != 3) {
			rooms = input.nextInt();
			if (rooms != 1 && rooms != 2 && rooms != 3) {
				System.err.println("Please enter valid number");

			}

//			else {
//				
//			System.out.println("hi");
//				
//			break;
//			}
			switch (rooms) {
			case 1: {
				int Total_members_price = per_member_price * member;
				total_amount = price + ac + swimmingpool + Total_members_price + Balcony_view;
				System.out.println("Room price          :" + price);
				System.out.println("Ac price            :" + ac);
				System.out.println("Swimming price      :" + swimmingpool);
				System.out.println("Per member price    :" + per_member_price);
				System.out.println("Total members price :" + Total_members_price);
				System.out.println("Bolcony             :" + Balcony_view);
				System.out.println("Total price         :" + total_amount);
				break;
			}
			case 2: {
				int Total_members_price = per_member_price * member;
				total_amount = price + swimmingpool + Total_members_price;
				System.out.println("Room price          :" + price);
				System.out.println("Swimming price      :" + swimmingpool);
				System.out.println("Per member price    :" + per_member_price);
				System.out.println("Total members price :" + Total_members_price);
				System.out.println("Total price         :" + total_amount);
				break;
			}
			case 3: {
				int Total_members_price = per_member_price * member;
				total_amount = price + ac + swimmingpool + Total_members_price;
				System.out.println("Room price          :" + price);
				System.out.println("Ac price            :" + ac);
				System.out.println("Swimming price      :" + swimmingpool);
				System.out.println("Per member price    :" + per_member_price);
				System.out.println("Total members price :" + Total_members_price);
				System.out.println("Total price         :" + total_amount);
				break;
			}
			}

		}

	}

	public void payment() {
		System.out.println("\nEnter 4 for booking room");
		System.out.println("Enter 5 for Exit");
		while (pay != 4 && pay != 5) {
			pay = input.nextInt();
			if (pay != 4 && pay != 5) {
				System.err.println("Please enter valid number");
			} else if (pay == 5) {
				System.out.println("Thank You Welcome " + name);
				break;
			}
		}
		if (pay == 4) {
			while (total_amount != payment) {
				System.out.println("Pay the amount");
				payment = input.nextInt();
				if (total_amount == payment) {
					System.out.println("Paid successfully :)");
					int roomPassword = getRoomPassword();
					System.out.println("Take Your Room Password " + roomPassword);
					System.out.println("Thank You " + name);
					System.out.println("\n");
				}

				else if (total_amount > payment || total_amount < payment) {
					System.err.println("Please pay total amount " + name + " its fixed :(");
				}
			}
			System.out.println("Enter 1 for Order foods");
			System.out.println("Enter 2 for Exit");
			food_menu_in = input.nextInt();
			if (food_menu_in == 1) {

				System.out.println("----------Menu Card----------");
				food_menu.put("1.Idly", 70);
				food_menu.put("2.Dosa", 90);
				food_menu.put("3.Vadai", 30);
				food_menu.put("4.Poori", 80);
				food_menu.put("5.Ombellet", 50);

				food_menu.put("6.Meals", 150);
				food_menu.put("7.Non-veg Meals", 220);
				food_menu.put("8.Chicken Rice", 170);
				food_menu.put("9.Chicken Noodels", 180);
				food_menu.put("10.Pizza", 260);

				food_menu.put("11.Coffee", 40);
				food_menu.put("12.Tea", 30);
				food_menu.put("13.Cold Coffee", 80);
				food_menu.put("14.French Fries", 120);
				food_menu.put("15.Cool Drinks", 50);

				Set<Entry<String, Integer>> entrySet = food_menu.entrySet();
				for (Entry<String, Integer> menu : entrySet) {
					System.out.println(menu.getKey() + "-----" + menu.getValue());
				}

				while (true) {
					System.out.println("Enter The Number To Order Items");
					System.out.println("Click 0 For Exit ");
					menu = input.nextInt();

					if (menu == 0) {
						break;
					}

					switch (menu) {
					case 1: {
						System.out.println("You have selected idly");
						System.out.println("Enter quantity");
						quantity = input.nextInt();
						total_item += quantity * 70;
						break;
					}
					case 2: {
						System.out.println("You have selected Dosa");
						System.out.println("Enter quantity");
						quantity = input.nextInt();
						total_item += quantity * 90;
						break;
					}
					case 3: {
						System.out.println("You have selected Vadai");
						System.out.println("Enter quantity");
						quantity = input.nextInt();
						total_item += quantity * 30;
						break;
					}
					case 4: {
						System.out.println("You have selected Poori");
						System.out.println("Enter quantity");
						quantity = input.nextInt();
						total_item += quantity * 80;
						break;
					}
					case 5: {
						System.out.println("You have selected Ombellet");
						System.out.println("Enter quantity");
						quantity = input.nextInt();
						total_item += quantity * 50;
						break;
					}
					case 6: {
						System.out.println("You have selected Meals");
						System.out.println("Enter quantity");
						quantity = input.nextInt();
						total_item += quantity * 150;
						break;
					}
					case 7: {
						System.out.println("You have selected Non-veg Meals");
						System.out.println("Enter quantity");
						quantity = input.nextInt();
						total_item += quantity * 220;
						break;
					}
					case 8: {
						System.out.println("You have selected Chicken Rice");
						System.out.println("Enter quantity");
						quantity = input.nextInt();
						total_item += quantity * 170;
						break;
					}
					case 9: {
						System.out.println("You have selected Chicken Noodels");
						System.out.println("Enter quantity");
						quantity = input.nextInt();
						total_item += quantity * 180;
						break;
					}
					case 10: {
						System.out.println("You have selected Pizza");
						System.out.println("Enter quantity");
						quantity = input.nextInt();
						total_item += quantity * 220;
						break;
					}
					case 11: {
						System.out.println("You have selected Coffee");
						System.out.println("Enter quantity");
						quantity = input.nextInt();
						total_item += quantity * 40;
						break;
					}
					case 12: {
						System.out.println("You have selected Tea");
						System.out.println("Enter quantity");
						quantity = input.nextInt();
						total_item += quantity * 30;
						break;
					}
					case 13: {
						System.out.println("You have selected Cold Coffee");
						System.out.println("Enter quantity");
						quantity = input.nextInt();
						total_item += quantity * 80;
						break;
					}
					case 14: {
						System.out.println("You have selected French Fries");
						System.out.println("Enter quantity");
						quantity = input.nextInt();
						total_item += quantity * 120;
						break;
					}
					case 15: {
						System.out.println("You have selected Cool Drinks");
						System.out.println("Enter quantity");
						quantity = input.nextInt();
						total_item += quantity * 50;
						break;
					}
					}
				}
			}
			if (food_menu_in != 2) {
				System.out.println("total item price :" + total_item);
//					System.out.println("-------Thank You-------");

				while (total_item != food_pay) {
					System.out.println("please pay the amount");
					food_pay = input.nextInt();
					if (food_pay < total_item || food_pay > total_item) {
						System.err.println("pay the exact amount");
					}
				}
				if (total_item == food_pay) {
					food_paid_amount = food_pay;
					System.out.println("successfully paid the amount " + total_item);
					System.out.println("Take your order " + name);

				}

			}

			else if (food_menu_in == 2) {
				System.out.println("OK " + name.toUpperCase() + " Thank You :)");
			}
		}

	}

	public static void main(String[] args) {
		User_Booking output = new User_Booking();
		
		while (true) {
			try 
			{
				output.user_Detials();
				output.hotel_Info();
				output.payment();
				break;
			} 
			catch (InputMismatchException e) 
			{
				System.err.println("Enter Proper Information and Valid Number ");
			}

		}

	}
}
