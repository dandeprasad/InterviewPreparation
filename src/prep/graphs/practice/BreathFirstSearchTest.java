package prep.graphs.practice;

import java.util.*;

public class BreathFirstSearchTest {
    int l;
    List[] graph;
    boolean visited[];


    BreathFirstSearchTest(int length){
        l = length;
        graph = new  LinkedList[l];
        visited = new boolean[l];
        for(int i=0;i<length;i++){
            graph[i]=new LinkedList();
        }
    }

   void addEdge(int v,int v1){
       graph[v].add(v1);
    }

    void bfsSearch(int vx){
        LinkedList<Integer> queue
                = new LinkedList<Integer>();
        visited[ vx]=true;
        queue.add( vx);
        while(queue.size()!=0){

            int value = queue.poll();
visited[value] = true;
            System.out.print(value + " ");

            Iterator<Integer> list = graph[value].iterator();
            while(list.hasNext()){
              int data =  list.next();
              if(!visited[data]) {
                  queue.add(data);
              }
            }
        }

    }

    public static void main(String args[])
    {
        BreathFirstSearchTest g = new BreathFirstSearchTest(4);
        g.addEdge(0, 1);
        g.addEdge(0, 2);
        g.addEdge(1, 2);
        g.addEdge(2, 0);
        g.addEdge(2, 3);
        g.addEdge(3, 3);

        g.bfsSearch(2);

    }
}
