public class GitRunnin {
    //class level vars
    //datatypes 
    public static void main(String[] args) throws Exception {
        //DATATYPE VAR NAME [=VALUE];
        int games = 3;
        double allowance = 40.50;
        long battlepass;//we define battlepass
        battlepass= 15;//assigning value to battlepass

        //printing out our variables values along with a string explaining them
        System.out.println("number of games I own = "+ games);
        System.out.println("my monthly allowance = " + allowance);
        System.out.println("cost of new fortnutting battlepass = " + battlepass);
       
        double c = allowance / battlepass; //creating variable to store our new values
        c= Math.floor(c); //using said varibale to let us round down the math we did, as you can't buy 2.7 battlepasses
        System.out.println("my allowance can buy this number of battlepasses:" + c);//printing finished variable
        System.out.println("the total cost of these passes is:" + c*battlepass);//multiplying cost of one BP by variable to get total value.
        }
    }
    
