package nz.ac.aut.hss.card.client;

import javacard.framework.UserException;
import javacard.security.AESKey;

import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 * @author Martin Schrimpf
 * @created 30.09.2014
 */
public interface RemoteObject extends Remote {
	/**
	 * @return -1 if the pin entered is correct, the amount of tries remaining otherwise
	 */
	public short checkPIN(byte[] pinBytes) throws RemoteException, UserException;

	public byte[] getPublicKeyBytes() throws RemoteException, UserException;

	public void setSecretKey(AESKey key) throws RemoteException, UserException;
}
