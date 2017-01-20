package Auto;

public class AutoPolicyTest {

	public static void main(String[] args){
		
		AutoPolicy policy1 = new AutoPolicy(111111, "Toyota Camry", "MA");
		//AutoPolicy policy2 = new AutoPolicy(323333, "Ford Fusion", "DE");
		
		policyInNoFaultState(policy1);
		//policyInNoFaultState(policy2);

	}

	private static void policyInNoFaultState(AutoPolicy policy) {
		System.out.println("The Auto Policy is: ");
		System.out.printf("Account #: Car: %s; State %s %s a no fault state%n%n", policy.getAccountNumber(), policy.getState(), policy.getMakeAndModel(),
				(policy.isNoFaultState() ? "is" : "is not" ));
		
	}

}
