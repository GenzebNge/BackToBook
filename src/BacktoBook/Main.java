package BacktoBook;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        ArrayList<Book>allBook = new ArrayList<>();
        ArrayList<Person>allPersons = new ArrayList<>();
        Scanner userInput = new Scanner(System.in);

        //create book
        int userChoice = 0;

        do {
            System.out.println("Select the options from the menu: " +
                    "\n1. Create Book " +
                    "\n2. List Books " +
                    "\n3. Create Author " +
                    "\n4. List Of authors/Persons"+
                    "\n5. List Author with their book " +
                    "\n6. Quite");

            userChoice = userInput.nextInt();
            userInput.nextLine();

            switch (userChoice){
                case 1:
                    String yesOrNo ="";
                    do {
                        Book abook = new Book();
                        System.out.println("Create book");
                        System.out.println("Enter Book title");
                        String title = userInput.nextLine();
                        abook.setTitle(title);
                        System.out.println("Enter ISBN");
                        String isbn = userInput.nextLine();
                        abook.setISBN(isbn);
                        System.out.println("Do you want to add more books? yes or No");
                        yesOrNo = userInput.nextLine();
                        allBook.add(abook);
                    }   while (yesOrNo.equalsIgnoreCase("yes"));
                    break;

                case 2 :
                    System.out.println("list books");
                    for (Book books : allBook){
                        System.out.println("Title: " + books.getTitle() + "\nISBN: " + books.getISBN());
                    }
                    break;
                case 3 :
                    Person aPerson = new Person();
                    System.out.println("Create Author");
                    System.out.println("Enter firstName");
                    String fName = userInput.nextLine();
                    aPerson.setFirstName(fName);
                    System.out.println("Enter Laste Name");
                    String lName = userInput.nextLine();
                    aPerson.setLastName(lName);
                    System.out.println("Enter Email ");
                    String email = userInput.nextLine();
                    aPerson.setEmail(email);
                    System.out.println("Enter phone Number");
                    String phoneNumber = userInput.nextLine();
                    aPerson.setPhoneNumber(phoneNumber);

                    String condition = "";
                    do{
                        Book abook = new Book();
                        System.out.println("Create book");
                        System.out.println("Enter Book title");
                        String title = userInput.nextLine();
                        abook.setTitle(title);
                        System.out.println("Enter ISBN");
                        String isbn = userInput.nextLine();
                        abook.setISBN(isbn);
                        allBook.add(abook);
                        aPerson.addBook(abook);
                        System.out.println("Do you want to add more books? yes or No");
                        condition = userInput.nextLine();
                    }while(condition.equalsIgnoreCase("yes"));

                    allPersons.add(aPerson);

                    break;
                case 4 :
                    System.out.println("list authors /persons");
                    for (Person person1 :allPersons){
                        System.out.println("First Name : " + person1.getFirstName() +
                                "\nLaste Name : " + person1.getLastName() +
                                "\n Email : " + person1.getEmail() +
                                "\nPhnoe Number : " +person1.getPhoneNumber());
                    }
                    break;
                case 5 :
                    System.out.println("List of authors with their books");
                    for (Person person1 : allPersons){
                        System.out.println("First Name : " + person1.getFirstName()+
                                "\nLast Name : " +person1.getLastName() +
                                "\nEmail : " + person1.getEmail() +
                                "\nPhone Number : " + person1.getPhoneNumber());
                        for (Book myBook : person1.getAllBook()){
                            System.out.println("Title : " + myBook.getTitle() +
                                    "\nISBN : " + myBook.getISBN());
                        }
                    }
                    break;
                case 6 :
                    System.out.println("Quit");
                    break;
                 default:
                     System.out.println("not cut yet");
            }

        }while(userChoice!=6);
    }
}
