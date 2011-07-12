package test.unit;

import mars.ParseRoverInputs;
import org.hamcrest.CoreMatchers;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class ParseRoverInputsTest {
    @Test
    public void testParseRoverInputAndGetValues() throws Exception {
        ParseRoverInputs parseRoverInputs =new ParseRoverInputs();
        parseRoverInputs.parseRoverInputAndGetValues();
        assertThat(parseRoverInputs.getPlateauLimitX(),is(CoreMatchers.<Object>notNullValue()));
        assertThat(parseRoverInputs.getPlateauLimitY(), is(CoreMatchers.<Object>notNullValue()));
    }

    @Test
    public void testSetInitialRoverStatesAndCommand() throws Exception {
    ParseRoverInputs parseRoverInputs =new ParseRoverInputs();
    parseRoverInputs.parseRoverInputAndGetValues();
    assertThat(parseRoverInputs.getRoverStartCoordinatesX(),is(CoreMatchers.<Object>notNullValue()));
    assertThat(parseRoverInputs.getRoverStartCoordinatesY(), is(CoreMatchers.<Object>notNullValue()));
    assertThat(parseRoverInputs.getRoverStartDirection(), is(CoreMatchers.<Object>notNullValue()));
    assertThat(parseRoverInputs.getCommand(), is(CoreMatchers.<Object>notNullValue()));
    }
}
