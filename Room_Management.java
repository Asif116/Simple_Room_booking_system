package Room_Booking_System;

import java.util.Scanner;

public class Room_Management {
	int rooms;
	final static int price;
	final static int ac;
	final static int Balcony_view;
	final static int swimmingpool;
	final static int per_member_price;
	private final static int room_Password;

	String name;
	long number;
	int member;
	static final String hotel_name;
	static {

		price = 2500;
		ac = 500;
		room_Password = 9080;
		hotel_name = "SS HOTEL";
		swimmingpool = 900;
		Balcony_view = 600;
		per_member_price = 200;

	}

	public Room_Management() {
		System.out.println("Welcome to SS Five Star Hotel");
	}

	Scanner input = new Scanner(System.in);

	public void user_Detials() {

		System.out.println("Enter Your Name");
		name = input.nextLine();
		System.out.println("Enter Your Number");
		number = input.nextLong();
		System.out.println("Enter How Many Members");
		member = input.nextInt();
		System.out.println("---------Welcome SS Hotel " + name.toUpperCase() + "---------\n");

	}

	public static int getRoomPassword() {
		return room_Password;
	}

}
