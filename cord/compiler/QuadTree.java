public class QuadTree<P> {    
    Point topLeft;
    Point bottomRight;
    Set<QuadNode<P>> nodes;
    // children (this can also be used like Trie, where it is an Array of QuadTree)
    QuadTree<P> topLeftTree;
    QuadTree<P> topRightTree;
    QuadTree<P> bottomLeftTree;
    QuadTree<P> bottomRightTree;
    int maxLen;

    public QuadTree(Point topLeft, Point bottomRight, int maxLen) {
        this.topLeft = topLeft;
        this.bottomRight = bottomRight;
        this.maxLen = maxLen;
        nodes = new HashSet<>();
    }
    public void insert(Point p, P data) {
        QuadTree<P> curr = this;

        while(!curr.isLeaf()) {
            System.out.println("Inserting " + p + " data " + data);

            // check the topLeft and bottomLeft value based on x
            if(p.x < (curr.topLeft.x + curr.bottomRight.x) / 2) {
                // check for topLeft or bottomLeft by comparing it with y
                if(p.y < (curr.topLeft.y + curr.bottomRight.y) / 2) { // it is in the topLeft
                    System.out.println("Is within topLeftTree py: " + p.y + " " + " mid: " + ((curr.topLeft.y + curr.bottomRight.y) / 2));
                    curr = curr.topLeftTree;
                } else { // it is in the bottomLeft
                    System.out.println("Is within bottomLeft");
                    curr = curr.bottomLeftTree;
                }

            } else { // check for topRight and bottomRight portion
                // check for topRight or bottomRight by comparing it with y
                if(p.y < (curr.topLeft.y + curr.bottomRight.y) / 2) { // it is in the topRight
                    System.out.println("Is within topRight");
                    curr = curr.topRightTree;

                } else { // it is in the bottomRight
                    System.out.println("Is within bottomRight");
                    curr = curr.bottomRightTree;
                }
            }
        }

        // curr is Leaf
        QuadNode<P> quadNode = new QuadNode<>(p, data);
        curr.nodes.add(quadNode);
        // System.out.println("curr " + curr);
        // if the the point is the maxLen then we will need ot subdivide
        if(curr.shouldSubDivide()) {
            // System.out.println("data " + data +  " need to be subdivide");
            curr.subDivide();
        }
    }
    public Set<QuadNode<P>> search(Point p) {
        QuadTree<P> curr = this;

        while(!curr.isLeaf()) {
            
            // recurse by checking if it is within the boundary
            if(p.x < (curr.topLeft.x + curr.bottomRight.x) / 2) {
                if(p.y < (curr.topLeft.y + curr.bottomRight.y) / 2) {
                    curr = curr.topLeftTree;
                } else {
                    curr = curr.bottomLeftTree;
                }
            } else {
                if(p.y < (curr.topLeft.y + curr.bottomRight.y) / 2) {
                    curr = curr.topRightTree;
                } else {
                    curr = curr.bottomRightTree;
                }

            }
        }
  return curr.node;
 }
}

