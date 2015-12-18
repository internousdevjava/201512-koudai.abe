/**
 * 
 */
package kadai;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author internous
 *
 */
public class KisoKadai1 {

	/**
	 * @param args
	 */
	public static void main(String[] args){
		  		System.out.println("～～九九の表～～");
		  		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		  		String str=null;
		  		System.out.println("X軸を入力してね♪");
		  try {
				str = br.readLine();
			} catch (IOException e) {
				// TODO 自動生成された catch ブロック
				e.printStackTrace();
			}
		
		  int i = Integer.parseInt(str);
				  	System.out.println("Y軸を入力してね♪");
				  	try {
						str = br.readLine();
					} catch (IOException e) {
						// TODO 自動生成された catch ブロック
						e.printStackTrace();
					}
		    		
		  int j = Integer.parseInt(str);{
			for( int x=1; x<=i; x++ ){
				for( int y=1; y<=j; y++ ){
							System.out.print(x*y+" ");
							}System.out.println();
			  	}
		    }
	}
}
