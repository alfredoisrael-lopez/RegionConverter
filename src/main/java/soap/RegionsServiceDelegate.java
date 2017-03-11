package soap;

import dao.RegionsDao;
import dao.RegionsDaoImpl;
import domain.Region;
import javax.jws.WebService;


@WebService (targetNamespace="http://soap/", serviceName="RegionsServiceService", portName="RegionsServicePort")
public class RegionsServiceDelegate{

    soap.RegionsService _regionsService = null;

    public Region getRegionByZipCode (String zipCode) {
        return _regionsService.getRegionByZipCode(zipCode);
    }

    public RegionsServiceDelegate() {
        _regionsService = new soap.RegionsService(); }

}