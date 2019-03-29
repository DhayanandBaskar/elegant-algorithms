package graph;

import org.junit.Test;

import graph.DijkstrasShortestPath.Graph;
import graph.DijkstrasShortestPath.Vertex;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import static org.junit.Assert.assertEquals;

public class DijkstrasShortestPathTest {

    Map<Integer, String> idToName = getIdToName();
    Graph graph = constructGraph();

    @Test
    public void shouldFindTheShortestPathToAllVertexFromTheGivenSource() {
        DijkstrasShortestPath dijkstra = new DijkstrasShortestPath();
        dijkstra.shortestPath(graph, 1);

        Map<Integer, Integer> expectedDistance = getExpectedShortestPathDistance();
        Map<Integer, String> expectedPaths = getExpectedShortestPath();

        Set<Vertex> vertices = graph.getVertices();

        for (Vertex v : vertices) {
            assertEquals(expectedDistance.get(v.id).intValue(), v.distanceFromSource);
            assertEquals(expectedPaths.get(v.id), getPrintablePath(v));
        }
    }

    private Graph constructGraph() {
        Graph graph = new Graph(7);
        graph.addEdge(1, 2, 7);
        graph.addEdge(2, 3, 8);
        graph.addEdge(3, 5, 5);
        graph.addEdge(1, 4, 5);
        graph.addEdge(5, 6, 8);
        graph.addEdge(4, 6, 6);
        graph.addEdge(5, 7, 9);
        graph.addEdge(6, 7, 11);
        graph.addEdge(4, 2, 9);
        graph.addEdge(4, 5, 15);
        graph.addEdge(2, 5, 7);
        return graph;
    }

    private String getPrintablePath(Vertex v) {
        StringBuilder br = new StringBuilder();
        while (v != null) {
            br.append(idToName.get(v.id) + "-<");
            v = v.parent;
        }
        return br.reverse().subSequence(2, br.length()).toString();
    }

    private Map<Integer, Integer> getExpectedShortestPathDistance() {
        return new HashMap<Integer, Integer>() {{
            put(1, 0);
            put(2, 7);
            put(3, 15);
            put(4, 5);
            put(5, 14);
            put(6, 11);
            put(7, 22);
        }};
    }

    private Map<Integer, String> getExpectedShortestPath() {
       return new HashMap<Integer, String>() {{
           put(1, "A");
           put(2, "A<-B");
           put(3, "A<-B<-C");
           put(4, "A<-D");
           put(5, "A<-B<-E");
           put(6, "A<-D<-F");
           put(7, "A<-D<-F<-G");
       }};
    }

    private Map<Integer, String> getIdToName() {
        return new HashMap<Integer, String>() {{
            put(1, "A");
            put(2, "B");
            put(3, "C");
            put(4, "D");
            put(5, "E");
            put(6, "F");
            put(7, "G");
        }};
    }
}