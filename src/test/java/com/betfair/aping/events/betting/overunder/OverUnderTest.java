package com.betfair.aping.events.betting.overunder;

import com.betfair.aping.com.betfair.aping.events.betting.OverUnderMarket;
import com.betfair.aping.entities.*;
import com.google.gson.Gson;
import org.junit.Ignore;
import org.junit.Test;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.List;

import static org.junit.Assert.assertEquals;

/**
 * Created by markwilliams on 23/08/2014.
 */
public class OverUnderTest {

    public final String under25Goals = "Under 2.5 Goals";
    public final String over25Goals = "Over 2.5 Goals";

    @Test
    public void castTest() {
        Integer priceRange = ((int) Math.floor(2.02));
        log(priceRange.toString());
    }

    @Test
    public void overUnderBetTest() throws Exception {
        String jsonEvent = "{\"id\":\"27249641\",\"name\":\"Man City v Liverpool\",\"countryCode\":\"GB\",\"timezone\":\"Europe/London\",\"openDate\":\"Aug 25, 2014 8:00:00 PM\",\"market\":{\"OVER_UNDER_25\":{\"marketId\":\"1.115036531\",\"marketName\":\"Over/Under 2.5 Goals\",\"description\":{\"persistenceEnabled\":true,\"bspMarket\":false,\"marketTime\":\"Aug 25, 2014 8:00:00 PM\",\"suspendTime\":\"Aug 25, 2014 8:00:00 PM\",\"bettingType\":\"ODDS\",\"turnInPlayEnabled\":true,\"marketType\":\"OVER_UNDER_25\",\"marketBaseRate\":5.0,\"discountAllowed\":true,\"wallet\":\"UK wallet\",\"rules\":\"\",\"rulesHasDate\":true},\"runners\":[{\"selectionId\":47972,\"runnerName\":\"Under 2.5 Goals\",\"handicap\":0.0},{\"selectionId\":47973,\"runnerName\":\"Over 2.5 Goals\",\"handicap\":0.0}],\"competition\":{\"id\":\"31\",\"name\":\"Barclays Premier League\"},\"event\":{\"id\":\"27249641\",\"name\":\"Man City v Liverpool\",\"countryCode\":\"GB\",\"timezone\":\"Europe/London\",\"openDate\":\"Aug 25, 2014 8:00:00 PM\",\"market\":{}},\"marketBook\":{\"marketId\":\"1.115036531\",\"isMarketDataDelayed\":true,\"status\":\"OPEN\",\"betDelay\":0,\"bspReconciled\":false,\"complete\":true,\"inplay\":false,\"numberOfWinners\":1,\"numberOfRunners\":2,\"numberOfActiveRunners\":2,\"totalMatched\":5531.36,\"totalAvailable\":18293.52,\"crossMatching\":true,\"runnersVoidable\":false,\"version\":795300510,\"runners\":[{\"selectionId\":47972,\"handicap\":0.0,\"status\":\"ACTIVE\",\"totalMatched\":0.0,\"ex\":{\"availableToBack\":[{\"price\":2.48,\"size\":18.39},{\"price\":2.46,\"size\":23.84},{\"price\":2.4,\"size\":90.5}],\"availableToLay\":[{\"price\":2.5,\"size\":127.0},{\"price\":2.54,\"size\":380.25},{\"price\":2.56,\"size\":258.02}],\"tradedVolume\":[]}},{\"selectionId\":47973,\"handicap\":0.0,\"status\":\"ACTIVE\",\"totalMatched\":0.0,\"ex\":{\"availableToBack\":[{\"price\":1.67,\"size\":10.22},{\"price\":1.66,\"size\":385.84},{\"price\":1.65,\"size\":384.05}],\"availableToLay\":[{\"price\":1.68,\"size\":22.97},{\"price\":1.69,\"size\":184.02},{\"price\":1.7,\"size\":76.68}],\"tradedVolume\":[]}}]}},\"CORRECT_SCORE\":{\"marketId\":\"1.115036530\",\"marketName\":\"Correct Score\",\"description\":{\"persistenceEnabled\":true,\"bspMarket\":false,\"marketTime\":\"Aug 25, 2014 8:00:00 PM\",\"suspendTime\":\"Aug 25, 2014 8:00:00 PM\",\"bettingType\":\"ODDS\",\"turnInPlayEnabled\":true,\"marketType\":\"CORRECT_SCORE\",\"marketBaseRate\":5.0,\"discountAllowed\":true,\"wallet\":\"UK wallet\",\"rules\":\"\",\"rulesHasDate\":true},\"runners\":[{\"selectionId\":1,\"runnerName\":\"0 - 0\",\"handicap\":0.0},{\"selectionId\":4,\"runnerName\":\"0 - 1\",\"handicap\":0.0},{\"selectionId\":9,\"runnerName\":\"0 - 2\",\"handicap\":0.0},{\"selectionId\":16,\"runnerName\":\"0 - 3\",\"handicap\":0.0},{\"selectionId\":2,\"runnerName\":\"1 - 0\",\"handicap\":0.0},{\"selectionId\":3,\"runnerName\":\"1 - 1\",\"handicap\":0.0},{\"selectionId\":8,\"runnerName\":\"1 - 2\",\"handicap\":0.0},{\"selectionId\":15,\"runnerName\":\"1 - 3\",\"handicap\":0.0},{\"selectionId\":5,\"runnerName\":\"2 - 0\",\"handicap\":0.0},{\"selectionId\":6,\"runnerName\":\"2 - 1\",\"handicap\":0.0},{\"selectionId\":7,\"runnerName\":\"2 - 2\",\"handicap\":0.0},{\"selectionId\":14,\"runnerName\":\"2 - 3\",\"handicap\":0.0},{\"selectionId\":10,\"runnerName\":\"3 - 0\",\"handicap\":0.0},{\"selectionId\":11,\"runnerName\":\"3 - 1\",\"handicap\":0.0},{\"selectionId\":12,\"runnerName\":\"3 - 2\",\"handicap\":0.0},{\"selectionId\":13,\"runnerName\":\"3 - 3\",\"handicap\":0.0},{\"selectionId\":4506345,\"runnerName\":\"Any Unquoted \",\"handicap\":0.0}],\"competition\":{\"id\":\"31\",\"name\":\"Barclays Premier League\"},\"event\":{\"id\":\"27249641\",\"name\":\"Man City v Liverpool\",\"countryCode\":\"GB\",\"timezone\":\"Europe/London\",\"openDate\":\"Aug 25, 2014 8:00:00 PM\",\"market\":{}},\"marketBook\":{\"marketId\":\"1.115036530\",\"isMarketDataDelayed\":true,\"status\":\"OPEN\",\"betDelay\":0,\"bspReconciled\":false,\"complete\":true,\"inplay\":false,\"numberOfWinners\":1,\"numberOfRunners\":17,\"numberOfActiveRunners\":17,\"totalMatched\":4623.37,\"totalAvailable\":20971.3,\"crossMatching\":true,\"runnersVoidable\":false,\"version\":795300526,\"runners\":[{\"selectionId\":1,\"handicap\":0.0,\"status\":\"ACTIVE\",\"totalMatched\":0.0,\"ex\":{\"availableToBack\":[{\"price\":17.5,\"size\":168.32},{\"price\":17.0,\"size\":33.69},{\"price\":16.5,\"size\":45.3}],\"availableToLay\":[{\"price\":18.0,\"size\":58.57},{\"price\":18.5,\"size\":109.87},{\"price\":19.5,\"size\":76.68}],\"tradedVolume\":[]}},{\"selectionId\":4,\"handicap\":0.0,\"status\":\"ACTIVE\",\"totalMatched\":0.0,\"ex\":{\"availableToBack\":[{\"price\":18.5,\"size\":153.87},{\"price\":18.0,\"size\":27.77},{\"price\":17.5,\"size\":28.57}],\"availableToLay\":[{\"price\":20.0,\"size\":2.47},{\"price\":21.0,\"size\":133.08},{\"price\":22.0,\"size\":55.12}],\"tradedVolume\":[]}},{\"selectionId\":9,\"handicap\":0.0,\"status\":\"ACTIVE\",\"totalMatched\":0.0,\"ex\":{\"availableToBack\":[{\"price\":34.0,\"size\":89.12},{\"price\":32.0,\"size\":15.62},{\"price\":30.0,\"size\":16.66}],\"availableToLay\":[{\"price\":40.0,\"size\":51.77},{\"price\":50.0,\"size\":3.42},{\"price\":60.0,\"size\":3.42}],\"tradedVolume\":[]}},{\"selectionId\":16,\"handicap\":0.0,\"status\":\"ACTIVE\",\"totalMatched\":0.0,\"ex\":{\"availableToBack\":[{\"price\":70.0,\"size\":6.72},{\"price\":60.0,\"size\":5.93},{\"price\":50.0,\"size\":50.0}],\"availableToLay\":[{\"price\":90.0,\"size\":3.0},{\"price\":95.0,\"size\":2.0},{\"price\":100.0,\"size\":16.77}],\"tradedVolume\":[]}},{\"selectionId\":2,\"handicap\":0.0,\"status\":\"ACTIVE\",\"totalMatched\":0.0,\"ex\":{\"availableToBack\":[{\"price\":10.5,\"size\":1141.58},{\"price\":10.0,\"size\":175.0},{\"price\":9.8,\"size\":103.02}],\"availableToLay\":[{\"price\":11.0,\"size\":2.11},{\"price\":12.0,\"size\":128.28},{\"price\":12.5,\"size\":36.71}],\"tradedVolume\":[]}},{\"selectionId\":3,\"handicap\":0.0,\"status\":\"ACTIVE\",\"totalMatched\":0.0,\"ex\":{\"availableToBack\":[{\"price\":9.2,\"size\":482.87},{\"price\":9.0,\"size\":159.03},{\"price\":8.8,\"size\":56.81}],\"availableToLay\":[{\"price\":10.0,\"size\":190.29},{\"price\":14.5,\"size\":37.0}],\"tradedVolume\":[]}},{\"selectionId\":8,\"handicap\":0.0,\"status\":\"ACTIVE\",\"totalMatched\":0.0,\"ex\":{\"availableToBack\":[{\"price\":15.5,\"size\":79.2},{\"price\":15.0,\"size\":80.68},{\"price\":14.0,\"size\":26.92}],\"availableToLay\":[{\"price\":17.5,\"size\":80.68},{\"price\":18.0,\"size\":84.67},{\"price\":25.0,\"size\":3.42}],\"tradedVolume\":[]}},{\"selectionId\":15,\"handicap\":0.0,\"status\":\"ACTIVE\",\"totalMatched\":0.0,\"ex\":{\"availableToBack\":[{\"price\":40.0,\"size\":67.61},{\"price\":38.0,\"size\":22.36},{\"price\":29.0,\"size\":50.0}],\"availableToLay\":[{\"price\":42.0,\"size\":15.6},{\"price\":44.0,\"size\":3.21},{\"price\":46.0,\"size\":18.17}],\"tradedVolume\":[]}},{\"selectionId\":5,\"handicap\":0.0,\"status\":\"ACTIVE\",\"totalMatched\":0.0,\"ex\":{\"availableToBack\":[{\"price\":11.5,\"size\":379.68},{\"price\":11.0,\"size\":70.45},{\"price\":10.5,\"size\":47.61}],\"availableToLay\":[{\"price\":13.0,\"size\":3.71},{\"price\":13.5,\"size\":120.48},{\"price\":14.0,\"size\":122.87}],\"tradedVolume\":[]}},{\"selectionId\":6,\"handicap\":0.0,\"status\":\"ACTIVE\",\"totalMatched\":0.0,\"ex\":{\"availableToBack\":[{\"price\":9.4,\"size\":1105.25},{\"price\":9.2,\"size\":663.03},{\"price\":9.0,\"size\":65.01}],\"availableToLay\":[{\"price\":9.8,\"size\":1007.66},{\"price\":10.0,\"size\":2253.69},{\"price\":10.5,\"size\":3037.35}],\"tradedVolume\":[]}},{\"selectionId\":7,\"handicap\":0.0,\"status\":\"ACTIVE\",\"totalMatched\":0.0,\"ex\":{\"availableToBack\":[{\"price\":14.5,\"size\":101.9},{\"price\":14.0,\"size\":80.68},{\"price\":13.0,\"size\":62.5}],\"availableToLay\":[{\"price\":16.0,\"size\":77.22},{\"price\":16.5,\"size\":3.48},{\"price\":19.0,\"size\":10.0}],\"tradedVolume\":[]}},{\"selectionId\":14,\"handicap\":0.0,\"status\":\"ACTIVE\",\"totalMatched\":0.0,\"ex\":{\"availableToBack\":[{\"price\":40.0,\"size\":99.01},{\"price\":38.0,\"size\":13.15},{\"price\":34.0,\"size\":10.61}],\"availableToLay\":[{\"price\":46.0,\"size\":51.14},{\"price\":120.0,\"size\":2.39}],\"tradedVolume\":[]}},{\"selectionId\":10,\"handicap\":0.0,\"status\":\"ACTIVE\",\"totalMatched\":0.0,\"ex\":{\"availableToBack\":[{\"price\":18.0,\"size\":85.25},{\"price\":17.5,\"size\":2.0},{\"price\":17.0,\"size\":86.23}],\"availableToLay\":[{\"price\":22.0,\"size\":50.0},{\"price\":23.0,\"size\":50.0},{\"price\":24.0,\"size\":80.68}],\"tradedVolume\":[]}},{\"selectionId\":11,\"handicap\":0.0,\"status\":\"ACTIVE\",\"totalMatched\":0.0,\"ex\":{\"availableToBack\":[{\"price\":15.5,\"size\":93.33},{\"price\":14.5,\"size\":34.48},{\"price\":13.0,\"size\":62.5}],\"availableToLay\":[{\"price\":16.5,\"size\":2.69},{\"price\":17.0,\"size\":7.71},{\"price\":17.5,\"size\":124.08}],\"tradedVolume\":[]}},{\"selectionId\":12,\"handicap\":0.0,\"status\":\"ACTIVE\",\"totalMatched\":0.0,\"ex\":{\"availableToBack\":[{\"price\":24.0,\"size\":43.45},{\"price\":23.0,\"size\":42.96},{\"price\":22.0,\"size\":43.93}],\"availableToLay\":[{\"price\":27.0,\"size\":84.55},{\"price\":28.0,\"size\":35.0},{\"price\":120.0,\"size\":4.91}],\"tradedVolume\":[]}},{\"selectionId\":13,\"handicap\":0.0,\"status\":\"ACTIVE\",\"totalMatched\":0.0,\"ex\":{\"availableToBack\":[{\"price\":50.0,\"size\":58.0},{\"price\":48.0,\"size\":131.45},{\"price\":36.0,\"size\":50.0}],\"availableToLay\":[{\"price\":55.0,\"size\":140.94},{\"price\":60.0,\"size\":151.71},{\"price\":65.0,\"size\":198.34}],\"tradedVolume\":[]}},{\"selectionId\":4506345,\"handicap\":0.0,\"status\":\"ACTIVE\",\"totalMatched\":0.0,\"ex\":{\"availableToBack\":[{\"price\":7.2,\"size\":184.66},{\"price\":6.8,\"size\":73.52},{\"price\":6.0,\"size\":41.66}],\"availableToLay\":[{\"price\":7.6,\"size\":2.6},{\"price\":7.8,\"size\":84.67},{\"price\":8.6,\"size\":2.0}],\"tradedVolume\":[]}}]}}}}";
        Gson gson = new Gson();
        Event e = gson.fromJson(jsonEvent, Event.class);
        MarketCatalogue mk = e.getMarket().get(MarketType.OVER_UNDER_25);
        MarketBook mb = e.getMarket().get(MarketType.OVER_UNDER_25).getMarketBook();

        RunnerCatalog rc = getRunnerByName(mk.getRunners(), under25Goals);
        log(rc.toString());

        Runner r = getRunnerBySelectionId(mb.getRunners(), rc.getSelectionId());
        log(r.toString());

        PriceSize back = getBack(r, 0);
        log(getBack(r, 0).toString());
        log(getBack(r, 1).toString());
        log(getBack(r, 2).toString());

        PriceSize lay = getLay(r, 0);
        log(lay.toString());
    }

