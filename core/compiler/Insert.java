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