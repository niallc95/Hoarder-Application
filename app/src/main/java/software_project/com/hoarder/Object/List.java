package software_project.com.hoarder.Object;

import java.io.Serializable;

/**
 * Created by Niall on 21/11/2016.
 */


public class List implements Serializable{

    private String productName;
    private String productPrice;

    public List(String productName, String productPrice){
        this.productName = productName;
        this.productPrice = productPrice;
    }


    public String getName() {
        return productName;
    }
    public String getPrice() {
        return productPrice;
    }
}
