class Rottweiler extends Dog {

 
     private String bark;
     private String jump;

     public Rottweiler() {
         this.bark = bark;
         this.jump = jump;
     }

     public String getBark() {
         return bark;
     }

     public void setBark(String bark) {
         this.bark = bark;
     }

     public String getJump() {
         return jump;
     }

     public void setJump(String jump) {
         this.jump = jump;
     }

     @Override
     public String toString() {
         return "Dog{" +
                 "bark='" + bark + '\'' +
                 ", jump='" + jump + '\'' +
                 '}';
     }

    @Override
    public void name() {

    }

    @Override
    public void color() {

    }

    @Override
    public void numberOfLegs() {

    }
}
