package biancso.tray;

import java.awt.Image;
import java.io.File;

import javax.swing.ImageIcon;
import javax.swing.filechooser.FileSystemView;

public class TrayUtil {

	public static Image getIco(File file) {
		return ((ImageIcon) FileSystemView.getFileSystemView().getSystemIcon(file)).getImage();
	}
}
