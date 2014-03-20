package md5util;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class MD5Util {
	private final static String[] strDigits = { "0", "1", "2", "3", "4", "5",
			"6", "7", "8", "9", "a", "b", "c", "d", "e", "f" };

	public MD5Util() {
	}

	private static String byteToArrayString(byte bByte) {
		int iRet = bByte;
		if (iRet < 0) {
			iRet += 256;
		}
		int iD1 = iRet / 16;
		int iD2 = iRet % 16;
		return strDigits[iD1] + strDigits[iD2];
	}

	private static String byteToNum(byte bByte) {
		int iRet = bByte;
		System.out.println("iRet1=" + iRet);
		if (iRet < 0) {
			iRet += 256;
		}
		return String.valueOf(iRet);
	}

	private static String byteToString(byte[] bByte) {
		StringBuffer sBuffer = new StringBuffer();
		for (int i = 0; i < bByte.length; i++) {
			sBuffer.append(byteToArrayString(bByte[i]));
		}
		return sBuffer.toString();
	}

	public static String genMD5Code(String func, String sno, String year)
			throws NoSuchAlgorithmException {

		StringBuilder sb = new StringBuilder();
		sb.append(func).append("funcno=").append(func).append("&sno=")
				.append(sno).append("&syear=").append(year).append("A3ixoSisQ");

		MessageDigest md = MessageDigest.getInstance("MD5");

		return byteToString(md.digest(sb.toString().getBytes()));
	}

	public static String GetMD5Code(String strObj) {
		String resultString = null;
		try {
			strObj = "DC04funcno=DC01&sno=" + strObj + "A3ixoSisQ";
			resultString = new String(strObj);
			MessageDigest md = MessageDigest.getInstance("MD5");
			resultString = byteToString(md.digest(strObj.getBytes()));
		} catch (NoSuchAlgorithmException ex) {
			ex.printStackTrace();
		}
		return resultString;
	}

	public static void main(String[] args) throws Exception {

		String res = MD5Util.genMD5Code("DC04", "3080104864", "2010");
		//String res = MD5Util.GetMD5Code("3080104864");
		System.out.println("MD5加密结果为：" + res);

	}
}