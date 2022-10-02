package housekeeping;

public class SimpleEnumUse {
    public static void main(String[] args) {
        Spiciness howHot = Spiciness.MEDIUM;
        System.out.println(howHot);
        System.out.println(howHot.getClass());
    }
}
/* Output:
MEDIUM
*/
