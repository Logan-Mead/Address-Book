import java.util.Scanner;
import java.util.ArrayList;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in).useDelimiter("\n");                                  //variable for user inputs and allows spaces
    int action = -1;                                                                              //variable for a users action
    ArrayList<Person> list = new ArrayList<Person>();                                             //an arraylist named list of type person

   while (action != 7){                                                                           //while loop that runs until the user decides to quit
    do {
      System.out.print("\n");                                                                    //menu with selections
      System.out.println("Make a Selection:");
      System.out.println("1) Add a person");
      System.out.println("2) Delete a person");
      System.out.println("3) Modify a person");
      System.out.println("4) Print one person");
      System.out.println("5) Print all people");
      System.out.println("6) Write all elements to a text file");
      System.out.println("7) Exit");
      System.out.print("Enter Selection: ");
      action = scanner.nextInt();
      System.out.print("\n");
    } while (action < 1 || action > 7);                                                            //while loops with methods 

    if (action == 1) {                                                                            //add person to array function
      System.out.print("Enter First Name: ");
      String firstName = scanner.next();
      System.out.print("Enter Last Name: ");
      String lastName = scanner.next();
      System.out.print("Enter Street Address: ");
      String streetAddress = scanner.next();
      System.out.print("Enter state: ");
      String state = scanner.next();
      System.out.print("Enter Zip: ");
      int zip = scanner.nextInt();
      System.out.print("Enter Phone Number: ");
      String phoneNumber = scanner.next();
      Person person = new Person(firstName, lastName, streetAddress, state, zip, phoneNumber);        //creates a new person with users input values
      list.add(person);                                                                               //adds person to array                            
    }

    if (action == 2) {                                                                                //delete method
      System.out.print("Enter a Persons First Name to Delete them: ");
      String inputName = scanner.next();
      boolean found = false;
      for (int i = 0; i < list.size(); i++){                                                          //error checking
        if(inputName.equals(list.get(i).getFirstName())){
          found = true;
        }
      }
      if(found == false){
        System.out.println("Error Could Not Find Person!");
      }
      if (found == true){                                                                             //runs if person is found
        for (int i = 0; i < list.size(); i++) {
          if (inputName.equals(list.get(i).getFirstName())) {
            list.remove(i);                                                                           //removes person from array
          }
        }
      }
    }

    if (action == 3) {                                                                                //modify method
      System.out.print("Enter A Person's Number To Modify Them: ");
      String searchKey = scanner.next();
      boolean found = false;
      for (int i = 0; i < list.size(); i++){                                                          //error checking
        if ( searchKey.equals(list.get(i).getPhoneNumber())){
          found = true;
        }
      }
      if (found == false){
        System.out.println("Error Could Not Find Person");
      }
      if (found == true){                                                                             //runs if person is found
        for (int i = 0; i < list.size(); i++) {
          if (searchKey.equals(list.get(i).getPhoneNumber())) {                                       //menu on what to modify
            System.out.println("What do you want to modify: ");
            System.out.println("1) Change First Name");
            System.out.println("2) Change Last Name");
            System.out.println("3) Change Address");
            System.out.println("4) Change state");
            System.out.println("5) Change Zip");
           System.out.println("6) Chnage Phone Number");
            System.out.print("Enter Selection:");
            int option = scanner.nextInt();

            if(option == 1){                                                                           //modify firstName method
              System.out.print("Enter a New First Name: ");
              String firstName = scanner.next();
              list.get(i).setFirstName(firstName);
            }

            if (option == 2){                                                                          //modify lastName method
              System.out.print("Enter a New Last Name: ");
              String lastName = scanner.next();
              list.get(i).setLastName(lastName);
            }

            if (option == 3){                                                                          //modify address method
              System.out.print("Enter a New Address: ");
              String address = scanner.next();
              list.get(i).setStreetAddress(address);
            }

            if (option == 4){                                                                           //modify state method
              System.out.print("Enter a New State: ");
              String state = scanner.next();
              list.get(i).setState(state);
            } 

            if (option == 5){                                                                           //modify zip method
              System.out.print("Enter a New Zip: ");
              int zip = scanner.nextInt();
              list.get(i).setZip(zip);
            }

            if (option == 6){                                                                            //modify phoneNumber method
              System.out.print("Enter a New Phone Number: ");
              String number = scanner.next();
              list.get(i).setPhoneNumber(number);
            }
          }
        }
      }
    }

    if (action == 4) {                                                                                   //print single person method
      System.out.print("Enter a First Name to Search: ");
      String inputName = scanner.next();
      boolean found = false;
      for (int i = 0; i < list.size(); i++){                                                             //error checking
        if (inputName.equals(list.get(i).getFirstName())){
          found = true;
        }
      }
      if (found == false){
        System.out.println("Error Could Not Find Person!");
      }
      if (found == true){                                                                                 //runs if person found
        for (int i = 0; i < list.size(); i++) {                                                           //prints the person asked to print
          if (inputName.equals(list.get(i).getFirstName())) {
            System.out.println(list.get(i));
          }
        }
      }
    }

    if (action == 5){                                                                                     //prints all people in array
      for (int i = 0; i < list.size(); i++) {
          System.out.println(list.get(i));
      }
    }

    if (action == 6){                                                                                     //prints the array to a file address.txt 
      try{
        FileOutputStream outStream = new FileOutputStream("address.txt");
        ObjectOutputStream objectOutputFile = new ObjectOutputStream(outStream);
        objectOutputFile.writeObject(list.toString());
        objectOutputFile.close();
      }
      catch(Exception e){
        System.out.println("Error Could Not Write to File!");
      }
    }

   }

   if (action == 7){                                                                                        //quit method
     System.out.println("Thank Your For Using My Service!");                                                //tells user thank you
     System.out.println("             Goodbye!");
   }
   
  }
}