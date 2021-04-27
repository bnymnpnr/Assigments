package Assigment_8;

public class q15 {

	public static void main(String[] args) {
		/*
		 * Question-15
		 * 
		 * We have a to do list app, every time a user adds a task - a few things needed
		 * to be checked.
		 * 
		 * It should not be empty. boolean parameter needs to be true taskId should be
		 * only 1 greater than currentID. for example if we have 7 tasks(currentId is 7)
		 * so the next task id is 8 , it can't be 10.
		 * 
		 * 
		 * for example:
		 * 
		 * validateTask(true,2,1) returns true
		 * 
		 * validateTask(true,3,1) returns false
		 * 
		 * validateTask(false,3,2) returns false
		 */

		int nextID = 2;
		int currentID = 1;
		boolean isNotEmpty = true;

		System.out.println(validateTask(isNotEmpty, currentID, nextID));
	}

	private static boolean validateTask(boolean isNotEmpty, int currentID, int nextID) {
		boolean flag = false;
		if ((nextID - currentID == 1) && isNotEmpty) {
			flag = true;
		}
		return flag;
	}

}
