
package alphaben.irc;

public class GlobalConfig 
{
    public static String  SERVER_DISCONNECTED = "Server  Disconected"; 
    
     public static String  ERR_SEND_TO_SERVER = "Error : while Send To Server "; 
     public static String  ERR_REICEVE_FROM  = "Error: while Send To Server "; 
     public static String  ERR_CON_SERVER  ="Error : failed connecting   to server";
     public static String  EMPTY_FIELDS   ="Empty Address or Port or PassWord  !";
     public static Thread Mintor = new  Thread(new ClinetMintor());
     public static int port = 8080;
     public static String HOST =  "localhost";
     public static String SERVER_PASS = "root" ;
     public static int  command  = 0;
    
  
      public static final int   Start  =  1;
      public static final int   Stop   =  2;
      public static final int   SendToAll = 3;
   
     
      public static  String[] names = {
            "James", "Mary", "Robert", "Patricia", "John", "Jennifer", "Michael", "Linda", "David", "Elizabeth",
            "William", "Barbara", "Richard", "Susan", "Joseph", "Jessica", "Thomas", "Sarah", "Christopher", "Karen",
            "Charles", "Lisa", "Daniel", "Nancy", "Matthew", "Betty", "Anthony", "Sandra", "Mark", "Margaret",
            "Donald", "Ashley", "Steven", "Kimberly", "Andrew", "Emily", "Paul", "Donna", "Joshua", "Michelle",
            "Kenneth", "Carol", "Kevin", "Amanda", "Brian", "Melissa", "George", "Deborah", "Timothy", "Stephanie",
            "Ronald", "Dorothy", "Jason", "Rebecca", "Edward", "Sharon", "Jeffrey", "Laura", "Ryan", "Cynthia",
            "Jacob", "Amy", "Gary", "Kathleen", "Nicholas", "Angela", "Eric", "Shirley", "Jonathan", "Brenda",
            "Stephen", "Emma", "Larry", "Anna", "Justin", "Pamela", "Scott", "Nicole", "Brandon", "Samantha",
            "Benjamin", "Katherine", "Samuel", "Christine", "Gregory", "Helen", "Alexander", "Debra", "Patrick",
            "Rachel", "Frank", "Carolyn", "Raymond", "Janet", "Jack", "Maria", "Dennis", "Catherine", "Jerry",
            "Heather", "Tyler", "Diane", "Aaron", "Olivia", "Jose", "Julie", "Adam", "Joyce", "Nathan", "Victoria",
            "Henry", "Ruth", "Zachary", "Virginia", "Douglas", "Lauren", "Peter", "Kelly", "Kyle", "Christina",
            "Noah", "Joan", "Ethan", "Evelyn", "Jeremy", "Judith", "Walter", "Andrea", "Christian", "Hannah",
            "Keith", "Megan", "Roger", "Cheryl", "Terry", "Jacqueline", "Austin", "Martha", "Sean", "Madison",
            "Gerald", "Teresa", "Carl", "Gloria", "Harold", "Sara", "Dylan", "Janice", "Arthur", "Ann",
            "Lawrence", "Kathryn", "Jordan", "Abigail", "Jesse", "Sophia", "Bryan", "Frances", "Billy", "Jean",
            "Bruce", "Alice", "Gabriel", "Judy", "Joe", "Isabella", "Logan", "Julia", "Alan", "Grace", "Juan",
            "Amber", "Albert", "Denise", "Willie", "Danielle", "Elijah", "Marilyn", "Wayne", "Beverly", "Randy",
            "Charlotte", "Vincent", "Natalie", "Mason", "Theresa", "Roy", "Diana", "Ralph", "Brittany", "Bobby",
            "Doris", "Russell", "Kayla", "Bradley", "Alexis", "Philip", "Lori", "Eugene", "Marie"
        };
        
}
