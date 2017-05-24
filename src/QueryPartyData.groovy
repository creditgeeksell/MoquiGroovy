import groovy.sql.Sql;


/**
 * Created by CSUKNSIL on 24/05/2017.
 */
class QueryPartyData
{

    static void main(String[] args)
    {
        println("Test Groovy Script Working!");

        def sqlConnection = Sql.newInstance( "jdbc:h2:tcp://localhost:9092/moqui",
                                            "sa",
                                        "sa",
                                    "org.h2.Driver");

        def sqlQuery = """
                       SELECT PARTY_ID
                       FROM PUBLIC.PARTY;
                       """;

        sqlConnection.execute(sqlQuery);

    }

}
