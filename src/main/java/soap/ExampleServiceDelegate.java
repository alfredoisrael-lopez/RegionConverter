package soap;

import javax.jws.WebService;


@WebService (targetNamespace="http://soap/", serviceName="ExampleServiceService", portName="ExampleServicePort")
public class ExampleServiceDelegate{

    soap.ExampleService _exampleService = null;

    public String getTextMessage (String name) {
        return _exampleService.getTextMessage(name);
    }

    public ExampleServiceDelegate() {
        _exampleService = new soap.ExampleService(); }

}