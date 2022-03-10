public class LineComparision {
    public double calculateLength(int x1, int y1, int x2, int y2)
    {
        // Calculating Length of points
        return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
    }

    public void checkLineEqality(Double lengthOne, Double lengthTwo)
    {
        boolean equals = lengthOne.equals(lengthTwo);
        if (equals){
            System.out.println("Lines are Equal");
        }
        else{
            System.out.println("Lines are not Equal");
        }

    }

}
