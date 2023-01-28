public class QuadNode<T> {
        T data;
        Point point;

        public QuadNode(Point p, T data) {
            this.data = data;
            this.point = p;
        }

        public QuadNode(int x, int y, T data) {
            this.data = data;
            this.point = new Point(x, y);
        }

        @Override
        public String toString() {
            return "data " + data + " point " + point;
        }
    }