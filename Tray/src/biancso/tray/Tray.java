package biancso.tray;

import java.awt.AWTException;
import java.awt.Image;
import java.awt.MenuItem;
import java.awt.PopupMenu;
import java.awt.SystemTray;
import java.awt.TrayIcon;
import java.awt.TrayIcon.MessageType;
import java.awt.event.ActionListener;

public class Tray {
	private static TrayIcon tray;

	private Tray() {

	}

	private static class Instance {
		private static final Tray tray = new Tray();
	}

	public static Tray getInstance() {
		return Instance.tray;
	}

	// INIT
	public void init(Image image) throws AWTException {
		init(image, "", new PopupMenu());
	}

	public void init(Image image, String tooltip) throws AWTException {
		init(image, tooltip, new PopupMenu());
	}

	public void init(Image image, String tooltip, PopupMenu popup) throws AWTException {
		tray = new TrayIcon(image, tooltip, popup);
		SystemTray.getSystemTray().add(tray);
	}

	public void setPopupMenu(PopupMenu popmnu) {
		tray.setPopupMenu(popmnu);
	}

	public PopupMenu getPopupMenu() {
		return tray.getPopupMenu();
	}

	public void dispatchMessage(String title, String content, MessageType messagetype) {
		tray.displayMessage(title, content, messagetype);
	}

	public void addMenuItem(MenuItem mnuItem) {
		tray.getPopupMenu().add(mnuItem);
	}

	public void setMenuItem(MenuItem mnuItem, int i) {
		getPopupMenu().insert(mnuItem, i);
	}

	public MenuItem getMenuItem(int i) {
		return getPopupMenu().getItem(i);
	}

	public void addSeparator() {
		getPopupMenu().addSeparator();
	}

	public void setSeparator(int i) {
		getPopupMenu().insertSeparator(i);
	}

	public void removeSeparator(int i) {
		getPopupMenu().remove(i);
	}

	public void attachActionListener(ActionListener l) {
		getPopupMenu().addActionListener(l);
	}

	public void detachActionListener(ActionListener l) {
		getPopupMenu().removeActionListener(l);
	}

	public void attachActionListener(ActionListener l, MenuItem mnuItem) {

	}

	public void exitTray() {
		SystemTray.getSystemTray().remove(tray);
	}
}