package com.jv_program.singeltonreflecs;


public class AppSingleTon {

    private static AppSingleTon myObj;

   public AppSingleTon (){

    }

    public static AppSingleTon getInstance(){
        if(myObj == null){
            myObj = new AppSingleTon();
        }
        return myObj;
    }

    public void getSomeThing(){
         System.out.println("I am simple singelton....");
    }

   /* public static void main(String a[]){
        AppSingleTon st = AppSingleTon.getInstance();
        st.getSomeThing();
    }
    */
}

