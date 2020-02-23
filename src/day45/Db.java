package day45;

public class Db {
        private String  data;
        private int  yint;

        public  String getData (){
            return data;
        }public  int getYint(){
            return yint;
        }public  void setData(String newdata){
            this.data=newdata;
        }public  void setYint(int newyint){
            this.yint=newyint;}
        public void insertData(String newdata,int newyint){
            data=newdata;
            yint=newyint;
        }
    }

