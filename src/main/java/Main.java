/**
 * Created by phujcn on 16/05/2016.
 */

import static spark.Spark.*;

public class Main {
    public static void main (String[] args){
        TestSorting sorter = new TestSorting();
        get("/hello", (req,res) ->  "Hello World!");
        get("/helloDave", (req,res) ->  "Hello dave!");
        get("/sorting", (reg,res)  ->  sorter.sort());

    }
}
