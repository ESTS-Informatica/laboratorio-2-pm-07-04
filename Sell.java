
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/**
 * A sell of a property, performed by a seller to a client.
 *
 * @author POO
 * @version 03/2024
 */
public class Sell {

    private static int NUMBER_OF_SELLS = 0;
    // Id of the sell.
    private final String id;
    // Client to whom the sell is done.
    private User client;
    // Seller who performed the sell.
    private User seller;
    // Sold property.
    private Property property;
    // Date of the sell.
    private LocalDate date;

    /**
     * Constructor of class Sell
     *
     * @param client The client to whom the sell is done.
     * @param seller The seller who performed the sell.
     * @param property The sold property.
     */
    public Sell(User client, User seller, Property property) {
        this.id = Integer.toString(++NUMBER_OF_SELLS);
        this.client = client;
        this.seller = seller;
        this.property = property;
        this.date = LocalDate.now();
    }

    /**
     * Get the id.
     *
     * @return This sell id.
     */
    public String getId() {
        return null;
    }

    /**
     * Get the client.
     *
     * @return The client of this sell.
     */
    public User getClient() {
        return null;
    }
    /**
     * Get the seller.
     *
     * @return The seller of this sell.
     */
    public User getSeller() {
        return null;
    }

    /**
     * Get the property.
     *
     * @return The sold property.
     */
    public Property getProperty() {
        return null;
    }

    /**
     * Get the date.
     * 
     * @return The sell date.
     */
    public LocalDate getDate() {
        return date;
    }

    /**
     * Set the date.
     *
     * @param date The sell date. Must not be null. Must not be a future date.
     */
    public void setDate(LocalDate date) {
        if (date != null && date.isBefore(LocalDate.now())) {
            this.date = date;
        }
    }

    @Override
    public String toString() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MMM/YYYY");
        return null;
        
        /*"Data da venda \t: " + this.date.format(formatter) + "\n"
                + this.property + "\n";*/
    }

}
