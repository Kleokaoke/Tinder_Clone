public class Image {

    // Fields:
    

        String url ;
        String description ;
        String title ;
        String tags ;  // Array
    



    // Constructor:

    Image(String url ,String description , String title, String tags){

        this.url = url ;
        this.desctription = description ;
        this.title = title ;
        this.tags = tags ;

    }
    
       
    // Setters

        public void seturl(String url) {
            this.url = url;
        }
        public void set description(String description) {
            this.description = description;
        }
        public void settitle(String title) {
             this.title = title;
        }
        public void settags(String tags) {
             this.tags = tags;
        }

    // Getters 

        public String geturl(){
            return this.url;
        }

         public String getdescription(){
             return this.description;
        }

        public String gettitle(){
            return this.title;
        }

        public String gettags(){
            return this.tags;
        }


}
