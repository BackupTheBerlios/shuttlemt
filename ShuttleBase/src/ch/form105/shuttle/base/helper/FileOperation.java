package ch.form105.shuttle.base.helper;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

import org.apache.log4j.Logger;

public class FileOperation {

	private static final Logger log = Logger.getLogger(FileOperation.class);

	public static void copy(String src, String dest) {
		try {
			copy(new FileInputStream(src), new FileOutputStream(dest));
		} catch (IOException e) {
			log.error(e);
		}
	}

	private static void copy(InputStream fis, OutputStream fos) {
		try {
			byte buffer[] = new byte[0xffff];
			int nbytes;

			while ((nbytes = fis.read(buffer)) != -1)
				fos.write(buffer, 0, nbytes);
		} catch (IOException e) {
			log.error(e);
		} finally {
			if (fis != null)
				try {
					fis.close();
				} catch (IOException e) {
				}

			try {
				if (fos != null)
					fos.close();
			} catch (IOException e) {
			}
		}
	}

}
