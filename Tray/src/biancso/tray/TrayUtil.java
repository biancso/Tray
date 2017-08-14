package biancso.tray;

import java.awt.Image;
import java.io.File;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileSystemView;

public class TrayUtil {

	public static Image getIco(File file) {
		return ((ImageIcon) FileSystemView.getFileSystemView().getSystemIcon(file)).getImage();
	}

	public static boolean msg_YesNo(String title, String content) {
		return JOptionPane.showConfirmDialog(null, content, title, JOptionPane.YES_NO_OPTION) == 0 ? true : false;
	}
}
