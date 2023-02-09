

public class Fraction {
    public int topN;
    public int btmN;
    
    public String toFraction(){
        return topN +"/"+ btmN;
    }
    public String toFloat(){
        double num1 = topN, num2 = btmN, sum = num1/num2;
        String str = Double.toString(sum);
        return str; 
    }
    public void addFraction(Fraction f){
        if (btmN == f.btmN){
            topN += f.topN;
            btmN = f.btmN;
        } else {
            topN = (topN * f.btmN)+(f.topN*btmN);
            btmN *= f.btmN;
        }
    }
    public boolean myEquals(Fraction x) {
                return (topN*1.0/btmN == x.topN*1.0/x.btmN);
    }
    public void LowestTermFrac () {
        int divisor = 0;
        
        for(int i = topN; i>= 1; i--) {
            if (topN % i == 0 && btmN % i == 0) {
                divisor = i;
                break;
            }
        }
        
        if (divisor != 0) {
            topN /= divisor;
            btmN /= divisor;
        }
    }
}