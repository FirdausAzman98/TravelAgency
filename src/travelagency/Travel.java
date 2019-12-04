package travelagency;

class Travel {
    private String Title; String Description;
    private double Price; double Duration;
 
    
    
    Travel(String Title,String Description,double Price,double Duration){
        this.Title = Title;
        this.Description = Description;
        this.Price = Price;
        this.Duration = Duration;
        
    }

 
    
    String getTitle(){
    return Title;
    }
    String getDescription(){
    return Description;
    }
    double getPrice(){
    return Price;
    }
    double getDuration(){
    return Duration;
    }
   
    void setPrice(double Price){
        this.Price = Price;
    }  
     void setDuration(double Duration){
        this.Duration = Duration;
    }   
      void setDescription(String Description){
        this.Description = Description;
      }
}