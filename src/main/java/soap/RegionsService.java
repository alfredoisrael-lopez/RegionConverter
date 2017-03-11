package soap;

import dao.RegionsDao;
import dao.RegionsDaoImpl;
import domain.Region;

public class RegionsService {

	RegionsDao dao = new RegionsDaoImpl();
	public Region getRegionByZipCode(String zipCode) {
		return dao.getRegionByZipCode(zipCode);
	}
}
