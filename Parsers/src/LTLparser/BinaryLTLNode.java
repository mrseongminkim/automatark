package LTLparser;

import java.io.*;
import java.util.*;

public abstract class BinaryLTLNode extends LTLNode {
    public BinaryLTLNode(LTLNode l1, LTLNode l2) {
        myLTL1 = l1;
        myLTL2 = l2;
    }
    
    public Set<String> returnLeafNodes(Set<String> set, boolean returnExp) {
        Set<String> hset = new HashSet<String>();
    	hset.addAll(myLTL1.returnLeafNodes(set, returnExp)); 
        hset.addAll(myLTL2.returnLeafNodes(set, returnExp));
        return set;
    }
    
    // two kids
    protected LTLNode myLTL1;
    protected LTLNode myLTL2;
}