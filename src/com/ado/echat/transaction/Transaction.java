package com.ado.echat.transaction;

/**
 * �������ӿ�
 * @author Administrator
 *
 */
public interface Transaction {

	/**
	 * ������
	 */
	public  abstract  void begin();
	/**
	 * �����ύ
	 */
	public  abstract  void commit();
	/**
	 * ����ع�
	 */
	public  abstract  void rollback();
}
