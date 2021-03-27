
package mudassir;

import java.io.IOException;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class MUDASSIR {

   
    public static void main(String[] args)  throws IOException {
        
     
        symbol s = new symbol();
        File file = new File("C:/temp/sourcecode.txt");
        
        Scanner sc = new Scanner(file);
        char c;
        
        String reader = "";
        
        while(sc.hasNextLine()){
            
        reader = reader.concat(sc.nextLine());  
        
        
        }
       
        //======================================================
        
        System.out.println("");
    
      int l=0;
      int[] np = new int [reader.length()]  ;  
      String[] pp = new String [reader.length()]  ;
      int[] line_no = new int [reader.length()]  ; 
      String[] datatype = new String [reader.length()]  ;
      String[] variable = new String [reader.length()]  ;
      int sym=0;
      String concat="";
    
        int d=0;
      int error=0;
      
    int Lbel = 0;    
    label:
    while(d<=reader.length()-1){  
        s.sar(l);
        s.setprojectliness(sym);
        
      switch(reader.charAt(d)){
      
        
          case '=' : 
          try{ if(reader.charAt(d+1) == '='){
              np[l]=d;
              pp[l]="==";
              s.mas(np, pp);
              l++;    
          System.out.println("==  relop  EQ");
          d++;}
          else {
              np[l]=d;
              pp[l]="=";
              s.mas(np, pp);
              l++;
              System.out.println("=  relop  ASN");}
          }catch(StringIndexOutOfBoundsException siobe){ 
              np[l]=d;
              pp[l]="=";
              s.mas(np, pp);
              l++;
              System.out.println("=  relop  ASN");}
          break;
         
          case '<' : 
          try{   if(reader.charAt(d+1) == '='){ 
               np[l]=d;
              pp[l]="<=";
              s.mas(np, pp);
              l++;
              System.out.println("=<  relop  LE"); d++;}
          else if (reader.charAt(d+1) == '>'){ np[l]=d;
              pp[l]="<>";
              s.mas(np, pp);
              l++;
              System.out.println("<>  relop  NE"); d++;}
          else {
               np[l]=d;
              pp[l]="<";
              s.mas(np, pp);
              l++;
              System.out.println("<  relop  LT");}
      }catch (StringIndexOutOfBoundsException siobe){
              np[l]=d;
              pp[l]="<";
              s.mas(np, pp);
              l++;
              System.out.println("< relop LT");}
          break;
          case '>' :
          try{ if(reader.charAt(d+1) == '='){
               np[l]=d;
              pp[l]=">=";
              s.mas(np, pp);
              l++;
              System.out.println(">=  relop  GE"); d++;}
          else { 
               np[l]=d;
              pp[l]=">";
              s.mas(np, pp);
              l++;
              System.out.println(">  relop  GT");} }
          catch (StringIndexOutOfBoundsException siobe){
              np[l]=d;
              pp[l]=">";
              s.mas(np, pp);
              l++;
              System.out.println(">  relop  GT");}
          break;
          case ' ' :
                   /*    if (reader.charAt(d)==' ') {
                            d++;
                            continue;
                        }
                        break;
                    case '\t':
                        if (reader.charAt(d) == '\t') {
                            d++;
                            continue;
                        }
                        break;
                    case '\n':
                        if (reader.charAt(d) == '\r' || reader.charAt(d) == '\n') {
                            d++;
                            continue;
                        } 
              */
          break;
          case '\t' : 
          break;
          case '\n' : 
          break;
          case '+' :
            
              np[l]=d;
              pp[l]="+";
              s.mas(np, pp);
            
              System.out.println("+  arop  ADD"); 
           
              l++;
          break;
          case '-' :
              np[l]=d;
              pp[l]="-";
              s.mas(np, pp);
              l++;
              System.out.println("-  arop  SUB"); 
          break;
          case '(' : System.out.println("(  otop  LPRN"); 
           np[l]=d;
              pp[l]="(";
              s.mas(np, pp);
              l++;
          break;
          case ')' :
               np[l]=d;
              pp[l]=")";
              s.mas(np, pp);
              l++;
              System.out.println(")  otop  RPRN"); 
          break;
          case '{' : 
               np[l]=d;
              pp[l]="{";
              s.mas(np, pp);
              l++;
              System.out.println("{  otop  LBRC"); 
          break;
          case '}' :
               np[l]=d;
              pp[l]="}";
              s.mas(np, pp);
              l++;
              System.out.println("}  otop  RBRC"); 
          break;
          case ';' : 
               np[l]=d;
              pp[l]=";";
              s.mas(np, pp);
              l++;
              System.out.println(";  otop  LNTR"); 
          break;
          case 'b' : 
                  
     
       try{ 
              char ch='b';
              //while(ch!=reader.charAt(d)){
             // d++;}
            if(reader.charAt(d) == 'b'){  d++;
              if(reader.charAt(d) == 'e'){ d++;//}else{System.out.println("b"); break;}
              if(reader.charAt(d) == 'g'){ d++;
              if(reader.charAt(d) == 'i') { d++;
              if(reader.charAt(d) == 'n') { //d++;
                  System.out.println("begin = keyword "); 
              } else{System.out.println("b id");System.out.println("e id");System.out.println("g id");System.out.println("i id"); d--; break;}
              } else{System.out.println("b id");System.out.println("e id");System.out.println("g id"); d--; break;}
              } else{System.out.println("b id");System.out.println("e id"); d--; break;}
              } else{System.out.println("b id"); d--; break;}
             //}else{break;}
              }
       }
               catch (StringIndexOutOfBoundsException siobe){System.out.println("b");}
          break; 

 
   
                         
          
  case 's' :
              
         
              try{  
               
             if(reader.charAt(d+1) == 't'){ d++;
                 
          
               if(reader.charAt(d+1) == 'r' ){ d++; 
                 
           
              
              if(reader.charAt(d+1) == 'i'){ d++; 
              
            
             
              if(reader.charAt(d+1) == 'n'){ d++; 
              
      
              
              if(reader.charAt(d+1) == 'g'){  d++; 
              
        
              System.out.print("string = keyword ");
           
              System.out.println("");
              
              d++;
              
          
            
                                   if ( reader.charAt(d) == ' ' ){
                                       
                                       d++;
                                       
                                if ((reader.charAt(d) >= 'a' && reader.charAt(d) <= 'z') || (reader.charAt(d) >= 'A' && reader.charAt(d) <= 'Z') || (reader.charAt(d) == '_') || (reader.charAt(d) == '$' ) 
                                        )
                                {     
                                   
                                    while (0 > -1) {
                                       
                                        if ( reader.charAt(d) == ';' || reader.charAt(d) == '=' || (reader.charAt(d) >= 0 && reader.charAt(d) <= 31) || (reader.charAt(d) >= 33 && reader.charAt(d) <= 47 || (reader.charAt(d) >= 60 && reader.charAt(d) <= 64) || (reader.charAt(d) >= 91 && reader.charAt(d) <= 96) ) ||(reader.charAt(d) >= 123 && reader.charAt(d) <= 127)// || Character.isWhitespace(reader.charAt(d))
                                                ) {
                                           
                                            break;
                                        }else if(reader.charAt(d)== ' ' || reader.charAt(d)== '\n' || reader.charAt(d)== '\r' || reader.charAt(d)== '\t' ){
                                       
                                         Lbel=1;
                                         break label;
                                    }
                                    
                                        concat=concat+String.valueOf(reader.charAt(d));
                                        
                                        System.out.print(reader.charAt(d));
                                    
                                        
                                    d++;
                                   
                                    }
                                    
                                    System.out.print(" id");
                                    System.out.println("");
                                    line_no[sym]=d;
                                        datatype[sym]="string";
                                        variable[sym]=concat;
                                        s.setdata(line_no, datatype, variable);
                                        sym++;
                                        concat="";
                            
                                        
                                }else{
                                }
                                
                                 }else{}
                                
                             
        
               continue;
              
              }else{System.out.println("s id");System.out.println("t id");System.out.println("r id");System.out.println("i id"); System.out.println("n id");}
              
              }else{System.out.println("s id");System.out.println("t id");System.out.println("r id");System.out.println("i id"); }
              
              }else{System.out.println("s id");System.out.println("t id");System.out.println("r id"); }
               
              }else{System.out.println("s id");System.out.println("t id");}
             
              }else{System.out.println("s id");}
             
      }catch (StringIndexOutOfBoundsException siobe){
      }
           break;
          
          
              case 'c' :
              
         
              try{  
             
             if(reader.charAt(d) == 'c'){
                 
             
           
           
               if(reader.charAt(d+1) == 'h' ){ d++; 
                 
   
              
              if(reader.charAt(d+1) == 'a'){ d++; 
              
             
             
              if(reader.charAt(d+1) == 'r'){ d++; 
              
        
              System.out.print("char = keyword ");
           
              System.out.println("");
              
              d++;
              
         
           
                                   if ( reader.charAt(d) == ' ' ){
                                       
                                       d++;
                                       
                                if ((reader.charAt(d) >= 'a' && reader.charAt(d) <= 'z') || (reader.charAt(d) >= 'A' && reader.charAt(d) <= 'Z') || (reader.charAt(d) == '_') || (reader.charAt(d) == '$' ) 
                                        )
                                {     
                                  
                                    while (0 > -1) {
                                      
                                        if ( reader.charAt(d) == ';' || reader.charAt(d) == '=' || (reader.charAt(d) >= 0 && reader.charAt(d) <= 31) || (reader.charAt(d) >= 33 && reader.charAt(d) <= 47 || (reader.charAt(d) >= 60 && reader.charAt(d) <= 64) || (reader.charAt(d) >= 91 && reader.charAt(d) <= 96) ) ||(reader.charAt(d) >= 123 && reader.charAt(d) <= 127)// || Character.isWhitespace(reader.charAt(d))
                                                ) {
                                           
                                            break;
                                        }else if(reader.charAt(d)== ' ' || reader.charAt(d)== '\n' || reader.charAt(d)== '\r' || reader.charAt(d)== '\t' ){
                                       
                                         Lbel=1;
                                         break label;
                                    }
                                  
                                        concat=concat+String.valueOf(reader.charAt(d));
                                        
                                        System.out.print(reader.charAt(d));
                                    
                                        
                                    d++;
                                   
                                    }
                                    
                                    System.out.print(" id");
                                    System.out.println("");
                                    line_no[sym]=d;
                                        datatype[sym]="char";
                                        variable[sym]=concat;
                                        s.setdata(line_no, datatype, variable);
                                        sym++;
                                        concat="";
                         
                                        
                                }else{
                                }
                                
                                 }else{}
                                
                             
        
               continue;
              
              }else{System.out.println("c id"); System.out.println("h id"); System.out.println("a id"); }
              
            
             }else{System.out.println("c id"); System.out.println("h id"); }
               
              }else{System.out.println("c id"); }
             
            }
             
      }catch (StringIndexOutOfBoundsException siobe){ 
      }
           break;
           
                 
         case 'f' :
              try{  
             
             if(reader.charAt(d) == 'f'){
              
           
               if(reader.charAt(d+1) == 'l' ){ d++; 
           
               
              if(reader.charAt(d+1) == 'o'){ d++; 
              
          
              if(reader.charAt(d+1) == 'a'){ d++; 
              
         
              if(reader.charAt(d+1) == 't'){ d++; 
              
        
              System.out.print("float = keyword ");
           
              System.out.println("");
              
              d++;
              
          
            
                                   if ( reader.charAt(d) == ' ' ){
                                       
                                       d++;
                                       
                                       
                                       
                                if ((reader.charAt(d) >= 'a' && reader.charAt(d) <= 'z') || (reader.charAt(d) >= 'A' && reader.charAt(d) <= 'Z') || (reader.charAt(d) == '_') || (reader.charAt(d) == '$' ) 
                                        )
                                {     
                                   
                                    while (0 > -1) {
                                    
                                        if (  reader.charAt(d) == ';' || reader.charAt(d) == '=' || (reader.charAt(d) >= 0 && reader.charAt(d) <= 31) || (reader.charAt(d) >= 33 && reader.charAt(d) <= 47 || (reader.charAt(d) >= 60 && reader.charAt(d) <= 64) || (reader.charAt(d) >= 91 && reader.charAt(d) <= 96) ) ||(reader.charAt(d) >= 123 && reader.charAt(d) <= 127) //|| Character.isWhitespace(reader.charAt(d))
                                                ) {
                                           
                                            break;
                                        } else if(reader.charAt(d)== ' ' || reader.charAt(d)== '\n' || reader.charAt(d)== '\r' || reader.charAt(d)== '\t' ){
                                       
                                         Lbel=1;
                                         break label;
                                    }
                                  
                                        concat=concat+String.valueOf(reader.charAt(d));
                                        
                                        System.out.print(reader.charAt(d));
                                    
                                        
                                    d++;
                                   
                                    }
                                    
                                    System.out.print(" id");
                                    System.out.println("");
                                    line_no[sym]=d;
                                        datatype[sym]="float";
                                        variable[sym]=concat;
                                        s.setdata(line_no, datatype, variable);
                                        sym++;
                                        concat="";
                           
                                        
                                }else{
                                }
                                
                                 }else{}
                                
                             
        
               continue;
              
              }else{System.out.println("f id");System.out.println("l id");System.out.println("o id");System.out.println("a id");}
            
              }else{System.out.println("f id");System.out.println("l id");System.out.println("o id");}
              
              }else{System.out.println("f id");System.out.println("l id");}
              
              }else{System.out.println("f id");}
               
             }
             
      }catch (StringIndexOutOfBoundsException siobe){ //System.out.println(reader.charAt(d)); //jo bhi sequence mai arha hoga tw usmai sy last wala
      }
           break;

         
          case 'e' :
      
              try{  
             
             if(reader.charAt(d) == 'e'){
         
           
               if(reader.charAt(d+1) == 'l'){ d++;
                 
           
               if(reader.charAt(d+1) == 's'){ d++;
         
              
              if(reader.charAt(d+1) == 'e'){ d++;
              
                System.out.println("keyword = else");
              
              }else{System.out.println("e id");System.out.println("l id");System.out.println("s id");}  //agar nhi likho gy tw e nhi ayega
              //System.out.println(reader.charAt(d));}
              
             }else{System.out.println("e id");System.out.println("l id");}
               
               
             }else if(reader.charAt(d+1) == 'n'){
                  d++; 
               
               if(reader.charAt(d+1) == 'd'){
                  d++;
                  System.out.println("keyword = end");
               }
              }else{System.out.println("e id"); }
             
            }
       }catch (StringIndexOutOfBoundsException siobe){ //System.out.println(reader.charAt(d));
       }
        break;
        
        
        case 'i' :
             
        try{  
             
             if(reader.charAt(d) == 'i'){
              
             if(reader.charAt(d+1) == 'n'){
                 d++;
            
              if(reader.charAt(d+1) == 't'){ d++; 
              
        
              System.out.print("int = keyword ");
           
              System.out.println("");
              
              d++;
              
            
            
                                   if ( reader.charAt(d) == ' ' ){
                                       
                                       d++;
                                       
                                if ((reader.charAt(d) >= 'a' && reader.charAt(d) <= 'z') || (reader.charAt(d) >= 'A' && reader.charAt(d) <= 'Z') || (reader.charAt(d) == '_') || (reader.charAt(d) == '$' ) 
                                        )
                                {     
                                   
                                    while (0 > -1) {
                                      
                                        if ( reader.charAt(d) == ';' || reader.charAt(d) == '=' || (reader.charAt(d) >= 0 && reader.charAt(d) <= 31) || (reader.charAt(d) >= 33 && reader.charAt(d) <= 47 || (reader.charAt(d) >= 60 && reader.charAt(d) <= 64) || (reader.charAt(d) >= 91 && reader.charAt(d) <= 96) ) ||(reader.charAt(d) >= 123 && reader.charAt(d) <= 127)// || Character.isWhitespace(reader.charAt(d))
                                                ) {
                                           
                                            break;
                                        }else if(reader.charAt(d)== ' ' || reader.charAt(d)== '\n' || reader.charAt(d)== '\r' || reader.charAt(d)== '\t' ){
                                       
                                         Lbel=1;
                                         break label;
                                    }
                                  
                                        concat=concat+String.valueOf(reader.charAt(d));
                                        
                                        System.out.print(reader.charAt(d));
                                    
                                        
                                    d++;
                                   
                                    }
                                    
                                    System.out.print(" id");
                                    System.out.println("");
                                    line_no[sym]=d;
                                        datatype[sym]="int";
                                        variable[sym]=concat;
                                        s.setdata(line_no, datatype, variable);
                                        sym++;
                                        concat="";
                         
                                        
                                }else{
                                }
                                
                                 }else{}
                                
                             
        
               continue;
              
               }
              else{ System.out.println("i id"); System.out.println("n id");
              }
              }
              else if(reader.charAt(d+1) == 'f'){
                  d++;
               System.out.println("keyword = if");
              }
              else{ System.out.println("i id");}
              }
              }
              catch (StringIndexOutOfBoundsException siobe){ //System.out.println(reader.charAt(d)); 
              }
        
      
              
              
              
      break;
              
          case '/' :
          
         
        try{ if(reader.charAt(d+1) == '*'){
         do{
             do{
          
         d++;
             }while(reader.charAt(d)!='*');
             d++;
         }while(reader.charAt(d)!= '/');
         
         } 
        
       /* else if( reader.charAt(d+1)== '/' ){
           
        do{
            
             d++;
         }while(reader.charAt(d)!= '\n');
        
        
        
        }
        */
        else{
            System.out.println("DIV");
         }
       
        
        
        }
         catch (StringIndexOutOfBoundsException siobe){System.out.println("error");
             
            
         }
      
          break;
      
          case '*' :
               np[l]=d;
              pp[l]="*";
              s.mas(np, pp);
              l++;
              System.out.println("*  atop  MUL"); 
              
           //   System.out.println("MUL"); 
          
          break;
          
          default:
              
      /*        if(reader.charAt(d) >= '0' && reader.charAt(d) <= '9' || (reader.charAt(d) >= 'a' && reader.charAt(d) <= 'z') || (reader.charAt(d) >= 'A' && reader.charAt(d) <= 'Z') || (reader.charAt(d) == '_') || (reader.charAt(d) == '$' )){
               
                  d++;
                  if
                  
                   while (0 > -1) {
                                        if ( reader.charAt(d) == ';' || reader.charAt(d) == '='  || Character.isWhitespace(reader.charAt(d))
                                                ) {
                                           
                                            break;
                                        }
                                   
                                        
                                        System.out.print(reader.charAt(d));
                                        System.out.println(" uinit");
                                        
                                    d++;
                                   
                                    }
              
              }
*/
        
          try{  
              
              
              
              
              
              
            //  if(true)label:{
        /*    
            if( reader.charAt(d)== '/' || reader.charAt(d+1)== '/'){
         d++;
          while (0>-1){
                    if((reader.charAt(d)==3) || (reader.charAt(d)==4)){
                        break;
                    }
                    //else{
                    //    System.out.println("error");// break labe1;
                   // }
                    //System.out.print(reader.charAt(d));
                    d++;
                }
         
         }  
            if(reader.charAt(d=='/') {
                d++;
                if (reader.charAt(d == '/') {
                    while (reader.charAt(d) != '\n') {
                        continue;
                    }
                    line_no++;
                    d++;
                    System.out.println();
                } else if (reader.charAt(d) == '*') {
                    d++;
                    while (reader.charAt(d) != '*') {
                        if(reader.charAt(d) =='\n'){
                            System.out.print("found");
                            line_no++;
                        }
                        reader.charAt(d)
                            continue;
                    }
                    d++;
                    d++;
                }
            }\
           
           
              
          else
          */
        
                      ///////////////////////////////////////////////////////remove
        
                         /*        if (reader.charAt(d)=='=' && reader.charAt(d+1)<='0' && reader.charAt(d+1)>='9' && reader.charAt(d+1)>='-'    ) {
                                     
                            //        if(reader.charAt(d+1) == ';' || reader.charAt(d+1) == '=' || (reader.charAt(d+1) >= 0 && reader.charAt(d+1) <= 31) || (reader.charAt(d+1) >= 33 && reader.charAt(d+1) <= 47 || (reader.charAt(d+1) >= 60 && reader.charAt(d+1) <= 127) //|| Character.isWhitespace(reader.charAt(d))
                            //                 )){
                                     
                                     
                            //        break label;
                                     
                            //         }else{
                                
                                
                         
                              
                                System.out.print(reader.charAt(d));
                                if (reader.charAt(d) == '-') {
                                    //continue;  d++;
                                    while (0 > -1) {
                                        if ((reader.charAt(d) >= 'a' && reader.charAt(d) <= 'z') || (reader.charAt(d) >= 'A' && reader.charAt(d) <= 'Z') || Character.isWhitespace(reader.charAt(d)) || reader.charAt(d)==';') {
                                            break;
                                        }
                                        System.out.print(reader.charAt(d));
                                        
                                        
                                        d++;
                                    }
                                    
                                    
                                    if(reader.charAt(d)==';'){
                                       System.out.print(" signed integer ");
                                        System.out.println("");
                                        
                                    }else{ 
                                        Lbel=1;
                                        break label;}
                                }
                                else if (reader.charAt(d)>='0' && reader.charAt(d)<='9') {
                                    
                                    d++;
                                    while (0 > -1) {
                                        if ((reader.charAt(d) >= 'a' && reader.charAt(d) <= 'z') || (reader.charAt(d) >= 'A' && reader.charAt(d) <= 'Z') || Character.isWhitespace(reader.charAt(d)) || reader.charAt(d)==';' || reader.charAt(d)=='"' ) {
                                            break;
                                        }
                                        System.out.print(reader.charAt(d));
                                      
                                        d++;
                                    }
                                    
                                    if(reader.charAt(d)==';'){
                                        System.out.print(" unsigned integer (unit) ");
                                        System.out.println("");
                                        
                                    }else{ 
                                        Lbel=1;
                                        break label;}
                                }else{//System.out.println(" ASN");
                                }
                               //  }////////////////////////////////////
                            }
              */                         ///////////////////////remove
          
                           // continue;
       /*                     if(reader.charAt(d)=='/') {
                d++;
                if (reader.charAt(d) == '/') {
                    while (reader.charAt(d) != '\n') {
                        continue;
                    }
                   // line_no++;
                    d++;
                    System.out.println();
                } else if (reader.charAt(d) == '*') {
                    d++;
                    while (reader.charAt(d) != '*') {
                        if(reader.charAt(d) =='\n'){
                            System.out.print("found");
                     //       line_no++;
                        }
                        d++;
                            continue;
                    }
                   // d++;
                    d++;
                }
            }
         */                  
                          
              
              
              if(reader.charAt(d)=='"'){
                System.out.print(reader.charAt(d));
                
                d++;
                while (0>-1){
                    if((reader.charAt(d)=='"') ){
                        break;
                    }
                    //else{
                    //    System.out.println("error");// break labe1;
                   // }
                    System.out.print(reader.charAt(d));
                    d++;
                }
              
                    System.out.print(reader.charAt(d));
                    System.out.print(" sliteral ");
                    System.out.println("");
                   
              
               
}
              
              else if (reader.charAt(d)>='0' && reader.charAt(d)<='9') {
    
                                    error++; 
                                    System.out.print(reader.charAt(d));
                                    d++;
                                    while (reader.charAt(d)>= 48 && reader.charAt(d)<= 57) {
                                       
                                        System.out.print(reader.charAt(d));
                                      
                                        d++;
                                    }
                                    
                                    if(reader.charAt(d)==';'){
                                        System.out.print(" unsigned integer (unit) ");
                                        System.out.println("");
                                        
                                    }
                                    else if(reader.charAt(d)== ' ' || reader.charAt(d)== '\n' || reader.charAt(d)== '\r' || reader.charAt(d)== '\t' ){
                                       
                                         Lbel=1;
                                         break label;
                                    }
                                    
                                } 
              //Lbel=1;
              //break label;
              

              else if(reader.charAt(d)>='a' && reader.charAt(d)<='z' || (reader.charAt(d) >= 'A' && reader.charAt(d) <= 'Z')){ 
              
              System.out.println(reader.charAt(d)+" id");
              
              } else if(reader.charAt(d)=='!' || reader.charAt(d) == '@'|| reader.charAt(d)=='#' || reader.charAt(d) == '%' || reader.charAt(d) == '^'|| reader.charAt(d)=='&' || reader.charAt(d) == '_' || reader.charAt(d) == '?'|| reader.charAt(d)==',' || reader.charAt(d) == '`'
                      || reader.charAt(d) == '|' || reader.charAt(d) == ':' ){
                  error++;
                  Lbel=1;
                  break label;
              
              }
               
               
       else{ ///////////////////asay he      
             
              
              
     
            
                //System.out.println(reader.charAt(d)+"is the unrecognzrd lexeme");
                //System.out.println("Java cannot recognize this lexeme");
               // break label;
                     
              
              
              
              
              
     System.out.println(reader.charAt(d));      
     //System.out.print("  id");   
    //              System.out.println("");
             
        /////////////////
    
       }
         // }
          } catch (StringIndexOutOfBoundsException siobe){ System.out.println("");  System.out.println("error");}
               //////////////////////asay he
          
      }
      
      
      
      d++;
    
      }
       if(Lbel==1){
           System.out.println("");
           System.out.println("Error line no : "+error+"  cause due to unrecognize lexeme ");}
           System.out.println("");
           s.show();
           s.dshow();
     
      
    }
 
    
}



                    
                
            