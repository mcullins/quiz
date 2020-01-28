import java.util.Scanner;

public class QuizRunner {

	private static Quiz quiz = new Quiz();

    public static void main(String[] args) {
    	try (Scanner input = new Scanner(System.in)) {
    		int selection = 0;
			do {
				System.out.println();
				System.out.println("Quiz Time!");
				System.out.println("1) Add True/False Question");
				System.out.println("2) Add Multiple Choice Question");
				System.out.println("3) Add Checkbox Question");
				System.out.println("4) Run Quiz");
				System.out.println("5) Exit");
				System.out.print("Selection: ");

				String userInput = input.nextLine();

				selection = Integer.parseInt(userInput);

				switch (selection) {
					case 1:
						System.out.print("Enter Question");
						String trueFalseQuestion = input.nextLine();
						System.out.print("Input Answer");
						boolean trueFalseAnswer = input.nextBoolean();

						quiz.addTrueFalseQuestion(
								new TrueFalse(trueFalseQuestion, trueFalseAnswer));

						break;
					case 2:System.out.print("Enter Question");
						String multipleChoiceQuestion = input.nextLine();
						System.out.print("Input Answer");
						String multipleChoiceAnswer = input.nextLine();

						quiz.addTrueFalseQuestion(
								new TrueFalse(trueFalseQuestion, trueFalseAnswer));

						break;
//							}
//						}
//
//						break;
//					case 3:
//						System.out.print("Enter menu item description: ");
//						String desc = in.nextLine();
//						System.out.print("Enter menu item price: ");
//						String priceStr = in.nextLine();
//						System.out.print("Enter menu category: ");
//						String category = in.nextLine();
//
//						double price = Double.parseDouble(priceStr);
//						menu.addMenuItem(
//								new MenuItem(menuIdNum++, desc, price, MenuCategory.valueOf(category.toUpperCase()), true));
//
//						break;
//					case 4:
//						System.out.print("Please enter the menu item ID you wish to delete: ");
//						String deleteItemId = in.nextLine();
//
//						int menuIdToDelete = Integer.parseInt(deleteItemId);
//						menu.removeMenuItem(menuIdToDelete);
//
//						break;
//				}

			} while (selection != 5);

			System.out.println("Goodbye!");
			System.exit(0);
		} catch (Exception e) {
			System.err.println("Something went wrong!");
			System.exit(1);
		}
	}
}

