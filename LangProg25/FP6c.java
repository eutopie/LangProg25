static double avgTime(List <Double> lapTimes) {
    /*lapTimes.remove(0); прогревочный круг */
    double time = 0;
    for (double x: lapTimes) {
        time+=x;
    }
    int laps = lapTimes.size();
    return time/laps;
}
static double totalTime(List <Double> lapTimes) {
    lapTimes.remove(0); //прогревочный круг
    double sum = 0;
    for (double x: lapTimes) {
        sum+=x;
    }
    return sum;
}