package Graph;
import java.io.*;

class Graph
{
	private final int MAX_VERTS = 20;
	private Vertex vertexList[]; // array of vertices
	private int adjMat[][];      // adjacency matrix
	private int nVerts;          // current number of vertices
	//-------------------------------------------------------------
	public Graph()               // constructor
	{
		vertexList = new Vertex[MAX_VERTS];
		// adjacency matrix
		adjMat = new int[MAX_VERTS][MAX_VERTS];
		nVerts = 0;
		for(int j=0; j<MAX_VERTS; j++)      // set adjacency
			for(int k=0; k<MAX_VERTS; k++)   //    matrix to 0
				adjMat[j][k] = 0;
	}  // end constructor
	//-------------------------------------------------------------
	public void addVertex(char lab)    // argument is label
	{
		vertexList[nVerts++] = new Vertex(lab);
	}
	//-------------------------------------------------------------
	public void addEdge(int start, int end)
	{
		adjMat[start][end] = 1;
		adjMat[end][start] = 1;
	}
	//-------------------------------------------------------------
	public void displayVertex(int v)
	{
		System.out.print(vertexList[v].label);
	}
	//-------------------------------------------------------------
	public void displayMatrix()
	{
		System.out.println("Graph Matrix: ");
		System.out.print("  ");
		for(int i=0; i< nVerts; i++)
			System.out.print(vertexList[i].label + " ");
		System.out.println();
		
		for(int i=0; i< nVerts; i++)
		{
			System.out.print(vertexList[i].label + " ");
			for(int j=0; j< nVerts; j++)
			{
				System.out.print(adjMat[i][j] + " ");
			}
			System.out.println();
		}
	}
	//-------------------------------------------------------------
	public int countEdges()
	{
		int sum = 0;
		
		for (int k = 0; k < nVerts; k++)
		{
			sum += adjMat[k].length;
		}
		return sum/2;
	}
}  // end class Graph
