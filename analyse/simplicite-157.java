package eraser;

public class Eraser {
    public static String erase(String str) {
    	
    		int nbstr = str.length(); // nbstr me permet de savoir combien de lettre possède ce String
    	    String v = ""; // Le mot retourné a la fin
    	    for(int i = 0; i<nbstr;i++){
    	      char s = str.charAt(i);  // s est la lettre du String a la ième position 
    	      
    	      if(s == ' '){  // Ça vérifie si s est un espace. Si ce n'en est pas un alors ça ajoute la lettre au String v 
    	    	
    	    	
    	        if(i== 0){	
    	        	if(str.charAt(i+1) == ' ') {
    	        		v = v + str.charAt(i); // Si i =0 et que la prochaine lettre est aussi un espace
    	            }
    	        }
    	        else if(i== nbstr-1){
        	        if(str.charAt(i-1) == ' ') {
        	        		v = v + str.charAt(i); // Si i = nbstr-1 et que celle avant est aussi espace
        	        }
        	        }
        	    else if(str.charAt(i+1) == ' '|| str.charAt(i-1) == ' '){
            	    
            	        v = v + str.charAt(i); // Si i n'est ni au début et ni à la fin, alors il regarde la lettre d'avant et d'après  
    	          
        	    }
    	          else{ System.out.println("c'est supp"); }// Elle s'affiche quand un espace est supprimé 
    	      }else{v = v +s;} // Si la lettre n'est pas un espace alors elle est ajoutée



    	      
    	    }

    	 return v;   
    }
    	    
}
    
