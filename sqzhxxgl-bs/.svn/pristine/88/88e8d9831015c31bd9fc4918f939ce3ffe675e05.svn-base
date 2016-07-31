package com.gouhai.baoshan.test;

import java.net.MalformedURLException;
import java.rmi.RemoteException;

import javax.xml.namespace.QName;
import javax.xml.rpc.ParameterMode;
import javax.xml.rpc.ServiceException;

import org.apache.axis.client.Call;
import org.apache.axis.client.Service;
import org.apache.axis.encoding.XMLType;


public class testservice {
	
	/*String url = "http://222.247.53.205/drug/services/IEntUserService?wsdl";
	// 初始化WebService
	Service service = new Service();
	Call call = (Call) service.createCall();
	call.setTargetEndpointAddress(new java.net.URL(url));
	call.setOperationName(new QName("http://synchronization.hcsoft.com", "regEntUser"));
	call.addParameter("in0", XMLType.XSD_ANYTYPE, ParameterMode.IN);
	call.addParameter("in1", XMLType.XSD_ANY, ParameterMode.IN);
	call.setReturnType(XMLType.XSD_ANYTYPE);

	// 设置参数
	Object[] object = new Object[2];
	object[0] = "SY43010016";
	object[1] = "W12";
	// 执行WebService
	String returnStr = (String) call.invoke(object);
	System.out.println("kl");

} catch (MalformedURLException e) {
	e.printStackTrace();
} catch (RemoteException e) {
	e.printStackTrace();
} catch (ServiceException e) {
	e.printStackTrace();
}*/
	public static void main(String[] args) {
		try {
			String url = "http://sso.jiading.gov.cn/Framework.WebService.Latest/AuthenticationService.asmx?wsdl";
			// 初始化WebService
			//http://12.118.223.81/service/index?User=AAAAPgApADsATwAhAHEAmwA6AMwAVQDCACoA-gD1AG4A-wC3AOQAPgDiAE8ASgAdAOoA1gAFADIA3QBWABIASwBYAGwA5AA7AJIA8wBhAPgAnACAALQAOQAgAEsAnwB8AE0AdgC4AKEAGAAWALEAoQDQACoACQDEAEIAZgC6ACEArwATALQAcQBHAEMAvgDiAGgAZwAeAMUAlwAaAHwAsgDOANAAwwDqALQArQDxALEAhwCWAF0AWwBxAOkAlACXAEEAmAAyAIYAagDxAOAAMgCYAOMA3gDhAF8AUAATAM8A6QB7AK8AnwBhAEEAXwCkAFAAtwCPAFcAzwClAA0AsACAAM4AZQArANwAcgBeAKQAnADYAOkAgwByAP4AwADYAA4AcADTAIkAYgAnAIoAEg!!&ReturnUrl=http://12.118.223.81/service/index
			Service service = new Service();
			Call call = (Call) service.createCall();
			call.setTargetEndpointAddress(new java.net.URL(url));
			call.setOperationName(new QName("http://wsaf.wicresoft.com/", "DecryptUserID"));
			call.addParameter("EncryptUserID", XMLType.XSD_STRING, ParameterMode.IN);
			call.addParameter("ApplicationID", XMLType.XSD_STRING, ParameterMode.IN);
			call.setReturnType(XMLType.XSD_ANYTYPE);

			// 设置参数 
			Object[] object = new Object[2];
			object[0] = "AAAAPgApADsATwAhAHEAmwA6AMwAVQDCACoA-gD1AG4A-wC3AOQAPgDiAE8ASgAdAOoA1gAFADIA3QBWABIASwBYAGwA5AA7AJIA8wBhAPgAnACAALQAOQAgAEsAnwB8AE0AdgC4AKEAGAAWALEAoQDQACoACQDEAEIAZgC6ACEArwATALQAcQBHAEMAvgDiAGgAZwAeAMUAlwAaAHwAsgDOANAAwwDqALQArQDxALEAhwCWAF0AWwBxAOkAlACXAEEAmAAyAIYAagDxAOAAMgCYAOMA3gDhAF8AUAATAM8A6QB7AK8AnwBhAEEAXwCkAFAAtwCPAFcAzwClAA0AsACAAM4AZQArANwAcgBeAKQAnADYAOkAgwByAP4AwADYAA4AcADTAIkAYgAnAIoAEg!!";
			object[1] = "0d4872c7-90d4-40ed-94ab-5102c8c1fcfc";
			// 执行WebService
			String returnStr = (String) call.invoke(object);
	
			System.err.println("结果："+returnStr);
		} catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (RemoteException e) {
			e.printStackTrace();
		} catch (ServiceException e) {
			e.printStackTrace();
		}
		
		
	}

}
