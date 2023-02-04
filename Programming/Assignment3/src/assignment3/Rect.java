
package assignment3;

class Rect {
    int x, y;
    int length, width;

    // constructor
    Rect(int x, int y, int length, int width) {
        setValues(x, y, length, width);
    }

    // set values to 1 if 0 and absolute value it if its negative
    final void setValues(int x, int y, int length, int width) {
        this.x = Math.max(Math.abs(x), 1);
        this.y = Math.max(Math.abs(y), 1);
        this.length = Math.max(Math.abs(length), 1);
        this.width = Math.max(Math.abs(width), 1);
    }

    //calculate perimeter
    int getPerimeter() {
        return 2 * (length + width);
    }

    //calculate area
    int getArea() {
        return length * width;
    }

    // change the pos of the rectangle to x and y
    void move(int x, int y) {
        setValues(x, y, this.length, this.width);
    }

    //set the length and width of the rect to n
    void changeSize(int n) {
        setValues(this.x, this.y, n, n);
    }

    //print out everything bout the rectangle
    void print() {
        System.out.println("Coordinates: (" + x + ", " + y + ")");
        System.out.println("Length: " + length);
        System.out.println("Width: " + width);
        System.out.println("Perimeter: " + getPerimeter());
        System.out.println("Area: " + getArea());
    }
    //check which is larger
    public boolean isBiggerThan(Rect rect) {
        return this.getArea() > rect.getArea();
    } 
}



    
