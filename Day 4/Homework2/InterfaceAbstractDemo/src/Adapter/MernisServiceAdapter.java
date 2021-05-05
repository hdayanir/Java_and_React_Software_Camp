package Adapter;






import Abstract.CustomerCheckService;
import Entities.Customer;
import tr.gov.nvi.tckimlik.WS.*;



public class MernisServiceAdapter implements CustomerCheckService{

	
		
	@Override
	public boolean checkIfRealPerson(Customer customer) {
		
		KPSPublicSoapProxy client = new KPSPublicSoapProxy(); 
			return client.TCKimlikNoDogrula(customer.getNationalyid(), customer.getFirstName(), 
					customer.getLastName(), customer.getDateOfBirth()); 
			
	}
}

