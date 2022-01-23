package c18.classes;

public class Donkey {
    public double mass;
    public Balloon [] balloons = new Balloon [0];

    public Donkey (double mass) {
        this.mass = mass;
    }

    //Ex4
//    public void addBalloon (Balloon balloon) {
//        for (int i = 0; i < balloons.length; i++) {
//            if (balloons[i]==null) {
//                balloons[i] = balloon;
//                break;
//            }
//        }
//    }
    //Ex5
    public void addBalloon (Balloon balloon) {
        Balloon [] tmp = balloons;
        balloons = new Balloon[tmp.length+1];
        for (int i = 0; i < balloons.length; i++) {
            if (i<balloons.length-1)
                balloons[i] = tmp[i];
            else
                balloons[i] = balloon;
        }
    }

    public boolean isFlying () {
        double balloonsLoad = 0;
        for (Balloon balloon :
                balloons) {
//            if (balloon!=null) //Ex4
                balloonsLoad+=balloon.getLoad();
        }
        return balloonsLoad >= mass;
    }
}
