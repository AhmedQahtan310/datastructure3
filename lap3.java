import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.ArrayList;
import java.util.Scanner;

public class lap3 {
    int arr[]={22,32,5,6,5,10,2,7,5,9};
    int arr1[]={1,2,2,3,3,3,6,7,8,9,3,3};
    ArrayList<Integer> num = new ArrayList<>();
    Scanner s =new Scanner(System.in);
    int count =0;
    public void reapeatToic_descover(int ar[]){
        for (int i = 0; i <ar.length ; i++) {
            count=0;
            for (int j = i; j <ar.length ; j++) {
                if (ar[i]==ar[j]){
                    count++;
                    if (count>=2){
                        num.add(ar[i]); } } }}
        System.out.println(num+"is repated toic or more"); }
    public void repat5(int ar[]){
        for (int i = 0; i <ar.length ; i++) {
            count=0;
            for (int j = 0; j <ar.length ; j++) {
                if(ar[i]==ar[j]){
                    count++;
                if(count>=5){
                    num.add(ar[i]); }}}}
        System.out.println(num+"is repeated 5 once or more"); }
    public static void main(String[] args) {
        lap3 l = new lap3();
        l.reapeatToic_descover(l.arr);
        l.repat5(l.arr1); }}
