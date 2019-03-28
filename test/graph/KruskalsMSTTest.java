package graph;

import org.junit.Test;

import java.util.*;

import static org.junit.Assert.*;

public class KruskalsMSTTest {
    @Test
    public void shouldReturnMSTForAGivenGraph() {
        List<Edge> graph = constructGraph();
        KruskalsMST kruskal = new KruskalsMST();
        List<Edge> mst = kruskal.mst(graph);
        HashSet<String> mstString = printableMST(mst);
        System.out.println(mstString);
        String[] expected = {"C<--5-->E", "D<--6-->F", "A<--7-->B", "E<--9-->G", "A<--5-->D", "B<--7-->E"};
        for(String e: expected) {
            assertTrue(mstString.contains(e));
        }
    }

    private HashSet<String> printableMST(List<Edge> mst) {
        Map<Integer, String> idToName = getEdgeIdToName();
        HashSet<String> mstString = new HashSet<>();
        for(Edge e : mst) {
            mstString.add(idToName.get(e.u) + "<--" + e.cost + "-->" + idToName.get(e.v));
        }
        return mstString;
    }

    private Map<Integer, String> getEdgeIdToName() {
        Map<Integer, String> idToName = new HashMap<>();
        idToName.put(1, "A");
        idToName.put(2, "B");
        idToName.put(3, "C");
        idToName.put(4, "D");
        idToName.put(5, "E");
        idToName.put(6, "F");
        idToName.put(7, "G");
        return idToName;
    }

    private List<Edge> constructGraph() {
        List<Edge> graph = new ArrayList<>();
        graph.add(new Edge(1, 2, 7));
        graph.add(new Edge(2, 3, 8));
        graph.add(new Edge(3, 5, 5));
        graph.add(new Edge(1, 4, 5));
        graph.add(new Edge(5, 6, 8));
        graph.add(new Edge(4, 6, 6));
        graph.add(new Edge(5, 7, 9));
        graph.add(new Edge(6, 7, 11));
        graph.add(new Edge(4, 2, 9));
        graph.add(new Edge(4, 2, 9));
        graph.add(new Edge(2, 5, 7));
        return graph;
    }
}