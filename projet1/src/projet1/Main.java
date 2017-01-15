package projet1;

import java.io.ByteArrayInputStream;

public class Main {

	public static void main(String[] args) {
		SoundPlayer player = new SoundPlayer("C://Dev/WS/Multimedia/projet1/src/xtine_8kechps_16bits.wav");		
		//DataInput di = new DataInput();

		// Nb Niveaux = 2   <=> Nb de bits = 1
		// Nb Niveaux = 4   <=> Nb de bits = 2
		// Nb Niveaux = 8   <=> Nb de bits = 3
		// Nb Niveaux = 16  <=> Nb de bits = 4
		// Nb Niveaux = 32  <=> Nb de bits = 5
		// Nb Niveaux = 64  <=> Nb de bits = 6
		// Nb Niveaux = 128 <=> Nb de bits = 7
		// Nb Niveaux = 256 <=> Nb de bits = 8
		// Nb Niveaux = 65536 <=> Nb de bits = 16
		
		//Question 6 : encodage differentiel
		//player.delta_encode();
		//player.delta_encode();
		player.simulateLoss();
		Quantifieur q = new Quantifieur(32);
		ByteArrayInputStream stream = new ByteArrayInputStream(q.run(player.getSamples()));
		player.play(stream);
		
		/*byte[] B = player.getSamples();
		byte maxB =0;
		byte minB =0;
		
		for (int i = 0; i < B.length; i++) {	
			maxB=(byte) Math.max(maxB, B[i]);
			minB=(byte) Math.min(minB, B[i]);
		}
		System.out.println(minB+" "+maxB);
		
		byte[] b = di.toByteArray();
		byte maxb =0;
		byte minb =0;
		
		for (int i = 0; i < b.length; i++) {	
			maxb=(byte) Math.max(maxb, b[i]);
			minb=(byte) Math.min(minb, b[i]);
		}
		System.out.println(minb+" "+maxb);
		
		Float[] f = di.toFloatArray();
		Float maxf =0f;
		Float minf =0f;
		
		for (int i = 0; i < f.length; i++) {	
			maxf=(Float) Math.max(maxf, f[i]);
			minf=(Float) Math.min(minf, f[i]);
		}
		System.out.println(minf+" "+maxf);*/
		
		// Question 5

		//byte[] B = player.getSamples();
		//byte maxB =0;
		//for (int i = 1; i < B.length; i++) {	
		//	maxB=(byte) Math.max(maxB, Math.abs(B[i]-B[i-1]));
		//}
		//System.out.println(maxB);
	}
}
