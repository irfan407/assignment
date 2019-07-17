package highcohesive;

public class PlayerDatabase {

      ConnectDatabase connectD=new ConnectDatabase();
    PrintAllPlayersInfo allPlayer= new PrintAllPlayersInfo();
    PrintRankings rankings = new PrintRankings();
    CloseDatabase closeD= new CloseDatabase();
    PrintSinglePlayerInfo singlePlayer = new PrintSinglePlayerInfo();
}
class ConnectDatabase{
    //connect to database
}
class CloseDatabase{
    //closing database connection
}
class PrintRankings{
    //printing the player current rankings
}

class PrintAllPlayersInfo
{
//printing all the players information.
}

class PrintSinglePlayerInfo
{
//printing a single player information.
}