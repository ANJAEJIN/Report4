package jp.ac.uryukyu.ie.e175731;

public class Main {
    public static void main(String[] args){
        try{
            String str = null;
            System.out.println(str.length());
        }catch (NullPointerException e){
            System.out.println(e.toString());
            System.out.println(e.getMessage());
        }
    }
}