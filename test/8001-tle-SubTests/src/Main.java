
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static final int maxIter=999;
    /**
     * @param args
     */
    public static void main(String[] args) {
        Main main = new Main();
        Class<Main> cls = Main.class;
        Method[] mets = cls.getDeclaredMethods();
        Arrays.sort(mets, new Comparator<Method>() {    
            @Override
            public int compare(Method arg0, Method arg1) {
                return arg0.getName().compareTo(arg1.getName());
            }
        });
        for (Method met:mets){
            if (met.getName().equalsIgnoreCase("main"))
                continue;
            try {
                System.out.println("Test "+met.getName()+" result: "+met.invoke(main));
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            } catch (IllegalArgumentException e) {
                e.printStackTrace();
            } catch (InvocationTargetException e) {
                e.printStackTrace();
            }
        }
    }
    public int testInt1(){
        int i=0;
        int res=0;
        for (;i>-5;i--){
            res-=i;
        }
        return res;
    }
    public int testInt2(){
        int i=0;
        int res=0;
        int tmp=10;
        for (;i>-50;i--){
            res-=i;
            tmp++;
            res-=tmp;
        }
        return res;
    }
    public int testInt3(){
        int i=0;
        int res=0;
        int tmp=10;
        for (i=maxIter;i>0;i--){
            res-=tmp;
            tmp--;
        }
        return res;
    }
    public int testInt4(){
        int i=0;
        int res=-10000;
        int tmp=10;
        for (i=tmp;i>-res;i--){
            res-=tmp;
            tmp--;
        }
        return res;
    }
    public long testLong1(){
        long i=0;
        long res=0;
        for (;i>-5;i--){
            res-=i;
        }
        return res;
    }
    public long testLong2(){
        long i=0;
        long res=0;
        long tmp=10;
        for (;i>-50;i--){
            res-=i;
            tmp++;
            res-=tmp;
        }
        return res;
    }
    public long testLong3(){
        long i=0;
        long res=0;
        long tmp=10;
        for (i=maxIter;i>0;i--){
            res-=tmp;
            tmp--;
        }
        return res;
    }
    public long testLong4(){
        long i=0;
        long res=-10000;
        long tmp=10;
        for (i=tmp;i>-res;i--){
            res-=tmp;
            tmp--;
        }
        return res;
    }
    public byte testByte1(){
        byte i=0;
        byte res=0;
        for (;i>-5;i--){
            res-=i;
        }
        return res;
    }
    public byte testByte2(){
        byte i=0;
        byte res=0;
        byte tmp=10;
        for (;i>-50;i--){
            res-=i;
            tmp++;
            res-=tmp;
        }
        return res;
    }
    public byte testByte3(){
        byte i=0;
        byte res=0;
        byte tmp=10;
        for (i=Byte.MAX_VALUE;i>Byte.MIN_VALUE;i--){
            res-=tmp;
            tmp--;
        }
        return res;
    }
    public byte testByte4(){
        byte i=0;
        byte res=-100;
        byte tmp=10;
        for (i=tmp;i>-res;i--){
            res-=tmp;
            tmp--;
        }
        return res;
    }
    public short testShort1(){
        short i=0;
        short res=0;
        for (;i>-5;i--){
            res-=i;
        }
        return res;
    }
    public short testShort2(){
        short i=0;
        short res=0;
        short tmp=10;
        for (;i>-50;i--){
            res-=i;
            tmp++;
            res-=tmp;
        }
        return res;
    }
    public short testShort3(){
        short i=0;
        short res=0;
        short tmp=10;
        for (i=maxIter;i>0;i--){
            res-=tmp;
            tmp--;
        }
        return res;
    }
    public short testShort4(){
        short i=0;
        short res=-10000;
        short tmp=10;
        for (i=tmp;i>-res;i--){
            res-=tmp;
            tmp--;
        }
        return res;
    }
    public int testFloat1(){
        int i=0;
        float res=0.0f;
        for (;i>-5;i--){
            res-=i;
        }
        return Float.floatToIntBits(res);
    }
    public int testFloat2(){
        int i=0;
        float res=0.0f;
        float tmp=10.0f;
        for (;i>-50;i--){
            res-=i;
            tmp++;
            res-=tmp;
        }
        return Float.floatToIntBits(res);
    }
    public int testFloat3(){
        int i=0;
        float res=0.0f;
        float tmp=10.0f;
        for (i=maxIter;i<00;i--){
            res-=tmp;
            tmp--;
        }
        return Float.floatToIntBits(res);
    }
    public int testFloat4(){
        int i=0;
        float res=-10000.0f;
        float tmp=10.0f;
        for (i=(int)tmp;i>-res;i--){
            res-=tmp;
            tmp--;
        }
        return Float.floatToIntBits(res);
    }
    public long testDouble1(){
        int i=0;
        double res=0.0;
        for (;i>-5;i--){
            res-=i;
        }
        return Double.doubleToLongBits(res);
    }
    public long testDouble2(){
        int i=0;
        double res=0.0;
        double tmp=10.0;
        for (;i>-50;i--){
            res-=i;
            tmp++;
            res-=tmp;
        }
        return Double.doubleToLongBits(res);
    }
    public long testDouble3(){
        int i=0;
        double res=0.0;
        double tmp=10.0;
        for (i=maxIter;i>00;i--){
            res-=tmp;
            tmp--;
        }
        return Double.doubleToLongBits(res);
    }
    public long testDouble4(){
        int i=0;
        double res=-10000.0;
        double tmp=10.0;
        for (i=(int)tmp;i>res;i--){
            res-=tmp;
            tmp--;
        }
        return Double.doubleToLongBits(res);
    }
    public byte testByte5(){
        byte i=0;
        byte res=0;
        byte tmp=3;
        for (;i<5;i++){
            res-=(byte) (tmp-i);
        }
        return res;
    }
    public byte testByte6(){
        byte i=0;
        byte res=0;
        byte tmp=-10;
        for (;i<50;i++){
            tmp++;
            res=(byte) (tmp-i);
        }
        return res;
    }
    public byte testByte7(){
        byte i=0;
        byte res=0;
        byte tmp=-10;
        for (i=Byte.MIN_VALUE;i<Byte.MAX_VALUE;i++){
            res=(byte) (tmp-res);
            tmp++;
        }
        return res;
    }
    public byte testByte8(){
        byte i=0;
        byte res=100;
        byte tmp=-10;
        for (i=tmp;i<res;i++){
            res-=(byte) (tmp-res);
        }
        return res;
    }
    public short testShort5(){
        short i=0;
        short res=0;
        short tmp=100;
        for (;i<5;i++){
            res-=(short) (i-tmp);
        }
        return res;
    }
    public short testShort6(){
        short i=0;
        short res=0;
        short tmp=-10;
        for (;i<50;i++){
            res=(short) (i-tmp);
            tmp++;
        }
        return res;
    }
    public short testShort7(){
        short i=0;
        short res=0;
        short tmp=-10;
        for (i=0;i<maxIter;i++){
            res=(short) (tmp-res);
            tmp++;
        }
        return res;
    }
    public short testShort8(){
        short i=0;
        short res=10000;
        short tmp=-10;
        for (i=tmp;i<res;i++){
            res-=(short) (tmp-res);
        }
        return res;
    }    
    public int testInt5(){
        int i=0;
        int res=0;
        int tmp=100;
        for (;i<5;i++){
            res-=i-tmp;
        }
        return res;
    }
    public int testInt6(){
        int i=0;
        int res=0;
        int tmp=-10;
        for (;i<50;i++){
            res=i-tmp;
            tmp++;
        }
        return res;
    }
    public int testInt7(){
        int i=0;
        int res=0;
        int tmp=-10;
        for (i=0;i<maxIter;i++){
            res=i-tmp;
            tmp++;
        }
        return res;
    }
    public int testInt8(){
        int i=0;
        int res=10000;
        int tmp=-10;
        for (i=tmp;i<res;i++){
            res-=i-tmp;
        }
        return res;
    }
    public long testLong5(){
        long i=0;
        long res=0;
        long tmp=100L;
        for (;i<5;i++){
            res-=i-tmp;
        }
        return res;
    }
    public long testLong6(){
        long i=0;
        long res=0;
        long tmp=-10;
        for (;i<50;i++){
            res=tmp-i;
            tmp++;
        }
        return res;
    }
    public long testLong7(){
        long i=0;
        long res=0;
        long tmp=-10;
        for (i=0;i<maxIter;i++){
            res=i-tmp;
            tmp++;
        }
        return res;
    }
    public long testLong8(){
        long i=0;
        long res=10000;
        long tmp=-10;
        for (i=tmp;i<res;i++){
            res-=i-tmp;
        }
        return res;
    }
    public int testFloat5(){
        int i=0;
        float res=0.0f;
        float tmp=1.5f;
        for (;i<5;i++){
            res-=i-tmp;
        }
        return Float.floatToIntBits(res);
    }
    public int testFloat6(){
        int i=0;
        float res=0.0f;
        float tmp=-10.0f;
        for (;i<50;i++){
            res=i-tmp;
            tmp++;
        }
        return Float.floatToIntBits(res);
    }
    public int testFloat7(){
        int i=0;
        float res=0.0f;
        float tmp=-10.0f;
        for (i=00;i<maxIter;i++){
            res=tmp-i;
            tmp++;
        }
        return Float.floatToIntBits(res);
    }
    public int testFloat8(){
        int i=0;
        float res=10000.0f;
        float tmp=-10.0f;
        for (i=(int)tmp;i<res;i++){
            res+=(tmp-i)-1000;
        }
        return Float.floatToIntBits(res);
    }
    public long testDouble5(){
        int i=0;
        double res=0.0;
        double tmp=1.0;
        for (;i<5;i++){
            res-=i-tmp;
        }
        return Double.doubleToLongBits(res);
    }
    public long testDouble6(){
        int i=0;
        double res=0.0;
        double tmp=-10.0;
        for (;i<50;i++){
            res=i-tmp;
            tmp++;
        }
        return Double.doubleToLongBits(res);
    }
    public long testDouble7(){
        int i=0;
        double res=0.0;
        double tmp=-10.0;
        for (i=00;i<maxIter;i++){
            res=tmp-i;
            tmp++;
        }
        return Double.doubleToLongBits(res);
    }
    public long testDouble8(){
        int i=0;
        double res=10000.0;
        double tmp=-10.0;
        for (i=(int)tmp;i<res;i++){
            res+=(tmp-i)-1000;
        }
        return Double.doubleToLongBits(res);
    }
}
