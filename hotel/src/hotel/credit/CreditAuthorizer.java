package hotel.credit;

public class CreditAuthorizer implements ICreditAuthorizer {
	
	private static CreditAuthorizer self;
	
	public static synchronized CreditAuthorizer getInstance() {
		if (self == null) {
			self = new CreditAuthorizer();
		}
		return self;
		
	}


	@Override
	public boolean authorize(ICreditCard card, double amount) {
	
            System.out.println("Card number :" +card.getNumber());
            if (card.getNumber() <= 5) {
			return true;
		}
		return false;
	}

}
