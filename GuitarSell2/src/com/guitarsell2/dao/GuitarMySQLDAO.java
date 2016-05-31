package com.guitarsell2.dao;

import java.sql.Connection;

import com.guitarsell2.model.*;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;



public class GuitarMySQLDAO implements GuitarDAO {
	
	public List<Guitar> getGuitars(){
		Connection conn = DB.getConn();
		Statement stmt = DB.getStatement(conn);
		String sql = "select * from guitar";
		ResultSet rs = DB.getResultSet(stmt, sql);
		List<Guitar> guitars = new ArrayList<Guitar>();
		try {
			while (rs.next()) {
				Guitar g = getGuitarFromRs(rs);
				guitars.add(g);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DB.close(stmt);
			DB.close(rs);
			DB.close(conn);
		}

		return guitars;
	}
	private Guitar getGuitarFromRs(ResultSet rs) {
		Guitar g = null;
		try {
			g = new Guitar();
			g.setSerialNumber(rs.getInt("serialNumber"));
			
			g.getSpec().setBuilder(Enum.valueOf(Builder.class, rs.getString("builder")));
			g.getSpec().setNumStrings(rs.getInt("numstrings"));
			g.setPrice(rs.getDouble("price"));
			g.getSpec().setModel(rs.getString("model"));
			g.getSpec().setType(Enum.valueOf(Type.class, rs.getString("type")));
			g.getSpec().setBackWood(Enum.valueOf(Wood.class, rs.getString("backWood")));
			g.getSpec().setTopWood(Enum.valueOf(Wood.class, rs.getString("topWood")));
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return g;
	}
}
