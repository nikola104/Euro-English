

public class Main {

	public static void main(String[] args) {
		System.out.println("\n\tWellcome to Euro English EU\n");

		String str = "As you learned in this chapter, Java methods start with an access modifier of public, \r\n"
				+ "private, protected or blank (default access). This is followed by an optional specifier such \r\n"
				+ "as static, final, or abstract. Next comes the return type, which is void or a Java type. \r\n"
				+ "The method name follows, using standard Java identifier rules. Zero or more parameters go \r\n"
				+ "in parentheses as the parameter list. Next come any optional exception types. Finally, zero \r\n"
				+ "or more statements go in braces to make up the method body.\r\n"
				+ "Using the private keyword means the code is only available from within the same class. \r\n"
				+ "Default (package private) access means the code is only available from within the same \r\n"
				+ "package. Using the protected keyword means the code is available from the same package \r\n"
				+ "or subclasses. Using the public keyword means the code is available from anywhere. Static \r\n"
				+ "methods and static variables are shared by the class. When referenced from outside the \r\n"
				+ "class, they are called using the classname—for example, StaticClass.method(). Instance \r\n"
				+ "members are allowed to call static members, but static members are not allowed to call \r\n"
				+ "instance members. Static imports are used to import static members.";
		System.out.println(str);

		System.out.println("\n\tEURO ENGLISH TRANSLATOR ------------------------------>>>>\n");

		String[] arr = str.split(" ");

		// 4 year

		for (int i = 0; i < arr.length; i++) {

			if (arr[i].toLowerCase().equals("an") || arr[i].toLowerCase().equals("the")
					|| arr[i].toLowerCase().equals("a")) {
				arr[i] = "";
			}
		}
		// 4 year

		// 1st year

		for (int i = 0; i < arr.length; i++) {

			arr[i] = arr[i].replace("ci", "si");

			arr[i] = arr[i].replace("Ci", "Si");

			arr[i] = arr[i].replace("CI", "SI");

			arr[i] = arr[i].replace("ce", "se");

			arr[i] = arr[i].replace("Ce", "Se");

			arr[i] = arr[i].replace("CE", "SE");

			arr[i] = arr[i].replace("ck", "k");
			
		}

		for (int i = 0; i < arr.length; i++) {

			arr[i] = arr[i].replaceAll("c", "k");

			arr[i] = arr[i].replaceAll("C", "K");

		}
		// 2nd year

		for (int i = 0; i < arr.length; i++) {

			arr[i] = arr[i].replace("ee", "i");

			arr[i] = arr[i].replace("EE", "I");

			arr[i] = arr[i].replace("oo", "u");

			arr[i] = arr[i].replace("OO", "U");

		}

		for (int i = 0; i < arr.length; i++) {

			int firstIndex = -1;
			StringBuilder sb = new StringBuilder();
			for (int j = 0; j < arr[i].length() - 1; j++) {
				if (Character.toLowerCase(arr[i].charAt(j)) == Character.toLowerCase(arr[i].charAt(j + 1))
						&& firstIndex == -1)
					firstIndex = j;
				else if (Character.toLowerCase(arr[i].charAt(j)) != Character.toLowerCase(arr[i].charAt(j + 1))
						&& firstIndex != -1) {

					arr[i] = sb.append(arr[i]).delete(firstIndex + 1, j + 1).toString();

					sb.delete(0, sb.length());

					j = firstIndex;
					firstIndex = -1;

				}

				if ((j + 2) == arr[i].length() && firstIndex != -1) {

					arr[i] = sb.append(arr[i]).delete(firstIndex + 1, j + 2).toString();
					sb.delete(0, sb.length());

				}
			}

		}

		// 3rd year

		for (int i = 0; i < arr.length; i++) {

			if ((arr[i].endsWith("e") && !arr[i].equals("ie") && !arr[i].equals("e")
					&& !arr[i].equals("E")))
				arr[i] = arr[i].substring(0, arr[i].length() - 1);

			else if (arr[i].endsWith("e,"))
				arr[i] = arr[i].substring(0, arr[i].length() - 2) + ",";

			else if (arr[i].endsWith("e."))
				arr[i] = arr[i].substring(0, arr[i].length() - 2) + ".";

			else if (arr[i].endsWith("e!"))
				arr[i] = arr[i].substring(0, arr[i].length() - 2) + "!";

			else if (arr[i].endsWith("e?"))
				arr[i] = arr[i].substring(0, arr[i].length() - 2) + "?";

			else if (arr[i].endsWith("e)"))
				arr[i] = arr[i].substring(0, arr[i].length() - 2) + ")";
		}

		// 4 year

		for (String curr : arr) {
			if (!curr.equals(""))
				System.out.print(curr + " ");
		}

	}

}
