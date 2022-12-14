import java.util.Scanner;

public class UserName {
  public static void main(String[] args) {
    // create Scanner object
    Scanner s = new Scanner(System.in);

    /*
    // get String input from user
    System.out.print("Enter your first name: ");
    String firstName = s.nextLine();
    System.out.print("Enter your last name: ");
    String lastName = s.nextLine();

    // test output
    System.out.println("Hello " + getInitial(firstName) + "." + getInitial(lastName) + ".");
    */

    System.out.print("How long of a password? ");
    int len = s.nextInt();
    
    generatePassword(len);

    s.close();
  } // end main method

  /*
   * Name: getInitial
   * Purpose: send back the first character (inital) of a name
   * Input: a name (String)
   * Return: a single character (String)
   */
  public static String getInitial(String n) {
    return n.substring(0, 1);
  } // end initialize method

  /*
   * Name: generatePassword
   * Purpose: generate a random password
   * Input: length of password (int)
   * Return: the password (String)
   */
  public static String generatePassword(int length) {
    String password = "";

    // loop 'length' times

    // generate a random number
    // from 65 - 90 CAPITAL letters
    // from 97 - 122 lowercase
    // from 33 - 47 for special characters
    int min, max;

    for(int i = 0; i < length; i++) {
      int choice = (int)(Math.random() * 3 + 1);
      if (choice == 1) {
        min = 65;
        max = 90;
      } // capital letters

      else if (choice == 2) {
        min = 97;
        max = 122;
      } // lowercase letters

      else {
        min = 33;
        max = 47;
      } // special character

      int rand = (int)(Math.random()*(max - min + 1) + min);

      // convert the random int to char, ex: c =(char)i;
      char c = (char)rand;

      // System.out.println(rand + " " + c);

      // add the char to password
      password += c; //password = password + c;

    } // end for loop

    System.out.println(password);

    return password;
  } // end generatePassword method

} // end class
