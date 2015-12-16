/**
 * 
 */
package kadai;

/**
 * @author internous
 *
 */
public class KisoKadai1 {

	/**
	 * @param args
	 */
public static void main(String args[]) 
		  {
			    System.out.println("九九の表");
			    int kuku[][] = new int[100][100];
			    for( int x=0; x<100; x++ ) {
			      for( int y=0; y<100; y++ ){
			    	  kuku[x][y] = (x+1) * (y+1);
			      }
			    }
			    for( int x=0; x<100; x++ ) {
			      for( int y=0; y<100; y++ ) { 
			    	  System.out.print(kuku[x][y] + " "); 
			      }
			      	  System.out.println(); 
			    }
		  }
}
