package projet1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DataInput {
	List<Float> byteList;

	public DataInput() {

		File file = new File("C:/Dev/WS/Multimedia/projet1/src/xtine.dat");
		byteList = new ArrayList<>();
		
		try {
			BufferedReader br = new BufferedReader(new FileReader(file));
			String thisLine = null;
			int i = 0;
			while ((thisLine = br.readLine()) != null) {
				String str = thisLine.substring(0,thisLine.length() - 4);
				String str2 = thisLine.substring(thisLine.length() - 3);
				Float f1 = Float.valueOf(str);
				Float f2 = Float.valueOf(str2);
				Float res = (float) (f1*Math.pow(10, f2));
				byteList.add(res);
				i++;
			}
			br.close();
		} catch (FileNotFoundException fe) {
			System.out.println("FileNotFoundException : " + fe);
		} catch (IOException ioe) {
			System.out.println("IOException : " + ioe);
		}
	}
	
	public byte[] toByteArray() {
		byte[] ret = new byte[byteList.size()];
		for (int i = 0; i < ret.length; i++) {
			ret[i] = (byte) (byteList.get(i)*125);
		}
		return ret;
	}

	public Float[] toFloatArray() {
		Float[] ret = new Float[byteList.size()];
		for (int i = 0; i < ret.length; i++) {
			ret[i] = byteList.get(i);
		}
		return ret;
	}
}