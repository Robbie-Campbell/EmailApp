import java.util.Scanner;

class Email {
    private String firstName;
    private String lastName;
    private String password;
    private String department;
    private String email;
    private int passwordDefaultLength = 10;
    private String alternateEmail;
    private int mailboxCapacity = 100;
    private String companySuffix = "company.com";

    // Constructor to receive first and last name
    Email(String firstName, String lastName){
         this.firstName = firstName;
         this.lastName = lastName;

         // Call a method asking for department
        this.department = setDepartment();

        // Call a variable to return random password
        this.password = setPassword(passwordDefaultLength);
        System.out.println("Your new password is: " + this.password);

        // Combine elements to generate email
        email = firstName.toLowerCase() + "." + lastName.toLowerCase() + "@" + this.department.toLowerCase()
                + "." + companySuffix;
     }
    // Ask for the department
    private String setDepartment(){
        System.out.println("New worker: " + firstName + ".");
        System.out.println("Please enter department \n1 for Sales\n2 for Development\n3 for Accounting\n0 for None");
        System.out.println("Enter department code.");
        Scanner in = new Scanner(System.in);
        int deptChoice = in.nextInt();
        if (deptChoice == 1){ return "Sales"; }
        else if (deptChoice == 2){ return "Development"; }
        else if (deptChoice == 3){ return "Accounting"; }
        else{ return ""; }
    }
    // Generate a random password
    private String setPassword(int length){
        String passwordSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890£$%^&*";
        char[] password = new char[length];
        for (int i = 0; i < length; i++){
            int rand = (int)(Math.random() * passwordSet.length());
            password[i] = passwordSet.charAt(rand);
        }
        return new String (password);
    }
    // Set mailbox capacity
    public void setMailBoxCapacity(int capacity){
        this.mailboxCapacity = capacity;
    }

    // Set alternate email
    public void setAlternateEmail(String altEmail){
        this.alternateEmail = altEmail.toLowerCase();
    }

    // Change the password
    public void changePassword(String password){
        this.password = password;
        System.out.println("Your new password is: " + password);
    }

    public int getMailboxCapacity() { return mailboxCapacity; }
    public String getAlternateEmail() {return alternateEmail; }
    public String getPassword() {return password; }

    public String showInfo(){
        return "DISPLAY NAME: " + firstName + " " + lastName +
                "\nCOMPANY EMAIL: " + email +
                "\nEMAIL CAPACITY: " + mailboxCapacity + "mb";
    }
}
