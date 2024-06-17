package graph;

import java.util.Map;
import java.util.List;
import java.util.HashMap;
import java.util.ArrayList;
import java.util.Set;

/**
 * MapGraph Class.
 */
public class MapGraph 
{
  private int numberNode;														// nodes number
  private Map<String, List<String>> adjacentList;		// adjacent list

  /**
   * Constructor.
   */
  public MapGraph()
  {
    numberNode = 0;
    adjacentList = new HashMap<>();
  }

  /**
   * The addNode method adds a node in the graph.
   * @param node The node added. 
   */
  public void addNode(String node)
  {
    numberNode++;
    if (adjacentList.containsKey(node) == false) {
      adjacentList.put(node, new ArrayList<>());

    } else {
      System.out.println("Error! The node already exists.");		
    }
  }

  /**
   * The addEdge method adds an edge between two nodes.
   * @param node1 The first node edged. 
   * @param node2 The second node edged.
   */
  public void addEdge(String node1, String node2) 
  {
    adjacentList.get(node1).add(node2);
    adjacentList.get(node2).add(node1);
  }

  /**
   * The showConnections method displays the nodes and their edges.
   */
  public void showConnections() 
  {
    Set<String> keys = adjacentList.keySet();

    for (String node : keys) {
      List<String> nodeConnections = adjacentList.get(node);
      String strConnections = "";

      for (String edge : nodeConnections) {
        strConnections += edge + " ";
      }

      System.out.println(node + " -->" + strConnections);
    }
  }

  /**
   * The getNodeNumber method returns the node number of the graph.
   * @return the number of node.
   */
  public int getNodeNumber()
  {
    return numberNode;
  }
}
