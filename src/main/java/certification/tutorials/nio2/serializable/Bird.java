package certification.tutorials.nio2.serializable;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Getter
@Setter
class Bird {
	
	
	protected transient String name;
	
     public  Bird (){
    	  
    	  this.name= "Matt";
      }
}
