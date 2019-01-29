import java.util.Arrays;

class sixth {
    public int leastInterval(char[] tasks, int n) {
        int[] map =new int[26];
        for(int i=0;i<tasks.length;i++){
            map[tasks[i]-'A']++;
        }
        Arrays.sort(map);
        int time=0;
        while(map[25]>0){
            int index=0;
            while(index<=n){
                if(map[25]==0){break;}
                if(index<26) map[25-index]--;
                time++;
                index++;
            }
            Arrays.sort(map);
        }
        return time;
    }
}
/* ideal:not used
    d7: what i saw here is that there where 26 types of tasks at max and they could then be stored as numbers in a array
    of size 26 and that what given task you do does not matter so we simple take the type task with the largest number of
    task in it. this can be found by sorting the array many times. next i see that we can start at the end of the list
    and move to the start and if the last element is ever 0 we are done, also i see we can block n tasks together if
    they are unique. this solution does not presurve a list of task you would do and in what order just simply how long
    they would take.
    Q:whats the cool down intended to represent?
 */