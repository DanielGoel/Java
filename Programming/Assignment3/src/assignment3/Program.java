package assignment3;

class Program {
    public void run() {
        // Create 1st rect obj
        Rect rect1 = new Rect(-6, 14, -1, -0);

        // Create 2nd rect obj
        Rect rect2 = new Rect(0, 6, -3, 17);

        // Use methods on 1st rect
        System.out.println("First Rectangle: ");
        rect1.print();

        System.out.println("\nAfter moving to (-32, -26): ");
        rect1.move(-32, -26);
        rect1.print();

        System.out.println("\nAfter changing size to -25: ");
        rect1.changeSize(-25);
        rect1.print();
        // Use methods on 2nd rect
        System.out.println("\nSecond Rectangle: ");
        rect2.print();

        System.out.println("\nAfter moving to (25, 52): ");
        rect2.move(25, 52);
        rect2.print();

        System.out.println("\nAfter changing size to 20: ");
        rect2.changeSize(20);
        rect2.print();
        //check which rect is bigger
        System.out.println("\nIs first rectangle bigger than second rectangle? " + rect1.isBiggerThan(rect2));
    }
}
