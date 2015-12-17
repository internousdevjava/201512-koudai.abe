/**
 * 
 */
package kadai;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author internous
 *
 */
public class KisoKadai2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("数当てゲームスタート！！");  
		System.out.println("数を入れてね！");
		int i = new java.util.Random().nextInt(99+1);
	for(int j=1;;j++){
				BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
				String c=null;
				try {
					c = br. readLine();
					} catch (IOException e) {
							// TODO 自動生成された catch ブロック
							e.printStackTrace();
							}
	    
	if(checkStringNumber(c)){
	    					int s = Integer.parseInt(c);
	   
	    	if(i>s){ 
	    			System.out.println("もっと大きい数です"); 
	    			}else if(i<s){ 
	    					System.out.println("もっと小さい数です"); 
	    			}else if(i==s){
	    					System.out.println("正解です！！");
	    			}
					}else{
						System.out.println("数や！");
					}continue;
					}
    				}
	
	public static boolean checkStringNumber(String number) {
		Pattern p = Pattern.compile("^[0-9]*$||^[０－９]*$");
		Matcher m = p.matcher(number);
		
		return m.find();
	}
}	