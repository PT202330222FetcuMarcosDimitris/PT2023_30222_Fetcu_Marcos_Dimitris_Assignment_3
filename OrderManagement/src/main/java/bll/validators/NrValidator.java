package bll.validators;

import model.Product;

public class NrValidator implements Validator<Product> {

    public void validate(Product p) {

        if (p.getCurrentStock() < 0) {
            throw new IllegalArgumentException("Cantitate mai mica decat 0");
        }

        if (p.getPrice() < 0) {
            throw new IllegalArgumentException("Pret mai mic decat 0");
        }
    }

}

