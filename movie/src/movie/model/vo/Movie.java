package movie.model.vo;
import java.util.*;

public class Movie {
   private String tit;
  
   private String age;
   private int rank;
   private String cate;
   private String rating;
   
   // Getter
   public String getTit() {
       return tit;
   }
     
   // Setter
   public void setTit(String tit) {
     this.tit = tit;
   }

   public String getAge() {
      return age;
   }
        
   // Setter
   public void setAge(String age) {
      this.age = age;
   }
   // Getter
   public int getRank() {
      return rank;
   }
        
   // Setter
   public void setRank(int rank) {
      this.rank = rank;
   }
   // Getter
   public String getCate() {
      return cate;
   }
        
   // Setter
   public void setCate(String cate) {
      this.cate = cate;
   }
   // Getter
   public String getRating() {
      return rating;
   }
        
   // Setter
   public void setRating(String rating) {
      this.rating = rating;
   }
   @Override
   public String toString() {
      // TODO Auto-generated method stub
      return "----------\nŸ��Ʋ:"+this.getTit() +"\n"
            +"����:"+this.getAge() +"\n"
            +"����:"+this.getRank() +"\n"
            +"�帣:"+this.getCate()+"\n"
            +"����:"+this.getRating();
   }
   
   
}
