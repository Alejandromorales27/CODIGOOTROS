package revisionDeCodigo;

public class RevisionDeCodigo6 {

		
		public static void main(String[] args) {
			//se agrego un main
		    int numeros[] = {20};
		    //se cambio la n por numero en donde se ocupo y tambien se quito el segundo Int
		    //y los primeros corchotes

		    for (int i = 0; i < 20; i++) {
		    	//se agrego un más
		    	  numeros[i] = (int)(Math.random() * 381) + 20;
			      System.out.println(numeros[i] + " ");
			      //se agrego dentro de los corchotes
			      //se agrego el .out
			      
		    }
		    System.out.print("\n¿Qué números quiere resaltar? ");
		    System.out.print("(1 – los múltiplos de 5, 2 – los múltiplos de 7): ")
;
		    

		    
		    int opcion = Integer.parseInt(System.console().readLine());
		    	//Se agrego parentesis
		    int multiplo = (opcion == 1) ? 5 : 7;
		    //Se cambiaron de lugar el signo con los puntos

		    for(int e : numeros) {
		    	//se quito la palabra else
		    	//se cambio la e a int
			      if (e % multiplo == 0) {
			        System.out.print("[" + e + "] ");
			      }else {
			        System.out.print(e + " "+numeros);
			        //se puso out en vez de in
			      }
		    	
		    }

		    
		  
		
		      
	}
		    

}
	

		  


