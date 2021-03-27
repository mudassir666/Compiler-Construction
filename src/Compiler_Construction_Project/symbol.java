/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mudassir;

/**
 *
 * @author Lenovo
 */
public class symbol {
    
  /*
    int no ;
    String stri;
    
    
    public void mas(int i, String s) {
    
       this.no = i;
       this.stri = s;
        
} 
    public String getString(){

return stri;
}
    
    public int getnumber(){

return no;
}
    */
    
   // public String[] vegetables;
    public String[] dt;
    public String[] stri;
    public int[] no;
    public String[] variable;
    public int[] line_no;
    int SAR;
    int projectline;
       public void sar(int i) {
    
       this.SAR = i;
     
} 
    public int getSAR(){

return SAR;
}
    
  public void setprojectliness(int i) {
    
       this.projectline = i;
     
}     
    
  public int getprojectlinees(){

return projectline;
}
  
  
//public void setVegetables( String vegetables[] ) {  
//    this.vegetables = vegetables;
//}

public void mas( int i[],String s[] ) {  
    this.stri = s;
    this.no = i;
}

public void setdata( int linenumber[],String datatype[] ,String variable[] ) {  
   
    this.line_no = linenumber;
    this.dt=datatype;
    this.variable = variable;
}

//public String[] getVegetables() {  
//    return vegetables;
//}

    public String[] getString(){

return stri;
}
    
    public int[] getnumber(){

return no;
}
    
    
    
    public void show (){
        
        
        System.out.println("                              GRAMMER        ");
        System.out.println(" ");
        System.out.println("E  => E");  
        System.out.println("E  => E+T |   "); 
        System.out.println("T  => T*F | F"); 
        System.out.println("F  => (E) | id"); 
        
        System.out.println("");
    
     System.out.println("********************************************************************");
     System.out.println("                                                                     ");
     System.out.println("                        PARSING TABLE                                 ");
        int o=0;
        System.out.println("state        action                   ");    
      //  System.out.println(no[o]+"          "+stri[0]//+getnumber()+" "+getString()
     // );
         for(int i=0;i<this.getSAR()+1;i++){
         System.out.println("______________________");
        // System.out.println("");
         System.out.println(i+"          "+stri[i]//+getnumber()+" "+getString()
         );
         //System.out.println("");
        // System.out.println("__________________________");
         }   
         System.out.println("");
        System.out.println("********************************************************************");        
        
    
    }
    
    public void dshow (){
    try{
     System.out.println("********************************************************************");
     System.out.println("                                                                     ");
     System.out.println("                        SYMBOL TABLE                                 ");
        System.out.println("");
        int o=0;
     System.out.println("ATTRIBUTE VALUE              DATA TYPE             NAME/VARIABLE                   "); 
        System.out.println("");
      //  System.out.println(no[o]+"          "+stri[0]//+getnumber()+" "+getString()
     // );
         for(int i=0;i<this.getprojectlinees()+1;i++){
         
     System.out.println(" "+i+"                              "+dt[i]+"                  "+variable[i]//+getnumber()+" "+getString()
         );
     
         }
         
     System.out.println("                                                                    ");    
     System.out.println("********************************************************************");
         
                
    }catch(NullPointerException e){} 
    
    }
    
    
}
