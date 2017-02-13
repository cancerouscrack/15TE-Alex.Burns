import java.util.Scanner;
public class breakingbad {
	
	static float tumours = 0;
	static int meth = 10;
	static String name = "Walter";
	static String surname = "White";
	static String nickname = "Heisenberg";
	static int age = 51;
	static int turn = 0;
	static int ingR = 0;
	static int ingC = 0;
	static int ingS = 0;
	static int ingM = 0;
	static int probability(){
		return (int) (Math.random()*100);
	}
	
	static int probability(int max) {
		return (int) (Math.random()*max);
	}
	
	static void printwalter () {
	
		System.out.print("##@@WWWWWWWWWWMMMMMWWWMMMWWWWWWMWMWWWWWWW@@@@@@@@############################\n"+
						 "#@@@@WWWWWW@WWMMMMMWWWMMMMWWWWWWWWWMxnz###znxW@@@@###########################\n"+
						 "#@@@@@WWWWW@WWMMMMMWWWWWWWWWWWWWMn+*ii;;;;ii**+#xW###########################\n"+
						 "#@@@@@WWWW@@WWWMMMMWWWW@@WWWWWx#+*iii;;;;;;;;ii**+zM@########################\n"+
						 "@@@@@@@WW@@@@WWMWWMWWW@@@@@Wn#+**iiiiii;;;;;;;ii*++#zM#######################\n"+
						 "@@@@@@@@@@@@@@WMMWWWWW@@@Wn#+***iiiiii;;;;;;;iiii*+##zn@#####################\n"+
						 "@@@@@@@@@@@@@@WWMWWWW@@@M#+++****ii;;;;;::;;;;i***++#zznM####################\n"+
						 "@@@@@@@@@@@@@@WWWWWWWWWn##++****ii;;;:::::::;;ii**+++##zzx@##################\n"+
						 "@@@@@@@@@@@@@@@WWWWWWMz##+++***iii;;;::::::;;iii**++++#zzzx@#################\n"+
						 "@@@@@@@@@@@@@@@WW@@@Mz##+++**iiiii;;;;;;;;;iiii****++###zznx@################\n"+
						 "@@@@@@@W@@@@@@WWWWWWz##+++**iiiiii;;;;;i;iiii*i******+###zznx@###############\n"+
						 "@@@@@WWWWWWWWWWWWWWn##++**iiiiiii;;;;;;iiiiiiiiiiii***+###znxM@##############\n"+
						 "@@@@WWMWWWMMMMWWWWx##++***i;;;i;;;;;;;;;;;ii;;iiii;ii**+##znxxW##############\n"+
						 "@@@@WWWWWWWWMMMMWMz##++*ii;;;;;;:::::::;;;;;;;;;;;;;i**++#znnxx@#############\n"+
						 "@@@@WWWWWWWWWMMMMx##++*ii;;;:::::::,:,:::;;:;::;;;;ii***+##znnxW#############\n"+
						 "@@@@WWWWWWWWWMMMMz##+**i;;;::::,,,,,,,:,,::::::::;iii***+#zznnxM@############\n"+
						 "@@@@@WWWWWWWWWWMxz#++*ii;;:::::,,,,,,,,,,,::::::;;;ii***++#znnxx@@###########\n"+
						 "@@@@@@WWWWWWWWWWn#+++*ii;;::::,,,,,,,,,,,,,,:,,::;;ii***++#znnnxM@###########\n"+
						 "@@@@@@WW@@@WWWWWz#++*iii;;:::::,,,,,,,,,,,,,,,:::;;iii**++znnnnxM@###########\n"+
						 "@@@@@@@W@@@@@@WMz#++*ii;;;;:::,,,,,,,,,,,,,,,,:::;;iii***+znnnnxM@###########\n"+
						 "#@@@@@@WW@@@@@WM#+++*i;;;;:::,,,,,,,,.,,,,,,:,,::;;iii**++#nnnnxMW@##########\n"+
						 "#@@@@@@@W@@@WWWx#+++*i;;;;::,,,,,..,,..,,,,,,,,:::;;;i**++#nznnxMW@##########\n"+
						 "#@@@@@@@WWW@WWWn#+++*i;;;;::,,,.........,,,,,,,::;;;ii**++#nnnnxMW@##########\n"+
						 "#@@@@@@@WWWWWMMz#+++*i;;;:::,,,........,,,,,,,,:::;;;i**++znnnnxMW@##########\n"+
						 "@@@@@@@@WWWWWWMz#++**i;;;;::,..........,,,,,,,,::::;;**++#znznnMMW@##########\n"+
						 "@@@@@@@WWW@WWWMz#+***;;;;:::,.,........,,,,,,,,:::;;;**++#znznnMMW@##########\n"+
						 "@@@@@@@@@@WWWWMz++***i;;;::,,,....,,,.,,,,,,,,,:::;;ii*+*+zzznnxMW@@#########\n"+
						 "@@@@@@@WW@WWWWMz#+***i;;;::,,,,..,,,,..,,,,,:,,:::;iii***+#zznnMMW@#@@#######\n"+
						 "@@@@WWWWWWWWWWMz#+***i;;;::::,,,,,,,,,.,,.,,:,,,::;i;i***+#znnnMWW@@@@@@#####\n"+
						 "@@@@WWMMMWWWWWMz#+***i;;;:::::,,,,,,,,,,,.,,:,,::;;i;i*i*+#nznxMWW@@@@@@#####\n"+
						 "@@@@WWWMMWWWWMMn#+***i;:::,,,,:,,:,,,,,,:,,:::::;::;;i;i*+znnxxMWWW@@@@@#####\n"+
						 "@@@WWWWWWWWWWWMn#+***i;;:::,,,,,,:,::,,::,:::::::;;iiii*+#znnxMMWWW@@@@@#####\n"+
						 "@@@WWWWMMMMMMMxn#+**ii;;::,,,,..,..,,,.,,,,,,:,::::;;;ii*#znxxMMWWW@@@@@@@###\n"+
						 "@@@WWWMMMxxxxxxn#++*iii;;:::,,..,...,,,,,,,,,,,::::;;;i*+#znnxMMWW@@@@@@@@@##\n"+
						 "@@@WWWMMMxxxxxxz#++***i;:::,,,,,,,,,,,,,,,.,,,,:::;i**++##znnxMMWW@@@@@@@@@@#\n"+
						 "@@@WWWMMMxxxxxxz#++**i;;;;:,,,...,,,,:,,,,.,,,,::;i;;;i*+#nnnMMMWW@@@@W@@@@@#\n"+
						 "@@@WWMMxMxxxxxxz#++*iii;;;;::,,,,,.,,,,,,.,,:,,:;i;;;iii*+nxnxMMWW@@Wnn@@#@##\n"+
						 "@@WWWMMxxxxxMxxn#+*+*i;:::,,,::::,,:,,,,,..,::,:;;::;ii*+zznxxMMW##@xxMW@####\n"+
						 "@@WWMMxxxxn##xMn#++*+ii;;::,,,,,,,,:,,:::,,,::,:::;i*+*+#znxxMMW@#@MxxMW@@###\n"+
						 "@@WWMMxxxxn#*#MM#++*++*ii;::,,,,,,,;:::;;:::::::;i++zzznxxxxMMW@@@WMxMMM@@###\n"+
						 "@@WWMMxxxxnn+*+nz+*+####*ii;:,,::;ii;;;;i;iii;i*+#zxMMMWWW@WMWWW@@MMMMWM@@###\n"+
						 "@@@WWMxxxxnnz*i+n++#z#+++##znnnnz###+i:;;i+z#nxMMxMWWxxMW@@WMMMW@WMMMMWM@@###\n"+
						 "@@@@WMMMxxz#n+iin#+++#####nxMMMMxnxnn*;;;i*zMMMWMxxnzz#zMWWWWMM@WWMMMMWW@@###\n"+
						 "@@@@WWWMMxn#z#+*nx#z###+++++#znnxxxxx+;;*zMWMxxMxnnznnnnxMMWWM@WWWMMMMWW@@###\n"+
						 "@@@WWWWMMxx####*xz*###+zMWWWW@WxMxxxx#ii**#xWMxWxxW@@W@@MxMMMMxMWWMMMMW@@@###\n"+
						 "@@@WWWWMMMM##+#+z#n+##+xMxzMWMn#xnzzz+,,:;znWzMnz+znnnxMWMMMxMxMWWWWMMW@@@###\n"+
						 "@@@@WWWWMMMnz#zz#+#+#+#z#+**##**+++*#;,,,:+#x###*ii*+#znxMxnzxxxWW@WWM@@@@###\n"+
						 "@@@@WWWWMMMxz##nz+#*i*++*ii;;ii*i;:z#;,,,:+zxn#+i;;*+#zznnz##nnxWWWWWM@@@@###\n"+
						 "@@@@@WWWMMMx#####+#**i*+ii;::;;;;:,++:,,,:+n#xz*;;i*+++##+*++nnMWMMWWM@@@@###\n"+
						 "@@@@@WWWWMMx#+++#++*ii**i;;;;:;;;:,*i:,.,:+n#nz*i;:;;i*+*;;*+xnMWMMWWM@@@@###\n"+
						 "@@@@@WWWWMMx#***#+++iii;:::,:::;:,;*;:,,,:+nzz#ii;;;;iii;;;i#nnMWMM@WW@@#####\n"+
						 "@@@@WWWWWMxxz*+*+#*#ii;:,,,:::::,,**:;:.,;+nnzz*;;;;;ii;;;i*nzxMWMW@M@@@#####\n"+
						 "@@@@WWWWMMxxn++*+#+*+i;:,,,,,,,,,i*;:;:.,;+nnz#z+;;:::;:;*#z#nxMWM@MW@@@@@###\n"+
						 "@@@@@@WWMMxxnz+++z+*i+i:,,,,,,,:i;*:::,.,;+nn##+*###++##z#++#nMWWWWMW@@@@@@##\n"+
						 "@@@@@@WWWMMxxn+*+z#*ii**i;;;;;:::*;:::,.,;+#nz#+*iii;iiii*++zxMWWWMM@@@@@@@@#\n"+
						 "@@@@@@@WWWMxxx#**z#*iiiiii;;:::;i:;:::,.,:i+nnz+i;;i*i**+##zxxMWWWMM@@@@@@###\n"+
						 "@@@@@@@@@WMMxxz#+z#+*iii*i;;;:,,,:::::,,,,i+nzz+i;:;iii**#nxxMMWWWMM@@@@@@###\n"+
						 "@@@@@@@@@WWMxxz#+##+*iii;::,,,.,:;:;:,,,,,;+n##z*;;;;ii*+zxMMMMWWWMW@@@@#####\n"+
						 "@@@@@@@@@WWMMxn#+#z#+*i;;:,,,.,,;;;;;,,,,:i#nnzx+i;;;ii*+nxMMMMWWMW@@@@@#####\n"+
						 "@@@@@@@@@WWMMxxn+###+**;;::,,,:;i;i*i::::;+nMxxMz*i;;i*+#xMMMMWWWWWW@@@@#####\n"+
						 "@@@@@@@@@WWWMMxxnn##+**i;:::,:;i::#xn#ii*+xW@WWMz#ii;;*#zxMMMMWWWWWW@@@@#####\n"+
						 "@@@@@@@@@@WWWMMxxxz#+***;;:::;i;,,inMxzznM@@@@@Wn#+*ii+#nMMxMMWWMWWWW@@@#####\n"+
						 "@@@@@@@@@@WWWMMMxxz#++**i;;::;;,,:;+++#MW@@##@@Wx##*i*+zxMxxMMMWMMWWW@@@#####\n"+
						 "@@@@@@@@@@@WWMMMxxz##+**i;;;;;:::;**###nxW@###@Wxz#+**#zxMxxMMMWMMWWWW@@@@@@@\n"+
						 "@@@@@@@@@@@WWMMMxxz##+*i*i;i:;:;**+#nz#xMMW@@@@WMnz#++#zxMxMMWMWMMMWWW@@@@@@@\n"+
						 "@@@@@@@@@@@WWMMxxxn##+ii*ii;;i*+zzznxxzxMMMWW@@WWMnnz##nxMxMMMMMxMMWWW@@@@@@@\n"+
						 "@@@@@@@@@@@WWMMxxxn##+*i+**;i##nnxnznznMMxnxMMMWMMxxMz#zxMnMWMWMMMWWWW@@@@@@@\n"+
						 "@@@@@@@@@@WWMMMxxxxz##*i*+ii##znnnxnnznMxxnxMMMMWMxMWWzzxMxMWMWMMMWWWWW@@@@@@\n"+
						 "@@@@@@@@@@WWMMMxxnxz##*i***+znxxnxxnnnMMxnxMMMMMWWWWW@xzxMnMWWWxMMMWW@W@@@@@@\n"+
						 "@@@@@@@@@WWWMMMxxxxn##*ii**nnxxMxMxxxWWMMnMMW@@WW@@@@@WnxMxMWMWxMMMWW@@@@@@@#\n"+
						 "@@@@@@@@@WWMMMMxxxxxz#+ii*+xMMWWWWWWWM@@@W@@@@###@@@@#@MxMxMWW@xxMMWW@@@@@@##\n"+
						 "@@@@@@@@WWWMMMMxxxxWx##*i*+MWWWMn#++*+zxz##zxMW@@@@@@@#WMMxMW@#MxMMW@@@@@@###\n"+
						 "@@W@@@@WWWMMMxxxxMWWWz#+i++xMMMz+*i;;;*++*++#nxMMMWMMW@WMMMWW##MxMW@@@@@@@###\n"+
						 "@WW@WWWWWMMMMxxxxWWW@Wz#*+#xMMniiiii*+z#z#z##nnxnnnMMx@WWMMW@##WMMWW@@@@@####\n"+
						 "WWWWWWWWMMMMxxxxMWW@@#Mz++zxWx#ii;i*+znnnznnnnnz###nnxWMWMW@@##@xMMW@@@@@####\n"+
						 "WWWWWWMMMxxxxxnnxWW@##Mn#+znMn+ii;i+#nMxxxnxMnz#####zxM@WM@####@xxMMW@@W@####\n"+
						 "WWWWWMMxxxxxxnnnxW@###Wnz+#xMn+*iii+zxWMMMMMMxz####zzxW@WW#####@MxMMMMWW@####\n"+
						 "WWWWMMxxxnnnnnznMW##@WMzn##MMxz+*ii+zMWWWWWWWMnz+##zznW@W@######WxMMMMMMWW@@#\n"+
						 "MMWMMxxnnnnnnnznMM#@nx*zzzxMxnz#+*i#nMMMMWWWWMxzzzzxMxWWW#######@MxxMMMMMMWW@\n"+
						 "MMMMMxxxxxxnnnxxMx@Mn*+nzzxxMxnzz**zxn#xxxMMWMWxxzzxWWW@@########@WMxMMMMMWWW\n"+
						 "MMMMxxnxxxxxxMxMWxMxz;#nzznWMMxnz#+#x#+nxnxMMMMMxxnMM@@@#########@#@WMMMMMWWW\n"+
						 "MMxxxxxxMMMWMMMMMMMM+izzzzzWWMnnnz#zz###nnxxMWW@MMxWW@@###########@@#@WWMMWW@\n"+
						 "MMxxxxMMMMMMWWWMWWxW#*zzzzzWWMnzxn#nn#z#nxnxxM@WMMM@W@@#############@@@@@W@@@\n"+
						 "MMMMMMMWMMWWMWWMWWxWn+zzz##x@@MxxxzxnznnnxxMMM@@WWMW@#############@@##@@@@@@@\n"+
						 "MMMMMMWMWWMMWMMWWWMMWznn###zM@WMxnMMxxMMMMMMWM@@@@WW@###############@####@@@@\n"+
						 "WMMMMMWWMWWWMWMWWMWMMMxxz###zM@WMMWWMMWM@WWW@W@@@W####################@@#@@@@\n"+
						 "WWMMMWMMWWWWMWMWWWWMMWMxn####zMW@W@WWW@@@@@@WW@##@#################@@###@@@@@\n"+
						 "WWWMMMWMWWMWMWWWMWMMMMWMnz###zzxMWW@@@@#@#@#@@######################@##@#@@W@\n");
		
	}
		
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		// Present the game
		printwalter();
		System.out.println("GOOSEMAN WANTS YOUR METH");
		System.out.println("YA GOTTA COOK");

		
		// Collect player info. (Name, character name)
		
