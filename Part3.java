	
/**
 *Assignment 1 - Part3 :: Problem Solving with Strings
 *NAKUL DEB NATH
 * 12-10-2017
 */
public class Part3
{
    public boolean twoOccurrences(String stringa, String stringb){
        
        int StartLocation = stringb.indexOf(stringa);
        
        if (StartLocation == -1){
            return false;
        }
        
        if (stringb.indexOf(stringa,StartLocation + 1) == -1){
            return false; 
        }
        
        return true;
    } 
    
    
    public void testing()
    {
        System.out.println("Test r   :: result " + twoOccurrences("r", "world of warcraft"));
        System.out.println("Test by  :: result " + twoOccurrences("by", "A story by Abby Long"));
        System.out.println("Test a   :: result " + twoOccurrences("a", "banana"));
        System.out.println("Test atg :: result " + twoOccurrences("atg", "ctgtatgta"));
    }

}