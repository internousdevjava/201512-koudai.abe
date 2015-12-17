/**
 * 
 */
package kadai;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

/**
 * @author internous
 *
 */
public class KisoKadai3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws FileNotFoundException {
		System.out.println("～～テキストファイル読み書きプログラムの作成～～"); 
		
			if(true){
					System.out.println("新規ファイルを作成しますか？");
					System.out.println("\n 1:YES\n 2:NO\n");
					BufferedReader br6 = new BufferedReader(new InputStreamReader(System.in));
					try {
						String str6 = br6.readLine();
						int p = Integer.parseInt(str6);
						if(p==1){ 
							BufferedReader br7 = new BufferedReader(new InputStreamReader(System.in));
						    String str7 = br7.readLine(); 
						    System.out.println(str7);
						File newfile = new File(str7);
						try {
							if(newfile.createNewFile()){
							System.out.println("ファイルができました。");
							}else if(p==2){
								System.out.println("Noooooooooo");
								}
						} catch (IOException e) {
											e.printStackTrace();
											System.out.println(e);	
											}
						}
						
				int i = 0;
				String str = null;
				while(i==0){
							try {
								BufferedReader br2 = new BufferedReader(new InputStreamReader(System.in));
								System.out.println("出力したいファイルを指定してください。");
								String str2 = br2.readLine();
								File file = new File(str2);
								System.out.println("出力が完了しました。");
								System.out.println("メニューを選択してください。");
						
					
								while(true){
										System.out.println("\n--メニュー--\n\n 1:追記\n 2:上書き\n 3:書き込み\n　4:参照\n 5:終了\n");
										BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
										str = br.readLine();
					
				int n = Integer.parseInt(str);
				if(str.matches("^[0-9]+$")){
								if(n==1){
										try {
											PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter(file)));
											while(true){	
												BufferedReader br3 = new BufferedReader(new InputStreamReader(System.in));
												String str3 = br3.readLine();
												if(str3.equals(".end")){
													break;
												}pw.println(str3);
												}
													pw.close();
											} catch (IOException e) {
											System.out.println(e);
											e.printStackTrace();
											}
								}
				if(n==2){
						try {
							PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter(file,true)));
							while(true){	
								BufferedReader br4 = new BufferedReader(new InputStreamReader(System.in));
								String str4 = br4.readLine();
								if(str4 .equals(".end")){
									break;								
									}
												pw.println(str4);
												
								pw.close();
								}
							} catch (IOException e) {
										System.out.println(e);
										e.printStackTrace();
										}
						}
				if(n==3){
						try {
							PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter(file,false)));
							while(true){	
								BufferedReader br5 = new BufferedReader(new InputStreamReader(System.in));
								String str5 = br5.readLine();
								if(str5.equals(".end")){
									break;
									}pw.println(str5);
								}
								pw.close();
							} catch (IOException e) {
										System.out.println(e);
										e.printStackTrace();
										}
						}
				if(n==4){
					try{
						BufferedReader br8 = new BufferedReader(new InputStreamReader(System.in));
						System.out.println("出力したいファイルを指定してください。");
						String str8 = br8.readLine();
						System.out.print(str8);
						System.out.print("出力が完了しました。");
						System.out.print("メニューを選択してください。");
					}catch (IOException e) {
						System.out.println(e);
						e.printStackTrace();
						}
				
				if(n==5){
					System.out.println("バイバイ！");
					System.exit(0);
					}
		}else{
			System.out.println("\n半角数値でメニューを選択してください。\n");
		}System.out.println("\n 1:メニューに戻る。\n 2:終了\n");
		BufferedReader br3 = new BufferedReader(new InputStreamReader(System.in));
		try {
			String str3 = br3.readLine();
			int j = Integer.parseInt(str3);
			if(j==2){
				System.out.println("バイバイ！");
				System.exit(0);
				}
		} catch (IOException e) {
						e.printStackTrace();
								}
						}
						}}catch (IOException e) {
						System.out.println(e);
						e.printStackTrace();
						}
						}
						}catch (IOException e1) {
						e1.printStackTrace();
					}
		}
	}
}
		


