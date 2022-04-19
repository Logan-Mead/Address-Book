public class Person {                                                                             //create a priavte class of person
  private String firstName;
  private String lastName;
  private String streetAddress;
  private String state;
  private int zip;
  private String phoneNumber;

public Person(){                                                                                 //defult constructor for person
  firstName = "No Name";
  lastName = "No Name";
  streetAddress = "No Address";
  state = "No State";
  zip = 0;
  phoneNumber = "No Number";
}

public Person(String first, String last, String address, String state, int zip, String phone){  //constructor with brought in variables
  this.firstName = first;
  this.lastName = last;
  this.streetAddress = address;
  this.state = state;
  this.zip = zip;
  this.phoneNumber = phone;
}
public void setFirstName(String firstName){                                                     //setter for firstName
  this.firstName = firstName;
}

public String getFirstName(){                                                                   //getter for firstName
  return firstName;
}

public void setLastName(String lastName){                                                       //setter for lastName
  this.lastName = lastName;
}

public String getLastName(){                                                                    //getter for lastName
  return lastName;
}

public void setStreetAddress(String address){                                                   //setter for streetAddress
  this.streetAddress = address;
}

public  String getStreetAddress(){                                                              //getter for streetAddress
  return streetAddress;
}

public void setState(String state){                                                             //setter for state
  this.state = state;
}

public String getState(){                                                                       //getter for state
  return state;
}

public void setZip(int zip){                                                                    //setter for zip
  this.zip = zip;
}

public int getZip(){                                                                            //getter for zip
  return zip;
}

public void setPhoneNumber(String number){                                                      //setter for phoneNumber
  this.phoneNumber = number;
}

public String getPhoneNumber(){                                                                 //getter for phoneNumber
  return phoneNumber;                                                                           
}

public String toString(){                                                                      //toString thats used when printing out a person
  return ("-----------------------" + "\n" + firstName + " " + lastName + "\n" + streetAddress + "\n" + state + ", " + zip + "\n" + phoneNumber + "\n");
}

}