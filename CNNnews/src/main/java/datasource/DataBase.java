package datasource;

import databases.ConnectToSqlDB;

import java.util.ArrayList;
import java.util.List;

public class DataBase {
    static ConnectToSqlDB connectToSqlDB = new ConnectToSqlDB();


    public static List<String> getItemValue(){
        List<String> itemsList = new ArrayList<String>();
        itemsList.add("politics");
        itemsList.add("Business");
        itemsList.add("Sports");
        itemsList.add("Finance");
        itemsList.add("International");
        itemsList.add("US news");
        itemsList.add("Updated news");
        itemsList.add("Tech Industries");

        return itemsList;
    }

    public static void insertDataIntoDB(){
        List<String> list = getItemValue();
        connectToSqlDB = new ConnectToSqlDB();
        connectToSqlDB.insertDataFromArrayListToSqlTable(list,"searchList","topics");

    }

    public List<String> getItemsListFromDB()throws Exception{
        List<String> list = new ArrayList<String>();
        list = connectToSqlDB.readDataBase("searchList", "topics");
        return list;
    }

    public static void main(String[] args)throws Exception{
        ConnectToSqlDB connectToSqlDB = new ConnectToSqlDB();
        List<String> list = connectToSqlDB.readDataBase("searchList","topics");
        for(String st:list){
            System.out.println(st);
        }
//        insertDataIntoDB();


    }
}
