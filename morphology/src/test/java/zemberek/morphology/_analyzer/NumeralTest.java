package zemberek.morphology._analyzer;

import org.junit.Test;

public class NumeralTest extends AnalyzerTestBase {

  @Test
  public void ordinalTest() {
    AnalysisTester t = getTester("bir [P:Num,Ord]");
    t.expectAny("bir", matchesTailLex("Num"));
    t.expectAny("bire", matchesTailLex("Num + Zero + Noun + A3sg + Pnon + Dat"));
    t.expectAny("birmiş", matchesTailLex("Num + Zero + Verb + Narr + A3sg"));
  }
}
