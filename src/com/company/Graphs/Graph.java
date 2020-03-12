package com.company.Graphs;

import java.util.*;

public class Graph {

    class Edge
    {
        int dest,weight;
        Edge(int dest,int weight)
        {
            this.dest = dest;
            this.weight = weight;
        }
        }
        List<Edge> graph[];

       Graph(int noOfVertices)
       {
           graph = new LinkedList[noOfVertices];

           for(int i=0;i<noOfVertices;i++)
           {
               graph[i] = new LinkedList<Edge>();
           }
       }

       void addEdge(int start,int dest,int weight)
       {
           graph[start].add(0,new Edge(dest,weight));
       }

       boolean isConnected(int start,int dest)
       {
           for(Edge edge: graph[start])
           {
               if(edge.dest == dest)
               {
                   return true;
               }

           }

           return false;
       }

       void printGraph()
       {

           for(int i=0;i<graph.length;i++)
           {
              for(Edge e : graph[i])
              {
                  System.out.println("Start: "+i+" Dest: "+e.dest+" Weight: "+e.weight);
              }
           }


       }

       public void DFS(int start)
       {
           boolean visited[] = new boolean[graph.length];
           Stack<Integer> st = new Stack<>();

           st.push(start);

           System.out.println("DFS: ");
           while(!st.isEmpty())
           {
               start = st.peek();
               st.pop();

               if(visited[start]==false)
               {
                   System.out.print(start+" ");
                  visited[start]=true;
               }

               Iterator<Edge> itr = graph[start].iterator();

               while(itr.hasNext())
               {
                   int n = itr.next().dest;
                   if(!visited[n])
                   {
                       st.push(n);
                   }
               }


           }


       }

         public void BFS(int start)
         {
             boolean visited[] = new boolean[graph.length];
             Queue<Integer> queue = new LinkedList<>();

             queue.add(start);

             System.out.println("BFS: ");
             while(queue.isEmpty() == false)
             {

                 start = queue.poll();

                 if(visited[start]==false)
                 {
                     System.out.print(start+" ");
                      visited[start] = true;
                 }

                 Iterator<Edge> itr = graph[start].iterator();

                 while (itr.hasNext())
                 {
                     int n = itr.next().dest;
                     if(!visited[n])
                     {

                         queue.add(n);
                     }
                 }


             }




         }




    public static void main(String[] args) {
        Graph g = new Graph(5);
        g.addEdge(0,1,5);
        g.addEdge(0,2,4);
        g.addEdge(1,2,8);
        g.addEdge(2,0,8);
        g.addEdge(2,3,8);
        g.addEdge(3,3,8);
        System.out.println(g.isConnected(2,3));
        g.printGraph();
        g.DFS(2);
        System.out.println();
        g.BFS(2);
       }





}
