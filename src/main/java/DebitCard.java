public class DebitCard extends BankCard implements IScan{
//    private String cardNumber;
    private int sortCode;
    private int accountNumber;
//    private String expiryDate;
//    private int securityNumber;

    public DebitCard(String cardNumber, String expiryDate, int securityNumber, int sortCode, int accountNumber) {
        super(cardNumber, expiryDate, securityNumber);
//        this.cardNumber = cardNumber;
        this.sortCode = sortCode;
        this.accountNumber = accountNumber;
//        this.expiryDate = expiryDate;
//        this.securityNumber = securityNumber;
    }

//    public String getCardNumber() {
//        return this.cardNumber;
//    }

    public int getSortCode() {
        return this.sortCode;
    }

    public int getAccountNumber() {
        return this.accountNumber;
    }

//    public String getExpiryDate() {
//        return this.expiryDate;
//    }

//    public int getSecurityNumber() {
//        return this.securityNumber;
//    }

    public String scan() {
        return "Payment Complete";
    }
}