		// Start the game
		String command = "";
		System.out.println("What's your move?");
		command = in.nextLine();
		
		// Keep looping as long as the magic word isn't entered
		while (!(command.equals("BITCH") || tumours >= 100))
		{	
			// Here's the game logic
			
			// Management of directions
			
			if(command.equalsIgnoreCase("R"))
			{
				System.out.println("'I'LL ADD RED PHOSPHORUS'");
				ingR +=1;
			}
			if(command.equalsIgnoreCase("C"))
			{
				System.out.println("'I'LL ADD CRYSTALIZED IODINE'");
				ingC +=1;
			}
			if(command.equalsIgnoreCase("S"))
			{
				System.out.println("'I'LL ADD SULFURIC ACID'");
				ingS +=1;
			}
			if(command.equalsIgnoreCase("M"))
			{
				System.out.println("'I'LL ADD METHYLAMINE'");
				ingM +=1;
			}
			
			tumours +=0.1;
			// This will decide what will happen when you move.
			int moveAction = probability();
			
			if (moveAction == 0 ){
				//gooseman
				tumours += 100;
				System.out.println("YOUR LAB EXPLODES :(");
			}
			else if(moveAction <= 10){
				//jesse
				tumours -= 5;
				System.out.println("JESSE ROLLS UP AND GIVES YOU SOME CHEMO :)");
			}
			else if(moveAction <= 15){
				//meth
				meth += 10;
			}
			else if(moveAction <= 18){
				//grave in the dessert
				int djup = probability(5)+1;
				tumours += djup;
				System.out.println("YOU FELL DOWN THE HOLE GOOSEMAN DUG AND YOU GAINED "+djup+" TUMOURS!");
					
			}
			System.out.println("CURRENT COOK: RED PHOSPHOROUS:"+ingR+", CRYSTALIZED IODINE:"+ingC+", SULFURIC ACID:"+ingS+", METHYLAMINE:"+ingM+"");
			System.out.println("tumours: "+tumours);
			
			System.out.println("What's your move?");
			command = in.nextLine();
			
		}
		System.out.println("BETTER CALL SAUL");
	}

}
