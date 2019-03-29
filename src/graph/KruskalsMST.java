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
            if(!quickUnion.isConnected(e.vertexOne, e.vertexTwo)) {
                quickUnion.union(e.vertexOne, e.vertexTwo);
                mst.add(e);
            }
        }
        return mst;
    }
}

class Edge implements Comparable{
    int vertexOne;
    int vertexTwo;
    int cost;

    Edge(int vertexOne, int vertexTwo, int cost) {
        this.vertexOne = vertexOne;
        this.vertexTwo = vertexTwo;
        this.cost = cost;
    }

    @Override
    public int compareTo(@NotNull Object o) {
        return this.cost - ((Edge) o).cost;
    }
}
