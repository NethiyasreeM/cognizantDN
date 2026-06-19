public class EcommerceSearch {

    public static void searchProduct(String[] products, String key) {

        boolean found = false;

        for (int i = 0; i < products.length; i++) {
            if (products[i].equalsIgnoreCase(key)) {
                System.out.println("Product found at index: " + i);
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Product not found");
        }
    }

    public static void main(String[] args) {

        String[] products = {"Laptop", "Phone", "Shoes", "Watch"};

        searchProduct(products, "Phone");
    }
}