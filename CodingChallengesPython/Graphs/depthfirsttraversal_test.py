
##
 # Depth First Traversal (or Search) for a graph is similar to Depth First Traversal of a tree. The only catch here is, unlike trees, graphs may contain cycles, so we may come to the same node again. 
 # To avoid processing a node more than once, we use a boolean visited array.
 # For example, in the graph at https://github.com/bhylan/codePractice/blob/master/DFS.jpg, we start traversal from vertex 2. When we come to vertex 0, we look for all adjacent vertices of it. 2 is also an adjacent vertex of 0. 
 # If we don’t mark visited vertices, then 2 will be processed again and it will become a non-terminating process. A Depth First Traversal of the following graph is 2, 0, 1, 3. 
##
 
import unittest


from collections import defaultdict
 

class Graph:
 
    # Constructor
    def __init__(self):
 
 
    # function to add an edge to graph
    def addEdge(self,u,v):
        

    def DFS(self,v):
 
 
 
# Driver code
# Create a graph given in the above diagram
g = Graph()
g.addEdge(0, 1)
g.addEdge(0, 2)
g.addEdge(1, 2)
g.addEdge(2, 0)
g.addEdge(2, 3)
g.addEdge(3, 3)


def test_graph_2():
    assert g.DFS(2) == [2, 0, 1, 3]