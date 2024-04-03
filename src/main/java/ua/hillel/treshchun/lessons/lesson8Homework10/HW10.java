package ua.hillel.treshchun.lessons.lesson8Homework10;

public class HW10 {
    public static void main(String[] args) {
        CoffeeOrderBoard board = new CoffeeOrderBoard();
        board.add("Sam");
        board.add("Frodo");
        board.add("Merry");
        board.add("Pippin");
        board.add("Gimli");
        board.add("Aragorn");
        board.add("Boromir");
        board.add("Faramir");

        board.draw();

        board.deliver();
        board.draw();

        board.deliver(3);
        board.draw();

        Order orderWithNumber = new Order("Sauron", -999);
        board.add(orderWithNumber);
        board.draw();

        board.deliver();
        board.draw();

        Order orderWithNumber10 = new Order("Ten", 10);
        board.add(orderWithNumber10);
        board.draw();

        Order orderWithNumber9 = new Order("Nine", 9);
        board.add(orderWithNumber9);
        board.draw();

        board.deliver();
        board.draw();

        board.add("Sam");
        board.add("Tammy");
        board.draw();

    }
}
