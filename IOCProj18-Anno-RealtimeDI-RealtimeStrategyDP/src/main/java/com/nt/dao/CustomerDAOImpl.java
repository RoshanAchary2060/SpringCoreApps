package com.nt.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.nt.bo.CustomerBO;

@Repository("custOraDAO")
public final class CustomerDAOImpl implements ICustomerDAO {
	private static final String REALTIMEDI_CUSTOMER_INSERT_QUERY = "INSERT INTO REALTIMEDI_CUSTOMER VALUES(CUSTID_SEQ.NEXTVAL,?,?,?,?,?,?)";

	@Autowired
	private DataSource ds;

	@Override
	public int insert(CustomerBO bo) throws Exception {
		Connection conn = null;
		PreparedStatement ps = null;
		int count = 0;
		try {
			// get pooled jdbc conn object
			conn = ds.getConnection();
			// create PreparedStatement object having pre-compiled SQL query
			ps = conn.prepareStatement(REALTIMEDI_CUSTOMER_INSERT_QUERY);
			// set query param values
			ps.setString(1, bo.getCustName());
			ps.setString(2, bo.getCustAddrs());
			ps.setFloat(3, bo.getPamt());
			ps.setFloat(4, bo.getTime());
			ps.setFloat(5, bo.getRate());
			ps.setFloat(6, bo.getInterestamount());
			// execute the query
			count = ps.executeUpdate();
		} catch (SQLException ex) {
			ex.printStackTrace();
			throw ex; // Exception rethrowing
		} catch (Exception ex) {
			ex.printStackTrace();
			throw ex;
		} finally {
			// close jdbc obj
			if (ps != null) {
				try {
					ps.close();
				} catch (SQLException ex) {
					ex.printStackTrace();
					throw ex;
				}
			}
			if (conn != null) {
				try {
					conn.close();
				} catch (SQLException ex) {
					ex.printStackTrace();
					throw ex;
				}
			}
		}
		return count;
	}

}
