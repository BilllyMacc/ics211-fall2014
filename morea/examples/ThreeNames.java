/**
* A class that stores first, middle & last name
* @author William McDaniel Albritton
*/
    public class ThreeNames extends Name{
   
   //data fields 	 
   //last & first are inherited from class Name
      private String middle;
   
   /** Constructor
   * @param aFirst is the first name	 
   * @param aMiddle is the middle name	
   * @param aLast is the last name */   
       public ThreeNames(String aFirst, String aMiddle, String aLast){
       //must first called the superclass's constructor when using inheritance
       //"super" is the constructor for the superclass (class Name)
         super(aFirst, aLast);
         middle = aMiddle;
      }
   
   /**Automatically called by println() or print() method!
   * @return a String in "first last" format */
       public String toString(){
       //call the superclass's toString() method
       //and add on the middle name
       //syntax: super.method()
         String fullName = super.toString() + " " + middle;
         return fullName;
      } 
   
   /**Used to Display The Initials.
   * @return The Initials For Someone's Name. */
       public String initials(){
       //Create a Local VAriable For Initials.
         String theInitials = 
            first.substring(0, 1) + ". " +
            middle.substring(0, 1) + ". " +
            last.substring(0, 1) + ".";
         return theInitials;
      }
   	
   /** Accessor method
   * @return a middle name */
       public String getMiddleName(){
         return middle;
      }			   	
   
   /** Mutator method
   * @param theMiddle is the middle name */	
       public void setMiddleName(String theMiddle){
         middle = theMiddle;
      }				
          
   /** Methods getFirstName, getLastName, setFirstName, setLastName 
   * are inherited from the superclass (class Name), 
   * so we do NOT need to rewrite them in the subclass */
   	 
   }//end of class
   
	
	
