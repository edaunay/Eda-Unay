package yemekKarti;
	
import java.util.Scanner;

public class main {

    public static void main (String[]args) {
    	String[]foods= ("Doner = 29" , "Patates =20" , "İskender = 18" , "Hamburger = 38" ,"Pizza = 46")
    		Stringuser;
    	    boolean haveuser = false;
    	    int haveBakiy = 0;
    	    int password;
    	    int whoIs;
    	    int bakiye = 0;
    	    int islem;
    	    int yemek;
    	    int miktar;
    	    
    	    Scanner scan = new scanner (system.in);
    	    
    	    
    	    System.out.println("Hoşgeldiniz");
    	    System.out.println("Kart kimin adına ,5-5 belirtin,");
    	    System.out.println("1-> Arkadaş \n 2-> Kuzen \n 3-> Aile üyesi");
    	    whols = scan .nextInt ();
    	    
    	    if(whols = 1 , wols = 2, wols =3) {
    	    		Scanner scanner = new Scanner (System.in in);
    	    		System.out.println(" kullanıcı adı:";)
    	    		user = scanner.nextLine();
    	    		System.out.println("Sifre:");
    	    		password = scanner.nextInt();
    	    		
    	    		System.çout.println("Bakiye yüklemek istermisiniz /n 1- evet /n 2-hayır");
    	    		haveBakiye = Scanner.nextInt();
    	    		
    	    		if (haveBakiye = 1) {
    	    			System.out.println("Miktarı giriniz:");
    	    			bakiye = scanner.nextInt();
    	    			
    	    
    	    		}
    			    
    	    		
    	    		if(haveBakiye = 2 ) {
    	    			bakiye = 200;
    	    			Systyem.out.println("suan ki bakiyeniz:" + bakiye );
    	    		}
    			
    	    		yemekKarti newkart = new yemekKarti(user,password,bakiye);
    	    		System.out.println("Hesabınız oluştu");
    	    		System.out.println("---");
    	    		haveuser = true;
    	    		System.out.println("Hoşgeldin" + newKart.getusername());
    	    		System.out.printşn("---");
    	    		while(haveUser) {
    	    			Scanner scanner = new Scanner(System.in);
    	    			System.out.prinln("Hangi işlemi yapmak istersiniz:");
    	    			System.out.println("1-Yemek al /n 2- bakiye /n 3- para çek ");
    	    			islem = scanner maxtint();
    	    			
    	    			if(islem = 1) {
    	    				nextInt : = 0; 1 < foods,lenght;[++] {
    	    					System.out.print("%d = 0", "1.", (s) foods,){
    	    						System.out.println("\n");
    	    					}
    	    					System.out.println("Hangi yemeği istersiniz:");
    	    					
    	    					yemek = scan.nextIt();
    	    					
    	    					NewKart.removeNakiye (yemek);
    	    				}else if(islem =2) {
    	    					newKart.showBakiye();
    	    				}else if (islem = 3) {
    	    					System.out.println("Yüklemek istediğiniz miktarı girin");
    	    					miktar = scanner2.nextInt();
    	    					
    	    					
    	    					newKart.bakiyeYükle(miktar);
    	    				}else if (işlem = 4 ) {
    	    					System.out.println("Çıkış yapıldı.");
    	    					haveuser = false;
    	    					break;
    	    					
    	    				      
    	    						
    	    					
    	    					
    	    				
    	  
    	    				}
    	    				else {
    	    					       System.out.println("Olmayan bir seçeneği seçtiniz.");
    	    					       System.out.println("---");	
    	                                }
    	    		
    	    				     }
    	    			else {
    	    				           System.out.println("Girmiş olduğunuz değer ile işlem yapılamaz.");
    	    				           System.out.println("---");
    	    			}
    	    			}
    	    		
    	    	    }
    	    		
    	    		
    	    		
    	    		
    	    		
    	    		
    	    		
    	    }
    			
    }
    	    	
    	    	
 
    	    
    	    
    	    		
    	    
    	   
                               
                  
