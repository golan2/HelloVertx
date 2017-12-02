package golan.hello.vertx;

import io.vertx.core.Vertx;
import io.vertx.core.http.HttpServer;
import io.vertx.core.http.HttpServerResponse;

public class SimpleVertxServer {


    private static final int PORT = 8082;

    public static void main(String[] args) throws InterruptedException {
        final Vertx vertex = Vertx.vertx();
        HttpServer server = vertex.createHttpServer();
        try {
            System.out.println("Prepare");
            server.requestHandler(request -> {
                HttpServerResponse response = request.response();
                final StringBuilder buf = generateResponse();
                response.end(buf.toString());
            });
            System.out.println("Listening");
            server.listen(PORT);
            System.out.println("Done");
        } finally {
            for (int i = 6*60*60; i >0 ; i--) {
                System.out.println("\t"+i);
                Thread.sleep(1000);
            }
            System.out.println("Closing");
            server.close();
            vertex.close();
        }
    }

    private static StringBuilder generateResponse() {
        final StringBuilder buf = new StringBuilder();
        buf.append("[\n" +
                "  {\n" +
                "    \"title\": \"Shia LaBeouf\", \n" +
                "    \"person_id\": \"nm0479471\", \n" +
                "    \"image\": {\n" +
                "      \"poster\": \"https://images-na.ssl-images-amazon.com/images/M/MV5BMGI1NWY3MDAtYjY2YS00MTE4LTkxMDgtNzhkNzY1MWY1NmM2XkEyXkFqcGdeQXVyMjQwMDg0Ng@@._V1_UY1200_CR153,0,630,1200_AL_.jpg\", \n" +
                "      \"thumb\": \"https://images-na.ssl-images-amazon.com/images/M/MV5BMGI1NWY3MDAtYjY2YS00MTE4LTkxMDgtNzhkNzY1MWY1NmM2XkEyXkFqcGdeQXVyMjQwMDg0Ng@@._V1_UY317_CR16,0,214,317_AL_.jpg\"\n" +
                "    }, \n" +
                "    \"type\": [\n" +
                "      \"Actor\", \n" +
                "      \"Director\", \n" +
                "      \"Soundtrack\"\n" +
                "    ], \n" +
                "    \"description\": \"Shia Saide LaBeouf was born in Los Angeles, California, to Shayna (Saide) and Jeffrey Craig LaBeouf, and is an only child. His mother is from an Ashkenazi Jewish family, while his father has Cajun (French) ancestry. His parents are divorced. He started his career by doing stand-up comedy around places in his neighborhood, such as coffee clubs. One...\", \n" +
                "    \"birthday\": \"1986-6-11\", \n" +
                "    \"birthplace\": \"Los Angeles, California, USA\", \n" +
                "    \"filmography\": {\n" +
                "      \"soundtrack\": [\n" +
                "        {\n" +
                "          \"url\": \"http://www.imdb.com/title/tt0072562/\", \n" +
                "          \"year\": \"2008\", \n" +
                "          \"type\": \"TV Series\", \n" +
                "          \"imdb_id\": \"tt0072562\", \n" +
                "          \"title\": \"Saturday Night LiveShia LaBeouf/My Morning Jacket\"\n" +
                "        }, \n" +
                "        {\n" +
                "          \"url\": \"http://www.imdb.com/title/tt0311289/\", \n" +
                "          \"year\": \"2003\", \n" +
                "          \"type\": \"Film\", \n" +
                "          \"imdb_id\": \"tt0311289\", \n" +
                "          \"title\": \"Holes\"\n" +
                "        }, \n" +
                "        {\n" +
                "          \"url\": \"http://www.imdb.com/title/tt0206511/\", \n" +
                "          \"year\": \"2002\", \n" +
                "          \"type\": \"TV Series\", \n" +
                "          \"imdb_id\": \"tt0206511\", \n" +
                "          \"title\": \"Even StevensBand on the RoofInfluenza: The Musical\"\n" +
                "        }\n" +
                "      ], \n");
        buf.append(
                "      \"producer\": [\n" +
                "        {\n" +
                "          \"url\": \"http://www.imdb.com/title/tt2638900/\", \n" +
                "          \"year\": \"2016\", \n" +
                "          \"type\": \"Film\", \n" +
                "          \"imdb_id\": \"tt2638900\", \n" +
                "          \"title\": \"LoveTrue\"\n" +
                "        }, \n" +
                "        {\n" +
                "          \"url\": \"http://www.imdb.com/title/tt6383604/\", \n" +
                "          \"year\": \"2015\", \n" +
                "          \"type\": \"Short Film\", \n" +
                "          \"imdb_id\": \"tt6383604\", \n" +
                "          \"title\": \"#INTRODUCTIONS\"\n" +
                "        }, \n" +
                "        {\n" +
                "          \"url\": \"http://www.imdb.com/title/tt2043796/\", \n" +
                "          \"year\": \"2011\", \n" +
                "          \"type\": \"Video short\", \n" +
                "          \"imdb_id\": \"tt2043796\", \n" +
                "          \"title\": \"Marilyn Manson: Born Villain\"\n" +
                "        }, \n" +
                "        {\n" +
                "          \"url\": \"http://www.imdb.com/title/tt1243225/\", \n" +
                "          \"year\": \"2008\", \n" +
                "          \"type\": \"Short Film\", \n" +
                "          \"imdb_id\": \"tt1243225\", \n" +
                "          \"title\": \"The Smallest River in Almirante\"\n" +
                "        }\n" +
                "      ], \n" +
                "      \"self\": [\n" +
                "        {\n" +
                "          \"url\": \"http://www.imdb.com/title/tt0816188/\", \n" +
                "          \"year\": \"2017\", \n" +
                "          \"type\": \"TV Series\", \n" +
                "          \"imdb_id\": \"tt0816188\", \n" +
                "          \"title\": \"CTV National NewsEpisode dated 7 September 2017\"\n" +
                "        }, \n" +
                "        {\n" +
                "          \"url\": \"http://www.imdb.com/title/tt0320037/\", \n" +
                "          \"year\": \"2003-2016\", \n" +
                "          \"type\": \"TV Series\", \n" +
                "          \"imdb_id\": \"tt0320037\", \n" +
                "          \"title\": \"Jimmy Kimmel Live!Shia LaBeouf/Anna Camp/Green DayShia LaBeouf/Michelle Monaghan/T.I.Episode #9.157Episode #7.95Episode #6.130\"\n" +
                "        }, \n" +
                "        {\n" +
                "          \"url\": \"http://www.imdb.com/title/tt0379623/\", \n" +
                "          \"year\": \"2008-2016\", \n" +
                "          \"type\": \"TV Series\", \n" +
                "          \"imdb_id\": \"tt0379623\", \n" +
                "          \"title\": \"Ellen: The Ellen DeGeneres ShowShia LaBeouf/Jesse Williams/Jon Dorenbos/Troye SivanShia LaBeouf/Gina Rodriguez/Padma Lakshmi/Guest DJ Meghan TrainorEpisode dated 26 September 2008\"\n" +
                "        }, \n" +
                "        {\n" +
                "          \"url\": \"http://www.imdb.com/title/tt4280606/\", \n" +
                "          \"year\": \"2015-2016\", \n" +
                "          \"type\": \"TV Series\", \n" +
                "          \"imdb_id\": \"tt4280606\", \n" +
                "          \"title\": \"The Late Late Show with James CordenShia LaBeouf/Cobie Smulders/Rachel BloomTom Hanks/Mila Kunis\"\n" +
                "        }, \n" +
                "        {\n" +
                "          \"url\": \"http://www.imdb.com/title/tt6383604/\", \n" +
                "          \"year\": \"2015\", \n" +
                "          \"type\": \"Short Film\", \n" +
                "          \"imdb_id\": \"tt6383604\", \n" +
                "          \"title\": \"#INTRODUCTIONS\"\n" +
                "        }, \n" +
                "        {\n" +
                "          \"url\": \"http://www.imdb.com/title/tt4380518/\", \n" +
                "          \"year\": \"2015\", \n" +
                "          \"type\": \"Film\", \n" +
                "          \"imdb_id\": \"tt4380518\", \n" +
                "          \"title\": \"The 57th Annual Grammy Awards\"\n" +
                "        }, \n" +
                "        {\n" +
                "          \"url\": \"http://www.imdb.com/title/tt5272060/\", \n" +
                "          \"year\": \"2015\", \n" +
                "          \"type\": \"Video short\", \n" +
                "          \"imdb_id\": \"tt5272060\", \n" +
                "          \"title\": \"Fury: Blood Brothers\"\n" +
                "        }, \n" +
                "        {\n" +
                "          \"url\": \"http://www.imdb.com/title/tt5272162/\", \n" +
                "          \"year\": \"2015\", \n" +
                "          \"type\": \"Video short\", \n" +
                "          \"imdb_id\": \"tt5272162\", \n" +
                "          \"title\": \"Fury: Director's Combat Journal\"\n" +
                "        }, \n" +
                "        {\n" +
                "          \"url\": \"http://www.imdb.com/title/tt0426701/\", \n" +
                "          \"year\": \"2009-2014\", \n" +
                "          \"type\": \"TV Series documentary\", \n" +
                "          \"imdb_id\": \"tt0426701\", \n" +
                "          \"title\": \"Le grand journal de Canal+Episode dated 20 October 2014Episode dated 18 May 2012Episode dated 15 May 2010Episode dated 12 June 2009\"\n" +
                "        }, \n" +
                "        {\n" +
                "          \"url\": \"http://www.imdb.com/title/tt0072506/\", \n" +
                "          \"year\": \"2014\", \n" +
                "          \"type\": \"TV Series\", \n" +
                "          \"imdb_id\": \"tt0072506\", \n" +
                "          \"title\": \"Good Morning AmericaEpisode dated 17 October 2014\"\n" +
                "        }, \n");
        buf.append(
                "        {\n" +
                "          \"url\": \"http://www.imdb.com/title/tt0081857/\", \n" +
                "          \"year\": \"2007-2014\", \n" +
                "          \"type\": \"TV Series\", \n" +
                "          \"imdb_id\": \"tt0081857\", \n" +
                "          \"title\": \"Entertainment TonightEpisode dated 16 October 2014Episode dated 15 October 2014Episode dated 3 October 2014Episode dated 13 September 2010Episode dated 5 July 2010\"\n" +
                "        }, \n" +
                "        {\n" +
                "          \"url\": \"http://www.imdb.com/title/tt0430836/\", \n" +
                "          \"year\": \"2014\", \n" +
                "          \"type\": \"TV Series\", \n" +
                "          \"imdb_id\": \"tt0430836\", \n" +
                "          \"title\": \"The InsiderEpisode dated 2 September 2014\"\n" +
                "        }, \n" +
                "        {\n" +
                "          \"url\": \"http://www.imdb.com/title/tt0266134/\", \n" +
                "          \"year\": \"2014\", \n" +
                "          \"type\": \"TV Series\", \n" +
                "          \"imdb_id\": \"tt0266134\", \n" +
                "          \"title\": \"E! NewsEpisode dated 28 June 2014Episode dated 27 June 2014\"\n" +
                "        }, \n" +
                "        {\n" +
                "          \"url\": \"http://www.imdb.com/title/tt0166442/\", \n" +
                "          \"year\": \"2014\", \n" +
                "          \"type\": \"TV Series documentary\", \n" +
                "          \"imdb_id\": \"tt0166442\", \n" +
                "          \"title\": \"Inside EditionDisability Investigation\"\n" +
                "        }, \n" +
                "        {\n" +
                "          \"url\": \"http://www.imdb.com/title/tt4525806/\", \n" +
                "          \"year\": \"2014\", \n" +
                "          \"type\": \"Video short\", \n" +
                "          \"imdb_id\": \"tt4525806\", \n" +
                "          \"title\": \"The Necessary Death of Charlie Countryman: The Making of 'The Necessary Death of Charlie Countryman'\"\n" +
                "        }, \n" +
                "        {\n" +
                "          \"url\": \"http://www.imdb.com/title/tt5230296/\", \n" +
                "          \"year\": \"2013\", \n" +
                "          \"type\": \"Video short\", \n" +
                "          \"imdb_id\": \"tt5230296\", \n" +
                "          \"title\": \"The Company You Keep: Behind-the-Scenes - The Movement\"\n" +
                "        }, \n" +
                "        {\n" +
                "          \"url\": \"http://www.imdb.com/title/tt5230324/\", \n" +
                "          \"year\": \"2013\", \n" +
                "          \"type\": \"Video short\", \n" +
                "          \"imdb_id\": \"tt5230324\", \n" +
                "          \"title\": \"The Company You Keep: Behind-the-Scenes - The Script, Preparation and the Cast\"\n" +
                "        }, \n" +
                "        {\n" +
                "          \"url\": \"http://www.imdb.com/title/tt0096636/\", \n" +
                "          \"year\": \"2003-2013\", \n" +
                "          \"type\": \"TV Series\", \n" +
                "          \"imdb_id\": \"tt0096636\", \n" +
                "          \"title\": \"Live with Kelly and RyanEpisode dated 4 April 2013Episode dated 20 August 2012Episode dated 22 August 2011Episode dated 30 June 2011Episode dated 20 May 2008\"\n" +
                "        }, \n" +
                "        {\n" +
                "          \"url\": \"http://www.imdb.com/title/tt0106053/\", \n" +
                "          \"year\": \"2007-2013\", \n" +
                "          \"type\": \"TV Series\", \n" +
                "          \"imdb_id\": \"tt0106053\", \n" +
                "          \"title\": \"Late Show with David LettermanEpisode #20.111Episode #18.157Shia LaBeouf/Brian Regan/Jimmy Eat WorldStupid Pet Tricks/Shia LaBeouf/N.E.R.D.Episode dated 29 June 2007\"\n" +
                "        }, \n" +
                "        {\n" +
                "          \"url\": \"http://www.imdb.com/title/tt2240092/\", \n" +
                "          \"year\": \"2012\", \n" +
                "          \"type\": \"Short Film\", \n" +
                "          \"imdb_id\": \"tt2240092\", \n" +
                "          \"title\": \"The Making of: Fj\\u00f6gur Piano\"\n" +
                "        }, \n" +
                "        {\n" +
                "          \"url\": \"http://www.imdb.com/title/tt5296910/\", \n" +
                "          \"year\": \"2012\", \n" +
                "          \"type\": \"Video short\", \n" +
                "          \"imdb_id\": \"tt5296910\", \n" +
                "          \"title\": \"The Making of the Kingdom of the Crystal Skull\"\n" +
                "        }, \n" +
                "        {\n" +
                "          \"url\": \"http://www.imdb.com/title/tt5123584/\", \n" +
                "          \"year\": \"2012\", \n" +
                "          \"type\": \"TV Series\", \n" +
                "          \"imdb_id\": \"tt5123584\", \n" +
                "          \"title\": \"Rencontres de cin\\u00e9maEpisode dated 9 September 2012\"\n" +
                "        }, \n" +
                "        {\n" +
                "          \"url\": \"http://www.imdb.com/title/tt1002838/\", \n" +
                "          \"year\": \"2012\", \n" +
                "          \"type\": \"TV Series\", \n" +
                "          \"imdb_id\": \"tt1002838\", \n" +
                "          \"title\": \"Chelsea LatelyEpisode #6.129\"\n" +
                "        }, \n" +
                "        {\n" +
                "          \"url\": \"http://www.imdb.com/title/tt0103569/\", \n" +
                "          \"year\": \"2003-2012\", \n" +
                "          \"type\": \"TV Series\", \n" +
                "          \"imdb_id\": \"tt0103569\", \n" +
                "          \"title\": \"The Tonight Show with Jay LenoEpisode #20.193Episode #16.155Episode #15.107Episode #15.59Episode #13.165\"\n" +
                "        }, \n" +
                "        {\n" +
                "          \"url\": \"http://www.imdb.com/title/tt0930831/\", \n" +
                "          \"year\": \"2012\", \n" +
                "          \"type\": \"TV Series\", \n" +
                "          \"imdb_id\": \"tt0930831\", \n" +
                "          \"title\": \"GomorronEpisode dated 21 May 2012\"\n" +
                "        }, \n" +
                "        {\n" +
                "          \"url\": \"http://www.imdb.com/title/tt2210415/\", \n" +
                "          \"year\": \"2012\", \n" +
                "          \"type\": \"Film\", \n" +
                "          \"imdb_id\": \"tt2210415\", \n" +
                "          \"title\": \"Above and Beyond: Exploring Dark of the Moon\"\n" +
                "        }, \n" +
                "        {\n" +
                "          \"url\": \"http://www.imdb.com/title/tt1990974/\", \n" +
                "          \"year\": \"2011\", \n" +
                "          \"type\": \"Film\", \n" +
                "          \"imdb_id\": \"tt1990974\", \n" +
                "          \"title\": \"33-y Moskovskiy mezhdunarodnyy kinofestival\"\n" +
                "        }, \n" +
                "        {\n" +
                "          \"url\": \"http://www.imdb.com/title/tt1981121/\", \n" +
                "          \"year\": \"2011\", \n" +
                "          \"type\": \"Short Film\", \n" +
                "          \"imdb_id\": \"tt1981121\", \n" +
                "          \"title\": \"Transformers: Dark of the Moon - 35mm Special\"\n" +
                "        }, \n" );
        buf.append(
                "        {\n" +
                "          \"url\": \"http://www.imdb.com/title/tt1480165/\", \n" +
                "          \"year\": \"2011\", \n" +
                "          \"type\": \"TV Series\", \n" +
                "          \"imdb_id\": \"tt1480165\", \n" +
                "          \"title\": \"The 7PM ProjectEpisode #1.488\"\n" +
                "        }, \n" +
                "        {\n" +
                "          \"url\": \"http://www.imdb.com/title/tt1924211/\", \n" +
                "          \"year\": \"2011\", \n" +
                "          \"type\": \"Film\", \n" +
                "          \"imdb_id\": \"tt1924211\", \n" +
                "          \"title\": \"2011 MTV Movie Awards\"\n" +
                "        }, \n" +
                "        {\n" +
                "          \"url\": \"http://www.imdb.com/title/tt0911896/\", \n" +
                "          \"year\": \"2010\", \n" +
                "          \"type\": \"TV Series\", \n" +
                "          \"imdb_id\": \"tt0911896\", \n" +
                "          \"title\": \"Made in HollywoodEpisode #6.1\"\n" +
                "        }, \n" +
                "        {\n" +
                "          \"url\": \"http://www.imdb.com/title/tt0270116/\", \n" +
                "          \"year\": \"2010\", \n" +
                "          \"type\": \"TV Series\", \n" +
                "          \"imdb_id\": \"tt0270116\", \n" +
                "          \"title\": \"Charlie RoseEpisode dated 24 September 2010\"\n" +
                "        }, \n" +
                "        {\n" +
                "          \"url\": \"http://www.imdb.com/title/tt0044298/\", \n" +
                "          \"year\": \"2009-2010\", \n" +
                "          \"type\": \"TV Series\", \n" +
                "          \"imdb_id\": \"tt0044298\", \n" +
                "          \"title\": \"TodayEpisode dated 13 May 2010Episode dated 25 June 2009\"\n" +
                "        }, \n" +
                "        {\n" +
                "          \"url\": \"http://www.imdb.com/title/tt1245693/\", \n" +
                "          \"year\": \"2010\", \n" +
                "          \"type\": \"TV Series\", \n" +
                "          \"imdb_id\": \"tt1245693\", \n" +
                "          \"title\": \"Made in Hollywood: Teen EditionTeen Acting CareersTeen Acting Careers with 'Greek'\"\n" +
                "        }, \n" +
                "        {\n" +
                "          \"url\": \"http://www.imdb.com/title/tt1579253/\", \n" +
                "          \"year\": \"2010\", \n" +
                "          \"type\": \"Film\", \n" +
                "          \"imdb_id\": \"tt1579253\", \n" +
                "          \"title\": \"Top 20 Under 25\"\n" +
                "        }, \n" +
                "        {\n" +
                "          \"url\": \"http://www.imdb.com/title/tt1538813/\", \n" +
                "          \"year\": \"2009\", \n" +
                "          \"type\": \"Film\", \n" +
                "          \"imdb_id\": \"tt1538813\", \n" +
                "          \"title\": \"A Day with Bay: Tokyo\"\n" +
                "        }, \n" +
                "        {\n" +
                "          \"url\": \"http://www.imdb.com/title/tt1538529/\", \n" +
                "          \"year\": \"2009\", \n" +
                "          \"type\": \"Film\", \n" +
                "          \"imdb_id\": \"tt1538529\", \n" +
                "          \"title\": \"The Human Factor: Exacting Revenge of the Fallen\"\n" +
                "        }, \n" +
                "        {\n" +
                "          \"url\": \"http://www.imdb.com/title/tt1469894/\", \n" +
                "          \"year\": \"2009\", \n" +
                "          \"type\": \"Film\", \n" +
                "          \"imdb_id\": \"tt1469894\", \n" +
                "          \"title\": \"The Teen Choice Awards 2009\"\n" +
                "        }, \n" +
                "        {\n" +
                "          \"url\": \"http://www.imdb.com/title/tt1434322/\", \n" +
                "          \"year\": \"2007-2009\", \n" +
                "          \"type\": \"TV Series\", \n" +
                "          \"imdb_id\": \"tt1434322\", \n" +
                "          \"title\": \"Up Close with Carrie KeaganEpisode dated 30 June 2009Episode dated 24 June 2009Episode dated 24 September 2008Episode dated 21 May 2008Episode dated 27 June 2007\"\n" +
                "        }, \n" +
                "        {\n" +
                "          \"url\": \"http://www.imdb.com/title/tt0220225/\", \n" +
                "          \"year\": \"2009\", \n" +
                "          \"type\": \"TV Series\", \n" +
                "          \"imdb_id\": \"tt0220225\", \n" +
                "          \"title\": \"The Early ShowEpisode dated 29 June 2009\"\n" +
                "        }, \n" +
                "        {\n" +
                "          \"url\": \"http://www.imdb.com/title/tt1332048/\", \n" +
                "          \"year\": \"2009\", \n" +
                "          \"type\": \"TV Series documentary\", \n" +
                "          \"imdb_id\": \"tt1332048\", \n" +
                "          \"title\": \"Making of...Transformers - Die Rache\"\n" +
                "        }, \n" +
                "        {\n" +
                "          \"url\": \"http://www.imdb.com/title/tt0899126/\", \n" +
                "          \"year\": \"2009\", \n" +
                "          \"type\": \"TV Series\", \n" +
                "          \"imdb_id\": \"tt0899126\", \n" +
                "          \"title\": \"The Tonight Show with Conan O'BrienShia LeBeouf/Phil Jackson/Holly Williams\"\n" +
                "        }, \n" +
                "        {\n" +
                "          \"url\": \"http://www.imdb.com/title/tt1016283/\", \n" +
                "          \"year\": \"2009\", \n" +
                "          \"type\": \"TV Series\", \n" +
                "          \"imdb_id\": \"tt1016283\", \n" +
                "          \"title\": \"Xpos\\u00e9Episode #3.190\"\n" +
                "        }, \n" +
                "        {\n" );
        buf.append(
                "          \"url\": \"http://www.imdb.com/title/tt1401689/\", \n" +
                "          \"year\": \"2009\", \n" +
                "          \"type\": \"Film\", \n" +
                "          \"imdb_id\": \"tt1401689\", \n" +
                "          \"title\": \"2009 MTV Movie Awards\"\n" +
                "        }, \n" +
                "        {\n" +
                "          \"url\": \"http://www.imdb.com/title/tt1409118/\", \n" +
                "          \"year\": \"2009\", \n" +
                "          \"type\": \"Film\", \n" +
                "          \"imdb_id\": \"tt1409118\", \n" +
                "          \"title\": \"Nickelodeon Kids' Choice Awards 2009\"\n" +
                "        }, \n" +
                "        {\n" +
                "          \"url\": \"http://www.imdb.com/title/tt1366328/\", \n" +
                "          \"year\": \"2009\", \n" +
                "          \"type\": \"Film\", \n" +
                "          \"imdb_id\": \"tt1366328\", \n" +
                "          \"title\": \"The Orange British Academy Film Awards\"\n" +
                "        }, \n" +
                "        {\n" +
                "          \"url\": \"http://www.imdb.com/title/tt5252860/\", \n" +
                "          \"year\": \"2008\", \n" +
                "          \"type\": \"Film\", \n" +
                "          \"imdb_id\": \"tt5252860\", \n" +
                "          \"title\": \"Asymmetrical Warfare: The Making of 'Eagle Eye'\"\n" +
                "        }, \n" +
                "        {\n" +
                "          \"url\": \"http://www.imdb.com/title/tt5252872/\", \n" +
                "          \"year\": \"2008\", \n" +
                "          \"type\": \"Video short\", \n" +
                "          \"imdb_id\": \"tt5252872\", \n" +
                "          \"title\": \"Eagle Eye: Is My Cell Phone Spying on Me?\"\n" +
                "        }, \n" +
                "        {\n" +
                "          \"url\": \"http://www.imdb.com/title/tt5252958/\", \n" +
                "          \"year\": \"2008\", \n" +
                "          \"type\": \"Film\", \n" +
                "          \"imdb_id\": \"tt5252958\", \n" +
                "          \"title\": \"Road Trip: On Location with the Cast and Crew of 'Eagle Eye'\"\n" +
                "        }, \n" +
                "        {\n" +
                "          \"url\": \"http://www.imdb.com/title/tt1343939/\", \n" +
                "          \"year\": \"2008\", \n" +
                "          \"type\": \"Video short\", \n" +
                "          \"imdb_id\": \"tt1343939\", \n" +
                "          \"title\": \"Indiana Jones 4: Pre-production\"\n" +
                "        }, \n" +
                "        {\n" +
                "          \"url\": \"http://www.imdb.com/title/tt0318220/\", \n" +
                "          \"year\": \"2005-2008\", \n" +
                "          \"type\": \"TV Series documentary\", \n" +
                "          \"imdb_id\": \"tt0318220\", \n" +
                "          \"title\": \"HBO First LookEagle EyeThe Making of Eagle Eye'Transformers': Their War. Our WorldConstantine: Heaven, Hell and Beyond\"\n" +
                "        }, \n" +
                "        {\n" +
                "          \"url\": \"http://www.imdb.com/title/tt1343940/\", \n" +
                "          \"year\": \"2008\", \n" +
                "          \"type\": \"Video short\", \n" +
                "          \"imdb_id\": \"tt1343940\", \n" +
                "          \"title\": \"Indiana Jones 4: The Return of a Legend\"\n" +
                "        }, \n" +
                "        {\n" +
                "          \"url\": \"http://www.imdb.com/title/tt1405392/\", \n" +
                "          \"year\": \"2008\", \n" +
                "          \"type\": \"Film\", \n" +
                "          \"imdb_id\": \"tt1405392\", \n" +
                "          \"title\": \"Production Diary: Making of 'The Kingdom of the Crystal Skull'\"\n" +
                "        }, \n" +
                "        {\n" +
                "          \"url\": \"http://www.imdb.com/title/tt1286158/\", \n" +
                "          \"year\": \"2008\", \n" +
                "          \"type\": \"Film\", \n" +
                "          \"imdb_id\": \"tt1286158\", \n" +
                "          \"title\": \"2008 MTV Video Music Awards\"\n" +
                "        }, \n" +
                "        {\n" +
                "          \"url\": \"http://www.imdb.com/title/tt1267446/\", \n" +
                "          \"year\": \"2008\", \n" +
                "          \"type\": \"Short Film\", \n" +
                "          \"imdb_id\": \"tt1267446\", \n" +
                "          \"title\": \"Achter de schermen bij 'Indiana Jones and the Kingdom of the Crystal Skull'\"\n" +
                "        }, \n" +
                "        {\n" +
                "          \"url\": \"http://www.imdb.com/title/tt0381753/\", \n" +
                "          \"year\": \"2008\", \n" +
                "          \"type\": \"TV Series documentary\", \n" +
                "          \"imdb_id\": \"tt0381753\", \n" +
                "          \"title\": \"Fant\\u00e1sticoEpisode dated 18 May 2008\"\n" +
                "        }, \n" +
                "        {\n" +
                "          \"url\": \"http://www.imdb.com/title/tt1265978/\", \n" +
                "          \"year\": \"2008\", \n" +
                "          \"type\": \"Video short\", \n" +
                "          \"imdb_id\": \"tt1265978\", \n" +
                "          \"title\": \"Indiana Jones: An Appreciation\"\n" +
                "        }, \n" +
                "        {\n" +
                "          \"url\": \"http://www.imdb.com/title/tt0072562/\", \n" +
                "          \"year\": \"2008\", \n" +
                "          \"type\": \"TV Series\", \n" +
                "          \"imdb_id\": \"tt0072562\", \n" +
                "          \"title\": \"Saturday Night LiveShia LaBeouf/My Morning Jacket\"\n" +
                "        }, \n" +
                "        {\n" +
                "          \"url\": \"http://www.imdb.com/title/tt1212906/\", \n" +
                "          \"year\": \"2008\", \n" +
                "          \"type\": \"Film\", \n" +
                "          \"imdb_id\": \"tt1212906\", \n" +
                "          \"title\": \"Nickelodeon Kids' Choice Awards 2008\"\n" +
                "        }, \n" +
                "        {\n" +
                "          \"url\": \"http://www.imdb.com/title/tt1002691/\", \n" +
                "          \"year\": \"2007\", \n" +
                "          \"type\": \"Film\", \n" +
                "          \"imdb_id\": \"tt1002691\", \n" +
                "          \"title\": \"Nickelodeon Kids' Choice Awards '07\"\n" +
                "        }, \n" +
                "        {\n" +
                "          \"url\": \"http://www.imdb.com/title/tt1454504/\", \n" +
                "          \"year\": \"2007\", \n" +
                "          \"type\": \"Film\", \n" +
                "          \"imdb_id\": \"tt1454504\", \n" +
                "          \"title\": \"NRJ 12: Scream Awards\"\n" +
                "        }, \n" +
                "        {\n" +
                "          \"url\": \"http://www.imdb.com/title/tt1138014/\", \n" +
                "          \"year\": \"2007\", \n" +
                "          \"type\": \"Film\", \n" +
                "          \"imdb_id\": \"tt1138014\", \n" +
                "          \"title\": \"Scream Awards 2007\"\n" +
                "        }, \n" +
                "        {\n" +
                "          \"url\": \"http://www.imdb.com/title/tt1127853/\", \n" +
                "          \"year\": \"2007\", \n" +
                "          \"type\": \"Film\", \n" +
                "          \"imdb_id\": \"tt1127853\", \n" +
                "          \"title\": \"Our World\"\n" +
                "        }, \n" +
                "        {\n" +
                "          \"url\": \"http://www.imdb.com/title/tt1131607/\", \n" +
                "          \"year\": \"2007\", \n" +
                "          \"type\": \"Film\", \n" +
                "          \"imdb_id\": \"tt1131607\", \n" +
                "          \"title\": \"Their War\"\n" +
                "        }, \n" +
                "        {\n" +
                "          \"url\": \"http://www.imdb.com/title/tt1024757/\", \n" +
                "          \"year\": \"2007\", \n" +
                "          \"type\": \"Film\", \n" +
                "          \"imdb_id\": \"tt1024757\", \n" +
                "          \"title\": \"2007 MTV Video Music Awards\"\n" +
                "        }, \n" +
                "        {\n" +
                "          \"url\": \"http://www.imdb.com/title/tt1098224/\", \n" +
                "          \"year\": \"2007\", \n" +
                "          \"type\": \"Film\", \n" +
                "          \"imdb_id\": \"tt1098224\", \n" +
                "          \"title\": \"The Teen Choice Awards 2007\"\n" +
                "        }, \n" +
                "        {\n");
        buf.append(
                "          \"url\": \"http://www.imdb.com/title/tt5247782/\", \n" +
                "          \"year\": \"2007\", \n" +
                "          \"type\": \"Film\", \n" +
                "          \"imdb_id\": \"tt5247782\", \n" +
                "          \"title\": \"The Making of Disturbia\"\n" +
                "        }, \n" +
                "        {\n" +
                "          \"url\": \"http://www.imdb.com/title/tt0972757/\", \n" +
                "          \"year\": \"2007\", \n" +
                "          \"type\": \"Film\", \n" +
                "          \"imdb_id\": \"tt0972757\", \n" +
                "          \"title\": \"2007 MTV Movie Awards\"\n" +
                "        }, \n" +
                "        {\n" +
                "          \"url\": \"http://www.imdb.com/title/tt1034451/\", \n" +
                "          \"year\": \"2007\", \n" +
                "          \"type\": \"Short Film\", \n" +
                "          \"imdb_id\": \"tt1034451\", \n" +
                "          \"title\": \"Max on Set: Disturbia... An Inside Look\"\n" +
                "        }, \n" +
                "        {\n" +
                "          \"url\": \"http://www.imdb.com/title/tt1063328/\", \n" +
                "          \"year\": \"2007\", \n" +
                "          \"type\": \"Film\", \n" +
                "          \"imdb_id\": \"tt1063328\", \n" +
                "          \"title\": \"Film Independent's 2007 Spirit Awards\"\n" +
                "        }, \n" +
                "        {\n" +
                "          \"url\": \"http://www.imdb.com/title/tt1160043/\", \n" +
                "          \"year\": \"2007\", \n" +
                "          \"type\": \"Film\", \n" +
                "          \"imdb_id\": \"tt1160043\", \n" +
                "          \"title\": \"13th Annual Screen Actors Guild Awards\"\n" +
                "        }, \n" +
                "        {\n" +
                "          \"url\": \"http://www.imdb.com/title/tt0305056/\", \n" +
                "          \"year\": \"2006\", \n" +
                "          \"type\": \"TV Series\", \n" +
                "          \"imdb_id\": \"tt0305056\", \n" +
                "          \"title\": \"Last Call with Carson DalyEpisode dated 16 November 2006\"\n" +
                "        }, \n" +
                "        {\n" +
                "          \"url\": \"http://www.imdb.com/title/tt0413610/\", \n" +
                "          \"year\": \"2006\", \n" +
                "          \"type\": \"TV Series\", \n" +
                "          \"imdb_id\": \"tt0413610\", \n" +
                "          \"title\": \"Talking MoviesEpisode dated 15 January 2006\"\n" +
                "        }, \n" +
                "        {\n" +
                "          \"url\": \"http://www.imdb.com/title/tt0486168/\", \n" +
                "          \"year\": \"2005\", \n" +
                "          \"type\": \"Film\", \n" +
                "          \"imdb_id\": \"tt0486168\", \n" +
                "          \"title\": \"Young Hollywood Awards\"\n" +
                "        }, \n" +
                "        {\n" +
                "          \"url\": \"http://www.imdb.com/title/tt0167735/\", \n" +
                "          \"year\": \"2003-2005\", \n" +
                "          \"type\": \"TV Series\", \n" +
                "          \"imdb_id\": \"tt0167735\", \n" +
                "          \"title\": \"Total Request LiveEpisode dated 29 September 2005Episode dated 15 August 2003\"\n" +
                "        }, \n" +
                "        {\n" +
                "          \"url\": \"http://www.imdb.com/title/tt0421470/\", \n" +
                "          \"year\": \"2005\", \n" +
                "          \"type\": \"TV Series\", \n" +
                "          \"imdb_id\": \"tt0421470\", \n" +
                "          \"title\": \"The Tony Danza ShowEpisode #1.104\"\n" +
                "        }, \n" +
                "        {\n" +
                "          \"url\": \"http://www.imdb.com/title/tt0413616/\", \n" +
                "          \"year\": \"2005\", \n" +
                "          \"type\": \"TV Series\", \n" +
                "          \"imdb_id\": \"tt0413616\", \n" +
                "          \"title\": \"UnscriptedEpisode #1.6\"\n" +
                "        }, \n" +
                "        {\n" +
                "          \"url\": \"http://www.imdb.com/title/tt0364900/\", \n" +
                "          \"year\": \"2004\", \n" +
                "          \"type\": \"TV Series\", \n" +
                "          \"imdb_id\": \"tt0364900\", \n" +
                "          \"title\": \"The Wayne Brady ShowEpisode dated 28 May 2004\"\n" +
                "        }, \n" +
                "        {\n" +
                "          \"url\": \"http://www.imdb.com/title/tt0382488/\", \n" +
                "          \"year\": \"2003\", \n" +
                "          \"type\": \"TV Series\", \n" +
                "          \"imdb_id\": \"tt0382488\", \n" +
                "          \"title\": \"Super Short ShowHoles: Shia LaBeouf: 2\"\n" +
                "        }, \n" +
                "        {\n" +
                "          \"url\": \"http://www.imdb.com/title/tt0106052/\", \n" +
                "          \"year\": \"2003\", \n" +
                "          \"type\": \"TV Series\", \n" +
                "          \"imdb_id\": \"tt0106052\", \n" +
                "          \"title\": \"Late Night with Conan O'BrienEpisode #10.163\"\n" +
                "        }, \n" +
                "        {\n" +
                "          \"url\": \"http://www.imdb.com/title/tt0408467/\", \n" +
                "          \"year\": \"2003\", \n" +
                "          \"type\": \"Film\", \n" +
                "          \"imdb_id\": \"tt0408467\", \n" +
                "          \"title\": \"The 30th Annual Daytime Emmy Awards\"\n" +
                "        }, \n" +
                "        {\n" +
                "          \"url\": \"http://www.imdb.com/title/tt0319991/\", \n" +
                "          \"year\": \"2003\", \n" +
                "          \"type\": \"TV Series\", \n" +
                "          \"imdb_id\": \"tt0319991\", \n" +
                "          \"title\": \"E! News LiveEpisode dated 17 April 2003\"\n" +
                "        }, \n" +
                "        {\n" +
                "          \"url\": \"http://www.imdb.com/title/tt0252175/\", \n" +
                "          \"year\": \"2003\", \n" +
                "          \"type\": \"TV Series\", \n" +
                "          \"imdb_id\": \"tt0252175\", \n" +
                "          \"title\": \"The Wayne Brady ShowEpisode dated 14 April 2003\"\n" +
                "        }, \n" +
                "        {\n" +
                "          \"url\": \"http://www.imdb.com/title/tt0407569/\", \n" +
                "          \"year\": \"2002\", \n" +
                "          \"type\": \"Film\", \n" +
                "          \"imdb_id\": \"tt0407569\", \n" +
                "          \"title\": \"Disney's Animation Magic: Beauty and the Beast\"\n" +
                "        }, \n" +
                "        {\n" +
                "          \"url\": \"http://www.imdb.com/title/tt0295122/\", \n" +
                "          \"year\": \"2002\", \n" +
                "          \"type\": \"TV Series\", \n" +
                "          \"imdb_id\": \"tt0295122\", \n" +
                "          \"title\": \"Movie SurfersThe RookieThe Greatest Game Ever Played\"\n" +
                "        }, \n" +
                "        {\n" +
                "          \"url\": \"http://www.imdb.com/title/tt0299368/\", \n" +
                "          \"year\": \"2001\", \n" +
                "          \"type\": \"TV Series\", \n" +
                "          \"imdb_id\": \"tt0299368\", \n" +
                "          \"title\": \"Project Greenlight\"\n" +
                "        }, \n" +
                "        {\n" +
                "          \"url\": \"http://www.imdb.com/title/tt0315667/\", \n" +
                "          \"year\": \"2001\", \n" +
                "          \"type\": \"TV Series\", \n" +
                "          \"imdb_id\": \"tt0315667\", \n" +
                "          \"title\": \"Express Yourself\"\n" +
                "        }, \n" +
                "        {\n" +
                "          \"url\": \"http://www.imdb.com/title/tt0219453/\", \n" +
                "          \"year\": \"1999\", \n" +
                "          \"type\": \"TV Series\", \n" +
                "          \"imdb_id\": \"tt0219453\", \n" +
                "          \"title\": \"Say What? Karaoke\"\n" +
                "        }\n" +
                "      ], \n" +
                "      \"writer\": [\n" +
                "        {\n" +
                "          \"url\": \"http://www.imdb.com/title/tt1869551/\", \n" +
                "          \"year\": \"2011/I\", \n" +
                "          \"type\": \"Short Film\", \n" +
                "          \"imdb_id\": \"tt1869551\", \n" +
                "          \"title\": \"Maniac\"\n" +
                "        }, \n" +
                "        {\n" +
                "          \"url\": \"http://www.imdb.com/title/tt2043796/\", \n" +
                "          \"year\": \"2011\", \n" +
                "          \"type\": \"Video short\", \n" +
                "          \"imdb_id\": \"tt2043796\", \n" +
                "          \"title\": \"Marilyn Manson: Born Villain\"\n" +
                "        }, \n" +
                "        {\n" +
                "          \"url\": \"http://www.imdb.com/title/tt0452812/\", \n" +
                "          \"year\": \"2004\", \n" +
                "          \"type\": \"Short Film\", \n" +
                "          \"imdb_id\": \"tt0452812\", \n" +
                "          \"title\": \"Let's Love Hate\"\n" +
                "        }\n" +
                "      ], \n" +
                "      \"actor\": [\n" +
                "        {\n" +
                "          \"url\": \"http://www.imdb.com/title/tt4364194/\", \n" +
                "          \"year\": \"2018\", \n" +
                "          \"type\": \"Film\", \n" +
                "          \"imdb_id\": \"tt4364194\", \n" +
                "          \"title\": \"The Peanut Butter Falconpost-production\"\n" +
                "        }, \n" +
                "        {\n" +
                "          \"url\": \"http://www.imdb.com/title/tt5727282/\", \n" +
                "          \"year\": \"2017\", \n" +
                "          \"type\": \"Film\", \n" +
                "          \"imdb_id\": \"tt5727282\", \n" +
                "          \"title\": \"Borg McEnroe\"\n" +
                "        }, \n" +
                "        {\n" +
                "          \"url\": \"http://www.imdb.com/title/tt6242900/\", \n" +
                "          \"year\": \"2016\", \n" +
                "          \"type\": \"Short Film\", \n" +
                "          \"imdb_id\": \"tt6242900\", \n" +
                "          \"title\": \"Everyday Performance Artists\"\n" +
                "        }, \n" );
        buf.append(
                "        {\n" +
                "          \"url\": \"http://www.imdb.com/title/tt3721936/\", \n" +
                "          \"year\": \"2016\", \n" +
                "          \"type\": \"Film\", \n" +
                "          \"imdb_id\": \"tt3721936\", \n" +
                "          \"title\": \"American Honey\"\n" +
                "        }, \n" +
                "        {\n" +
                "          \"url\": \"http://www.imdb.com/title/tt2461520/\", \n" +
                "          \"year\": \"2015/I\", \n" +
                "          \"type\": \"Film\", \n" +
                "          \"imdb_id\": \"tt2461520\", \n" +
                "          \"title\": \"Man Down\"\n" +
                "        }, \n" +
                "        {\n" +
                "          \"url\": \"http://www.imdb.com/title/tt4338648/\", \n" +
                "          \"year\": \"2015\", \n" +
                "          \"type\": \"Video short\", \n" +
                "          \"imdb_id\": \"tt4338648\", \n" +
                "          \"title\": \"Sia: Elastic Heart\"\n" +
                "        }, \n" +
                "        {\n" +
                "          \"url\": \"http://www.imdb.com/title/tt4161166/\", \n" +
                "          \"year\": \"2014\", \n" +
                "          \"type\": \"Video short\", \n" +
                "          \"imdb_id\": \"tt4161166\", \n" +
                "          \"title\": \"Rob Cantor: Shia LaBeouf Live\"\n" +
                "        }, \n" +
                "        {\n" +
                "          \"url\": \"http://www.imdb.com/title/tt2713180/\", \n" +
                "          \"year\": \"2014\", \n" +
                "          \"type\": \"Film\", \n" +
                "          \"imdb_id\": \"tt2713180\", \n" +
                "          \"title\": \"Fury\"\n" +
                "        }, \n" +
                "        {\n" +
                "          \"url\": \"http://www.imdb.com/title/tt1937390/\", \n" +
                "          \"year\": \"2013\", \n" +
                "          \"type\": \"Film\", \n" +
                "          \"imdb_id\": \"tt1937390\", \n" +
                "          \"title\": \"Nymphomaniac: Vol. I\"\n" +
                "        }, \n" +
                "        {\n" +
                "          \"url\": \"http://www.imdb.com/title/tt2382009/\", \n" +
                "          \"year\": \"2013\", \n" +
                "          \"type\": \"Film\", \n" +
                "          \"imdb_id\": \"tt2382009\", \n" +
                "          \"title\": \"Nymphomaniac: Vol. II\"\n" +
                "        }, \n" +
                "        {\n" +
                "          \"url\": \"http://www.imdb.com/title/tt1196948/\", \n" +
                "          \"year\": \"2013\", \n" +
                "          \"type\": \"Film\", \n" +
                "          \"imdb_id\": \"tt1196948\", \n" +
                "          \"title\": \"Charlie Countryman\"\n" +
                "        }, \n" +
                "        {\n" +
                "          \"url\": \"http://www.imdb.com/title/tt1381404/\", \n" +
                "          \"year\": \"2012\", \n" +
                "          \"type\": \"Film\", \n" +
                "          \"imdb_id\": \"tt1381404\", \n" +
                "          \"title\": \"The Company You Keep\"\n" +
                "        }, \n" +
                "        {\n" +
                "          \"url\": \"http://www.imdb.com/title/tt2218364/\", \n" +
                "          \"year\": \"2012\", \n" +
                "          \"type\": \"Video short\", \n" +
                "          \"imdb_id\": \"tt2218364\", \n" +
                "          \"title\": \"Sigur R\\u00f3s: Fj\\u00f6gur p\\u00edan\\u00f3\"\n" +
                "        }, \n" +
                "        {\n" +
                "          \"url\": \"http://www.imdb.com/title/tt1212450/\", \n" +
                "          \"year\": \"2012\", \n" +
                "          \"type\": \"Film\", \n" +
                "          \"imdb_id\": \"tt1212450\", \n" +
                "          \"title\": \"Lawless\"\n" +
                "        }, \n" +
                "        {\n" +
                "          \"url\": \"http://www.imdb.com/title/tt1869551/\", \n" +
                "          \"year\": \"2011/I\", \n" +
                "          \"type\": \"Short Film\", \n" +
                "          \"imdb_id\": \"tt1869551\", \n" +
                "          \"title\": \"Maniac\"\n" +
                "        }, \n" +
                "        {\n" +
                "          \"url\": \"http://www.imdb.com/title/tt1399103/\", \n" +
                "          \"year\": \"2011\", \n" +
                "          \"type\": \"Film\", \n" +
                "          \"imdb_id\": \"tt1399103\", \n" +
                "          \"title\": \"Transformers: Dark of the Moon\"\n" +
                "        }, \n" +
                "        {\n" +
                "          \"url\": \"http://www.imdb.com/title/tt1027718/\", \n" +
                "          \"year\": \"2010\", \n" +
                "          \"type\": \"Film\", \n" +
                "          \"imdb_id\": \"tt1027718\", \n" +
                "          \"title\": \"Wall Street: Money Never Sleeps\"\n" +
                "        }, \n" +
                "        {\n" +
                "          \"url\": \"http://www.imdb.com/title/tt1369842/\", \n" +
                "          \"year\": \"2009\", \n" +
                "          \"type\": \"Video Game\", \n" +
                "          \"imdb_id\": \"tt1369842\", \n" +
                "          \"title\": \"Transformers: Revenge of the Fallen\"\n" +
                "        }, \n" +
                "        {\n" +
                "          \"url\": \"http://www.imdb.com/title/tt1055369/\", \n" +
                "          \"year\": \"2009\", \n" +
                "          \"type\": \"Film\", \n" +
                "          \"imdb_id\": \"tt1055369\", \n" +
                "          \"title\": \"Transformers: Revenge of the Fallen\"\n" +
                "        }, \n" +
                "        {\n" +
                "          \"url\": \"http://www.imdb.com/title/tt1059786/\", \n" +
                "          \"year\": \"2008\", \n" +
                "          \"type\": \"Film\", \n" +
                "          \"imdb_id\": \"tt1059786\", \n" +
                "          \"title\": \"Eagle Eye\"\n" +
                "        }, \n" +
                "        {\n" +
                "          \"url\": \"http://www.imdb.com/title/tt0808399/\", \n" +
                "          \"year\": \"2008\", \n" +
                "          \"type\": \"Film\", \n" +
                "          \"imdb_id\": \"tt0808399\", \n" +
                "          \"title\": \"New York, I Love You\"\n" +
                "        }, \n" +
                "        {\n" +
                "          \"url\": \"http://www.imdb.com/title/tt0367882/\", \n" +
                "          \"year\": \"2008\", \n" +
                "          \"type\": \"Film\", \n" +
                "          \"imdb_id\": \"tt0367882\", \n" +
                "          \"title\": \"Indiana Jones and the Kingdom of the Crystal Skull\"\n" +
                "        }, \n" +
                "        {\n" +
                "          \"url\": \"http://www.imdb.com/title/tt5922570/\", \n" +
                "          \"year\": \"2007\", \n" +
                "          \"type\": \"Video short\", \n" +
                "          \"imdb_id\": \"tt5922570\", \n" +
                "          \"title\": \"Disturbia: Outtakes\"\n" +
                "        }, \n" +
                "        {\n" +
                "          \"url\": \"http://www.imdb.com/title/tt1015475/\", \n" +
                "          \"year\": \"2007\", \n" +
                "          \"type\": \"Video Game\", \n" +
                "          \"imdb_id\": \"tt1015475\", \n" +
                "          \"title\": \"Transformers: The Game\"\n" +
                "        }, \n" +
                "        {\n" +
                "          \"url\": \"http://www.imdb.com/title/tt0418279/\", \n" +
                "          \"year\": \"2007\", \n" +
                "          \"type\": \"Film\", \n" +
                "          \"imdb_id\": \"tt0418279\", \n" +
                "          \"title\": \"Transformers\"\n" +
                "        }, \n" +
                "        {\n" +
                "          \"url\": \"http://www.imdb.com/title/tt0423294/\", \n" +
                "          \"year\": \"2007\", \n" +
                "          \"type\": \"Film\", \n" +
                "          \"imdb_id\": \"tt0423294\", \n" +
                "          \"title\": \"Surf's Up\"\n" +
                "        }, \n" +
                "        {\n" +
                "          \"url\": \"http://www.imdb.com/title/tt1051265/\", \n" +
                "          \"year\": \"2007\", \n" +
                "          \"type\": \"Video Game\", \n" +
                "          \"imdb_id\": \"tt1051265\", \n" +
                "          \"title\": \"Surf's Up\"\n" +
                "        }, \n" +
                "        {\n" +
                "          \"url\": \"http://www.imdb.com/title/tt0072562/\", \n" +
                "          \"year\": \"2007\", \n" +
                "          \"type\": \"TV Series\", \n" +
                "          \"imdb_id\": \"tt0072562\", \n" +
                "          \"title\": \"Saturday Night LiveShia LaBeouf/Avril Lavigne\"\n" +
                "        }, \n" +
                "        {\n" +
                "          \"url\": \"http://www.imdb.com/title/tt0486822/\", \n" +
                "          \"year\": \"2007\", \n" +
                "          \"type\": \"Film\", \n" +
                "          \"imdb_id\": \"tt0486822\", \n" +
                "          \"title\": \"Disturbia\"\n" +
                "        }, \n" +
                "        {\n" +
                "          \"url\": \"http://www.imdb.com/title/tt0308055/\", \n" +
                "          \"year\": \"2006\", \n" +
                "          \"type\": \"Film\", \n" +
                "          \"imdb_id\": \"tt0308055\", \n" +
                "          \"title\": \"Bobby\"\n" +
                "        }, \n" +
                "        {\n" +
                "          \"url\": \"http://www.imdb.com/title/tt0473488/\", \n" +
                "          \"year\": \"2006\", \n" +
                "          \"type\": \"Film\", \n" +
                "          \"imdb_id\": \"tt0473488\", \n" +
                "          \"title\": \"A Guide to Recognizing Your Saints\"\n" +
                "        }, \n" +
                "        {\n" +
                "          \"url\": \"http://www.imdb.com/title/tt0388980/\", \n" +
                "          \"year\": \"2005\", \n" +
                "          \"type\": \"Film\", \n" +
                "          \"imdb_id\": \"tt0388980\", \n" +
                "          \"title\": \"The Greatest Game Ever Played\"\n" +
                "        }, \n" +
                "        {\n" +
                "          \"url\": \"http://www.imdb.com/title/tt0360486/\", \n" +
                "          \"year\": \"2005\", \n" +
                "          \"type\": \"Film\", \n" +
                "          \"imdb_id\": \"tt0360486\", \n" +
                "          \"title\": \"Constantine\"\n" +
                "        }, \n" +
                "        {\n");
        buf.append(
                "          \"url\": \"http://www.imdb.com/title/tt0343818/\", \n" +
                "          \"year\": \"2004\", \n" +
                "          \"type\": \"Film\", \n" +
                "          \"imdb_id\": \"tt0343818\", \n" +
                "          \"title\": \"I, Robot\"\n" +
                "        }, \n" +
                "        {\n" +
                "          \"url\": \"http://www.imdb.com/title/tt0206511/\", \n" +
                "          \"year\": \"2000-2003\", \n" +
                "          \"type\": \"TV Series\", \n" +
                "          \"imdb_id\": \"tt0206511\", \n" +
                "          \"title\": \"Even StevensIn Ren We TrustLeavin' StevensSurf's UpModel PrincipalStevens Manor\"\n" +
                "        }, \n" +
                "        {\n" +
                "          \"url\": \"http://www.imdb.com/title/tt0357470/\", \n" +
                "          \"year\": \"2003\", \n" +
                "          \"type\": \"Film\", \n" +
                "          \"imdb_id\": \"tt0357470\", \n" +
                "          \"title\": \"The Battle of Shaker Heights\"\n" +
                "        }, \n" +
                "        {\n" +
                "          \"url\": \"http://www.imdb.com/title/tt0305357/\", \n" +
                "          \"year\": \"2003\", \n" +
                "          \"type\": \"Film\", \n" +
                "          \"imdb_id\": \"tt0305357\", \n" +
                "          \"title\": \"Charlie's Angels: Full Throttle\"\n" +
                "        }, \n" +
                "        {\n" +
                "          \"url\": \"http://www.imdb.com/title/tt0329028/\", \n" +
                "          \"year\": \"2003\", \n" +
                "          \"type\": \"Film\", \n" +
                "          \"imdb_id\": \"tt0329028\", \n" +
                "          \"title\": \"Dumb and Dumberer: When Harry Met Lloyd\"\n" +
                "        }, \n" +
                "        {\n" +
                "          \"url\": \"http://www.imdb.com/title/tt0327698/\", \n" +
                "          \"year\": \"2003\", \n" +
                "          \"type\": \"Film\", \n" +
                "          \"imdb_id\": \"tt0327698\", \n" +
                "          \"title\": \"The Even Stevens Movie\"\n" +
                "        }, \n" +
                "        {\n" +
                "          \"url\": \"http://www.imdb.com/title/tt0311289/\", \n" +
                "          \"year\": \"2003\", \n" +
                "          \"type\": \"Film\", \n" +
                "          \"imdb_id\": \"tt0311289\", \n" +
                "          \"title\": \"Holes\"\n" +
                "        }, \n" +
                "        {\n" +
                "          \"url\": \"http://www.imdb.com/title/tt0296251/\", \n" +
                "          \"year\": \"2002\", \n" +
                "          \"type\": \"Film\", \n" +
                "          \"imdb_id\": \"tt0296251\", \n" +
                "          \"title\": \"Tru Confessions\"\n" +
                "        }, \n" +
                "        {\n" +
                "          \"url\": \"http://www.imdb.com/title/tt0293737/\", \n" +
                "          \"year\": \"2002\", \n" +
                "          \"type\": \"TV Series\", \n" +
                "          \"imdb_id\": \"tt0293737\", \n" +
                "          \"title\": \"The Proud FamilyI Love You Penny Proud\"\n" +
                "        }, \n" +
                "        {\n" +
                "          \"url\": \"http://www.imdb.com/title/tt0280282/\", \n" +
                "          \"year\": \"2001\", \n" +
                "          \"type\": \"TV Series\", \n" +
                "          \"imdb_id\": \"tt0280282\", \n" +
                "          \"title\": \"The Nightmare RoomScareful What You Wish For\"\n" +
                "        }, \n" +
                "        {\n" +
                "          \"url\": \"http://www.imdb.com/title/tt0274557/\", \n" +
                "          \"year\": \"2001\", \n" +
                "          \"type\": \"Film\", \n" +
                "          \"imdb_id\": \"tt0274557\", \n" +
                "          \"title\": \"Hounded\"\n" +
                "        }, \n" +
                "        {\n" +
                "          \"url\": \"http://www.imdb.com/title/tt0108757/\", \n" +
                "          \"year\": \"2000\", \n" +
                "          \"type\": \"TV Series\", \n" +
                "          \"imdb_id\": \"tt0108757\", \n" +
                "          \"title\": \"ERAbby Road\"\n" +
                "        }, \n" +
                "        {\n" +
                "          \"url\": \"http://www.imdb.com/title/tt0193676/\", \n" +
                "          \"year\": \"2000\", \n" +
                "          \"type\": \"TV Series\", \n" +
                "          \"imdb_id\": \"tt0193676\", \n" +
                "          \"title\": \"Freaks and GeeksWe've Got Spirit\"\n" +
                "        }, \n" +
                "        {\n" +
                "          \"url\": \"http://www.imdb.com/title/tt0106179/\", \n" +
                "          \"year\": \"1999\", \n" +
                "          \"type\": \"TV Series\", \n" +
                "          \"imdb_id\": \"tt0106179\", \n" +
                "          \"title\": \"The X-FilesThe Goldberg Variation\"\n" +
                "        }, \n" +
                "        {\n" +
                "          \"url\": \"http://www.imdb.com/title/tt0108968/\", \n" +
                "          \"year\": \"1999\", \n" +
                "          \"type\": \"TV Series\", \n" +
                "          \"imdb_id\": \"tt0108968\", \n" +
                "          \"title\": \"Touched by an AngelThe Occupant\"\n" +
                "        }, \n" +
                "        {\n" +
                "          \"url\": \"http://www.imdb.com/title/tt0115376/\", \n" +
                "          \"year\": \"1999\", \n" +
                "          \"type\": \"TV Series\", \n" +
                "          \"imdb_id\": \"tt0115376\", \n" +
                "          \"title\": \"Suddenly SusanA Day in the Life\"\n" +
                "        }, \n" +
                "        {\n" +
                "          \"url\": \"http://www.imdb.com/title/tt0156196/\", \n" +
                "          \"year\": \"1999\", \n" +
                "          \"type\": \"TV Series\", \n" +
                "          \"imdb_id\": \"tt0156196\", \n" +
                "          \"title\": \"JesseMomma Was a Rollin' Stone\"\n" +
                "        }, \n" +
                "        {\n" +
                "          \"url\": \"http://www.imdb.com/title/tt0148482/\", \n" +
                "          \"year\": \"1998\", \n" +
                "          \"type\": \"Film\", \n" +
                "          \"imdb_id\": \"tt0148482\", \n" +
                "          \"title\": \"Monkey Business\"\n" +
                "        }, \n" +
                "        {\n" +
                "          \"url\": \"http://www.imdb.com/title/tt0264483/\", \n" +
                "          \"year\": \"1998\", \n" +
                "          \"type\": \"Film\", \n" +
                "          \"imdb_id\": \"tt0264483\", \n" +
                "          \"title\": \"The Christmas Path\"\n" +
                "        }, \n" +
                "        {\n" +
                "          \"url\": \"http://www.imdb.com/title/tt0111910/\", \n" +
                "          \"year\": \"1998\", \n" +
                "          \"type\": \"TV Series\", \n" +
                "          \"imdb_id\": \"tt0111910\", \n" +
                "          \"title\": \"Caroline in the CityCaroline and the Bar Mitzvah\"\n" +
                "        }, \n" +
                "        {\n" +
                "          \"url\": \"http://www.imdb.com/title/tt0157675/\", \n" +
                "          \"year\": \"1998\", \n" +
                "          \"type\": \"Film\", \n" +
                "          \"imdb_id\": \"tt0157675\", \n" +
                "          \"title\": \"Breakfast with Einstein\"\n" +
                "        }, \n" +
                "        {\n" +
                "          \"url\": \"http://www.imdb.com/title/tt0087544/\", \n" +
                "          \"year\": \"1984\", \n" +
                "          \"type\": \"Film\", \n" +
                "          \"imdb_id\": \"tt0087544\", \n" +
                "          \"title\": \"Nausica\\u00e4 of the Valley of the Wind\"\n" +
                "        }\n" +
                "      ], \n" +
                "      \"director\": [\n" +
                "        {\n" +
                "          \"url\": \"http://www.imdb.com/title/tt4187824/\", \n" +
                "          \"year\": \"2014\", \n" +
                "          \"type\": \"Video short\", \n" +
                "          \"imdb_id\": \"tt4187824\", \n" +
                "          \"title\": \"Future Unlimited: Haunted Love\"\n" +
                "        }, \n" +
                "        {\n" +
                "          \"url\": \"http://www.imdb.com/title/tt2400355/\", \n" +
                "          \"year\": \"2012\", \n" +
                "          \"type\": \"Short Film\", \n" +
                "          \"imdb_id\": \"tt2400355\", \n" +
                "          \"title\": \"Howard Cantour.com\"\n" +
                "        }, \n" +
                "        {\n" );
        buf.append(
                "          \"url\": \"http://www.imdb.com/title/tt1869551/\", \n" +
                "          \"year\": \"2011/I\", \n" +
                "          \"type\": \"Short Film\", \n" +
                "          \"imdb_id\": \"tt1869551\", \n" +
                "          \"title\": \"Maniac\"\n" +
                "        }, \n" +
                "        {\n" +
                "          \"url\": \"http://www.imdb.com/title/tt2043796/\", \n" +
                "          \"year\": \"2011\", \n" +
                "          \"type\": \"Video short\", \n" +
                "          \"imdb_id\": \"tt2043796\", \n" +
                "          \"title\": \"Marilyn Manson: Born Villain\"\n" +
                "        }, \n" +
                "        {\n" +
                "          \"url\": \"http://www.imdb.com/title/tt2648224/\", \n" +
                "          \"year\": \"2011\", \n" +
                "          \"type\": \"Video short\", \n" +
                "          \"imdb_id\": \"tt2648224\", \n" +
                "          \"title\": \"Kid Cudi: Marijuana\"\n" +
                "        }, \n" +
                "        {\n" +
                "          \"url\": \"http://www.imdb.com/title/tt0452812/\", \n" +
                "          \"year\": \"2004\", \n" +
                "          \"type\": \"Short Film\", \n" +
                "          \"imdb_id\": \"tt0452812\", \n" +
                "          \"title\": \"Let's Love Hate\"\n" +
                "        }\n" +
                "      ], \n" +
                "      \"archive_footage\": [\n" +
                "        {\n" +
                "          \"url\": \"http://www.imdb.com/title/tt7643144/\", \n" +
                "          \"year\": \"2017\", \n" +
                "          \"type\": \"Video short\", \n" +
                "          \"imdb_id\": \"tt7643144\", \n" +
                "          \"title\": \"Happy Pride! Sexy LGBT Stars\"\n" +
                "        }, \n" +
                "        {\n" +
                "          \"url\": \"http://www.imdb.com/title/tt0081857/\", \n" +
                "          \"year\": \"2014-2017\", \n" +
                "          \"type\": \"TV Series\", \n" +
                "          \"imdb_id\": \"tt0081857\", \n" +
                "          \"title\": \"Entertainment TonightEpisode #36.264Episode #36.239Episode dated 12 October 2015Episode dated 24 August 2015Episode dated 27 July 2015\"\n" +
                "        }, \n" +
                "        {\n" +
                "          \"url\": \"http://www.imdb.com/title/tt5660328/\", \n" +
                "          \"year\": \"2016\", \n" +
                "          \"type\": \"Film\", \n" +
                "          \"imdb_id\": \"tt5660328\", \n" +
                "          \"title\": \"Goodnight, Sweet Prince\"\n" +
                "        }, \n" +
                "        {\n" +
                "          \"url\": \"http://www.imdb.com/title/tt0247094/\", \n" +
                "          \"year\": \"2015\", \n" +
                "          \"type\": \"TV Series\", \n" +
                "          \"imdb_id\": \"tt0247094\", \n" +
                "          \"title\": \"ExtraEpisode #22.26\"\n" +
                "        }, \n" +
                "        {\n" +
                "          \"url\": \"http://www.imdb.com/title/tt0430836/\", \n" +
                "          \"year\": \"2014\", \n" +
                "          \"type\": \"TV Series\", \n" +
                "          \"imdb_id\": \"tt0430836\", \n" +
                "          \"title\": \"The InsiderEpisode dated 1 December 2014Episode dated 10 October 2014Episode dated 6 October 2014Episode dated 24 July 2014Episode dated 27 June 2014\"\n" +
                "        }, \n" +
                "        {\n" +
                "          \"url\": \"http://www.imdb.com/title/tt0166442/\", \n" +
                "          \"year\": \"2014\", \n" +
                "          \"type\": \"TV Series documentary\", \n" +
                "          \"imdb_id\": \"tt0166442\", \n" +
                "          \"title\": \"Inside EditionEpisode #26.22Episode #25.211\"\n" +
                "        }, \n" +
                "        {\n" +
                "          \"url\": \"http://www.imdb.com/title/tt0262152/\", \n" +
                "          \"year\": \"2010\", \n" +
                "          \"type\": \"TV Series\", \n" +
                "          \"imdb_id\": \"tt0262152\", \n" +
                "          \"title\": \"BreakfastEpisode dated 18 May 2010\"\n" +
                "        }, \n" +
                "        {\n" +
                "          \"url\": \"http://www.imdb.com/title/tt0181261/\", \n" +
                "          \"year\": \"2009\", \n" +
                "          \"type\": \"TV Series\", \n" +
                "          \"imdb_id\": \"tt0181261\", \n" +
                "          \"title\": \"This MorningEpisode dated 9 February 2009\"\n" +
                "        }, \n" +
                "        {\n" +
                "          \"url\": \"http://www.imdb.com/title/tt0185103/\", \n" +
                "          \"year\": \"2009\", \n" +
                "          \"type\": \"TV Series\", \n" +
                "          \"imdb_id\": \"tt0185103\", \n" +
                "          \"title\": \"WWE RawEpisode #17.6\"\n" +
                "        }, \n" +
                "        {\n" +
                "          \"url\": \"http://www.imdb.com/title/tt1391541/\", \n" +
                "          \"year\": \"2008\", \n" +
                "          \"type\": \"Video short\", \n" +
                "          \"imdb_id\": \"tt1391541\", \n" +
                "          \"title\": \"Closing: Team Indy\"\n" +
                "        }, \n" +
                "        {\n" +
                "          \"url\": \"http://www.imdb.com/title/tt1434611/\", \n" +
                "          \"year\": \"2008\", \n" +
                "          \"type\": \"Film\", \n" +
                "          \"imdb_id\": \"tt1434611\", \n" +
                "          \"title\": \"Adventures in Post-Production\"\n" +
                "        }, \n" +
                "        {\n" +
                "          \"url\": \"http://www.imdb.com/title/tt1285302/\", \n" +
                "          \"year\": \"2008\", \n" +
                "          \"type\": \"Video short\", \n" +
                "          \"imdb_id\": \"tt1285302\", \n" +
                "          \"title\": \"Come Feud with Me: The Top 10 Disney Channel Character Feuds\"\n" +
                "        }, \n" +
                "        {\n" +
                "          \"url\": \"http://www.imdb.com/title/tt1478318/\", \n" +
                "          \"year\": \"2005\", \n" +
                "          \"type\": \"Film\", \n" +
                "          \"imdb_id\": \"tt1478318\", \n" +
                "          \"title\": \"Disney Channel Holiday\"\n" +
                "        }\n" +
                "      ], \n" +
                "      \"thanks\": [\n" +
                "        {\n" +
                "          \"url\": \"http://www.imdb.com/title/tt1343939/\", \n" +
                "          \"year\": \"2008\", \n" +
                "          \"type\": \"Video short\", \n" +
                "          \"imdb_id\": \"tt1343939\", \n" +
                "          \"title\": \"Indiana Jones 4: Pre-production\"\n" +
                "        }, \n" +
                "        {\n" +
                "          \"url\": \"http://www.imdb.com/title/tt1343940/\", \n" +
                "          \"year\": \"2008\", \n" +
                "          \"type\": \"Video short\", \n" +
                "          \"imdb_id\": \"tt1343940\", \n" +
                "          \"title\": \"Indiana Jones 4: The Return of a Legend\"\n" +
                "        }\n" +
                "      ]\n" +
                "    }, \n" );
        buf.append(
                "    \"photos\": [\n" +
                "      \"https://images-na.ssl-images-amazon.com/images/M/MV5BMTY0NDIyNjgzM15BMl5BanBnXkFtZTcwNjcwMjE3MQ@@._V1_SX1777_CR0,0,1777,940_AL_.jpg\", \n" +
                "      \"https://images-na.ssl-images-amazon.com/images/M/MV5BNzU0MDMxMjg2M15BMl5BanBnXkFtZTgwMDc1MjU3NjE@._V1_SX1500_CR0,0,1500,999_AL_.jpg\", \n" +
                "      \"https://images-na.ssl-images-amazon.com/images/M/MV5BMTQ2NDE4MDg5MF5BMl5BanBnXkFtZTcwMTk3NTIyMw@@._V1_SX1777_CR0,0,1777,752_AL_.jpg\", \n" +
                "      \"https://images-na.ssl-images-amazon.com/images/M/MV5BMjI4NzMzODQ4Nl5BMl5BanBnXkFtZTgwNTM4Nzk5OTE@._V1_SY1000_CR0,0,1333,1000_AL_.jpg\", \n" +
                "      \"https://images-na.ssl-images-amazon.com/images/M/MV5BMjI2MTIyNTA4OV5BMl5BanBnXkFtZTcwNjY3MTE1NQ@@._V1_SY1000_CR0,0,1410,1000_AL_.jpg\", \n" +
                "      \"https://images-na.ssl-images-amazon.com/images/M/MV5BMTU4OTc2ODI2Nl5BMl5BanBnXkFtZTcwMDM1NzEyNw@@._V1_SY1000_CR0,0,1452,1000_AL_.jpg\", \n" +
                "      \"https://images-na.ssl-images-amazon.com/images/M/MV5BMTU5NDUxNzg3Nl5BMl5BanBnXkFtZTcwMDM0NDM4Nw@@._V1_SY1000_CR0,0,1502,1000_AL_.jpg\", \n" +
                "      \"https://images-na.ssl-images-amazon.com/images/M/MV5BMTY2MDE5MDAyMF5BMl5BanBnXkFtZTgwMTk4MzMyMDI@._V1_SY1000_CR0,0,1497,1000_AL_.jpg\", \n" +
                "      \"https://images-na.ssl-images-amazon.com/images/M/MV5BMTczNTY1OTA5M15BMl5BanBnXkFtZTcwNjU2OTAyNw@@._V1_SY1000_CR0,0,1503,1000_AL_.jpg\", \n" +
                "      \"https://images-na.ssl-images-amazon.com/images/M/MV5BMjI2ODYyMjMzOF5BMl5BanBnXkFtZTgwNDEyNTY4MjE@._V1_SX1500_CR0,0,1500,999_AL_.jpg\", \n" +
                "      \"https://images-na.ssl-images-amazon.com/images/M/MV5BNDcxMTI1ODI1MF5BMl5BanBnXkFtZTcwNDgzNTEyOQ@@._V1_SY1000_CR0,0,1503,1000_AL_.jpg\", \n" +
                "      \"https://images-na.ssl-images-amazon.com/images/M/MV5BNzg3OTE2NDc1MV5BMl5BanBnXkFtZTcwNzk0NDM4Nw@@._V1_SY1000_CR0,0,1503,1000_AL_.jpg\", \n" +
                "      \"https://images-na.ssl-images-amazon.com/images/M/MV5BNTcwNTg2MzA5MF5BMl5BanBnXkFtZTgwODY4MzE4MjE@._V1_SX1500_CR0,0,1500,999_AL_.jpg\", \n" +
                "      \"https://images-na.ssl-images-amazon.com/images/M/MV5BNDA4NzUyODAxNV5BMl5BanBnXkFtZTcwMDg0Njc0Mw@@._V1_SY1000_CR0,0,1110,1000_AL_.jpg\", \n" +
                "      \"https://images-na.ssl-images-amazon.com/images/M/MV5BMTYwMTY1NzQ5OF5BMl5BanBnXkFtZTgwMzMyNTY4MjE@._V1_SX1500_CR0,0,1500,999_AL_.jpg\", \n" +
                "      \"https://images-na.ssl-images-amazon.com/images/M/MV5BOTc5NjY3NDA1MV5BMl5BanBnXkFtZTcwMDc0NDkwOQ@@._V1_SY1000_CR0,0,727,1000_AL_.jpg\", \n" +
                "      \"https://images-na.ssl-images-amazon.com/images/M/MV5BMTM1NDU0NjE4N15BMl5BanBnXkFtZTcwNzAwOTc3NQ@@._V1_SY1000_CR0,0,1502,1000_AL_.jpg\", \n" +
                "      \"https://images-na.ssl-images-amazon.com/images/M/MV5BMTQ4MDQ3ODU1OF5BMl5BanBnXkFtZTcwMzg4NTIyMw@@._V1_SY1000_CR0,0,666,1000_AL_.jpg\", \n" +
                "      \"https://images-na.ssl-images-amazon.com/images/M/MV5BMTY3MzU4NDE2MV5BMl5BanBnXkFtZTcwNzk1NzAzMw@@._V1_SY1000_CR0,0,1502,1000_AL_.jpg\", \n" +
                "      \"https://images-na.ssl-images-amazon.com/images/M/MV5BMTQzMTQzNzU4NV5BMl5BanBnXkFtZTcwMzI0NzMzMw@@._V1_SY1000_CR0,0,1501,1000_AL_.jpg\", \n" +
                "      \"https://images-na.ssl-images-amazon.com/images/M/MV5BMTI5ODM1MDg3NF5BMl5BanBnXkFtZTcwMTM0NzMzMw@@._V1_SX1500_CR0,0,1500,999_AL_.jpg\", \n" +
                "      \"https://images-na.ssl-images-amazon.com/images/M/MV5BMjIyNDMyNzEzNV5BMl5BanBnXkFtZTgwMDU0OTc0MzI@._V1_SY1000_CR0,0,719,1000_AL_.jpg\", \n" +
                "      \"https://images-na.ssl-images-amazon.com/images/M/MV5BMjI1ODAwOTM2OV5BMl5BanBnXkFtZTcwODI3MDM3Nw@@._V1_SY1000_CR0,0,665,1000_AL_.jpg\", \n" +
                "      \"https://images-na.ssl-images-amazon.com/images/M/MV5BNzAyODU5NTMzNF5BMl5BanBnXkFtZTgwNjQ0OTc0MzI@._V1_SY1000_CR0,0,1505,1000_AL_.jpg\", \n" +
                "      \"https://images-na.ssl-images-amazon.com/images/M/MV5BMjExMTc5NzQ1OV5BMl5BanBnXkFtZTcwMDUwODM2Mg@@._V1_SY1000_CR0,0,666,1000_AL_.jpg\", \n" +
                "      \"https://images-na.ssl-images-amazon.com/images/M/MV5BMTEyMzM4MDQ1MzJeQTJeQWpwZ15BbWU4MDYzMjU2ODIx._V1_SX1500_CR0,0,1500,999_AL_.jpg\", \n" +
                "      \"https://images-na.ssl-images-amazon.com/images/M/MV5BMTUwNTIyNjA4OF5BMl5BanBnXkFtZTcwMzM4NDMzNQ@@._V1_SX1777_CR0,0,1777,733_AL_.jpg\", \n" +
                "      \"https://images-na.ssl-images-amazon.com/images/M/MV5BMTYxMTMwMjAxNl5BMl5BanBnXkFtZTgwNTk3Mjg3MDE@._V1_SY1000_CR0,0,674,1000_AL_.jpg\", \n" +
                "      \"https://images-na.ssl-images-amazon.com/images/M/MV5BNzU5NjQ3MTA0M15BMl5BanBnXkFtZTgwMjc3NjMwMzE@._V1_SY1000_CR0,0,1667,1000_AL_.jpg\", \n" +
                "      \"https://images-na.ssl-images-amazon.com/images/M/MV5BMTM2ODA0NDY5OV5BMl5BanBnXkFtZTcwOTgzMzMzOQ@@._V1_SY1000_CR0,0,782,1000_AL_.jpg\", \n" +
                "      \"https://images-na.ssl-images-amazon.com/images/M/MV5BMTk0MzY0NzEzOF5BMl5BanBnXkFtZTcwNDk2NTIyMw@@._V1_SY1000_CR0,0,1490,1000_AL_.jpg\", \n" +
                "      \"https://images-na.ssl-images-amazon.com/images/M/MV5BMjIxOTM0MTQ3M15BMl5BanBnXkFtZTcwNzcxMjk4Mg@@._V1_SY1000_CR0,0,666,1000_AL_.jpg\", \n" +
                "      \"https://images-na.ssl-images-amazon.com/images/M/MV5BMTk3NTgzMzQ4Nl5BMl5BanBnXkFtZTcwMDgwOTE2NQ@@._V1_SY1000_CR0,0,1500,1000_AL_.jpg\", \n" +
                "      \"https://images-na.ssl-images-amazon.com/images/M/MV5BMjI1NTA3NjE0OV5BMl5BanBnXkFtZTcwNjA3ODU5OA@@._V1_SY1000_CR0,0,1505,1000_AL_.jpg\", \n" +
                "      \"https://images-na.ssl-images-amazon.com/images/M/MV5BMTcyMTQwODUxOV5BMl5BanBnXkFtZTcwOTUzODMyOQ@@._V1_SY1000_CR0,0,1503,1000_AL_.jpg\", \n" +
                "      \"https://images-na.ssl-images-amazon.com/images/M/MV5BMTk4MzgyMDc0MF5BMl5BanBnXkFtZTcwNTQ0NzMzMw@@._V1_SY1000_CR0,0,678,1000_AL_.jpg\", \n" +
                "      \"https://images-na.ssl-images-amazon.com/images/M/MV5BMTUwMjE0NDE0N15BMl5BanBnXkFtZTgwMTU5NTA4NjE@._V1_SY1000_CR0,0,1468,1000_AL_.jpg\", \n" +
                "      \"https://images-na.ssl-images-amazon.com/images/M/MV5BMTk2NjQxODU4MF5BMl5BanBnXkFtZTgwNjc3NjMwMzE@._V1_SY1000_CR0,0,723,1000_AL_.jpg\", \n" +
                "      \"https://images-na.ssl-images-amazon.com/images/M/MV5BMTgwOTM4MTQyMF5BMl5BanBnXkFtZTcwNjU5MzUzMw@@._V1_SX1500_CR0,0,1500,999_AL_.jpg\", \n" +
                "      \"https://images-na.ssl-images-amazon.com/images/M/MV5BOTI1MDU0NzcxMV5BMl5BanBnXkFtZTgwMDU5NTA4NjE@._V1_SY1000_CR0,0,664,1000_AL_.jpg\", \n" +
                "      \"https://images-na.ssl-images-amazon.com/images/M/MV5BMTY3MTM3NDMzMF5BMl5BanBnXkFtZTcwMzk0NDM4Nw@@._V1_SY1000_CR0,0,1480,1000_AL_.jpg\", \n" +
                "      \"https://images-na.ssl-images-amazon.com/images/M/MV5BMjAwNjA2ODYzMl5BMl5BanBnXkFtZTcwMzU2NzAzMw@@._V1_SY1000_CR0,0,674,1000_AL_.jpg\", \n" +
                "      \"https://images-na.ssl-images-amazon.com/images/M/MV5BMTQ4ODM1MzAxMF5BMl5BanBnXkFtZTcwNTM1NjQxMw@@._V1_SY1000_CR0,0,1637,1000_AL_.jpg\", \n" +
                "      \"https://images-na.ssl-images-amazon.com/images/M/MV5BMTgyNjI1MTUxMV5BMl5BanBnXkFtZTcwMDM2MDM2NQ@@._V1_SY1000_CR0,0,1500,1000_AL_.jpg\", \n" +
                "      \"https://images-na.ssl-images-amazon.com/images/M/MV5BMjM2MjA1MzYxM15BMl5BanBnXkFtZTgwODgyMTAwMzE@._V1_SY1000_CR0,0,664,1000_AL_.jpg\", \n" +
                "      \"https://images-na.ssl-images-amazon.com/images/M/MV5BMjE4NTU0MzcxMl5BMl5BanBnXkFtZTcwMTczMzMzOQ@@._V1_SY1000_CR0,0,1256,1000_AL_.jpg\", \n" +
                "      \"https://images-na.ssl-images-amazon.com/images/M/MV5BMTgzNzIzNzA0MV5BMl5BanBnXkFtZTgwOTQzNzA4NjE@._V1_SY1000_CR0,0,693,1000_AL_.jpg\", \n" +
                "      \"https://images-na.ssl-images-amazon.com/images/M/MV5BMTY5OTQ5NDE1Ml5BMl5BanBnXkFtZTgwODQ5NTA4NjE@._V1_SY1000_CR0,0,1474,1000_AL_.jpg\", \n" +
                "      \"https://images-na.ssl-images-amazon.com/images/M/MV5BMzgxODI3MDAxMl5BMl5BanBnXkFtZTcwOTE0NDM4Nw@@._V1_SY1000_CR0,0,1503,1000_AL_.jpg\", \n" +
                "      \"https://images-na.ssl-images-amazon.com/images/M/MV5BMTM0MjE2OTczOF5BMl5BanBnXkFtZTcwOTAwOTc3NQ@@._V1_SY1000_CR0,0,770,1000_AL_.jpg\", \n" +
                "      \"https://images-na.ssl-images-amazon.com/images/M/MV5BMTM2MTE4OTA2Nl5BMl5BanBnXkFtZTcwMjI1NzEyNw@@._V1_SY1000_CR0,0,1153,1000_AL_.jpg\", \n" +
                "      \"https://images-na.ssl-images-amazon.com/images/M/MV5BODY3OTY5Nzk4NV5BMl5BanBnXkFtZTcwMDY5MzUzMw@@._V1_SX1500_CR0,0,1500,999_AL_.jpg\", \n" +
                "      \"https://images-na.ssl-images-amazon.com/images/M/MV5BNjQwMDIzMDE2NF5BMl5BanBnXkFtZTcwMDgyNzA3NQ@@._V1_SX1331_CR0,0,1331,999_AL_.jpg\", \n" +
                "      \"https://images-na.ssl-images-amazon.com/images/M/MV5BMTAwNzc4MTMxNzFeQTJeQWpwZ15BbWU4MDEzMDk1MTEx._V1_SY1000_CR0,0,666,1000_AL_.jpg\", \n" +
                "      \"https://images-na.ssl-images-amazon.com/images/M/MV5BMjE5MTE1OTQ0N15BMl5BanBnXkFtZTcwOTczNzMzMw@@._V1_SX1500_CR0,0,1500,999_AL_.jpg\", \n" +
                "      \"https://images-na.ssl-images-amazon.com/images/M/MV5BMTgyMjIyMDg5N15BMl5BanBnXkFtZTgwNTU1NjE5ODE@._V1_SY1000_CR0,0,1612,1000_AL_.jpg\", \n" +
                "      \"https://images-na.ssl-images-amazon.com/images/M/MV5BMTMyOTg0MjY2Ml5BMl5BanBnXkFtZTcwODcwMjE3MQ@@._V1_SY1000_CR0,0,1459,1000_AL_.jpg\", \n" +
                "      \"https://images-na.ssl-images-amazon.com/images/M/MV5BOTQ5NTMwNTQ1NV5BMl5BanBnXkFtZTgwODg0NTM3MjE@._V1_SY1000_CR0,0,674,1000_AL_.jpg\", \n" +
                "      \"https://images-na.ssl-images-amazon.com/images/M/MV5BMTk2MDU3Njc0NF5BMl5BanBnXkFtZTcwOTkyNzk5OA@@._V1_SY1000_CR0,0,799,1000_AL_.jpg\", \n" +
                "      \"https://images-na.ssl-images-amazon.com/images/M/MV5BMTQ3MTM1NjM1MF5BMl5BanBnXkFtZTcwMDgzNTEyOQ@@._V1_SY1000_CR0,0,1503,1000_AL_.jpg\", \n" +
                "      \"https://images-na.ssl-images-amazon.com/images/M/MV5BMTUxNDI0MjczMF5BMl5BanBnXkFtZTgwMTc4MzMyMDI@._V1_SY1000_CR0,0,1756,1000_AL_.jpg\", \n" +
                "      \"https://images-na.ssl-images-amazon.com/images/M/MV5BMTc3MDk4MjM4MV5BMl5BanBnXkFtZTcwMzU2OTAyNw@@._V1_SY1000_CR0,0,1501,1000_AL_.jpg\", \n" +
                "      \"https://images-na.ssl-images-amazon.com/images/M/MV5BMTg4MTU3ODk5NF5BMl5BanBnXkFtZTcwNzcwMjE3MQ@@._V1_SY1000_CR0,0,1624,1000_AL_.jpg\", \n" +
                "      \"https://images-na.ssl-images-amazon.com/images/M/MV5BMTMwMzkyOTIzN15BMl5BanBnXkFtZTcwMzYwODM2Mg@@._V1_SY1000_CR0,0,1499,1000_AL_.jpg\", \n" +
                "      \"https://images-na.ssl-images-amazon.com/images/M/MV5BMTgwOTY4NDg2NV5BMl5BanBnXkFtZTgwNzQ5NTA4NjE@._V1_SY1000_CR0,0,1482,1000_AL_.jpg\", \n" +
                "      \"https://images-na.ssl-images-amazon.com/images/M/MV5BMjIyMjQxMDgxN15BMl5BanBnXkFtZTcwMTM2NDY3NQ@@._V1_SY1000_CR0,0,1460,1000_AL_.jpg\", \n" +
                "      \"https://images-na.ssl-images-amazon.com/images/M/MV5BMTkwMTk1NDg1MV5BMl5BanBnXkFtZTgwODQ0OTc0MzI@._V1_SY1000_CR0,0,725,1000_AL_.jpg\", \n" +
                "      \"https://images-na.ssl-images-amazon.com/images/M/MV5BMTQ2NDAzNjMxNl5BMl5BanBnXkFtZTcwNDkzMzMzOQ@@._V1_SY1000_CR0,0,665,1000_AL_.jpg\", \n" +
                "      \"https://images-na.ssl-images-amazon.com/images/M/MV5BMTU4NDMyMTc3Nl5BMl5BanBnXkFtZTcwOTk0NzAzMw@@._V1_SX1535_CR0,0,1535,999_AL_.jpg\", \n" +
                "      \"https://images-na.ssl-images-amazon.com/images/M/MV5BZTQyZTk5YjYtNTI5NC00OTkwLThhM2UtZmEwODdlOWJjNmQ1XkEyXkFqcGdeQXVyNDkzNTM2ODg@._V1_SY1000_CR0,0,1333,1000_AL_.jpg\", \n" +
                "      \"https://images-na.ssl-images-amazon.com/images/M/MV5BMTUzMDkwODY4NV5BMl5BanBnXkFtZTgwMTc1MjU3NjE@._V1_SX1500_CR0,0,1500,999_AL_.jpg\", \n" +
                "      \"https://images-na.ssl-images-amazon.com/images/M/MV5BMTY2NjQ1OTAwMF5BMl5BanBnXkFtZTcwMTU2OTAyNw@@._V1_SY1000_CR0,0,1501,1000_AL_.jpg\", \n" +
                "      \"https://images-na.ssl-images-amazon.com/images/M/MV5BMjVlNmQ4MTMtMTQyZi00YjhkLThkMzUtZjEyMTQzM2IzZWZlXkEyXkFqcGdeQXVyNjUwNzk3NDc@._V1_SY1000_CR0,0,1502,1000_AL_.jpg\", \n" +
                "      \"https://images-na.ssl-images-amazon.com/images/M/MV5BNTIxNTY2MTI5MF5BMl5BanBnXkFtZTcwODI1NjQxMw@@._V1_SY1000_CR0,0,1506,1000_AL_.jpg\", \n" +
                "      \"https://images-na.ssl-images-amazon.com/images/M/MV5BMTg4NTAzMDY5Ml5BMl5BanBnXkFtZTgwMTE4NjQ0MzI@._V1_SY1000_CR0,0,674,1000_AL_.jpg\", \n" +
                "      \"https://images-na.ssl-images-amazon.com/images/M/MV5BNDgyNzQyMzcxMl5BMl5BanBnXkFtZTcwMjU2NjE5NA@@._V1_SX1500_CR0,0,1500,999_AL_.jpg\", \n" +
                "      \"https://images-na.ssl-images-amazon.com/images/M/MV5BMTA3OTEwMTYyMjFeQTJeQWpwZ15BbWU4MDczMTk3NDMy._V1_SY1000_CR0,0,1413,1000_AL_.jpg\", \n" +
                "      \"https://images-na.ssl-images-amazon.com/images/M/MV5BMTk4ODE2NjkxN15BMl5BanBnXkFtZTcwODk1NzAzMw@@._V1_SY1000_CR0,0,1502,1000_AL_.jpg\", \n" +
                "      \"https://images-na.ssl-images-amazon.com/images/M/MV5BMTkwOTY0MTc1NV5BMl5BanBnXkFtZTcwMDQwNjA2NQ@@._V1_SY1000_CR0,0,668,1000_AL_.jpg\", \n" +
                "      \"https://images-na.ssl-images-amazon.com/images/M/MV5BMjA1NDAxMjUzM15BMl5BanBnXkFtZTcwMDQxNzk5OA@@._V1_SY1000_CR0,0,719,1000_AL_.jpg\", \n" +
                "      \"https://images-na.ssl-images-amazon.com/images/M/MV5BMTYzMTM3NzU2NF5BMl5BanBnXkFtZTcwNjc1MjI2Mw@@._V1_SY1000_CR0,0,1479,1000_AL_.jpg\", \n" +
                "      \"https://images-na.ssl-images-amazon.com/images/M/MV5BNDViY2EyZTctMWI2OC00NjcwLWJiMjAtMzg4N2NkZTM2MzQzXkEyXkFqcGdeQXVyMDU5Njk5MQ@@._V1_SY1000_CR0,0,667,1000_AL_.jpg\", \n" +
                "      \"https://images-na.ssl-images-amazon.com/images/M/MV5BMTg0MDc2NDI5N15BMl5BanBnXkFtZTcwOTU5MzUzMw@@._V1_SX1500_CR0,0,1500,999_AL_.jpg\", \n" +
                "      \"https://images-na.ssl-images-amazon.com/images/M/MV5BMTI0NzY3MTItMDY3ZC00OGM5LTljMDQtMDNmMmUyMTcyMDMyXkEyXkFqcGdeQXVyNDkzNTM2ODg@._V1_SY1000_CR0,0,1501,1000_AL_.jpg\", \n" +
                "      \"https://images-na.ssl-images-amazon.com/images/M/MV5BMTgzNzM3NTQ4MV5BMl5BanBnXkFtZTcwOTIzODYzMw@@._V1_SY1000_CR0,0,1659,1000_AL_.jpg\", \n" +
                "      \"https://images-na.ssl-images-amazon.com/images/M/MV5BMjAzMjcxMzg1NF5BMl5BanBnXkFtZTcwNTU5MzUzMw@@._V1_SY1000_CR0,0,666,1000_AL_.jpg\", \n" +
                "      \"https://images-na.ssl-images-amazon.com/images/M/MV5BODMyMDM4MTc5M15BMl5BanBnXkFtZTcwNTM1NzEyNw@@._V1_SY1000_CR0,0,1052,1000_AL_.jpg\", \n" +
                "      \"https://images-na.ssl-images-amazon.com/images/M/MV5BMTk3ODU2MzU3NV5BMl5BanBnXkFtZTcwNzc1NzAzMw@@._V1_SY1000_CR0,0,1479,1000_AL_.jpg\", \n" +
                "      \"https://images-na.ssl-images-amazon.com/images/M/MV5BYWQwZmJjMjctNzUxNC00MGFlLThmM2YtMWJlNzg2YTBkMGI1XkEyXkFqcGdeQXVyNjUwNzk3NDc@._V1_SY1000_CR0,0,1506,1000_AL_.jpg\", \n" +
                "      \"https://images-na.ssl-images-amazon.com/images/M/MV5BMjA5NTM1MjQ1NF5BMl5BanBnXkFtZTcwODIzODYzMw@@._V1_SY1000_CR0,0,1659,1000_AL_.jpg\", \n" +
                "      \"https://images-na.ssl-images-amazon.com/images/M/MV5BNzU1MTk4Njg0NF5BMl5BanBnXkFtZTcwMTE3NTIyMw@@._V1_SX1500_CR0,0,1500,999_AL_.jpg\", \n" +
                "      \"https://images-na.ssl-images-amazon.com/images/M/MV5BMTk2MDQwMjU5N15BMl5BanBnXkFtZTcwMTc5MzUzMw@@._V1_SX1500_CR0,0,1500,999_AL_.jpg\", \n" +
                "      \"https://images-na.ssl-images-amazon.com/images/M/MV5BMjA4MDU0NTUyN15BMl5BanBnXkFtZTgwMzQxMzY4MjE@._V1_SY1000_CR0,0,674,1000_AL_.jpg\", \n" +
                "      \"https://images-na.ssl-images-amazon.com/images/M/MV5BMjE3ODg0NjA5MF5BMl5BanBnXkFtZTgwNTc4MzMyMDI@._V1_SY1000_CR0,0,1682,1000_AL_.jpg\", \n" +
                "      \"https://images-na.ssl-images-amazon.com/images/M/MV5BMTM0ODc4NzU4MV5BMl5BanBnXkFtZTcwMzY5MzUzMw@@._V1_SY1000_CR0,0,666,1000_AL_.jpg\", \n" +
                "      \"https://images-na.ssl-images-amazon.com/images/M/MV5BMjI1OTE0MzkwMl5BMl5BanBnXkFtZTcwOTQ2NzAzMw@@._V1_SY1000_CR0,0,1502,1000_AL_.jpg\", \n" +
                "      \"https://images-na.ssl-images-amazon.com/images/M/MV5BNTE2MDg1MTIwM15BMl5BanBnXkFtZTcwODczNzMzMw@@._V1_SX1500_CR0,0,1500,999_AL_.jpg\", \n" +
                "      \"https://images-na.ssl-images-amazon.com/images/M/MV5BNjU2OTA3MTQ4Ml5BMl5BanBnXkFtZTcwNjI1NjQxMw@@._V1_SY1000_CR0,0,1503,1000_AL_.jpg\", \n" +
                "      \"https://images-na.ssl-images-amazon.com/images/M/MV5BMTY1MzE0ODEyMV5BMl5BanBnXkFtZTcwNTYwODM2Mg@@._V1_SY1000_CR0,0,666,1000_AL_.jpg\", \n" +
                "      \"https://images-na.ssl-images-amazon.com/images/M/MV5BMTgxNzg2NzQwNl5BMl5BanBnXkFtZTcwMDkwMjE3MQ@@._V1_SY1000_CR0,0,666,1000_AL_.jpg\", \n" +
                "      \"https://images-na.ssl-images-amazon.com/images/M/MV5BMTQ2NTk5MTQ4NV5BMl5BanBnXkFtZTcwMzk2NTIyMw@@._V1_SY1000_CR0,0,1506,1000_AL_.jpg\", \n" +
                "      \"https://images-na.ssl-images-amazon.com/images/M/MV5BMTQ5OTMwMTU2OV5BMl5BanBnXkFtZTcwODcxMjk4Mg@@._V1_SY1000_CR0,0,666,1000_AL_.jpg\", \n" +
                "      \"https://images-na.ssl-images-amazon.com/images/M/MV5BMTQ4MzEwMzI3MF5BMl5BanBnXkFtZTgwMzc1MjU3NjE@._V1_SX1303_CR0,0,1303,999_AL_.jpg\", \n" +
                "      \"https://images-na.ssl-images-amazon.com/images/M/MV5BMTk1ODk3NjM3NF5BMl5BanBnXkFtZTgwODc3MzU1MDI@._V1_SY1000_CR0,0,648,1000_AL_.jpg\", \n" +
                "      \"https://images-na.ssl-images-amazon.com/images/M/MV5BMjIwODE5Nzc0Ml5BMl5BanBnXkFtZTcwMDc1NzAzMw@@._V1_SY1000_CR0,0,666,1000_AL_.jpg\", \n" +
                "      \"https://images-na.ssl-images-amazon.com/images/M/MV5BMzgwMDc0NTgwN15BMl5BanBnXkFtZTcwMzQ2NDM4Nw@@._V1_SY1000_CR0,0,672,1000_AL_.jpg\", \n" +
                "      \"https://images-na.ssl-images-amazon.com/images/M/MV5BMTYwNzA1NTk1MV5BMl5BanBnXkFtZTcwNTk0NzAzMw@@._V1_SX1535_CR0,0,1535,999_AL_.jpg\", \n" +
                "      \"https://images-na.ssl-images-amazon.com/images/M/MV5BMTM1OTY4MDAzMV5BMl5BanBnXkFtZTcwOTgyNzA3NQ@@._V1_SY1000_CR0,0,674,1000_AL_.jpg\", \n" +
                "      \"https://images-na.ssl-images-amazon.com/images/M/MV5BODA0NDIzMTIwMV5BMl5BanBnXkFtZTcwNzMzNzMzMw@@._V1_SX1777_CR0,0,1777,753_AL_.jpg\", \n" +
                "      \"https://images-na.ssl-images-amazon.com/images/M/MV5BNjI4NTk4MjIwNl5BMl5BanBnXkFtZTcwMzM0NzMzMw@@._V1_SX1500_CR0,0,1500,999_AL_.jpg\", \n" +
                "      \"https://images-na.ssl-images-amazon.com/images/M/MV5BMTAyNTI1MzQ4NzJeQTJeQWpwZ15BbWU3MDQyNTcxMjc@._V1_SY1000_CR0,0,1371,1000_AL_.jpg\", \n" +
                "      \"https://images-na.ssl-images-amazon.com/images/M/MV5BMTMyMzQxMzM1MF5BMl5BanBnXkFtZTcwNzgzNzMzMw@@._V1_SY1000_CR0,0,1488,1000_AL_.jpg\", \n" +
                "      \"https://images-na.ssl-images-amazon.com/images/M/MV5BODI5NDc3NjU1MV5BMl5BanBnXkFtZTcwMjA1NzAzMw@@._V1_SX1500_CR0,0,1500,999_AL_.jpg\", \n" +
                "      \"https://images-na.ssl-images-amazon.com/images/M/MV5BMTQzMDA3NzQwMl5BMl5BanBnXkFtZTgwNDIyNTY4MjE@._V1_SX1500_CR0,0,1500,999_AL_.jpg\", \n" +
                "      \"https://images-na.ssl-images-amazon.com/images/M/MV5BMTkyMzk0NDU5OF5BMl5BanBnXkFtZTgwMjIyNTY4MjE@._V1_SX1500_CR0,0,1500,999_AL_.jpg\", \n" +
                "      \"https://images-na.ssl-images-amazon.com/images/M/MV5BMTM0NDc3OTMzNl5BMl5BanBnXkFtZTcwMTM1NjQxMw@@._V1_SY1000_CR0,0,1502,1000_AL_.jpg\", \n" +
                "      \"https://images-na.ssl-images-amazon.com/images/M/MV5BMTM3NTU0NDc3MF5BMl5BanBnXkFtZTcwODk0NzAzMw@@._V1_SX1535_CR0,0,1535,999_AL_.jpg\", \n" +
                "      \"https://images-na.ssl-images-amazon.com/images/M/MV5BNDE3MDMzMDY2Nl5BMl5BanBnXkFtZTgwMTY4MzE4MjE@._V1_SX1500_CR0,0,1500,999_AL_.jpg\", \n" +
                "      \"https://images-na.ssl-images-amazon.com/images/M/MV5BMTMyNTIxOTQ3M15BMl5BanBnXkFtZTcwMjU2NzAzMw@@._V1_SY1000_CR0,0,674,1000_AL_.jpg\", \n" +
                "      \"https://images-na.ssl-images-amazon.com/images/M/MV5BMTQzOTk1ODc3MV5BMl5BanBnXkFtZTcwNDc4NTIyMw@@._V1_SX1777_CR0,0,1777,744_AL_.jpg\", \n" +
                "      \"https://images-na.ssl-images-amazon.com/images/M/MV5BNDg2ODg5NTE1NV5BMl5BanBnXkFtZTgwNjQzNzA4NjE@._V1_SY1000_CR0,0,627,1000_AL_.jpg\", \n" +
                "      \"https://images-na.ssl-images-amazon.com/images/M/MV5BMTUzMjI5Mzc0OV5BMl5BanBnXkFtZTcwNDc5MzUzMw@@._V1_SX1500_CR0,0,1500,999_AL_.jpg\", \n" +
                "      \"https://images-na.ssl-images-amazon.com/images/M/MV5BNWExMTM0ZTUtOGM3Zi00MzM5LTlkOTQtODRjZjYyNjg5NjRiXkEyXkFqcGdeQXVyNjUxMjc1OTM@._V1_SX1777_CR0,0,1777,741_AL_.jpg\", \n" +
                "      \"https://images-na.ssl-images-amazon.com/images/M/MV5BMjU5NTM1ODE4OF5BMl5BanBnXkFtZTcwNTU2OTAyNw@@._V1_SY1000_CR0,0,1501,1000_AL_.jpg\", \n" +
                "      \"https://images-na.ssl-images-amazon.com/images/M/MV5BMTgyMDk5MDMwN15BMl5BanBnXkFtZTgwNzE1NzMzMzI@._V1_SY1000_CR0,0,1333,1000_AL_.jpg\", \n" +
                "      \"https://images-na.ssl-images-amazon.com/images/M/MV5BMjIzMDk5NTMwM15BMl5BanBnXkFtZTcwNDY5MzUzMw@@._V1_SY1000_CR0,0,666,1000_AL_.jpg\", \n" +
                "      \"https://images-na.ssl-images-amazon.com/images/M/MV5BNTg2NzYzNTM5N15BMl5BanBnXkFtZTgwMDAyNjkxMTE@._V1_SX1777_CR0,0,1777,999_AL_.jpg\", \n" +
                "      \"https://images-na.ssl-images-amazon.com/images/M/MV5BMTYwNTU3MDI2OV5BMl5BanBnXkFtZTgwMjU1NjE5ODE@._V1_SY1000_CR0,0,737,1000_AL_.jpg\", \n" +
                "      \"https://images-na.ssl-images-amazon.com/images/M/MV5BMjMyMTkzMjA1M15BMl5BanBnXkFtZTcwMTM3MDM3Nw@@._V1_SY1000_CR0,0,1503,1000_AL_.jpg\", \n" +
                "      \"https://images-na.ssl-images-amazon.com/images/M/MV5BMTAxMDU2NjQzOTheQTJeQWpwZ15BbWU3MDIyNDczMzM@._V1_SY1000_CR0,0,666,1000_AL_.jpg\", \n" +
                "      \"https://images-na.ssl-images-amazon.com/images/M/MV5BMTk1ODA5Nzk1NF5BMl5BanBnXkFtZTcwNDU5MzUzMw@@._V1_SY1000_CR0,0,666,1000_AL_.jpg\", \n" +
                "      \"https://images-na.ssl-images-amazon.com/images/M/MV5BMTgzNDY1MjA4NV5BMl5BanBnXkFtZTgwNDc3NjMwMzE@._V1_SY1000_CR0,0,658,1000_AL_.jpg\", \n" +
                "      \"https://images-na.ssl-images-amazon.com/images/M/MV5BMTY4ODI5NDc2M15BMl5BanBnXkFtZTcwOTI2MDM2NQ@@._V1_SY1000_CR0,0,1500,1000_AL_.jpg\", \n" +
                "      \"https://images-na.ssl-images-amazon.com/images/M/MV5BNDM5MDg2MjQtYzM2ZS00YjNiLTljNDUtOWVhZjZiNDkyYmZhXkEyXkFqcGdeQXVyMjQwMDg0Ng@@._V1_SY1000_CR0,0,772,1000_AL_.jpg\", \n" +
                "      \"https://images-na.ssl-images-amazon.com/images/M/MV5BNjk4OTczOTk0NF5BMl5BanBnXkFtZTcwNjQ0NzMzMw@@._V1_SY1000_CR0,0,674,1000_AL_.jpg\", \n" +
                "      \"https://images-na.ssl-images-amazon.com/images/M/MV5BNjg3NDk5NjY2Ml5BMl5BanBnXkFtZTcwMzE3NTIyMw@@._V1_SY1000_CR0,0,1509,1000_AL_.jpg\", \n" +
                "      \"https://images-na.ssl-images-amazon.com/images/M/MV5BMjAxODA2MDI1NF5BMl5BanBnXkFtZTcwMTgwMjE3MQ@@._V1_SX1500_CR0,0,1500,999_AL_.jpg\", \n" +
                "      \"https://images-na.ssl-images-amazon.com/images/M/MV5BNDIwMTA3NjUzN15BMl5BanBnXkFtZTcwOTczNTEyOQ@@._V1_SY1000_CR0,0,1505,1000_AL_.jpg\", \n" +
                "      \"https://images-na.ssl-images-amazon.com/images/M/MV5BMjA4MzQ0NzgwOF5BMl5BanBnXkFtZTcwNzY5MzUzMw@@._V1_SX1500_CR0,0,1500,999_AL_.jpg\", \n" +
                "      \"https://images-na.ssl-images-amazon.com/images/M/MV5BMjEzMzUxNzc0Nl5BMl5BanBnXkFtZTcwOTk1NzAzMw@@._V1_SY1000_CR0,0,1502,1000_AL_.jpg\", \n" +
                "      \"https://images-na.ssl-images-amazon.com/images/M/MV5BMTA3MjgxNTI4ODReQTJeQWpwZ15BbWU4MDU0MzcwODYx._V1_SY1000_CR0,0,725,1000_AL_.jpg\", \n" +
                "      \"https://images-na.ssl-images-amazon.com/images/M/MV5BMjE0Mzc1MzA0M15BMl5BanBnXkFtZTcwMjU5MzUzMw@@._V1_SX1500_CR0,0,1500,999_AL_.jpg\", \n" +
                "      \"https://images-na.ssl-images-amazon.com/images/M/MV5BMTY3MzIxODY3NV5BMl5BanBnXkFtZTcwNDM0NDM4Nw@@._V1_SY1000_CR0,0,665,1000_AL_.jpg\", \n" +
                "      \"https://images-na.ssl-images-amazon.com/images/M/MV5BMTY5MDE5MzgwN15BMl5BanBnXkFtZTcwMTE0NDM4Nw@@._V1_SY1000_CR0,0,665,1000_AL_.jpg\", \n" +
                "      \"https://images-na.ssl-images-amazon.com/images/M/MV5BNjY1NTgwNjQyNV5BMl5BanBnXkFtZTcwMjgwOTE2NQ@@._V1_SY1000_CR0,0,1500,1000_AL_.jpg\", \n" +
                "      \"https://images-na.ssl-images-amazon.com/images/M/MV5BMTcxNzQ2NTc5NF5BMl5BanBnXkFtZTcwMDc5MzUzMw@@._V1_SX1500_CR0,0,1500,999_AL_.jpg\", \n" +
                "      \"https://images-na.ssl-images-amazon.com/images/M/MV5BMTQxMzExNDMyMl5BMl5BanBnXkFtZTgwOTEyNTY4MjE@._V1_SX1500_CR0,0,1500,999_AL_.jpg\", \n" +
                "      \"https://images-na.ssl-images-amazon.com/images/M/MV5BOTUzODg4Njg3NF5BMl5BanBnXkFtZTcwMDU5MzUzMw@@._V1_SX1500_CR0,0,1500,999_AL_.jpg\", \n" +
                "      \"https://images-na.ssl-images-amazon.com/images/M/MV5BMTc1ODEzOTU0N15BMl5BanBnXkFtZTgwNDcyMzE0MDE@._V1_SY1000_CR0,0,674,1000_AL_.jpg\", \n" +
                "      \"https://images-na.ssl-images-amazon.com/images/M/MV5BMTUzNDk1NTg2OF5BMl5BanBnXkFtZTcwNDU2NzAzMw@@._V1_SY1000_CR0,0,674,1000_AL_.jpg\", \n" +
                "      \"https://images-na.ssl-images-amazon.com/images/M/MV5BNjYwMTI0Mzk1Nl5BMl5BanBnXkFtZTcwNDc1NzAzMw@@._V1_SX1777_CR0,0,1777,874_AL_.jpg\", \n" +
                "      \"https://images-na.ssl-images-amazon.com/images/M/MV5BMTUyMTUxNDMxNl5BMl5BanBnXkFtZTcwODgwMjE3MQ@@._V1_SY1000_CR0,0,1462,1000_AL_.jpg\", \n" +
                "      \"https://images-na.ssl-images-amazon.com/images/M/MV5BNTEwMzkzODI2NV5BMl5BanBnXkFtZTcwMzgwMjE3MQ@@._V1_SY1000_CR0,0,666,1000_AL_.jpg\", \n" +
                "      \"https://images-na.ssl-images-amazon.com/images/M/MV5BOTg1NjA0NDczOV5BMl5BanBnXkFtZTcwNjk0NDM4Nw@@._V1_SX1500_CR0,0,1500,999_AL_.jpg\", \n" +
                "      \"https://images-na.ssl-images-amazon.com/images/M/MV5BMTU5NjgxMzM4MV5BMl5BanBnXkFtZTcwOTgwMjE3MQ@@._V1_SX1500_CR0,0,1500,999_AL_.jpg\", \n" +
                "      \"https://images-na.ssl-images-amazon.com/images/M/MV5BMTQ5NTIwMzQ0Ml5BMl5BanBnXkFtZTgwOTU3ODAwMzE@._V1_SY1000_CR0,0,1511,1000_AL_.jpg\", \n" +
                "      \"https://images-na.ssl-images-amazon.com/images/M/MV5BMTM1NjkxMzI3OF5BMl5BanBnXkFtZTcwOTI1NjQxMw@@._V1_SY1000_CR0,0,1462,1000_AL_.jpg\", \n" +
                "      \"https://images-na.ssl-images-amazon.com/images/M/MV5BMjM5ODE5ODU3M15BMl5BanBnXkFtZTgwOTgyMTAwMzE@._V1_SY1000_CR0,0,1271,1000_AL_.jpg\", \n" +
                "      \"https://images-na.ssl-images-amazon.com/images/M/MV5BMTQxNjE3ODEzOF5BMl5BanBnXkFtZTcwMjgzNzYxOA@@._V1_SY1000_CR0,0,1503,1000_AL_.jpg\", \n" +
                "      \"https://images-na.ssl-images-amazon.com/images/M/MV5BMjMyNjU5NzU4N15BMl5BanBnXkFtZTcwMjM0NDM4Nw@@._V1_SX1500_CR0,0,1500,999_AL_.jpg\", \n" +
                "      \"https://images-na.ssl-images-amazon.com/images/M/MV5BMzI3MDUxNzY0M15BMl5BanBnXkFtZTgwNzQ0OTc0MzI@._V1_SY1000_CR0,0,734,1000_AL_.jpg\", \n" +
                "      \"https://images-na.ssl-images-amazon.com/images/M/MV5BMjIxMDE1NzgzNl5BMl5BanBnXkFtZTcwNTEwMTQyMw@@._V1_SY1000_CR0,0,1511,1000_AL_.jpg\", \n" +
                "      \"https://images-na.ssl-images-amazon.com/images/M/MV5BMTY0NTk0ODk2N15BMl5BanBnXkFtZTcwNzIzODYzMw@@._V1_SY1000_CR0,0,1659,1000_AL_.jpg\", \n" +
                "      \"https://images-na.ssl-images-amazon.com/images/M/MV5BMjIwNDk1ODk1MV5BMl5BanBnXkFtZTgwNjkyMTAwMzE@._V1_SY1000_CR0,0,664,1000_AL_.jpg\", \n" +
                "      \"https://images-na.ssl-images-amazon.com/images/M/MV5BMjA5Mjg4NDE3Ml5BMl5BanBnXkFtZTcwMTk0NDM4Nw@@._V1_SY1000_CR0,0,1430,1000_AL_.jpg\", \n" +
                "      \"https://images-na.ssl-images-amazon.com/images/M/MV5BMjIyNzkwNTM4NF5BMl5BanBnXkFtZTcwNjYwODM2Mg@@._V1_SY1000_CR0,0,1499,1000_AL_.jpg\", \n" +
                "      \"https://images-na.ssl-images-amazon.com/images/M/MV5BMTMzOTAyNzk0MF5BMl5BanBnXkFtZTcwODI1NzEyNw@@._V1_SY1000_CR0,0,1335,1000_AL_.jpg\", \n" +
                "      \"https://images-na.ssl-images-amazon.com/images/M/MV5BN2ZlM2I1N2EtZjkxZC00ZTA4LWE1YTMtZjVlMDhlMjQxMWE2XkEyXkFqcGdeQXVyNjUwNzk3NDc@._V1_SY1000_CR0,0,1502,1000_AL_.jpg\", \n" +
                "      \"https://images-na.ssl-images-amazon.com/images/M/MV5BMTQzNzYyMzg4MV5BMl5BanBnXkFtZTcwMjMwOTc3NQ@@._V1_SY1000_CR0,0,1502,1000_AL_.jpg\", \n" +
                "      \"https://images-na.ssl-images-amazon.com/images/M/MV5BMjAwMTE0MzY1MV5BMl5BanBnXkFtZTcwNTIzODYzMw@@._V1_SY1000_CR0,0,1659,1000_AL_.jpg\", \n" +
                "      \"https://images-na.ssl-images-amazon.com/images/M/MV5BMTMxMjIwNDIwOF5BMl5BanBnXkFtZTcwNzc4NTIyMw@@._V1_SY1000_CR0,0,1481,1000_AL_.jpg\", \n" +
                "      \"https://images-na.ssl-images-amazon.com/images/M/MV5BMjA4ODU5NzQ1Nl5BMl5BanBnXkFtZTcwMDA1NzAzMw@@._V1_SY1000_CR0,0,666,1000_AL_.jpg\", \n" +
                "      \"https://images-na.ssl-images-amazon.com/images/M/MV5BMTU5MDEzMzYwMF5BMl5BanBnXkFtZTcwNTcwMjUxMw@@._V1_SY1000_CR0,0,675,1000_AL_.jpg\", \n" +
                "      \"https://images-na.ssl-images-amazon.com/images/M/MV5BMTgyODU4MzczOF5BMl5BanBnXkFtZTgwNDMyNTY4MjE@._V1_SX1500_CR0,0,1500,999_AL_.jpg\", \n" +
                "      \"https://images-na.ssl-images-amazon.com/images/M/MV5BMTYzNDMwODEwNl5BMl5BanBnXkFtZTcwNzI3MDM3Nw@@._V1_SY1000_CR0,0,1474,1000_AL_.jpg\", \n" +
                "      \"https://images-na.ssl-images-amazon.com/images/M/MV5BMTUzNzE0NTg3NV5BMl5BanBnXkFtZTcwNDQyNDQxOQ@@._V1_SY1000_CR0,0,1505,1000_AL_.jpg\", \n" +
                "      \"https://images-na.ssl-images-amazon.com/images/M/MV5BMjAyNjg1OTQ4MF5BMl5BanBnXkFtZTcwNzA3ODU5OA@@._V1_SY1000_CR0,0,1503,1000_AL_.jpg\", \n" +
                "      \"https://images-na.ssl-images-amazon.com/images/M/MV5BMTM2ODgzNjg0NF5BMl5BanBnXkFtZTcwNjY0NDkwOQ@@._V1_SY1000_CR0,0,683,1000_AL_.jpg\", \n" +
                "      \"https://images-na.ssl-images-amazon.com/images/M/MV5BMzc5MTk1MzE0MF5BMl5BanBnXkFtZTgwNTc3NjMwMzE@._V1_SY1000_CR0,0,709,1000_AL_.jpg\", \n" +
                "      \"https://images-na.ssl-images-amazon.com/images/M/MV5BMTQ2MzIzNDM4N15BMl5BanBnXkFtZTcwNDA2NzAzMw@@._V1_SY1000_CR0,0,1502,1000_AL_.jpg\", \n" +
                "      \"https://images-na.ssl-images-amazon.com/images/M/MV5BMTcxMzk3MzcxNF5BMl5BanBnXkFtZTcwMzYwOTc3NQ@@._V1_SY1000_CR0,0,846,1000_AL_.jpg\", \n" +
                "      \"https://images-na.ssl-images-amazon.com/images/M/MV5BMjE5MjI2MTk3NV5BMl5BanBnXkFtZTcwMTA2NzAzMw@@._V1_SY1000_CR0,0,1502,1000_AL_.jpg\", \n" +
                "      \"https://images-na.ssl-images-amazon.com/images/M/MV5BNjc0NzE0MjgzOV5BMl5BanBnXkFtZTcwMjgzNTEyOQ@@._V1_SY1000_CR0,0,1503,1000_AL_.jpg\", \n" +
                "      \"https://images-na.ssl-images-amazon.com/images/M/MV5BMjEzNTgyODgwNV5BMl5BanBnXkFtZTgwNTU3ODAwMzE@._V1_SY1000_CR0,0,1503,1000_AL_.jpg\", \n" +
                "      \"https://images-na.ssl-images-amazon.com/images/M/MV5BMTk2ODYyMTMwNl5BMl5BanBnXkFtZTcwODQ2Nzk5OA@@._V1_SY1000_CR0,0,752,1000_AL_.jpg\", \n" +
                "      \"https://images-na.ssl-images-amazon.com/images/M/MV5BMTgyOTkzMzM4N15BMl5BanBnXkFtZTcwNDU2OTAyNw@@._V1_SY1000_CR0,0,1501,1000_AL_.jpg\", \n" +
                "      \"https://images-na.ssl-images-amazon.com/images/M/MV5BMjI2OTYwMTE0NF5BMl5BanBnXkFtZTcwODU2OTAyNw@@._V1_SY1000_CR0,0,1503,1000_AL_.jpg\", \n" +
                "      \"https://images-na.ssl-images-amazon.com/images/M/MV5BNDY3MjIwNDU0MF5BMl5BanBnXkFtZTgwOTIyNTY4MjE@._V1_SX1500_CR0,0,1500,999_AL_.jpg\", \n" +
                "      \"https://images-na.ssl-images-amazon.com/images/M/MV5BODU0NTIwMjIwMF5BMl5BanBnXkFtZTcwNjI1NzEyNw@@._V1_SY1000_CR0,0,1449,1000_AL_.jpg\", \n" +
                "      \"https://images-na.ssl-images-amazon.com/images/M/MV5BMTQ1MzIzODUzOV5BMl5BanBnXkFtZTcwOTMzNzMzMw@@._V1_SX1777_CR0,0,1777,757_AL_.jpg\", \n" +
                "      \"https://images-na.ssl-images-amazon.com/images/M/MV5BNDg1NTU2OWEtM2UzYi00ZWRmLWEwMTktZWNjYWQ1NWM1OThjXkEyXkFqcGdeQXVyMTQxNzMzNDI@._V1_SY1000_CR0,0,674,1000_AL_.jpg\", \n" +
                "      \"https://images-na.ssl-images-amazon.com/images/M/MV5BMTU1NTI2ODc1Nl5BMl5BanBnXkFtZTgwODU1NjE5ODE@._V1_SY1000_CR0,0,1501,1000_AL_.jpg\", \n" +
                "      \"https://images-na.ssl-images-amazon.com/images/M/MV5BMTQxODUyMzIwOF5BMl5BanBnXkFtZTcwMzM1NjQxMw@@._V1_SY1000_CR0,0,1502,1000_AL_.jpg\", \n" +
                "      \"https://images-na.ssl-images-amazon.com/images/M/MV5BZGFjMTg2ZjUtZTBhYi00NzhjLWExZTctYmFiMjczOTI2NGE1XkEyXkFqcGdeQXVyNDkzNTM2ODg@._V1_SX1777_CR0,0,1777,999_AL_.jpg\", \n" +
                "      \"https://images-na.ssl-images-amazon.com/images/M/MV5BMjA2MDA5ODI1MV5BMl5BanBnXkFtZTcwMDU2OTAyNw@@._V1_SY1000_CR0,0,1501,1000_AL_.jpg\", \n" +
                "      \"https://images-na.ssl-images-amazon.com/images/M/MV5BMTMxODY3MDI4MV5BMl5BanBnXkFtZTcwMDMzODYzMw@@._V1_SY1000_CR0,0,1659,1000_AL_.jpg\", \n" +
                "      \"https://images-na.ssl-images-amazon.com/images/M/MV5BMzY1OTg5MTIyNl5BMl5BanBnXkFtZTgwOTYwMDIwMjE@._V1_SY1000_CR0,0,1718,1000_AL_.jpg\", \n" +
                "      \"https://images-na.ssl-images-amazon.com/images/M/MV5BNjUxNDQ0MjkwNV5BMl5BanBnXkFtZTcwMTg1NzAzMw@@._V1_SY1000_CR0,0,1502,1000_AL_.jpg\", \n" +
                "      \"https://images-na.ssl-images-amazon.com/images/M/MV5BMjQ3MDAwMzg0N15BMl5BanBnXkFtZTgwOTMxOTc0MzI@._V1_SY1000_CR0,0,753,1000_AL_.jpg\", \n" +
                "      \"https://images-na.ssl-images-amazon.com/images/M/MV5BMTgzNjY5ODY0OV5BMl5BanBnXkFtZTcwMTkwMjE3MQ@@._V1_SY1000_CR0,0,1658,1000_AL_.jpg\", \n" +
                "      \"https://images-na.ssl-images-amazon.com/images/M/MV5BMTMzODUwNTA5M15BMl5BanBnXkFtZTcwNzIyOTU2Nw@@._V1_SX1520_CR0,0,1520,999_AL_.jpg\", \n" +
                "      \"https://images-na.ssl-images-amazon.com/images/M/MV5BMTU4ODQ2MjU2Nl5BMl5BanBnXkFtZTgwNzQyNTY4MjE@._V1_SX1500_CR0,0,1500,999_AL_.jpg\", \n" +
                "      \"https://images-na.ssl-images-amazon.com/images/M/MV5BMzg1NjU0NDYzN15BMl5BanBnXkFtZTgwNjQ5NTA4NjE@._V1_SY1000_CR0,0,1509,1000_AL_.jpg\", \n" +
                "      \"https://images-na.ssl-images-amazon.com/images/M/MV5BMTc0MDM0NzczMF5BMl5BanBnXkFtZTcwMzIzODYzMw@@._V1_SY1000_CR0,0,1659,1000_AL_.jpg\", \n" +
                "      \"https://images-na.ssl-images-amazon.com/images/M/MV5BMjMyMDU4NDIxNl5BMl5BanBnXkFtZTcwNDA3ODU5OA@@._V1_SY1000_CR0,0,1505,1000_AL_.jpg\", \n" +
                "      \"https://images-na.ssl-images-amazon.com/images/M/MV5BMTgyMjA5MDUyMl5BMl5BanBnXkFtZTcwNjIzODYzMw@@._V1_SY1000_CR0,0,1659,1000_AL_.jpg\", \n" +
                "      \"https://images-na.ssl-images-amazon.com/images/M/MV5BMjI3MDc1MDIxM15BMl5BanBnXkFtZTcwMjczMzMzOQ@@._V1_SY1000_CR0,0,1294,1000_AL_.jpg\", \n" +
                "      \"https://images-na.ssl-images-amazon.com/images/M/MV5BMTM4Mjg5NTE2OF5BMl5BanBnXkFtZTcwMDE4NDMzNQ@@._V1_SY1000_CR0,0,1502,1000_AL_.jpg\", \n" +
                "      \"https://images-na.ssl-images-amazon.com/images/M/MV5BMTk5NDc3NjI5N15BMl5BanBnXkFtZTcwMjA2NzAzMw@@._V1_SY1000_CR0,0,1502,1000_AL_.jpg\", \n" +
                "      \"https://images-na.ssl-images-amazon.com/images/M/MV5BMTY1NTc1NTI5Ml5BMl5BanBnXkFtZTcwMTAwOTc3NQ@@._V1_SY1000_CR0,0,1502,1000_AL_.jpg\", \n" +
                "      \"https://images-na.ssl-images-amazon.com/images/M/MV5BMzYxNDkyNTE0OF5BMl5BanBnXkFtZTcwODkyNzk5OA@@._V1_SY1000_CR0,0,1451,1000_AL_.jpg\", \n" +
                "      \"https://images-na.ssl-images-amazon.com/images/M/MV5BMTQ2OTg3NDExMl5BMl5BanBnXkFtZTcwNDcwMjE3MQ@@._V1_SY1000_CR0,0,666,1000_AL_.jpg\", \n" +
                "      \"https://images-na.ssl-images-amazon.com/images/M/MV5BMjM3MDI4NjE3NF5BMl5BanBnXkFtZTgwODIyNTY4MjE@._V1_SX1500_CR0,0,1500,999_AL_.jpg\", \n" +
                "      \"https://images-na.ssl-images-amazon.com/images/M/MV5BMTQ0NDQxOTY3M15BMl5BanBnXkFtZTcwNTE0MTExOQ@@._V1_SY1000_CR0,0,675,1000_AL_.jpg\", \n" +
                "      \"https://images-na.ssl-images-amazon.com/images/M/MV5BMTQyNjM5MzM3OV5BMl5BanBnXkFtZTgwNTEwMjgzMzE@._V1_SY1000_CR0,0,1498,1000_AL_.jpg\", \n" +
                "      \"https://images-na.ssl-images-amazon.com/images/M/MV5BMjA1MDY0OTA3Nl5BMl5BanBnXkFtZTcwMTczODMyOQ@@._V1_SY1000_CR0,0,1503,1000_AL_.jpg\", \n" +
                "      \"https://images-na.ssl-images-amazon.com/images/M/MV5BODQyNjM1NTE4N15BMl5BanBnXkFtZTcwNTI1NzEyNw@@._V1_SX1500_CR0,0,1500,999_AL_.jpg\"\n" +
                "    ]\n" +
                "  }\n" +
                "]");
        return buf;
    }

}
