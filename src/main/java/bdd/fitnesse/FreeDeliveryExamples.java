package bdd.fitnesse;


import org.apache.commons.lang.NotImplementedException;

public class FreeDeliveryExamples {

    private String productsOrdered;
    private String totalPrice;

    public void setProductsOrdered(String productsOrdered) {
        this.productsOrdered = productsOrdered;
    }

    public void setTotalPrice(String totalPrice) {
        this.totalPrice = totalPrice;
    }

    public String deliveryCosts() {
        throw new NotImplementedException();
    }
}
