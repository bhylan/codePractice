package coding;

import static org.junit.Assert.assertEquals;

import org.junit.Test;


/*
 * Depth First Traversal (or Search) for a graph is similar to Depth First Traversal of a tree. The only catch here is, unlike trees, graphs may contain cycles, so we may come to the same node again. 
 * To avoid processing a node more than once, we use a boolean visited array.
 * For example, in the graph at , we start traversal from vertex 2. When we come to vertex 0, we look for all adjacent vertices of it. 2 is also an adjacent vertex of 0. 
 * If we don’t mark visited vertices, then 2 will be processed again and it will become a non-terminating process. A Depth First Traversal of the following graph is 2, 0, 1, 3. 
 */

public class DepthFirstTraversalTest {
	
	@Test
	public void testGraphFour(){
		Graph g = new Graph(4);
		 
        g.addEdge(0, 1);
        g.addEdge(0, 2);
        g.addEdge(1, 2);
        g.addEdge(2, 0);
        g.addEdge(2, 3);
        g.addEdge(3, 3);
        
        int[] expectedResult={2, 0, 1, 3};
        
        assertEquals(expectedResult, g.getResultArray());
	}

}
