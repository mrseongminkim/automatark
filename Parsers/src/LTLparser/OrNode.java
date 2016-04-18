package LTLparser;

import java.io.*;
import java.util.*;


public class OrNode extends BinaryLTLNode {
    public OrNode(LTLNode l1, LTLNode l2) {
        super(l1, l2);
    }

    public void unparse(PrintWriter p, int indent) {
        p.print("(");
        myLTL1.unparse(p, 0);
        p.print(" || ");
        myLTL2.unparse(p, 0);
        p.print(")");
    }
}