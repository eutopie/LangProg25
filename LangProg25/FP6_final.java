static double avgTime(List <Double> lapTimes) {
    /*lapTimes.remove(0); прогревочный круг */
    double time = 0;
    for (double x: lapTimes) {
        time+=x;
    }
    int laps = lapTimes.size();
    return time/laps;
}
List <Double> lapTimes = new ArrayList<>();
lapTimes.add(31.0)
lapTimes.add(20.9)
lapTimes.add(21.1)
lapTimes.add(21.3)
static double totalTime(List <Double> lapTimes) {
    List<Double>withoutWarpUp = new ArrayList<>(lapTimes);
    withoutWarpUp.remove(0); //прогревочный круг
    double sum = 0;
    for (double x: withoutWarpUp) {
        sum+=x;
    }
    return sum;
}