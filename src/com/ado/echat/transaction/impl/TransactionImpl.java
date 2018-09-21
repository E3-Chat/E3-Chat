package com.ado.echat.transaction.impl;

import java.sql.Connection;
import java.sql.SQLException;

import com.ado.echat.transaction.Transaction;
import com.ado.echat.util.JDBCUntil;


public class TransactionImpl  implements Transaction{

	/**
	 * ������
	 */
	@Override
	public void begin() {
		Connection connection;
		try {
			connection=JDBCUntil.getConnection();
			connection.setAutoCommit(false); //falseΪ��ֹ�Զ��ύ
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	/**
	 * �����ύ
	 */
	 
	@Override
	public void commit() {
		Connection connection;
		try {
			connection = JDBCUntil.getConnection();
			connection.commit();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
    /**
     * ����ع�
     */
	@Override
	public void rollback() {
		Connection connection;
		try {
			connection = JDBCUntil.getConnection();
			connection.rollback();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
