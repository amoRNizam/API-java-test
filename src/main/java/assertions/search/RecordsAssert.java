package assertions.search;

import models.Records;

/**
 * {@link Records} specific assertions - Generated by CustomAssertionGenerator.
 *
 * Although this class is not final to allow Soft assertions proxy, if you wish to extend it, 
 * extend {@link AbstractRecordsAssert} instead.
 */
@javax.annotation.Generated(value="assertj-assertions-generator")
public class RecordsAssert extends AbstractRecordsAssert<RecordsAssert, Records> {

  /**
   * Creates a new <code>{@link RecordsAssert}</code> to make assertions on actual Records.
   * @param actual the Records we want to make assertions on.
   */
  public RecordsAssert(Records actual) {
    super(actual, RecordsAssert.class);
  }

  /**
   * An entry point for RecordsAssert to follow AssertJ standard <code>assertThat()</code> statements.<br>
   * With a static import, one can write directly: <code>assertThat(myRecords)</code> and get specific assertion with code completion.
   * @param actual the Records we want to make assertions on.
   * @return a new <code>{@link RecordsAssert}</code>
   */
  @org.assertj.core.util.CheckReturnValue
  public static RecordsAssert assertThat(Records actual) {
    return new RecordsAssert(actual);
  }
}