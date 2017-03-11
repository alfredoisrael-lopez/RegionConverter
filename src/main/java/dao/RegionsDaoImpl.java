package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;

import domain.Region;

public class RegionsDaoImpl implements RegionsDao {

	private final static String DS_NAME = "jdbc/regions";
	
	private final static String QRY_REGIONS = "SELECT REGION_ID, REGION_NAME " +
												"FROM REGIONS " + 
												"WHERE ZIP_CODE = ?";
	
	/* (non-Javadoc)
	 * @see dao.RegionsDao#getRegionByZipCode(java.lang.String)
	 */
	@Override
	public Region getRegionByZipCode(String zipCode) {
		
		Context context;
		Region region = new Region(0, "N/A");
		try {
			context = new InitialContext();
			DataSource dataSource = (DataSource) context.lookup(DS_NAME);
			Connection connection = dataSource.getConnection();
			PreparedStatement preparedStatement = connection.prepareStatement(QRY_REGIONS);
			preparedStatement.setString(1, zipCode);
			ResultSet resultSet = preparedStatement.executeQuery();
			
			if (resultSet.next()) {
				region = new Region(resultSet.getInt("REGION_ID"), resultSet.getString("REGION_NAME"));
			} 
			
			resultSet.close();
			preparedStatement.close();
			connection.close();
		} catch (NamingException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return region;
	}
}
