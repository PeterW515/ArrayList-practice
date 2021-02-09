import java.util.ArrayList;

class Caesar_Cipher {
    //ArrayList to hold the alphabet
    ArrayList<Character> alphabet = new ArrayList<Character>();

    //constructor which fills the alphabet ArrayList
    public Caesar_Cipher() {
        for (char letter = 'a'; letter <= 'z'; letter++) {
            alphabet.add(letter);
        }
    }

    //method to return position of a letter in alphabet
    public int position_of_char(char letter) {
        return alphabet.indexOf(letter);
    }

    //method to return letter at position in alphabet
    public char letter_at_pos(int target) {
        return alphabet.get(target);
    }

    //method to encrypt a character
    public char encrypt_char(char letter) {
        //variable to store position
        int num = position_of_char(letter);
        //adding three to letter position for encryption
        num += 3;
        //if statement in case encryption needs to wrap around alphabet
        if (num > 25) num -= 26;
        //return character at new position
        return letter_at_pos(num);
    }

    //method to decrypt a character
    public char decrypt_char(char letter) {
        //variable to store position
        int num = position_of_char(letter);
        //subtracting three from letter position for decryption
        num -= 3;
        //if statement in case decryption needs to wrap around alphabet
        if (num < 0) num += 26;
        //return character at new position
        return letter_at_pos(num);
    }

    //method to encrypt a string
    public String encrypt(String plaintext) {
        //declare and initialize string to hold encrypted message
        String ciphertext = "";
        //for loop to loop through each character of string to be encrypted
        for (int a = 0; a < plaintext.length(); a++) {
            //appending each encrypted character to ciphertext variable
            ciphertext = ciphertext + encrypt_char(plaintext.charAt(a));
        }
        return ciphertext;
    }

    //method to decrypt a string
    public String decrypt(String ciphertext) {
        //declare and initialize string to hold decrypted message
        String plaintext = "";
        //for loop to loop through each character of string to be decrypted
        for (int a = 0; a < ciphertext.length(); a++) {
            //appending each decrypted character to plaintext variable
            plaintext = plaintext + decrypt_char(ciphertext.charAt(a));
        }
        return plaintext;
    }
}
