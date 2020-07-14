import org.openjdk.jmh.annotations.*;
import java.util.Scanner;


public class MyBenchMark {

    @Benchmark()
    @BenchmarkMode({Mode.Throughput, Mode.AverageTime, Mode.SampleTime, Mode.SingleShotTime})
    @Fork(value = 1)
    public boolean benchMark1(int arr[], int size) {
        int arr[] = {1,4,6,12,18,20 };
        return binarySearch(arr, 20, 0,size-1);
    }

    @Benchmark()
    @BenchmarkMode({Mode.Throughput, Mode.AverageTime, Mode.SampleTime, Mode.SingleShotTime})
    @Fork(value = 1)
    public void benchMark1(int arr[], int size) {

        return processAndPrintInfo(arr, 2);
    }

    public void processAndPrintInfo(int [] arr, int size){
        System.out.println("First element: "+ arr[0]);
        for(int i=0; i<size/2; i++){
            System.out.println(arr[i]);
        }

        for (int i=0; i<100; i++){
            System.out.println("hi");
        }
    }

    public boolean binarySearch(int [] arr, int val, int start, int end){

        if (start > end){
            return false;
        }
        int mid = (start+end)/2;

        if(arr[mid] == val){
            return true;
        }

        if(arr[mid] > x){
            return binarySearch(arr, val, start, mid-1);
        }
        else{
            return binarySearch(arr, val, mid+1, end);
        }

    }

        public static void main(String[] args) throws Exception {
            org.openjdk.jmh.Main.main(args);
        }


}