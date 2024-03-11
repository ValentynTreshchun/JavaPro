package ua.hillel.treshchun.lessons.lesson7Homework9;

import java.time.LocalDateTime;
import java.util.*;
import java.util.concurrent.TimeUnit;
import java.util.stream.Collectors;

public class HW9 {
    public static void main(String[] args) throws InterruptedException {
        HW9 hw9 = new HW9();
        List<Product> products = new ArrayList<>();
        products.add(new Product("Book", 25));
        products.add(new Product("Book", 100));
        products.add(new Product("Book", 250));
        products.add(new Product("Book", 500));
        products.add(new Product("Book", 750));

        System.out.println("Books that cost > 250: " + hw9.getProductsByTypeAndPrice("Book", 250, products));

        products.add(new DiscountedProduct("Book", 25, 10));
        products.add(new DiscountedProduct("Book", 25, 15));
        products.add(new DiscountedProduct("Book", 100, 10));
        products.add(new DiscountedProduct("Book", 1000, 0.1));

        System.out.println("Books with 10% off: " + hw9.getProductByTypeAndDiscount("Book", 0.1, products));

        products.add(new DiscountedProduct("Vinyl", 23, 0.1));
        products.add(new DiscountedProduct("Vinyl", 10, 0.1));

        System.out.println("Cheapest Book: " + hw9.getCheapestProduct("Book", products));
        System.out.println("Cheapest Book: " + hw9.getCheapestProduct("Kindle", products));


        products.add(new DiscountedProductWithDate("Vinyl", 25, 0.1));
        TimeUnit.SECONDS.sleep(1);
        products.add(new DiscountedProductWithDate("Vinyl", 30, 0));
        TimeUnit.SECONDS.sleep(1);
        products.add(new DiscountedProductWithDate("Vinyl", 50, 0.1));
        TimeUnit.SECONDS.sleep(1);
        products.add(new DiscountedProductWithDate("Vinyl", 100, 0.2));
        products.add(new DiscountedProductWithDate("Vinyl", 200, 0));


        System.out.println("Last 3 added products: " + hw9.getLastAddedProducts(3, products));

        System.out.println("Total cost of Vinyls added this year, above 75: "
                + hw9.GetCostByTypePriceYTD("Vinyl", 75, products));

        System.out.println(hw9.GroupByType(products));


    }

    private List<Product> getProductsByTypeAndPrice(String type, int minPrice, List<Product> products) {
        return products.stream()
                .filter(product -> product.getType().equals(type))
                .filter(product -> product.getPrice() > minPrice)
                .collect(Collectors.toList());
    }

    private List<Product> getProductByTypeAndDiscount(String type, double discount, List<Product> products) {
        return products.stream()
                .filter(product -> product.getType().equals(type)
                        && product instanceof DiscountedProduct
                        && ((DiscountedProduct) product).getDiscount() == discount)
                .map(product -> new Product(type, product.getPrice()))
                .collect(Collectors.toList());
    }

    private Product getCheapestProduct(String type, List<Product> products) {
        List<Product> targetProducts = this.getProductsByTypeAndPrice(type, 0, products);
        return targetProducts
                .stream()
                .min(Comparator.comparing(Product::getPrice))
                .orElseThrow(() -> new RuntimeException("Exception: product [type = " + type + "] not found"));
    }

    private List<Product> getLastAddedProducts(int lastN, List<Product> products) {
        return products.stream()
                .filter(product -> product instanceof DiscountedProductWithDate)
                .map(product -> (DiscountedProductWithDate) product)
                .sorted((p1, p2) -> {
                    if (p1.getDate().isAfter(p2.getDate())) {
                        return -1;
                    } else if (p1.getDate().isBefore(p2.getDate())) {
                        return 1;
                    } else return 0;
                })
                .limit(lastN)
                .collect(Collectors.toList());
    }

    private double GetCostByTypePriceYTD(String type, double minPrice, List<Product> products) {
        final double[] result = {0};
        products.stream()
                .filter(product -> product instanceof DiscountedProductWithDate
                        && product.getPrice() > minPrice
                        && product.getType().equals(type)
                        && ((DiscountedProductWithDate) product).getDate().getYear()
                        == LocalDateTime.now().getYear())
                .forEach(product -> result[0] = result[0] + product.getPrice());
        return result[0];
    }

    private Map<String, List<Product>> GroupByType(List<Product> products) {
        Map<String, List<Product>> result = new HashMap<>();
        List<String> types = new ArrayList<>();
        types = products.stream()
                .map(Product::getType)
                .distinct()
                .collect(Collectors.toList());
        types.stream()
                .forEach(type -> {
                    result.put(type, new ArrayList<>());
                });
        products.stream()
                .forEach(product -> {
                    result.get(product.getType()).add(product);
                });
        return result;
    }
}