    public RunnerCatalog getRunnerByName(List<RunnerCatalog> runners, String runnerName) throws Exception {
        for (RunnerCatalog r : runners) {
            if (r.getRunnerName().equals(runnerName)) {
                return r;
            }
        }
        throw new Exception("Runner not found: " + runnerName);
    }

    public Runner getRunnerBySelectionId(List<Runner> runners, long selectionId) throws Exception {
        for (Runner r : runners) {
            if (r.getSelectionId() == selectionId) {
                return r;
            }
        }
        throw new Exception("Runner not found: " + selectionId);
    }

    public PriceSize getBack(Runner runner, int position) {
        return runner.getEx().getAvailableToBack().get(position);
    }

    public PriceSize getLay(Runner runner, int position) {
        return runner.getEx().getAvailableToLay().get(position);
    }

    public void log(String s) {
        System.out.println(s);
    }

    @Test
    public void calendarTest() {
        Calendar cal = Calendar.getInstance();
        SimpleDateFormat df = new SimpleDateFormat("yyyyMMdd.HHmmss");
        System.out.println(df.format(cal.getTime()));
    }

    @Test
    public void safetyTest() {
        boolean safety = Boolean.valueOf("trues");

        System.out.println(safety);
    }

    @Test @Ignore
    public void getUnderRunnerName() {
        Gson gson = new Gson();
        final String jsonEvent = "{\"id\":\"27249641\",\"name\":\"Man City v Liverpool\",\"countryCode\":\"GB\",\"timezone\":\"Europe/London\",\"openDate\":\"Aug 25, 2014 8:00:00 PM\",\"market\":{\"OVER_UNDER_25\":{\"marketId\":\"1.115036531\",\"marketName\":\"Over/Under 2.5 Goals\",\"description\":{\"persistenceEnabled\":true,\"bspMarket\":false,\"marketTime\":\"Aug 25, 2014 8:00:00 PM\",\"suspendTime\":\"Aug 25, 2014 8:00:00 PM\",\"bettingType\":\"ODDS\",\"turnInPlayEnabled\":true,\"marketType\":\"OVER_UNDER_25\",\"marketBaseRate\":5.0,\"discountAllowed\":true,\"wallet\":\"UK wallet\",\"rules\":\"\",\"rulesHasDate\":true},\"runners\":[{\"selectionId\":47972,\"runnerName\":\"Under 2.5 Goals\",\"handicap\":0.0},{\"selectionId\":47973,\"runnerName\":\"Over 2.5 Goals\",\"handicap\":0.0}],\"competition\":{\"id\":\"31\",\"name\":\"Barclays Premier League\"},\"event\":{\"id\":\"27249641\",\"name\":\"Man City v Liverpool\",\"countryCode\":\"GB\",\"timezone\":\"Europe/London\",\"openDate\":\"Aug 25, 2014 8:00:00 PM\",\"market\":{}},\"marketBook\":{\"marketId\":\"1.115036531\",\"isMarketDataDelayed\":false,\"status\":\"OPEN\",\"betDelay\":5,\"bspReconciled\":false,\"complete\":true,\"inplay\":true,\"numberOfWinners\":1,\"numberOfRunners\":2,\"numberOfActiveRunners\":2,\"lastMatchTime\":\"Aug 25, 2014 8:15:23 PM\",\"totalMatched\":1366025.76,\"totalAvailable\":468213.31,\"crossMatching\":true,\"runnersVoidable\":false,\"version\":803897693,\"runners\":[{\"selectionId\":47972,\"handicap\":0.0,\"status\":\"ACTIVE\",\"lastPriceTraded\":1.98,\"totalMatched\":402569.13,\"ex\":{\"availableToBack\":[{\"price\":1.96,\"size\":1384.66},{\"price\":1.95,\"size\":1204.2},{\"price\":1.94,\"size\":705.44}],\"availableToLay\":[{\"price\":1.98,\"size\":4066.02},{\"price\":1.99,\"size\":950.74},{\"price\":2.0,\"size\":1114.97}],\"tradedVolume\":[]},\"orders\":[{\"betId\":\"40509052837\",\"orderType\":\"LIMIT\",\"status\":\"EXECUTION_COMPLETE\",\"persistenceType\":\"LAPSE\",\"side\":\"BACK\",\"price\":2.42,\"size\":2.0,\"bspLiability\":0.0,\"placedDate\":\"Aug 25, 2014 7:21:00 PM\",\"avgPriceMatched\":2.42,\"sizeMatched\":2.0,\"sizeRemaining\":0.0,\"sizeLapsed\":0.0,\"sizeCancelled\":0.0,\"sizeVoided\":0.0}],\"matches\":[]},{\"selectionId\":47973,\"handicap\":0.0,\"status\":\"ACTIVE\",\"lastPriceTraded\":2.02,\"totalMatched\":963456.62,\"ex\":{\"availableToBack\":[{\"price\":2.02,\"size\":5582.24},{\"price\":2.0,\"size\":2163.69},{\"price\":1.99,\"size\":316.6}],\"availableToLay\":[{\"price\":2.04,\"size\":1577.61},{\"price\":2.06,\"size\":2236.53},{\"price\":2.08,\"size\":1356.35}],\"tradedVolume\":[]}}]}},\"CORRECT_SCORE\":{\"marketId\":\"1.115036530\",\"marketName\":\"Correct Score\",\"description\":{\"persistenceEnabled\":true,\"bspMarket\":false,\"marketTime\":\"Aug 25, 2014 8:00:00 PM\",\"suspendTime\":\"Aug 25, 2014 8:00:00 PM\",\"bettingType\":\"ODDS\",\"turnInPlayEnabled\":true,\"marketType\":\"CORRECT_SCORE\",\"marketBaseRate\":5.0,\"discountAllowed\":true,\"wallet\":\"UK wallet\",\"rules\":\"\",\"rulesHasDate\":true},\"runners\":[{\"selectionId\":1,\"runnerName\":\"0 - 0\",\"handicap\":0.0},{\"selectionId\":4,\"runnerName\":\"0 - 1\",\"handicap\":0.0},{\"selectionId\":9,\"runnerName\":\"0 - 2\",\"handicap\":0.0},{\"selectionId\":16,\"runnerName\":\"0 - 3\",\"handicap\":0.0},{\"selectionId\":2,\"runnerName\":\"1 - 0\",\"handicap\":0.0},{\"selectionId\":3,\"runnerName\":\"1 - 1\",\"handicap\":0.0},{\"selectionId\":8,\"runnerName\":\"1 - 2\",\"handicap\":0.0},{\"selectionId\":15,\"runnerName\":\"1 - 3\",\"handicap\":0.0},{\"selectionId\":5,\"runnerName\":\"2 - 0\",\"handicap\":0.0},{\"selectionId\":6,\"runnerName\":\"2 - 1\",\"handicap\":0.0},{\"selectionId\":7,\"runnerName\":\"2 - 2\",\"handicap\":0.0},{\"selectionId\":14,\"runnerName\":\"2 - 3\",\"handicap\":0.0},{\"selectionId\":10,\"runnerName\":\"3 - 0\",\"handicap\":0.0},{\"selectionId\":11,\"runnerName\":\"3 - 1\",\"handicap\":0.0},{\"selectionId\":12,\"runnerName\":\"3 - 2\",\"handicap\":0.0},{\"selectionId\":13,\"runnerName\":\"3 - 3\",\"handicap\":0.0},{\"selectionId\":4506345,\"runnerName\":\"Any Unquoted \",\"handicap\":0.0}],\"competition\":{\"id\":\"31\",\"name\":\"Barclays Premier League\"},\"event\":{\"id\":\"27249641\",\"name\":\"Man City v Liverpool\",\"countryCode\":\"GB\",\"timezone\":\"Europe/London\",\"openDate\":\"Aug 25, 2014 8:00:00 PM\",\"market\":{}},\"marketBook\":{\"marketId\":\"1.115036530\",\"isMarketDataDelayed\":false,\"status\":\"OPEN\",\"betDelay\":5,\"bspReconciled\":false,\"complete\":true,\"inplay\":true,\"numberOfWinners\":1,\"numberOfRunners\":17,\"numberOfActiveRunners\":17,\"lastMatchTime\":\"Aug 25, 2014 8:15:22 PM\",\"totalMatched\":853815.56,\"totalAvailable\":65045.67,\"crossMatching\":true,\"runnersVoidable\":false,\"version\":803897101,\"runners\":[{\"selectionId\":1,\"handicap\":0.0,\"status\":\"ACTIVE\",\"lastPriceTraded\":13.0,\"totalMatched\":158751.95,\"ex\":{\"availableToBack\":[{\"price\":12.5,\"size\":1317.35},{\"price\":12.0,\"size\":996.68},{\"price\":11.5,\"size\":1110.46}],\"availableToLay\":[{\"price\":13.0,\"size\":139.22},{\"price\":13.5,\"size\":1947.16},{\"price\":14.0,\"size\":1778.15}],\"tradedVolume\":[]}},{\"selectionId\":4,\"handicap\":0.0,\"status\":\"ACTIVE\",\"lastPriceTraded\":15.5,\"totalMatched\":41214.06,\"ex\":{\"availableToBack\":[{\"price\":15.5,\"size\":131.62},{\"price\":15.0,\"size\":7.51},{\"price\":14.5,\"size\":279.44}],\"availableToLay\":[{\"price\":16.5,\"size\":9.55},{\"price\":17.0,\"size\":25.92},{\"price\":17.5,\"size\":61.7}],\"tradedVolume\":[]}},{\"selectionId\":9,\"handicap\":0.0,\"status\":\"ACTIVE\",\"lastPriceTraded\":32.0,\"totalMatched\":17888.41,\"ex\":{\"availableToBack\":[{\"price\":30.0,\"size\":104.0},{\"price\":28.0,\"size\":8.26},{\"price\":27.0,\"size\":150.25}],\"availableToLay\":[{\"price\":36.0,\"size\":38.21},{\"price\":38.0,\"size\":186.69},{\"price\":40.0,\"size\":3.52}],\"tradedVolume\":[]}},{\"selectionId\":16,\"handicap\":0.0,\"status\":\"ACTIVE\",\"lastPriceTraded\":95.0,\"totalMatched\":7060.15,\"ex\":{\"availableToBack\":[{\"price\":95.0,\"size\":16.25},{\"price\":90.0,\"size\":33.0},{\"price\":85.0,\"size\":18.0}],\"availableToLay\":[{\"price\":110.0,\"size\":73.29},{\"price\":130.0,\"size\":3.57},{\"price\":150.0,\"size\":4.85}],\"tradedVolume\":[]}},{\"selectionId\":2,\"handicap\":0.0,\"status\":\"ACTIVE\",\"lastPriceTraded\":9.4,\"totalMatched\":88569.21,\"ex\":{\"availableToBack\":[{\"price\":9.2,\"size\":67.88},{\"price\":9.0,\"size\":209.81},{\"price\":8.8,\"size\":65.49}],\"availableToLay\":[{\"price\":9.4,\"size\":357.09},{\"price\":9.6,\"size\":72.13},{\"price\":9.8,\"size\":107.96}],\"tradedVolume\":[]}},{\"selectionId\":3,\"handicap\":0.0,\"status\":\"ACTIVE\",\"lastPriceTraded\":8.2,\"totalMatched\":95519.27,\"ex\":{\"availableToBack\":[{\"price\":8.2,\"size\":78.9},{\"price\":8.0,\"size\":389.18},{\"price\":7.8,\"size\":194.67}],\"availableToLay\":[{\"price\":8.4,\"size\":401.29},{\"price\":8.6,\"size\":107.61},{\"price\":9.0,\"size\":154.14}],\"tradedVolume\":[]}},{\"selectionId\":8,\"handicap\":0.0,\"status\":\"ACTIVE\",\"lastPriceTraded\":16.0,\"totalMatched\":39314.47,\"ex\":{\"availableToBack\":[{\"price\":15.0,\"size\":298.59},{\"price\":14.5,\"size\":153.95},{\"price\":14.0,\"size\":60.47}],\"availableToLay\":[{\"price\":17.0,\"size\":32.87},{\"price\":17.5,\"size\":26.35},{\"price\":18.0,\"size\":66.06}],\"tradedVolume\":[]}},{\"selectionId\":15,\"handicap\":0.0,\"status\":\"ACTIVE\",\"lastPriceTraded\":42.0,\"totalMatched\":13446.39,\"ex\":{\"availableToBack\":[{\"price\":42.0,\"size\":2.93},{\"price\":32.0,\"size\":13.02},{\"price\":30.0,\"size\":99.1}],\"availableToLay\":[{\"price\":46.0,\"size\":2.0},{\"price\":48.0,\"size\":2.0},{\"price\":50.0,\"size\":2.0}],\"tradedVolume\":[]}},{\"selectionId\":5,\"handicap\":0.0,\"status\":\"ACTIVE\",\"lastPriceTraded\":10.5,\"totalMatched\":65550.4,\"ex\":{\"availableToBack\":[{\"price\":10.5,\"size\":513.97},{\"price\":10.0,\"size\":1354.58},{\"price\":9.8,\"size\":643.63}],\"availableToLay\":[{\"price\":11.0,\"size\":9.13},{\"price\":11.5,\"size\":10.64},{\"price\":12.0,\"size\":441.0}],\"tradedVolume\":[]}},{\"selectionId\":6,\"handicap\":0.0,\"status\":\"ACTIVE\",\"lastPriceTraded\":10.0,\"totalMatched\":80989.58,\"ex\":{\"availableToBack\":[{\"price\":10.0,\"size\":96.9},{\"price\":9.8,\"size\":216.32},{\"price\":9.6,\"size\":339.27}],\"availableToLay\":[{\"price\":10.5,\"size\":170.14},{\"price\":11.0,\"size\":949.71},{\"price\":11.5,\"size\":582.3}],\"tradedVolume\":[]}},{\"selectionId\":7,\"handicap\":0.0,\"status\":\"ACTIVE\",\"lastPriceTraded\":18.5,\"totalMatched\":60981.85,\"ex\":{\"availableToBack\":[{\"price\":18.5,\"size\":99.94},{\"price\":18.0,\"size\":77.56},{\"price\":17.0,\"size\":7.06}],\"availableToLay\":[{\"price\":19.0,\"size\":4.81},{\"price\":19.5,\"size\":197.31},{\"price\":20.0,\"size\":94.98}],\"tradedVolume\":[]}},{\"selectionId\":14,\"handicap\":0.0,\"status\":\"ACTIVE\",\"lastPriceTraded\":55.0,\"totalMatched\":12795.54,\"ex\":{\"availableToBack\":[{\"price\":48.0,\"size\":81.88},{\"price\":40.0,\"size\":30.1},{\"price\":38.0,\"size\":2.63}],\"availableToLay\":[{\"price\":60.0,\"size\":4.99},{\"price\":75.0,\"size\":4.18},{\"price\":85.0,\"size\":12.46}],\"tradedVolume\":[]}},{\"selectionId\":10,\"handicap\":0.0,\"status\":\"ACTIVE\",\"lastPriceTraded\":19.0,\"totalMatched\":33545.57,\"ex\":{\"availableToBack\":[{\"price\":19.0,\"size\":398.64},{\"price\":18.5,\"size\":6.0},{\"price\":18.0,\"size\":109.77}],\"availableToLay\":[{\"price\":22.0,\"size\":32.06},{\"price\":23.0,\"size\":26.05},{\"price\":24.0,\"size\":257.58}],\"tradedVolume\":[]}},{\"selectionId\":11,\"handicap\":0.0,\"status\":\"ACTIVE\",\"lastPriceTraded\":17.5,\"totalMatched\":44092.53,\"ex\":{\"availableToBack\":[{\"price\":17.5,\"size\":94.03},{\"price\":17.0,\"size\":210.83},{\"price\":16.5,\"size\":199.71}],\"availableToLay\":[{\"price\":18.0,\"size\":17.19},{\"price\":18.5,\"size\":113.94},{\"price\":19.0,\"size\":79.57}],\"tradedVolume\":[]}},{\"selectionId\":12,\"handicap\":0.0,\"status\":\"ACTIVE\",\"lastPriceTraded\":34.0,\"totalMatched\":22535.35,\"ex\":{\"availableToBack\":[{\"price\":34.0,\"size\":12.26},{\"price\":32.0,\"size\":27.15},{\"price\":30.0,\"size\":8.57}],\"availableToLay\":[{\"price\":36.0,\"size\":83.41},{\"price\":38.0,\"size\":8.46},{\"price\":42.0,\"size\":2.0}],\"tradedVolume\":[]}},{\"selectionId\":13,\"handicap\":0.0,\"status\":\"ACTIVE\",\"lastPriceTraded\":80.0,\"totalMatched\":11050.35,\"ex\":{\"availableToBack\":[{\"price\":80.0,\"size\":6.82},{\"price\":75.0,\"size\":2.99},{\"price\":70.0,\"size\":7.76}],\"availableToLay\":[{\"price\":85.0,\"size\":4.08},{\"price\":95.0,\"size\":30.04},{\"price\":110.0,\"size\":5.5}],\"tradedVolume\":[]}},{\"selectionId\":4506345,\"handicap\":0.0,\"status\":\"ACTIVE\",\"lastPriceTraded\":11.0,\"totalMatched\":60510.4,\"ex\":{\"availableToBack\":[{\"price\":11.0,\"size\":372.17},{\"price\":10.5,\"size\":3.0},{\"price\":10.0,\"size\":635.47}],\"availableToLay\":[{\"price\":12.0,\"size\":272.69},{\"price\":12.5,\"size\":610.92},{\"price\":13.0,\"size\":46.36}],\"tradedVolume\":[]}}]}}}}";
        Event event = gson.fromJson(jsonEvent, Event.class);

        OverUnderMarket overUnderMarket = new OverUnderMarket(event.getMarket().get(MarketType.OVER_UNDER_25));

        String name = "";
        assertEquals("Under 2.5 Goals", name);
    }
}






























