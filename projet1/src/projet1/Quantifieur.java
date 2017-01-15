package projet1;

public class Quantifieur {
	int nbDeNiveaux;
	static int PLAGE = 256;
	
	public Quantifieur(int i) {
		nbDeNiveaux=i;
	}

	public byte[] run(byte[] in) {
		byte[] out = new byte[in.length];
		for (int i = 0; i < in.length; i++) {
			System.out.print("|");
			for (int j = 0; j < nbDeNiveaux; j++) {
				int e0=in[i];
				int t0=(-128+(j)*PLAGE/nbDeNiveaux);
				int t1=(-128+(j+1)*PLAGE/nbDeNiveaux);
				if((e0>=t0)&&(e0<t1)){
					out[i]=(byte) ((t0+t1)/2);
					System.out.print("[]");
				}else{System.out.print("--");}
			}
			System.out.print("| ");
			System.out.printf("%4s ", Byte.toString(in[i]));
			System.out.printf("%4s \n", Byte.toString(out[i]));
		}
		return out;
	}
}
