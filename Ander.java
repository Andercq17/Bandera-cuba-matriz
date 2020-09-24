public class Ander{
	public static void main(String[] args) {

		char matriz[][];
		matriz = new char[10][20];
		int a=0;

		for(int i=0;i<2 ;i++){
			for(int j=0;j<matriz[0].length;j++){matriz[i][j] = 'A';}
		}
		for (int i=2;i<4 ;i++ ) {
			for (int j=0;j<matriz[0].length;j++ ) {
		 		matriz[i][j] = 'B';
		 	}
		 }
		 for (int i=4;i<6 ;i++ ) {

		 	for (int j=0;j<matriz[0].length;j++ ) {
		 		matriz[i][j] = 'C';
		 	}
		 	
		 }
		 for (int i=6;i<8 ;i++ ) {

		 	for (int j=0;j<matriz[0].length;j++ ) {
		 		matriz[i][j] = 'D';
		 	}
		 	
		 }
		 for (int i=8;i<10 ;i++ ) {

		 	for (int j=0;j<matriz[0].length;j++ ) {
		 		matriz[i][j] = 'E';
		 	}
		 	
		 }

	
			

			
				



			for (int i=0;i<matriz.length ;i++ ) {

				for (a=0;a<8 ;a++ ) {
					
					System.out.print(ConsoleColors.RED_BACKGROUND+" ");
				

						if (i==5&&a==4) {
						
						System.out.print(ConsoleColors.WHITE_BOLD+">");
						System.out.print(ConsoleColors.RED_BACKGROUND+"        ");

					}
					if (i==5&&a==1) {

						
						System.out.print(ConsoleColors.WHITE_BOLD+"<");
						
					}
					if (i==3&&a==7) {
						System.out.print(ConsoleColors.RED_BACKGROUND+"      ");
						System.out.print(ConsoleColors.WHITE_BACKGROUND+"    ");
					}
					if (i==2&&a==7) {
						System.out.print(ConsoleColors.RED_BACKGROUND+"     ");
						System.out.print(ConsoleColors.WHITE_BACKGROUND+"     ");
					}
					if (i==1&&a==7) {

						System.out.print(ConsoleColors.RED_BACKGROUND+"   ");
						System.out.print(ConsoleColors.BLUE_BACKGROUND+"       ");

					}
					if (i==0&&a==7) {
						System.out.print(ConsoleColors.BLUE_BACKGROUND+"          ");

					}
					if (i==4&&a==3) {
						System.out.print(ConsoleColors.WHITE_BOLD+"^");
						System.out.print(ConsoleColors.RED_BACKGROUND+"       ");
					}
					if (i==4&&a==7) {

						System.out.print(ConsoleColors.BLUE_BACKGROUND+"  ");
					}
					if (i==6&&a==3) {
						System.out.print(ConsoleColors.WHITE_BOLD+"v");
						System.out.print(ConsoleColors.RED_BACKGROUND+"       ");


					}
					if (i==6&&a==7) {
						System.out.print(ConsoleColors.WHITE_BACKGROUND+"  ");
						
					}
					if (i==7&&a==7) {
						System.out.print(ConsoleColors.RED_BACKGROUND+"     ");
						System.out.print(ConsoleColors.WHITE_BACKGROUND+"     ");

					}
					if (i==8&&a==7) {

						System.out.print(ConsoleColors.RED_BACKGROUND+"   ");						
						System.out.print(ConsoleColors.BLUE_BACKGROUND+"       ");

					}
					if (i==9&&a==7) {

						System.out.print(ConsoleColors.RED_BACKGROUND+"  ");
						System.out.print(ConsoleColors.BLUE_BACKGROUND+"        ");


					}
					if (i==10&&a==3) {

						System.out.print(ConsoleColors.RED_BACKGROUND+" ");
						

					}



				}
			for (int j=0;j<matriz[0].length ;j++ ) {
			
						if (matriz[i][j]=='A') {System.out.print(ConsoleColors.BLUE_BACKGROUND+"  ");}				
						if (matriz[i][j]=='B') {System.out.print(ConsoleColors.WHITE_BACKGROUND+"  ");}
						if (matriz[i][j]=='C') {System.out.print(ConsoleColors.BLUE_BACKGROUND+"  ");}
						if (matriz[i][j]=='D') {System.out.print(ConsoleColors.WHITE_BACKGROUND+"  ");}
						if (matriz[i][j]=='E') {System.out.print(ConsoleColors.BLUE_BACKGROUND+"  ");}
			
			}
		System.out.println(ConsoleColors.RESET);
	 }

}
}
	


	