   public List<Token> contents=new ArrayList<Token>();
   private String string1="";
   private String string2="";
   public char[] str=null;

   public header(String fstring, String sstring){
      string1=fstring;
      string2=sstirng;
      String ja="";
      int n=0;
      int n=string1.length()-1;
      int k=string2.length();
      int count=0;

      for(int i=0; i<6; i++){      //atx type header
         if(string1.charAt(i)=='#'){  //checking front#
            string1.charAt(i)=' ';
            count++;
         }else {
            break;
         }
      }

      for(i=n; i<0; i--){
         if(string1.charAt(i)=='#')){//checking back#
            string1.charAt(i)=' ';
         }else{
            break;
            }
      }

      if(count==1){
         string1="<h1>"+string1.trim()+"</h1>";
      }else if(count==2){
         string1="<h2>"+string1.trim()+"</h2>";
      }else if(count==3){
         string1="<h3>"+string1.trim()+"</h3>";
      }else if(count==4){
         string1="<h4>"+string1.trim()+"</h4>";
      }else if(count==5){
         string1="<h5>"+string1.trim()+"</h5>";
      }else if(count==6){
         string1="<h6>"+string1.trim()+"</h6>";
      }

      count=0;
      //setext

      for(i=0; i<k; i++){
         if(string2.charAt(i)=='='){
            count++;
         }
         else{
            break;
         }
      }
      if(count!=0 && count==k-1){
         string2="";
         string1="<h1>"+string1+"</h1>";
      }

      count=0;

      for(i=0; i<k; i++){
         if(string2.charAt(i)=='-'){
            count++;
         }
         else{
            break;
         }
      }
      if(count!=0 && count==k-1){
         string2="";
         string1="<h2>"+string1+"</h2>";
      }


