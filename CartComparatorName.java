public class CartComparatorName extends CartComparator {

    public int compare(ShoppingCart c1, ShoppingCart c2) {
        if (super.compare(c1, c2) != 0) return super.compare(c1, c2);
        else if (c1 == null && c2 == null) return 0;
        return c1.getUserName().compareTo(c2.getUserName());
    }
}
