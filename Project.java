public class Project {

    // Attributes
    String projNumber;
    String projName;
    String projType;
    String projAddress;
    String erf;
    int feeTotal;
    int paidToDate;
    String deadline;

    // constructor
    public Project(String projNumber, String projName, String projType, String projAddress,
    String erf, int feeTotal, int paidToDate, String deadline) {
        this.projNumber = projNumber;
        this.projName = projName;
        this.projType = projType;
        this.projAddress = projAddress;
        this.erf = erf;
        this.feeTotal = feeTotal;
        this.paidToDate = paidToDate;
        this.deadline = deadline; 
    }

    // returns all of students info
    public String toString() {
        String output = "Project Number: " + projNumber;
        output += "\nProject Name: " + projName;
        output += "\nProject Type: " + projType;
        output += "\nProject Address: " + projAddress;
        output += "\nProject ERF: " + erf;
        output += "\nProject Fee: " + feeTotal;
        output += "\nAmount Paid to Date: " + paidToDate;
        output += "\nProject Deadline: " + deadline;

        return output;
    }

    // method to change duedate
    public void changeDate(String newDate) {
        deadline = newDate;
    }

    // method to change the amount payed to date
    public void changePay(int amount) {
        paidToDate += amount;
    }

    // method to generate invoice when finalised
    public String finalise() {

        int totalOutstanding = feeTotal - paidToDate;
        // if fee outstanding generate invoice
        if (totalOutstanding > 0) {
            String output = "Customer name: ";
            output += "\nCustomer phone number: ";
            output += "\nCustomer email address: ";
            output += "\nCustomer physical address: ";
            output += "\nCustomer email address: ";
            output += "\nAmount outstanding: " + totalOutstanding;
            return output;
        } else {
            return null;
        }
    }
}
