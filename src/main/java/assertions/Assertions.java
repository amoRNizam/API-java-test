package assertions;

import assertions.search.*;

/**
 * Entry point for assertions of different data types. Each method in this class is a static factory for the
 * type-specific assertion objects.
 */
@javax.annotation.Generated(value="assertj-assertions-generator")
public class Assertions {

  /**
   * Creates a new instance of <code>{@link models.FieldsItemAssert}</code>.
   *
   * @param actual the actual value.
   * @return the created assertion object.
   */
  @org.assertj.core.util.CheckReturnValue
  public static FieldsItemAssert assertThat(models.FieldsItem actual) {
    return new FieldsItemAssert(actual);
  }

  /**
   * Creates a new instance of <code>{@link models.ItemModelAssert}</code>.
   *
   * @param actual the actual value.
   * @return the created assertion object.
   */
  @org.assertj.core.util.CheckReturnValue
  public static ItemModelAssert assertThat(models.ItemModel actual) {
    return new ItemModelAssert(actual);
  }

  /**
   * Creates a new instance of <code>{@link models.ItemsItemAssert}</code>.
   *
   * @param actual the actual value.
   * @return the created assertion object.
   */
  @org.assertj.core.util.CheckReturnValue
  public static ItemsItemAssert assertThat(models.ItemsItem actual) {
    return new ItemsItemAssert(actual);
  }

  /**
   * Creates a new instance of <code>{@link models.RecordsAssert}</code>.
   *
   * @param actual the actual value.
   * @return the created assertion object.
   */
  @org.assertj.core.util.CheckReturnValue
  public static RecordsAssert assertThat(models.Records actual) {
    return new RecordsAssert(actual);
  }

  /**
   * Creates a new instance of <code>{@link models.ValueAssert}</code>.
   *
   * @param actual the actual value.
   * @return the created assertion object.
   */
  @org.assertj.core.util.CheckReturnValue
  public static ValueAssert assertThat(models.Value actual) {
    return new ValueAssert(actual);
  }

  /**
   * Creates a new <code>{@link Assertions}</code>.
   */
  protected Assertions() {
    // empty
  }
}
