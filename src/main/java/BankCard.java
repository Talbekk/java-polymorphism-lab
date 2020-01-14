public abstract class BankCard {

    protected String cardNumber;
    protected String expiryDate;
    protected int securityNumber;

    public BankCard(String cardNumber, String expiryDate, int securityNumber) {
        this.cardNumber = cardNumber;
        this.expiryDate = expiryDate;
        this.securityNumber = securityNumber;
    }

    public String getCardNumber(){
        return this.cardNumber;
    }

    public String getExpiryDate(){
        return this.expiryDate;
    }

    public int getSecurityNumber(){
        return this.securityNumber;
    }
}
