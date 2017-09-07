package scjp;

public class EagerInitializationSingleton {
	private static EagerInitializationSingleton instance;
	
	private EagerInitializationSingleton(){}
	
	//EagerInitialization - 
	//private static EagerInitializationSingleton Instance = new EagerInitializationSingleton();
		/*public static EagerInitializationSingleton getInstance() {
		return Instance;
	}*/
	
	//static block initialization for exception handling
    static{
        try{
            instance = new EagerInitializationSingleton();
        }catch(Exception e){
            throw new RuntimeException("Exception occured in creating singleton instance");
        }

}
}
