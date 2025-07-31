public class Race {
    String leader = "";
    int distance = 0;
    public void setLeader(String carName, int carSpeed){
        int distance = 24*carSpeed;
        if(distance > this.distance && !this.leader.equalsIgnoreCase(carName)){
            this.distance = distance;
            this.leader = carName;
        } else {
            this.distance = distance;
            this.leader = carName;
        }
    }
    public String getLeader(){
        return this.leader;
    }
}
