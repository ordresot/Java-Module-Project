public class Race {
    private String leader = "";
    private int distance = 0;

    public void leaderDefining(Car car){
        if (24 * car.getSpeed() > distance){
            distance = 24 * car.getSpeed();
            leader = car.getName();
        }
    }

    public String getLeader(){
        return leader;
    }
}
