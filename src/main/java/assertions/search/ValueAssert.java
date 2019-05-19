package assertions.search;

import models.Value;

/**
 * {@link Value} specific assertions - Generated by CustomAssertionGenerator.
 *
 * Although this class is not final to allow Soft assertions proxy, if you wish to extend it, 
 * extend {@link AbstractValueAssert} instead.
 */
@javax.annotation.Generated(value="assertj-assertions-generator")
public class ValueAssert extends AbstractValueAssert<ValueAssert, Value> {

  /**
   * Creates a new <code>{@link ValueAssert}</code> to make assertions on actual Value.
   * @param actual the Value we want to make assertions on.
   */
  public ValueAssert(Value actual) {
    super(actual, ValueAssert.class);
  }

  /**
   * An entry point for ValueAssert to follow AssertJ standard <code>assertThat()</code> statements.<br>
   * With a static import, one can write directly: <code>assertThat(myValue)</code> and get specific assertion with code completion.
   * @param actual the Value we want to make assertions on.
   * @return a new <code>{@link ValueAssert}</code>
   */
  @org.assertj.core.util.CheckReturnValue
  public static ValueAssert assertThat(Value actual) {
    return new ValueAssert(actual);
  }
}