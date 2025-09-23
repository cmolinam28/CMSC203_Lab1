import java.util.Scanner;

public class MovieDriver_Task2
{

	public static void main(String[] args) 
	{
		//Create a new object of type Scanner that reads from the keyboard
		Scanner input = new Scanner(System.in);
		
		//Create a new movie object
		Movie MyMovie = new Movie();
		String title, rating, answer = "";
		int soldTickets;
				
		do
		{
	
		
		//Prompt the user to enter the title of a movie 
		System.out.println("Enter enter the name of a movie: ");
		title = input.nextLine();
		
		//Set the title in the movie object
		MyMovie.setTitle(title);
		
		
		//Prompt the user to enter the movie’s rating
		System.out.println("Enter the rating of the movie: ");
		rating = input.nextLine();
		
		//Set the rating in the movie object
		MyMovie.setRating(rating);
		
		//Prompt the user to enter the number of tickets sold at a (unnamed) theater
		System.out.println("Enter the number of tickets sold for this movie: ");
		soldTickets = input.nextInt();
		
		//Set the number of tickets sold in the movie object
		MyMovie.setSoldTickets(soldTickets);
		
				
		//Print out the information using the movie’s toString method
		System.out.println(MyMovie.toString());
		
		input.nextLine();
		
		System.out.println("Do you want to enter another? (y or n)");
		answer = input.nextLine();
		
		}while (answer.equalsIgnoreCase("y"));
		
		System.out.println("Goodbye");
		
		input.close();
		

	}

}
