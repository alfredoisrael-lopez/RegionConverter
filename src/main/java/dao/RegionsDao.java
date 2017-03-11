package dao;

import domain.Region;

public interface RegionsDao {

	Region getRegionByZipCode(String zipCode);

}