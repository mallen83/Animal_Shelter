abstract class Snakes implements Animal {

    public void swim(){
        System.out.println("Snakes swim by lateral moving in the water.");

    }

    private String venomous;

    private String shed;

    public Snakes(String venomous, String shed) {
        this.venomous = venomous;
        this.shed = shed;
    }
    public String getVenomous() {
        return venomous;
    }

    public void setVenomous(String venomous) {
        this.venomous = venomous;
    }

    public String getShed() {
        return shed;
    }

    public void setShed(String shed) {
        this.shed = shed;
    }

    @Override
    public String toString() {
        return "Snakes{" +
                "venomous='" + venomous + '\'' +
                ", shed='" + shed + '\'' +
                '}';
    }
}
