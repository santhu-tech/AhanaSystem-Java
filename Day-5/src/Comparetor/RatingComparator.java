package Comparetor;

import java.util.Comparator;

public class RatingComparator implements Comparator<Product> {
    public int compare(Product p1,Product p2){
        return p1.getName().compareTo(p2.getName());
    }
}
