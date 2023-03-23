package certification.tutorials.graphandtree;

import java.util.ArrayList;
import java.util.List;

public class Graph {

	// A list of lists t o represente an adjaceny list

	List<List<Integer>> adjList = null;

	public Graph(List<Edge> edges, int n) {

		adjList = new ArrayList<List<Integer>>();

		for (int i = 0; i < n; i++) {
			adjList.add(new ArrayList<Integer>());
		}

		// add edges to the undirected graph
		for (Edge edge : edges) {

			int src = edge.source;
			int dest = edge.dest;

			adjList.get(src).add(src);
			adjList.get(dest).add(dest);
		}
	}

}
