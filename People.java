public class People {

    // Attributes
    String personType;
    String name;
    String number;
    String email;
    String address;

    //constructor 
    public People(String personType, String name, String number, String email, String address) {
        this.personType = personType;
        this.name = name;
        this.number = number;
        this.email = email;
        this.address = address; 
    }

    // returns all of students info
    public String toString() {
        String output = "Role: " + personType;
        output += "\nName: " + name;
        output += "\nPhone Number: " + number;
        output += "\nEmail Adress: " + email;
        output += "\nPhysical Address: " + address;

        return output;
    }

    // method to change email address
    public void updateContacts(String newNumber, String newEmail, String newAddress) {
        this.number = newNumber;
        this.email = newEmail;
        this.address = newAddress;
    }

    
}
