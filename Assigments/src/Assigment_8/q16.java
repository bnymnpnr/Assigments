package Assigment_8;

public class q16 {

	public static void main(String[] args) {
		/*
		 * Question-16
		 * 
		 * To book a room first it needs to be available for rent and make sure its
		 * available at the date selected:
		 * 
		 * the room is already booked between 7/1/2018 - 7/8/2018 and not available
		 * accepting bookings only for year of 2018
		 * 
		 * example:
		 * 
		 * simpleRoomBook(false,2,1,2018) return false
		 * 
		 * simpleRoomBook(true,2,1,2018) return true
		 * 
		 * simpleRoomBook(true,7,2,2018) return false
		 */

		boolean isRoomAvailable = true;
		int month = 7;
		int day = 2;
		int year = 2018;

		System.out.println(simpleRoomBook(isRoomAvailable, month, day, year));

	}

	private static boolean simpleRoomBook(boolean isRoomAvailable, int month, int day, int year) {
		boolean isDateAvailable = true;

		if (!isRoomAvailable) {
			isDateAvailable = false;
		} else if (year == 2018) {
			if (month == 7) {
				if (day >= 1 && day <= 8) {
					isDateAvailable = false;
				}
			}
		}

		return isDateAvailable;

	}

}
