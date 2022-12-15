 class Parrot extends Bird {
     public void talk() {
         System.out.println("Polly is hungry today!!");
     }
    private String sing;
    private String fly;
    public Parrot() {
        this.sing = sing;
        this.fly = fly;
    }

    public String getSing() {
        return sing;
    }

    public void setSing(String sing) {
        this.sing = sing;
    }

    public String getFly() {
        return fly;
    }

    public void setFly(String fly) {
        this.fly = fly;
    }

    @Override
    public String toString() {
        return "Bird{" +
                "sing='" + sing + '\'' +
                ", fly='" + fly + '\'' +
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
