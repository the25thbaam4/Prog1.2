
public class GeschachtelteSchleifen {

	public static void main(String[]args) {

		for (int x = 0; x <= 36; x++) {

			for (int y = 0; y <= 36; y++) {
				for (int z = 0; z <= 36; z++) {
					
					if(x<=y&&y<=z) {
						if (x*y*z==36) {
							
							
							System.out.println(x+" "+ y +" "+z);
							
						}
											
					}
								
				}

			}
		}

	}

}











