package graph;

import com.sun.istack.internal.NotNull;
import unionfind.QuickUnion;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Time complexity - O(E log E) where E is the number of Edges
 */

public class KruskalsMST {
    public List<Edge> mst(List<Edge> graph) {
        List<Edge> mst = new ArrayList<>();
        Collections.sort(graph);
        QuickUnion quickUnion = new QuickUnion(graph.size()*2);
        for(Edge e : graph) {
            if(!quickUnion.isConnected(e.u, e.v)) {
                quickUnion.union(e.u, e.v);
                mst.add(e);
            }
        }
        return mst;
    }
}

class Edge implements Comparable{
    int u;
    int v;
    int cost;

    Edge(int u, int v, int cost) {
        this.u = u;
        this.v = v;
        this.cost = cost;
    }

    @Override
    public int compareTo(@NotNull Object o) {
        return this.cost - ((Edge) o).cost;
    }
}
