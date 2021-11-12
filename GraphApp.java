package Graph;

public class GraphApp {
	public static void main(String[] args)
	{
		Graph g = new Graph();
		
		g.addVertex('a'); //0
		g.addVertex('b'); //1
		g.addVertex('c'); //2
		g.addVertex('d'); //3
		g.addVertex('e'); //4
		g.addVertex('f'); //5
		
		g.addEdge(0,1);
		g.addEdge(1,3);
		g.addEdge(1,5);
		g.addEdge(5,3);
		g.addEdge(3,4);
		g.addEdge(4,2);
		
		g.displayMatrix();
		
	}
}

