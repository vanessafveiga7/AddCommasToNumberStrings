package week3;

import acm.program.ConsoleProgram;

public class DeleteCharactersFromString extends ConsoleProgram {
	/**
	 * 
	 */
	
	private static final long serialVersionUID = 1L;

	public void run() {
		while (true) {
			String str = readLine("Enter a phrase: ");
			String getChar = readLine("Enter a letter you want to remove: ");
			char ch = getChar.charAt(0);
			int indexOfString = str.indexOf(ch);
			println(removeAllOccurrences (str, ch));
			if (indexOfString == -1) {
				println("Error: You did not enter a phrase. Try again!");
			}
		}
	}	
	 
	private String removeAllOccurrences(String str, char ch) {
		String result = "";
		for (int i=0; i < str.length(); i++) {
			if (str.charAt(i) != ch) {
				result = result + str.charAt(i);
			}
		}
		return result;
	}
}