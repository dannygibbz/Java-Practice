package dayTwoHomework;

import java.lang.Integer;


public class CommandLineArguments {

	public static void main(String[] args) {
		if (args.length == 0) {
			return;
		}
		int first = Integer.parseInt(args[0]);
		int second = Integer.parseInt(args[1]);
		int third = Integer.parseInt(args[2]);
		
		System.out.println(first + second + third);
		
		
	}

}
