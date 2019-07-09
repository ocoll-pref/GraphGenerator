package generator;

import java.io.PrintWriter;
import java.util.Random;

public class GraphGenerator {

	public static void main(String[] args) {
		if (args.length != 4){
			System.out.println("USAGE: GraphGenerator VerticesN MaxVal MaxEdges OutputName");
			System.exit(0);
		}
		else{
			PrintWriter writer = null; 
			int i, verticesN=0, maxVal =0, maxEdges=0;
			try{
				writer = new PrintWriter(args[3], "UTF-8");
				verticesN = Integer.parseInt(args[0]);
				maxEdges = Integer.parseInt(args[1]);
				maxVal = Integer.parseInt(args[2]);
			}catch(Exception e){
				System.out.println("Exception on args" + e.getMessage());
				System.out.println("USAGE: GraphGenerator VerticesN MaxVal MaxEdges OutputName");
				System.exit(0);
			}
			
			for(i=0;i<verticesN;i++){
				Random forv = new Random();
				Random formax = new Random();
				Random fordestination = new Random();
				Random foredvalue = new Random();
				Vertex toadd = new Vertex(i,forv.nextInt(maxVal)+1);
				int size = formax.nextInt(maxEdges);
				for(int j=0; j< size; j++){
					toadd.addEdge(foredvalue.nextInt(maxVal)+1, fordestination.nextInt(verticesN));
				}
				
				writer.println(toadd.toString());
				
			}
			writer.close();
			System.out.println("File created successfully");
		}

	}

}
