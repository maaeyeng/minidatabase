public  class Point {
    int x;
    int y;
    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    // more like a deep clone
    public Point(Point p) {
        this.x = p.x;
        this.y = p.y;
    }

    @Override
    public String toString() {
        return "x: " + x + " y: " + y;
    }
} 