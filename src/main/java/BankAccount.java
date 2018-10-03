
/**
 * Class implementing a bank account.
 * <p>
 * Complete and document this class as part of Lab 5.
 *
 * @see <a href="https://cs125.cs.illinois.edu/lab/5/">Lab 5 Description</a>
 */
public class BankAccount {

    /*
     * You may want to use this to distinguish between different kinds of accounts.
     */

    /**
     * efhkdjfhekfhkehfkjsd.
     */
    public enum BankAccountType {
        /**
         * dfjkhdskfh.
         */
        CHECKINGS,
        /**
         * hfkjdshfk.
         */
        SAVINGS,
        /**
         * fdsjfdkjsh.
         */
        STUDENT,
        /**
         * fjdsfhkjsd.
         */
        WORKPLACE
    }

    /**
     * fhskdjfdsh.
     */

    private BankAccountType accountType;
    /**
     * dsgfhjdgfdhj.
     */
    private double accountBalance;
    /**
     * fdjshf.
     */
    private String ownerName;
    /**
     * fhjsd.
     */
    private double interestRate;
    /**
     * dhfksj.
     */
    private double interestEarned;

    /**
     * fhdsjhsdfkj.
     * @param name jkdhsfhds
     * @param accountCategory fhdsjkfs.
     */
    public BankAccount(final String name, final BankAccountType accountCategory) {
        ownerName = name;
        accountType = accountCategory;
    }

    /**
     * ghfjghdf.
     * @param newType type.
     */
    public void setAccountType(final BankAccountType newType) {
        accountType = newType;
    }

    /**
     * fsdhkjfds.
     * @return kjfhsdjfksd.
     */
    public BankAccountType getAccountType() {
        return accountType;
    }

    /**
     * hjkvd.
     * @param newBalance fsdhgfhdjs.
     */
    public void setAccountBalance(final double newBalance) {
        accountBalance = newBalance;
    }

    /**
     * fidshfkdsjhfkds.
     * @return fkjdshfjkdsfhds.
     */
    public double getAccountBalance() {
        return accountBalance;
    }

    /**
     * fjdskjfh.
     * @param newName fjskdhhfsjk.
     */
    public void setOwnerName(final String newName) {
        ownerName = newName;
    }

    /**
     * hfdjks.
     * @return jdsfhjk.
     */
    public String getOwnerName() {
        return ownerName;
    }

    /**
     * fdjshkfs.
     * @param newInterestRate djksa.
     */
    public void setInterestRate(final double newInterestRate) {
        interestRate = newInterestRate;
    }

    /**
     * fdshfkj.
     * @return jhkdsfjjdh.
     */
    public double getInterestRate() {
        return interestRate;
    }

    /**
     * jhfdskjfdsk.
     * @param newInterestEarned jkdfs.
     */
    public void setInterestEarned(final double newInterestEarned) {
        interestEarned = newInterestEarned;
    }

    /**
     * fojdshfjkdhfs.
     * @return fdhskfhskjfhs.
     */
    public double getInterestEarned() {
        return interestEarned;
    }
    /*
     * Implement getters and setters as appropriate for private variables.
     */
}
