public class LimitObjectCreation {
    public static void main(String[] args) {
        LimitClass obj;
        
        for(int i = 1; i <= 20; i++) 
            obj = LimitClass.getInstance();
            
    }
}

class LimitClass {
      
    public static int objCount = 0; // count of alive instances in JVM
 
    /**
     * private constructor
     * increases the objCount static variable on every object creation
     */
    private LimitClass(){
        objCount++;
        System.out.println("instance " + objCount + " created");
    }
 
    /**
     * static factory method to return LimitClass instance
     * @return instance of LimitClass if not reached to threshold, else returns null
     */
    public static LimitClass getInstance() {
        if(objCount < 3 ){
            return new LimitClass();
        }
        System.out.println("Instance Limit reached. Can not create new Object");
        System.gc();
        return null;
    }
     
    /**
     * decreases the objCount static variable when JVM runs garbage collection
     * and destroys unused instances
     */
    @Override
    public void finalize()
    {
        System.out.println("Instance destroyed");
        objCount--;
    }
}