package com.company.Graphs;

import java.util.LinkedList;
import java.util.List;

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

    public static void main(String[] args) {
        Graph g = new Graph(5);
        g.addEdge(0,1,5);
        g.addEdge(2,3,4);
        g.addEdge(2,5,8);
        System.out.println(g.isConnected(2,3));
        g.printGraph();
    }




}
