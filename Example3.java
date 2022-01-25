

public class Example3 {
    public class Test   
{   
    public static void main(String arg[])   
    {   
       String modCode = "1009";

        switch(modCode)   
        {   
            case "1010":   
                System.out.println("CSC1010-Computer Networks"); 
                break;   
            case "1009":   
                System.out.println("CSC1009-Object Oriented Programming"); 
                break;   
            case "1008":   
                System.out.println("CSC1008-Data Structures and Algorithms"); 
                break;   
            case "1007":   
                System.out.println("CSC1007-Operating Systems"); 
                break; 
            case "1006":   
                System.out.println("CSC1006-Mathematics 2"); 
                break;   
            default:    
                System.out.println("Unknown Module"); 
                break;   
        }   
        System.out.println("After switch");   
        
    }   
}  


    
}
