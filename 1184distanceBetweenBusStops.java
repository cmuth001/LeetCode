class Solution {
    public int distanceBetweenBusStops(int[] distance, int start, int destination) {
        int totalDistance = 0, clockwiseDistance = 0;
        for(int i= 0 ; i<distance.length; i++){
            if(start<destination && (i>=start && i<destination) ){
                clockwiseDistance+=distance[i];
            }
            if(start>destination && (i>=start || i<destination) ){
                clockwiseDistance+=distance[i];
            }
            totalDistance+=distance[i];;
        }
        return Math.min(clockwiseDistance,totalDistance - clockwiseDistance);
    }
}
