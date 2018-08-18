public class CalendarEntry {

    String title;
    double amountToPay = 0; //This will show the amount required to pay (ex. if the entry is a recurring bill)
    int priority = 0; //Can be set to 0 (none), 1 (low), 2 (high) - default is 0
    String note = ""; //User has option to add notes to their entry, but default is an empty string

    //Constructor
    public CalendarEntry(String title){
        //The only initial entry is the title, and the other data members are added afterwards
        this.title = title;

    }


    //Setters

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAmountToPay(double amountToPay) {
        this.amountToPay = amountToPay;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }

    public void setNote(String note) {
        this.note = note;
    }


    //Getters

    public String getTitle() {
        return title;
    }

    public double getAmountToPay() {
        return amountToPay;
    }

    public int getPriority() {
        return priority;
    }

    public String getNote() {
        return note;
    }
}


