class university {
        private String student;
        private  int id;

       public void setstudent(String std){
        student = std;

        }
        public String getstudent(){
            return student;
        }

        public void setId(int id){
            this.id = id;
        }
        public int getId(){
            return id;
        }

        
    }
    



public class encap {

    public static void main(String[] args) {
        university un = new university();
        // un.student = "Ali";

        un.setstudent("khan");
        System.out.println("value is " + un.getstudent());

        un.setId(4553);
        System.out.println("ID is "+ un.getId());
    }
}
