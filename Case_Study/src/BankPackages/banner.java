package BankPackages;

public class banner {
	
	public static void banner() {
		// An array of strings representing the bank logo, with each line as an element of the array.
		String[] logo = {
				"          ||=====================================================================================================================||",
				"          ||              JJJJJJJJJJJ                BBBBBBBBBBBBBBBBB                                       kkkkkkk             ||",
				"          ||              J:::::::::J                B::::::::::::::::B                                      k:::::k             ||",
				"          ||              J:::::::::J                B::::::BBBBBB:::::B                                     k:::::k             ||",
				"          ||              JJ:::::::JJ                BB:::::B     B:::::B                                    k:::::k             ||",
				"          ||                J:::::J  aaaaaaaaaaaaa     B::::B     B:::::B  aaaaaaaaaaaaa  nnnn  nnnnnnnn     k:::::k    kkkkkkk  ||",
				"          ||                J:::::J  a::::::::::::a    B::::B     B:::::B  a::::::::::::a n:::nn::::::::nn   k:::::k   k:::::k   ||",
				"          ||                J:::::J  aaaaaaaaa:::::a   B::::BBBBBB:::::B   aaaaaaaaa:::::an::::::::::::::nn  k:::::k  k:::::k    ||",
				"          ||                J:::::j           a::::a   B:::::::::::::BB             a::::ann:::::::::::::::n k:::::k k:::::k     ||",
				"          ||                J:::::J    aaaaaaa:::::a   B::::BBBBBB:::::B     aaaaaaa:::::a  n:::::nnnn:::::n k::::::k:::::k      ||",
				"          ||    JJJJJJJ     J:::::J  aa::::::::::::a   B::::B     B:::::B  aa::::::::::::a  n::::n    n::::n k:::::::::::k       ||",
				"          ||    J:::::J     J:::::J a::::aaaa::::::a   B::::B     B:::::B a::::aaaa::::::a  n::::n    n::::n k:::::::::::k       ||",
				"          ||    J::::::J   J::::::Ja::::a    a:::::a   B::::B     B:::::Ba::::a    a:::::a  n::::n    n::::n k::::::k:::::k      ||",
				"          ||    J:::::::JJJ:::::::Ja::::a    a:::::a BB:::::BBBBBB::::::Ba::::a    a:::::a  n::::n    n::::nk::::::k k:::::k     ||",
				"          ||     JJ:::::::::::::JJ a:::::aaaa::::::a B:::::::::::::::::B a:::::aaaa::::::a  n::::n    n::::nk::::::k  k:::::k    ||",
				"          ||       JJ:::::::::JJ    a::::::::::aa:::aB::::::::::::::::B   a::::::::::aa:::a n::::n    n::::nk::::::k   k:::::k   ||",
				"          ||        JJJJJJJJJ       aaaaaaaaaa  aaaaBBBBBBBBBBBBBBBBB     aaaaaaaaaa  aaaa nnnnnn    nnnnnnkkkkkkkk    kkkkkkk   ||",
				"          ||=====================================================================================================================||"
				};

		// calculate the width of the banner
		int width = logo[0].length();
		// Iterate over each line in the logo array
	    for (String line : logo) {
	        int padding = (width - line.length()) / 2;
	        String paddedLine = String.format("%" + (padding + line.length()) + "s", line);
	        System.out.println(paddedLine);
	    }
	 // Print three blank lines after the logo
	    System.out.println("\n\n\n");
	       
	}
	
	public static void scanCard() {
		System.out.println();
		System.out.println("========================");
		System.out.println("||   Scan your Card   ||");
		System.out.println("========================");
		System.out.println();
	}
	
	public static void loginBanner() {
		System.out.println();
		System.out.println("                    \033[0;32m"+"+======================================+");
		System.out.println( "                    +               Login                  +");
		System.out.println("                    +======================================+"+ "\033[0m");
		System.out.println();
	}
	
	public static void createAccountBanner(){
		System.out.println();
		System.out.println("                    \033[0;32m"+"+======================================+");
		System.out.println("                    +         Create an Account            +");
		System.out.println("                    +======================================+"+ "\033[0m");
		System.out.println();
	}
	
	public static void accountManageBanner() {
		if(login.accountName == null) {
			accountManage.name = createAccount.getTempName();
		}else {
			accountManage.name = login.accountName;
		}
		

		
		System.out.println();
		System.out.println("                    \033[0;32m"+"+======================================+");
		System.out.println("                               Welcome  "+ accountManage.name +"              ");
		System.out.println("                    +======================================+"+ "\033[0m");
		System.out.println();
	}

}
