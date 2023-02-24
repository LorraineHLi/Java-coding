import java.util.Calendar;
public class CreditCard {
    Calendar now = Calendar.getInstance();
    private int expiryMonth = 0;
    private int expiryYear = 0;
    private String firstName = "";
    private String lastName = "";
    private String ccNumber = "";

    public CreditCard(int ExpiryMonth, int ExpiryYear, String FirstName, String LastName, String CcNumber) {
        expiryMonth = ExpiryMonth;
        expiryYear = ExpiryYear;
        firstName = FirstName;
        lastName = LastName;
        ccNumber = CcNumber;
    }

    public String formatExpiryDate() {
        String mm;
        String yy;
//        if (expiryMonth > 9) mm = String.valueOf(expiryMonth);
//        else mm = "0" + String.valueOf(expiryMonth);
        mm = String.valueOf(expiryMonth);
        yy = String.valueOf(expiryYear).substring(2);
        return mm + "/" + yy;
    }
    public String formatFullName() {
        return firstName + " " + lastName;
    }
    public String formatCCNumber() {
        String ccN = "";
        for (int i = 0; i < 16; i+= 4) {
            ccN = ccN + ccNumber.substring(i, i+4) + " ";
        }
        return ccN.substring(0, ccN.length()-1);
    }
    public boolean isValid() {
        if (expiryYear > now.get(Calendar.YEAR)) return true;
        else if ((expiryYear == now.get(Calendar.YEAR)) && (expiryMonth > now.get(Calendar.MONTH) + 1)) return true;
        else return false;
    }

    public String toString() {
        String out = "Number: " + formatCCNumber() + "\n"
                + "Expiration date: " + formatExpiryDate() + "\n"
                + "Account holder: " + formatFullName() + "\n"
                + "Is valid: " + isValid();
        return out;
    }
}
