package algorithms.graph;

import java.util.*;
import java.util.Map.Entry;

/**
 * Dijkstra's shortest path algorithm is greedy algorithm
 * Time complexity - O(E log V)
 */

public class DijkstrasShortestPath {
    public static class Graph {
        Map<Integer, Vertex> idToVertex;

        public Graph(int n) {
            idToVertex = new HashMap<>(n);
            for (int i = 1; i <= n; i++) {
                idToVertex.put(i, new Vertex(i));
            }
        }

        public Vertex getVertex(int id) {
            return idToVertex.get(id);
        }

        public void addEdge(int vertexOneId, int vertexTwoId, int distance) {
            Vertex one = getVertex(vertexOneId);
            Vertex two = getVertex(vertexTwoId);
            one.addEdge(two, distance);
            two.addEdge(one, distance);
        }

        public Set<Vertex> getVertices() {
            return new HashSet<>(idToVertex.values());
        }
    }

    public static class Vertex {
        int id;
        Vertex parent;
        int distanceFromSource;
        Map<Vertex, Integer> adjacent = new HashMap<>();

        Vertex(int id) {
            this.id = id;
            distanceFromSource = Integer.MAX_VALUE;
        }

        public void addEdge(Vertex v, int distance) {
            if (adjacent.containsKey(v)) {
                if (adjacent.get(v) > distance) adjacent.put(v, distance);
            } else {
                adjacent.put(v, distance);
            }
        }
    }

    public void shortestPath(Graph graph, int sourceId) {
        Vertex source = graph.getVertex(sourceId);
        source.distanceFromSource = 0;

        PriorityQueue<Vertex> queue = new PriorityQueue<>(Comparator.comparingInt(v -> v.distanceFromSource));
        queue.add(source);

        while (!queue.isEmpty()) {
            Vertex current = queue.poll();

            for (Entry<Vertex, Integer> entry : current.adjacent.entrySet()) {
                Vertex adjacent = entry.getKey();
                int newDistance = current.distanceFromSource + entry.getValue();

                if (newDistance < adjacent.distanceFromSource) {
                    adjacent.distanceFromSource = newDistance;
                    adjacent.parent = current;
                    if (queue.contains(adjacent)) queue.remove(adjacent);
                    queue.add(adjacent);
                }
            }
        }
    }

}
