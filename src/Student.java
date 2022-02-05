import java.math.BigDecimal;
import java.math.RoundingMode;

public class Student {
    private String name;
    private int[] marksList;

    Student(String name, int[] marksList){
        this.name = name;
        this.marksList = marksList;
    }

    public int getTotalSumOfMarks(){
        int sum = 0;
        for(int marks:marksList)
            sum += marks;
        return  sum;
    }

    public  int getMaximumMarks(){
        int mx = Integer.MIN_VALUE;
        for(int marks:marksList)
            mx = Integer.max(mx,marks);
        return  mx;
    }

    public  int getMinimumMarks(){
        int mn = Integer.MAX_VALUE;
        for(int marks:marksList)
            mn = Integer.min(mn, marks);
        return  mn;
    }

    public BigDecimal getAverageMarks(){
        int sum = getTotalSumOfMarks();
        // new BigDecimal(sum).divide(new BigDecimal(marksList.length), 3, RoundingMode.UP)
        return BigDecimal.valueOf(sum).divide(BigDecimal.valueOf(marksList.length), 3, RoundingMode.UP);
    }

}
