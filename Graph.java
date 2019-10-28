import java.util.Iterator;
import java.util.LinkedList;
import java.util.Stack;

public class Graph {
	private int x;
	private LinkedList<Integer> adj[];
	
	Graph(int v) {
		x = v;
		adj = new LinkedList[v];
		for(int i = 0; i < v; i++) {
			adj[i] = new LinkedList<>();
		}
	}
	
	public void addEdge(int a, int b) {
		adj[a].add(b);
	}
	
	public void bfs(int c) {
		boolean visited[] = new boolean[x];
		
		LinkedList<Integer> queue = new LinkedList<>();
		
		visited[c] = true;
		queue.add(c);
		
		while(!queue.isEmpty()) {
			c = queue.poll();
			System.out.println(c + " ");
			
			Iterator<Integer> i = adj[c].listIterator();
			
			while(i.hasNext()) {
				int n = i.next();
				if(!visited[n]) {
					visited[n] = true;
					queue.add(n);
				}
			}
		}
	}
	
	public void dfs(int c) {
		boolean visited[] = new boolean[x];
		
		Stack<Integer> stack = new Stack<>();
		
		visited[c] = true;
		stack.push(c);
		
		while(!stack.isEmpty()) {
			c = stack.pop();
			System.out.println(c + " ");
			
			Iterator<Integer> i = adj[c].listIterator();
			
			while(i.hasNext()) {
				int n = i.next();
				if(!visited[n]) {
					visited[n] = true;
					stack.add(n);
				}
			}
		}
	}
}
