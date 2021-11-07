package java_assignment_Nov4;

/*
 * Create an abstract class named Card with the following protected attributes / member variables. 
 String holderName; String cardNumber; String expiryDate; 
 
 Include appropriate getters and setters. 
 Include appropriate constructors. In the 3-argument constructor, the order 
 of the arguments is holderName, cardNumber, expiryDate. 
 
 Create a class named MembershipCard. The class MembershipCard is a derived class of Card. 
 Include the following private attributes / member variables. 
 Integer rating 
 Include appropriate getters and setters. 
 Include appropriate constructors. In the 4-argument constructor, the order of 
 the arguments is holderName, cardNumber, expiryDate, rating. 
 
 Create a class named PaybackCard. The class PaybackCard is a derived class of Card. 
 Include the following private attributes / member variables. 
 Integer pointsEarned; 
 Double totalAmount; 
 
 Include appropriate getters and setters. 
 Include appropriate constructors. 
 In the 5-argument constructor, the order of the arguments is 
 holderName, cardNumber, expiryDate, pointsEarned, totalAmount.
  
 Create another class called Main. 
 In the method, create instances of the above classes and test the above classes. 
 The card details are entered separated by a ‘|’. 
All text in bold corresponds to input and the rest corresponds to output. 

 */

import java.util.*;

abstract class Card {
	String holderName;
	String cardNumber;
	String expiryDate;

	Card(String holder, String num, String expiry) {
		holderName = holder;
		cardNumber = num;
		expiryDate = expiry;
	}

	protected String getHolderName() {
		return holderName;
	}

	protected void setHolderName(String holderName) {
		this.holderName = holderName;
	}

	protected String getCardNumber() {
		// System.out.println(cardNumber);
		return cardNumber;
	}

	protected void setCardNumber(String cardNumber) {
		this.cardNumber = cardNumber;
	}

	protected String getExpiryDate() {
		return expiryDate;
	}

	protected void setExpiryDate(String expiryDate) {
		this.expiryDate = expiryDate;
	}
}

class MembershipCard extends Card {
	private Integer rating;

	MembershipCard(String holder, String num, String expiry, Integer r) {
		super(holder, num, expiry);
		// cardNumber = num;
		// expiryDate = expiry;
		rating = r;
	}

	protected Integer getRating() {
		return rating;
	}

	protected void setRating(Integer rating) {
		this.rating = rating;
	}
}

class PaybackCard extends Card {
	private Integer pointsEarned;
	private Double totalAmount;

	PaybackCard(String holder, String num, String expiry, Integer points, Double total) {
		super(holder, num, expiry);
		pointsEarned = points;
		totalAmount = total;
	}

	protected Integer getPointsEarned() {
		return pointsEarned;
	}

	protected void setPointsEarned(Integer pointsEarned) {
		this.pointsEarned = pointsEarned;
	}

	protected Double getTotalAmount() {
		return totalAmount;
	}

	protected void setTotalAmount(Double totalAmount) {
		this.totalAmount = totalAmount;
	}

}

/*
 * Sample Input and Output 1:
 * 
 * Select the Card 1.Payback Card 2.Membership Card 1
 * 
 * Enter the Card Details: Anandhi|12345|14/01/2020
 * 
 * Enter points in card 1000
 * 
 * Enter Amount 50000
 * 
 * Anandhi's Payback Card Details: Card Number 12345 Points Earned 1000 Total
 * Amount 50000.0
 */
public class Java_assign_3 {
	private static int points;
	private static int rating;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		// StringBuilder details = new StringBuilder();
		String details;

		System.out.println("Select the Card\n1. Payback Card\n2. MembershipCard\n");
		Integer choice = Integer.parseInt(sc.next());

		System.out.println("Enter card details\n");
		details = sc.next();
		System.out.println(details);
		String[] details_split = details.split("\\|");
		System.out.println(Arrays.toString(details_split));

		switch (choice) {
		case 1: {
			System.out.println("Enter points in card \n");
			points = Integer.parseInt(sc.next());
			System.out.println("Enter amount in card \n");
			Double amt = Double.valueOf(sc.next());
			PaybackCard pb = new PaybackCard(details_split[0], details_split[1], details_split[2], points, amt);
			// System.out.println("Choice 1.");
			System.out.println(pb.getHolderName() + "'s PaybackCard Information");
			// System.out.println(vf.foodPrice());
			System.out.println("Card Number " + pb.getCardNumber());
			System.out.println("Points earned " + pb.getPointsEarned());
			System.out.println("Total Amount " + pb.getTotalAmount());
		}
			break;
		case 2: {
			System.out.println("Enter rating on card \n");
			rating = Integer.parseInt(sc.next());
			MembershipCard mem = new MembershipCard(details_split[0], details_split[1], details_split[2], rating);
			//System.out.println(mem.getCardNumber());
			//System.out.println("Choice 2.");
			System.out.println(mem.getHolderName() + "'s MembershipCard Information");
			// System.out.println(vf.foodPrice());
			System.out.println("Card Number " + mem.getCardNumber());
			System.out.println("Total Rating " + mem.getRating());
		}
			break;
		default: {
			System.out.println("Invalid input.");
		}
			return;

		}

	}

}
