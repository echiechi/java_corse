package classes_objects;

import java.math.BigDecimal;

public class Product {

    public Product(){}

    public Product(double... args){
        for(int i =0; i< args.length; i++){
            System.out.println(args[i]);
        }
    }

    public static final BigDecimal RATE = BigDecimal.valueOf(23.36);
    private BigDecimal price;

    public void setPrice(final double price, final double discount) {
        BigDecimal initialPrice = BigDecimal.valueOf(price).multiply(RATE);
        this.price = initialPrice.subtract(initialPrice.multiply(BigDecimal.valueOf(discount)));
    }

    public void setPrice(final double price) {
        this.price = BigDecimal.valueOf(price).multiply(RATE);
    }

    public void setPrice(final BigDecimal price) {
        this.price = price.multiply(RATE);
    }

    public BigDecimal getPrice() {
        return this.price;
    }


}


