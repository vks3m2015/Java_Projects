package lambdaExp;

public class MethodReference {

	
	public static void logAction(String actionName){
		System.out.println("prforming actionName : "+ actionName);
	}
	
	public void logSecondaryAction(String actionName){
		System.out.println("performing Secondary actionName : "+ actionName);
	}
	
	public void startMethod(){
		System.out.println(" starting method of new thread..."+ this);
	}
	
	public static void main(String[] args) {
		
		MethodReference mf = new MethodReference();
		
		ActionFunctionalInterface driving = (actionName) -> logAction(actionName);
		
		//Using Method Reference //static method
		ActionFunctionalInterface running =   MethodReference :: logAction;   //(actionName) -> logAction(actionName);
		
		//non static method
		ActionFunctionalInterface talking =   mf :: logSecondaryAction;
		
		Runnable r = mf :: startMethod;
		 
		driving.performAction("Driving");
		running.performAction("Running");
		talking.performAction("Talking");
		
		Thread t = new Thread(r);
		t.start();
		
	}
}

interface ActionFunctionalInterface{
	public void performAction( String actionName);
}