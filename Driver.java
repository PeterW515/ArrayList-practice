import java.util.Scanner;

public class Driver {
    public static void main(String[] args) {
        //declare and initialize new Caesar object
        Caesar_Cipher cipher = new Caesar_Cipher();
        //declare variable to hold user's menu choice
        int choice;
        //declare and initialize new scanner to get user input
        Scanner scan = new Scanner(System.in);
        //do while loop to ensure menu prints at least once
        do {
            //print out menu
            System.out.println("1. Encrypt a message");
            System.out.println("2. Decrypt a message");
            System.out.println("3. Quit");
            //read and store user's menu choice
            choice = Integer.parseInt(scan.nextLine());

            //evaluate user's menu choice
            switch (choice) {
                case 1:
                    //prompt for message to encrypt
                    System.out.println("What is the message to encrypt?");
                    //store message to encrypt
                    String plaintext = (scan.nextLine().toLowerCase());
                    //call encrypt method and print returned string
                    System.out.println("Encrypted: " + cipher.encrypt(plaintext));
                    break;
                case 2:
                    //prompt for message to decrypt
                    System.out.println("What is the encrypted message?");
                    //store message to decrypt
                    String ciphertext = (scan.nextLine().toLowerCase());
                    //call decrypt method and print returned string
                    System.out.println("Plaintext: " + cipher.decrypt(ciphertext));
                    break;
            }
            //break loop if user chooses to quit
        } while (choice != 3);
    }
}
