public class TaxiBooking {

    public static int minimumTime(int N, int cur, int[] pos, int[] time) {
        // code here
        int minTime[] = new int[N];
        for(int i=0; i<N; i++){
            if(pos[i]<=cur)
               minTime[i] = (cur-pos[i])*time[i];
            else
               minTime[i] = (pos[i]-cur)*time[i];
        }
        
        Arrays.sort(minTime);
        return minTime[0];
    }
    
}
