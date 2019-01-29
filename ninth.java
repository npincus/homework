public class ninth {
    private class IntervalComparator implements Comparator<Interval> {
        @Override
        public int compare(Interval a, Interval b) {
            return a.start < b.start ? -1 : a.start == b.start ? 0 : 1;
        }
    }
    public List<Interval> merge(List<Interval> intervals) {
        Collections.sort(intervals,new IntervalComparator());
        int i=0;
        while(i<intervals.size()-1){
            if(overlap(intervals.get(i),intervals.get(i+1))){
                intervals.set(i,combine(intervals.get(i),intervals.get(i+1)));
                intervals.remove(i+1);
            }else{
                i++;
            }
        }
        return intervals;
    }
    private boolean overlap(Interval a, Interval b) {
        return a.start <= b.end && b.start <= a.end;
    }
    private Interval combine(Interval a, Interval b){
        int min=Math.min(a.start,b.start);
        int max=Math.max(a.end,b.end);
        return new Interval(min,max);
    }
}
/* ideal not used
    d7: so i saw this problem as 3 things, first do they over lap, easy if start of one is with in start-end range of
    another then yes.
    second was how do i add them, also easy, lows start and the highest end assumeing they over lap
    and thrid and finaly was simple getting it in order and then you only need to add one to the next element if they
    overlap if they dont then move on to the element after the first and repeat
    Q:more a note, javas not great for this kotlin or any langaue with Lambda expressions would be cleaner and easier
 */