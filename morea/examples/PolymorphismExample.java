/**
* Polymorphism Example Using Classes Name & ThreeNames.
* @author William McDaniel Albritton
*/
    public class PolymorphismExample{
    
   /** Method "main()" Is Used To Test The Methods of Class Name. 
   * @param argumentS Is Not Used.*/    
       public static void main(String[] argumentS) {  
      //Can Use 1 variable from The SuperClass to Call Methods.
      //Of Both the SuperClass & SubClass.
      //Syntax: SuperClass variableName1 = new SuperClass();
      //Syntax: SuperClass variableName1 = new SubClass();
         Name name1 = new Name("Fujiko", "Tanonaka");
			System.out.print(name1.toString() + "\'s initials are ");
         System.out.println(name1.initials());  
         name1 = new ThreeNames("Jeff", "Masao", "Tanonaka");
			System.out.print(name1.toString() + "\'s initials are ");
         System.out.println(name1.initials());	
      }//End of Method.
     
   }//End of Class.
	
	
	
	
	